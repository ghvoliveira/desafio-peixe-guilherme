package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class BuyOption extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    public Integer id;

    @Constraints.Required
    @Constraints.MinLength(5)
    public String title;

    @Constraints.Required
    @Constraints.Min(0)
    public double normalPrice;

    public double salePrice;

    @Constraints.Required
    @Constraints.Min(0)
    @Constraints.Max(100)
    public double percentageDiscount;

    @Constraints.Required
    @Constraints.Min(0)
    public Long quantityCupom;

    @Constraints.Required
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date startDate;

    @Constraints.Required
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date endDate;

    @ManyToOne
    public Deal deal;

    public BuyOption(){

    }

    public BuyOption(Integer id, String title, double normalPrice, double salePrice, double percentageDiscount,
                     Long quantityCupom, Date startDate, Date endDate){
        this.id = id;
        this.title = title;
        this.normalPrice = normalPrice;
        this.salePrice = salePrice;
        this.percentageDiscount = percentageDiscount;
        this.quantityCupom = quantityCupom;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static Finder<Integer, BuyOption> find() {
        return new Finder<>(BuyOption.class);
    }

    public String formatDate(Date date){
        SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy");
        return dt1.format(date);
    }

    public String formatDecimal(double decimalNumber){
        return String.format ("%,.2f", decimalNumber);
    }
}
