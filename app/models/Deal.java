package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

@Entity
public class Deal extends Model {
    @Id
    @GeneratedValue
    public Integer id;

    @Constraints.Required
    @Constraints.MinLength(5)
    public String title;

    @Constraints.Required
    @Constraints.MinLength(10)
    public String text;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date createDate;

    @Constraints.Required
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date publishDate;

    @Constraints.Required
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date endDate;

    public String url;

    public Integer totalSold;

    @Constraints.Required
    public Integer typeDeal;

    @OneToMany
    private List<BuyOption> buyOptions;

    public Deal(){

    }

    public Deal(Integer id, String title, String text, Date createDate, Date publishDate, Date endDate,
                String url, Integer totalSold, Integer typeDeal){
        this.id = id;
        this.title = title;
        this.text = text;
        this.createDate = createDate;
        this.publishDate = publishDate;
        this.endDate = endDate;
        this.url = url;
        this.totalSold = totalSold;
        this.typeDeal = typeDeal;
    }

    public void setBuyOptions(List<BuyOption> buyOptions){
        this.buyOptions = buyOptions;
    }

    public List<BuyOption> getBuyOptions(){return this.buyOptions;}

    public static Finder<Integer, Deal> find() {
        return new Finder<>(Deal.class);
    }

    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");

    public String slugify(String input){
        String nowhitespace = WHITESPACE.matcher(input).replaceAll("-");
        String normalized = Normalizer.normalize(nowhitespace, Form.NFD);
        String slug = NONLATIN.matcher(normalized).replaceAll("");
        return slug.toLowerCase(Locale.ENGLISH);
    }

    public String formatDate(Date date){
        SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy");
        return dt1.format(date);
    }

    public String getTypeDescription(Integer type){
        switch (type){
            case 1: return "LOCAL";
            case 2: return "PRODUTO";
            case 3: return "VIAGEM";
            default: return "";
        }
    }

}
