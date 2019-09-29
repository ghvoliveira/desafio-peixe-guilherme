
package views.html.buyoptions

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[BuyOption],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(buyOption : Form[BuyOption])(deal : Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/layout("Formulário da Opção de Compra")/*4.41*/{_display_(Seq[Any](format.raw/*4.42*/("""
    """),format.raw/*5.5*/("""<h1>Formulário da Opção de Compra</h1>
    """),_display_(/*6.6*/helper/*6.12*/.form(action=routes.BuyOptionsController.save())/*6.60*/{_display_(Seq[Any](format.raw/*6.61*/("""
        """),_display_(/*7.10*/helper/*7.16*/.CSRF.formField),format.raw/*7.31*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(buyOption("title"),'_label->"Título",'class ->"form-control",'_showConstraints -> false,
            'required -> "true", 'minlength -> "5")),format.raw/*9.52*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(buyOption("normalPrice"),'_label->"Preço de Venda Normal",'class ->"form-control",
            '_showConstraints -> false, 'required -> "true",'type->"number",'min->"0",'step->"0.01")),format.raw/*11.101*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(buyOption("percentageDiscount"),'_label->"Percentual de Desconto",'class ->"form-control",
            'type->"number",'min->"0",'max->"100",'step->"0.1",'_showConstraints -> false, 'required -> "true")),format.raw/*13.112*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(buyOption("quantityCupom"),'_label->"Quantidade Total de Cupons Disponíveis",
            'class ->"form-control",'type->"number",'min->"0",'max->"100",'step->"1",'_showConstraints -> false,
            'required -> "true")),format.raw/*16.33*/("""
        """),_display_(/*17.10*/helper/*17.16*/.inputDate(buyOption("startDate"),'_label->"Data de Entrada",'class ->"form-control",
            '_showConstraints -> false, 'required -> "true")),format.raw/*18.61*/("""
        """),_display_(/*19.10*/helper/*19.16*/.inputDate(buyOption("endDate"),'_label->"Data de Saída",'class ->"form-control",
            '_showConstraints -> false, 'required -> "true")),format.raw/*20.61*/("""
        """),format.raw/*21.9*/("""<button class="btn btn-success" type="submit"> Salvar </button>

        """),_display_(/*23.10*/helper/*23.16*/.inputText(buyOption("id"),'_label->"",'hidden ->"hidden")),format.raw/*23.74*/("""
        """),format.raw/*24.9*/("""<input type="text" name="deal.id" value=""""),_display_(/*24.51*/deal),format.raw/*24.55*/("""" style="display:none">
        <input type="text" name="salePrice" value="0" style="display:none">
    """)))}),format.raw/*26.6*/("""
""")))}))
      }
    }
  }

  def render(buyOption:Form[BuyOption],deal:Integer): play.twirl.api.HtmlFormat.Appendable = apply(buyOption)(deal)

  def f:((Form[BuyOption]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (buyOption) => (deal) => apply(buyOption)(deal)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 28 22:23:41 BRT 2019
                  SOURCE: C:/Users/myghv/Documents/desafio-peixe-guilherme/app/views/buyoptions/form.scala.html
                  HASH: 831c8628722d5bdab1c13a05a73d554c1d0fbea3
                  MATRIX: 975->1|1093->49|1138->46|1166->66|1194->69|1241->108|1279->109|1311->115|1381->160|1395->166|1451->214|1489->215|1526->226|1540->232|1575->247|1612->258|1626->264|1798->416|1836->427|1851->433|2068->628|2106->639|2121->645|2357->859|2395->870|2410->876|2667->1112|2705->1123|2720->1129|2888->1276|2926->1287|2941->1293|3105->1436|3142->1446|3245->1522|3260->1528|3339->1586|3376->1596|3445->1638|3470->1642|3607->1749
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|41->9|42->10|42->10|43->11|44->12|44->12|45->13|46->14|46->14|48->16|49->17|49->17|50->18|51->19|51->19|52->20|53->21|55->23|55->23|55->23|56->24|56->24|56->24|58->26
                  -- GENERATED --
              */
          