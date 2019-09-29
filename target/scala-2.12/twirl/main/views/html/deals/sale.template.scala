
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

object sale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Deal],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(deals : List[Deal]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),_display_(/*3.2*/layout("Comprar - Escolha uma Oferta")/*3.40*/{_display_(Seq[Any](format.raw/*3.41*/("""
    """),format.raw/*4.5*/("""<h1>Comprar - Escolha uma oferta</h1>
    <ul class="list-group">
    """),_display_(/*6.6*/for(deal <- deals) yield /*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
        """),format.raw/*7.9*/("""<li class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1">"""),_display_(/*9.35*/deal/*9.39*/.title),format.raw/*9.45*/("""</h5>
            </div>
            <p class="mb-1">"""),_display_(/*11.30*/deal/*11.34*/.text),format.raw/*11.39*/("""</p>
            <small><a class="btn btn-primary" href=""""),_display_(/*12.54*/routes/*12.60*/.BuyOptionsController.buyOptionsForSale(deal.id)),format.raw/*12.108*/("""">Ver Oferta</a></small>
        </li>
    """)))}),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""</ul>

""")))}))
      }
    }
  }

  def render(deals:List[Deal]): play.twirl.api.HtmlFormat.Appendable = apply(deals)

  def f:((List[Deal]) => play.twirl.api.HtmlFormat.Appendable) = (deals) => apply(deals)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 28 18:31:17 BRT 2019
                  SOURCE: C:/Users/myghv/Documents/desafio-peixe-guilherme/app/views/deals/sale.scala.html
                  HASH: 1b2fa712a37306c0151e0441fa5eabaa979ed86a
                  MATRIX: 957->1|1072->21|1102->26|1148->64|1186->65|1218->71|1316->144|1349->162|1387->163|1423->173|1600->324|1612->328|1638->334|1721->390|1734->394|1760->399|1846->458|1861->464|1931->512|2007->558|2040->564
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|41->9|41->9|41->9|43->11|43->11|43->11|44->12|44->12|44->12|46->14|47->15
                  -- GENERATED --
              */
          