package controllers;

import models.BuyOption;
import models.Deal;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.buyoptions.form;
import views.html.buyoptions.sale;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuyOptionsController extends Controller {
    @Inject
    FormFactory formFactory;

    public Result create(Integer id){
        Form<BuyOption> buyOptionForm = formFactory.form(BuyOption.class);
        return ok(form.render(buyOptionForm, id));
    }

    public Result edit(Integer id){
        BuyOption buyOption = BuyOption.find().byId(id);
        if(buyOption == null){
            return notFound("Opção de Compra não encontrada");
        }
        Form<BuyOption> buyOptionForm = formFactory.form(BuyOption.class).fill(buyOption);
        return ok(form.render(buyOptionForm, buyOption.deal.id));
    }

    public Result save(){
        Form<BuyOption> buyOptionForm = formFactory.form(BuyOption.class).bindFromRequest();
        BuyOption buyOption = buyOptionForm.get();
        buyOption.salePrice = buyOption.normalPrice - (buyOption.normalPrice * (buyOption.percentageDiscount/100));
        if(buyOption.id==null){
            buyOption.save();}
        else{
            buyOption.update();
        }
        return redirect(routes.DealsController.show(buyOption.deal.id));
    }

    public Result destroy(Integer id){
        BuyOption buyOption = BuyOption.find().byId(id);
        if(buyOption == null){
            return notFound("Opção de Compra não encontrada");
        }
        buyOption.delete();
        return redirect(routes.DealsController.show(buyOption.deal.id));
    }

    public Result buyOptionsForSale(Integer deal){
        List<BuyOption> buyOptionList = new ArrayList<BuyOption>();
        buyOptionList = BuyOption.find().query().where().betweenProperties("startDate","endDate",new Date(System.currentTimeMillis())).and().eq("deal_id",deal).findList();
        return ok(sale.render(buyOptionList));
    }

    public Result sell(Integer id){
        BuyOption buyOption = BuyOption.find().byId(id);
        if(buyOption == null){
            return notFound("Opção de Compra não encontrada");
        }

        Integer dealId = buyOption.deal.id;
        Deal deal = Deal.find().byId(dealId);
        buyOption.quantityCupom  = buyOption.quantityCupom-1;
        buyOption.update();
        flash("success","Compra Efetuada com Sucesso!");

        deal.totalSold = deal.totalSold + 1;
        deal.save();
        return redirect(routes.BuyOptionsController.buyOptionsForSale(dealId));
    }
}
