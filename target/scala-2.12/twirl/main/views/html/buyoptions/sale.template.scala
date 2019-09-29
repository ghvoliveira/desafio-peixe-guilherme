
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
/*1.2*/import models.BuyOption

object sale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[BuyOption],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(buyOptions: List[BuyOption]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.31*/("""

"""),_display_(/*4.2*/layout("Comprar - Escolha o Produto")/*4.39*/{_display_(Seq[Any](format.raw/*4.40*/("""
    """),format.raw/*5.5*/("""<h1>Comprar - Escolha o Produto</h1>
    <ul class="list-group">
    """),_display_(/*7.6*/for(buyOption <-buyOptions) yield /*7.33*/{_display_(Seq[Any](format.raw/*7.34*/("""
        """),format.raw/*8.9*/("""<li class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1">"""),_display_(/*10.35*/buyOption/*10.44*/.title),format.raw/*10.50*/("""</h5>
                <small>"""),_display_(/*11.25*/buyOption/*11.34*/.quantityCupom),format.raw/*11.48*/(""" """),format.raw/*11.49*/("""cupons disponíveis</small>
            </div>
            <p class="mb-1">R$ """),_display_(/*13.33*/buyOption/*13.42*/.formatDecimal(buyOption.salePrice)),format.raw/*13.77*/("""</p>
            """),_display_(/*14.14*/if(buyOption.quantityCupom == 0)/*14.46*/{_display_(Seq[Any](format.raw/*14.47*/("""
                """),format.raw/*15.17*/("""<small><a class="btn btn-danger" href="#">Esgotado</a></small>
            """)))}),format.raw/*16.14*/("""
            """),_display_(/*17.14*/if(buyOption.quantityCupom > 0)/*17.45*/{_display_(Seq[Any](format.raw/*17.46*/("""
                """),format.raw/*18.17*/("""<small><a class="btn btn-success" href=""""),_display_(/*18.58*/routes/*18.64*/.BuyOptionsController.sell(buyOption.id)),format.raw/*18.104*/("""">Comprar</a></small>
            """)))}),format.raw/*19.14*/("""
        """),format.raw/*20.9*/("""</li>
    """)))}),format.raw/*21.6*/("""
    """),format.raw/*22.5*/("""</ul>

""")))}))
      }
    }
  }

  def render(buyOptions:List[BuyOption]): play.twirl.api.HtmlFormat.Appendable = apply(buyOptions)

  def f:((List[BuyOption]) => play.twirl.api.HtmlFormat.Appendable) = (buyOptions) => apply(buyOptions)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 28 21:34:11 BRT 2019
                  SOURCE: C:/Users/myghv/Documents/desafio-peixe-guilherme/app/views/buyoptions/sale.scala.html
                  HASH: 4c8839c6988f49cfc97cddce3725989ccd1bdba9
                  MATRIX: 662->1|998->27|1122->56|1152->61|1197->98|1235->99|1267->105|1364->177|1406->204|1444->205|1480->215|1658->366|1676->375|1703->381|1761->412|1779->421|1814->435|1843->436|1950->516|1968->525|2024->560|2070->579|2111->611|2150->612|2196->630|2304->707|2346->722|2386->753|2425->754|2471->772|2539->813|2554->819|2616->859|2683->895|2720->905|2762->917|2795->923
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|39->7|39->7|39->7|40->8|42->10|42->10|42->10|43->11|43->11|43->11|43->11|45->13|45->13|45->13|46->14|46->14|46->14|47->15|48->16|49->17|49->17|49->17|50->18|50->18|50->18|50->18|51->19|52->20|53->21|54->22
                  -- GENERATED --
              */
          