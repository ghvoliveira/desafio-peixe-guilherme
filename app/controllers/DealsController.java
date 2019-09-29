package controllers;

import models.BuyOption;
import models.Deal;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.deals.form;
import views.html.deals.index;
import views.html.deals.sale;
import views.html.deals.show;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DealsController extends Controller {
    @Inject
    FormFactory formFactory;

    public Result index(){
        List<Deal> deals = Deal.find().all();
        return ok(index.render(deals));
    }

    public Result create(){
        Form<Deal> dealForm = formFactory.form(Deal.class);
        return ok(form.render(dealForm));
    }

    public Result edit(Integer id){
        Deal deal = Deal.find().byId(id);
        if(deal == null){
            return notFound("Oferta não encontrada");
        }
        Form<Deal> dealForm = formFactory.form(Deal.class).fill(deal);
        return ok(form.render(dealForm));
    }

    public Result save(){
        Form<Deal> dealForm = formFactory.form(Deal.class).bindFromRequest();
        if(dealForm.hasErrors()){
            flash("danger","Por favor, preencha o formulário adequadamente");
            return badRequest(form.render(dealForm));
        }
        Deal deal = dealForm.get();
        deal.url = deal.slugify(deal.title);
        if(deal.id==null){
            deal.createDate = new Date(System.currentTimeMillis());
            deal.totalSold = 0;
            deal.save();}
        else{
            deal.update();
        }
        return redirect(routes.DealsController.index());
    }

    public Result show(Integer id){
        Deal deal = Deal.find().byId(id);
        if(deal == null){
            return notFound("Oferta não encontrada!");
        }
        return ok(show.render(deal));
    }

    public Result destroy(Integer id){
        Deal deal = Deal.find().byId(id);
        if(deal == null){
            return notFound("Oferta não encontrada!");
        }
        deal.delete();
        return redirect(routes.DealsController.index());
    }

    public Result searchByUrl(String urlDeal){
       Deal deal = Deal.find().query().where().eq("url",urlDeal).findOne();
        if(deal == null){
            return notFound("Oferta não encontrada!");
        }
        return redirect(routes.BuyOptionsController.buyOptionsForSale(deal.id));
    }

    public Result dealsForSale(){
        List<Deal> deals = Deal.find().query().where().betweenProperties("publishDate","endDate",new Date(System.currentTimeMillis())).findList();
        List<Deal> dealsWithBuyOptionsAvaliable = new ArrayList<>();

        for(Deal deal:deals){
            List<BuyOption> buyOptionList = new ArrayList<BuyOption>();
            buyOptionList = BuyOption.find().query().where().betweenProperties("startDate","endDate",new Date(System.currentTimeMillis())).and().eq("deal_id",deal.id).and().not().eq("quantity_cupom",0).findList();
            if (!buyOptionList.isEmpty()){
                dealsWithBuyOptionsAvaliable.add(deal);
            }
        }

        return ok(sale.render(dealsWithBuyOptionsAvaliable));
    }
}
