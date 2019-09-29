
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Deal],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(deals : List[Deal]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),_display_(/*3.2*/layout("Ofertas")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<h1>Todas as Ofertas</h1>
            <a class="btn btn-success" href=""""),_display_(/*5.47*/routes/*5.53*/.DealsController.create()),format.raw/*5.78*/("""">Criar Oferta</a>

            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">Oferta</th>
                        <th scope="col">Publicação</th>
                        <th scope="col">Validade</th>
                        <th scope="col"></th>
                        <th scope="col"></th>
                        <th scope="col"></th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*19.22*/for(deal <-deals) yield /*19.39*/{_display_(Seq[Any](format.raw/*19.40*/("""
                        """),format.raw/*20.25*/("""<tr>
                            <th scope="row">"""),_display_(/*21.46*/deal/*21.50*/.title),format.raw/*21.56*/("""</th>
                            <td>"""),_display_(/*22.34*/deal/*22.38*/.formatDate(deal.publishDate)),format.raw/*22.67*/("""</td>
                            <td>"""),_display_(/*23.34*/deal/*23.38*/.formatDate(deal.endDate)),format.raw/*23.63*/("""</td>
                            <td>
                                <a class="btn btn-primary" href=""""),_display_(/*25.67*/routes/*25.73*/.DealsController.show(deal.id)),format.raw/*25.103*/("""">Detalhes</a>
                            </td>
                            <td>
                                <a class="btn btn-success" href=""""),_display_(/*28.67*/routes/*28.73*/.DealsController.edit(deal.id)),format.raw/*28.103*/("""">Editar</a>
                            </td>
                            <td>
                                <a class="btn btn-danger" href=""""),_display_(/*31.66*/routes/*31.72*/.DealsController.destroy(deal.id)),format.raw/*31.105*/("""">Excluir</a>
                            </td>
                        </tr>
                    """)))}),format.raw/*34.22*/("""
                """),format.raw/*35.17*/("""</tbody>
            </table>

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
                  DATE: Sat Sep 28 13:06:40 BRT 2019
                  SOURCE: C:/Users/myghv/Documents/desafio-peixe-guilherme/app/views/deals/index.scala.html
                  HASH: 0d0550f675b295e5b1818c2dea512888b21f1e03
                  MATRIX: 958->1|1073->21|1103->26|1128->43|1166->44|1198->50|1297->123|1311->129|1356->154|1896->667|1929->684|1968->685|2022->711|2100->762|2113->766|2140->772|2207->812|2220->816|2270->845|2337->885|2350->889|2396->914|2530->1021|2545->1027|2597->1057|2775->1208|2790->1214|2842->1244|3017->1392|3032->1398|3087->1431|3220->1533|3266->1551
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|51->19|51->19|51->19|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|57->25|57->25|57->25|60->28|60->28|60->28|63->31|63->31|63->31|66->34|67->35
                  -- GENERATED --
              */
          