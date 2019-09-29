
package views.html.deals

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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Deal],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(dealForm : Form[Deal]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/layout("Formulário da Oferta")/*4.32*/{_display_(Seq[Any](format.raw/*4.33*/("""
    """),format.raw/*5.5*/("""<h1>Formulário da Oferta</h1>
    """),_display_(/*6.6*/helper/*6.12*/.form(action=routes.DealsController.save())/*6.55*/{_display_(Seq[Any](format.raw/*6.56*/("""
        """),_display_(/*7.10*/helper/*7.16*/.CSRF.formField),format.raw/*7.31*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(dealForm("title"),'_label->"Título da Oferta",'class ->"form-control",
            '_showConstraints -> false, 'required -> "true", 'minlength -> "5")),format.raw/*9.80*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(dealForm("text"),'_label->"Texto de Destaque",'class ->"form-control",
            '_showConstraints -> false, 'required -> "true", 'minlength -> "10")),format.raw/*11.81*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputDate(dealForm("publishDate"),'_label->"Data de Publicação",'class ->"form-control",
            '_showConstraints -> false, 'required -> "true")),format.raw/*13.61*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputDate(dealForm("endDate"),'_label->"Validade da Oferta",'class ->"form-control",
            '_showConstraints -> false, 'required -> "true")),format.raw/*15.61*/("""
        """),_display_(/*16.10*/select(dealForm("typeDeal"),options(TypeDeal.options()),'_label->"Tipo",'class ->"form-control",
            '_showConstraints -> false, 'required -> "true")),format.raw/*17.61*/("""

        """),format.raw/*19.9*/("""<button class="btn btn-success" type="submit"> Salvar </button>
        """),_display_(/*20.10*/helper/*20.16*/.inputText(dealForm("id"),'_label->"",'style ->"display:none")),format.raw/*20.78*/("""
        """),_display_(/*21.10*/helper/*21.16*/.inputText(dealForm("url"),'_label->"",'style ->"display:none")),format.raw/*21.79*/("""
        """),_display_(/*22.10*/helper/*22.16*/.inputText(dealForm("totalSold"),'_label->"",'_info->"",'style ->"display:none")),format.raw/*22.96*/("""
        """),_display_(/*23.10*/helper/*23.16*/.inputDate(dealForm("createDate"),'_label->"",'class ->"form-control",'style ->"display:none",
        '_showConstraints -> false)),format.raw/*24.36*/("""
    """)))}),format.raw/*25.6*/("""
""")))}))
      }
    }
  }

  def render(dealForm:Form[Deal]): play.twirl.api.HtmlFormat.Appendable = apply(dealForm)

  def f:((Form[Deal]) => play.twirl.api.HtmlFormat.Appendable) = (dealForm) => apply(dealForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 28 20:27:52 BRT 2019
                  SOURCE: C:/Users/myghv/Documents/desafio-peixe-guilherme/app/views/deals/form.scala.html
                  HASH: 4d91524247ebee29414fc9e42472aed90f40deac
                  MATRIX: 957->1|1053->27|1098->24|1126->44|1154->47|1192->77|1230->78|1262->84|1323->120|1337->126|1388->169|1426->170|1463->181|1477->187|1512->202|1549->213|1563->219|1745->381|1783->392|1798->398|1982->561|2020->572|2035->578|2207->729|2245->740|2260->746|2428->893|2466->904|2645->1062|2684->1074|2785->1148|2800->1154|2883->1216|2921->1227|2936->1233|3020->1296|3058->1307|3073->1313|3174->1393|3212->1404|3227->1410|3379->1541|3416->1548
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|41->9|42->10|42->10|43->11|44->12|44->12|45->13|46->14|46->14|47->15|48->16|49->17|51->19|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|56->24|57->25
                  -- GENERATED --
              */
          