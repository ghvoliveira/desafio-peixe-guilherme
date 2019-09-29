
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Deal,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(deal : Deal):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""
"""),_display_(/*2.2*/layout(deal.title)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
    """),format.raw/*3.5*/("""<h2>Descrição da Oferta</h2>
            <ul class="list-group">
                <li class="list-group-item"><b>Título: </b>"""),_display_(/*5.61*/deal/*5.65*/.title),format.raw/*5.71*/("""</li>
                <li class="list-group-item"><b>Texto: </b>"""),_display_(/*6.60*/deal/*6.64*/.text),format.raw/*6.69*/("""</li>
                <li class="list-group-item"><b>Data de Criação: </b>"""),_display_(/*7.70*/deal/*7.74*/.formatDate(deal.createDate)),format.raw/*7.102*/("""</li>
                <li class="list-group-item"><b>Data de Publicação: </b>"""),_display_(/*8.73*/deal/*8.77*/.formatDate(deal.publishDate)),format.raw/*8.106*/("""</li>
                <li class="list-group-item"><b>Data de Validade: </b>"""),_display_(/*9.71*/deal/*9.75*/.formatDate(deal.endDate)),format.raw/*9.100*/("""</li>
                <li class="list-group-item"><b>Tipo: </b>"""),_display_(/*10.59*/deal/*10.63*/.getTypeDescription(deal.typeDeal)),format.raw/*10.97*/("""</li>
                <li class="list-group-item"><b>Total de Cupons Vendidos: </b>"""),_display_(/*11.79*/deal/*11.83*/.totalSold),format.raw/*11.93*/("""</li>
                <li class="list-group-item"><b>URL venda: </b><a href=""""),_display_(/*12.73*/routes/*12.79*/.DealsController.searchByUrl(deal.url)),format.raw/*12.117*/("""">sales/deal/"""),_display_(/*12.131*/deal/*12.135*/.url),format.raw/*12.139*/("""</a></li>
            </ul>

    <h3>Opções de Compra</h3>
            <a class="btn btn-primary" href=""""),_display_(/*16.47*/routes/*16.53*/.BuyOptionsController.create(deal.id)),format.raw/*16.90*/("""">Adicionar Opção de Compra</a>

    <table class="table">
        <thead>
            <tr>
                <th scope="col">Opção de Compra</th>
                <th scope="col">Início</th>
                <th scope="col">Fim</th>
                <th scope="col">Quantidade Disponível</th>
                <th scope="col"></th>
                <th scope="col"></th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*30.10*/for(buyOption <- deal.getBuyOptions) yield /*30.46*/{_display_(Seq[Any](format.raw/*30.47*/("""
            """),format.raw/*31.13*/("""<tr>
                <th scope="row">"""),_display_(/*32.34*/buyOption/*32.43*/.title),format.raw/*32.49*/("""</th>
                <td>"""),_display_(/*33.22*/deal/*33.26*/.formatDate(buyOption.startDate)),format.raw/*33.58*/("""</td>
                <td>"""),_display_(/*34.22*/deal/*34.26*/.formatDate(buyOption.endDate)),format.raw/*34.56*/("""</td>
                <td>"""),_display_(/*35.22*/buyOption/*35.31*/.quantityCupom),format.raw/*35.45*/("""</td>
                <td>
                    <a class="btn btn-success" href=""""),_display_(/*37.55*/routes/*37.61*/.BuyOptionsController.edit(buyOption.id)),format.raw/*37.101*/("""">Editar</a>
                </td>
                <td>
                    <a class="btn btn-danger" href=""""),_display_(/*40.54*/routes/*40.60*/.BuyOptionsController.destroy(buyOption.id)),format.raw/*40.103*/("""">Excluir</a>
                </td>
            </tr>
        """)))}),format.raw/*43.10*/("""
        """),format.raw/*44.9*/("""</tbody>
    </table>
""")))}))
      }
    }
  }

  def render(deal:Deal): play.twirl.api.HtmlFormat.Appendable = apply(deal)

  def f:((Deal) => play.twirl.api.HtmlFormat.Appendable) = (deal) => apply(deal)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 28 22:54:12 BRT 2019
                  SOURCE: C:/Users/myghv/Documents/desafio-peixe-guilherme/app/views/deals/show.scala.html
                  HASH: 2928a8232baacba539c6ea7dda253e722ecd22d9
                  MATRIX: 951->1|1059->14|1087->17|1113->35|1151->36|1183->42|1336->169|1348->173|1374->179|1466->245|1478->249|1503->254|1605->330|1617->334|1666->362|1771->441|1783->445|1833->474|1936->551|1948->555|1994->580|2086->645|2099->649|2154->683|2266->768|2279->772|2310->782|2416->861|2431->867|2491->905|2533->919|2547->923|2573->927|2709->1036|2724->1042|2782->1079|3248->1518|3300->1554|3339->1555|3381->1569|3447->1608|3465->1617|3492->1623|3547->1651|3560->1655|3613->1687|3668->1715|3681->1719|3732->1749|3787->1777|3805->1786|3840->1800|3950->1883|3965->1889|4027->1929|4166->2041|4181->2047|4246->2090|4343->2156|4380->2166
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|48->16|48->16|48->16|62->30|62->30|62->30|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|69->37|69->37|69->37|72->40|72->40|72->40|75->43|76->44
                  -- GENERATED --
              */
          