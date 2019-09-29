
package views.html

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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title : String)(body : Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.1*/("""<html>
    <head>
        <title>"""),_display_(/*4.17*/title),format.raw/*4.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" media="screen" href='"""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*6.110*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/bootstrap-grid.min.css")),format.raw/*7.115*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/bootstrap-reboot.min.css")),format.raw/*8.117*/("""'>
        <link rel="shortcut icon" type="image/png" href='"""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""'>
    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Desafio Peixe Urbano</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href=""""),_display_(/*21.52*/routes/*21.58*/.HomeController.index()),format.raw/*21.81*/("""">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href=""""),_display_(/*24.52*/routes/*24.58*/.DealsController.index()),format.raw/*24.82*/("""">Ofertas</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href=""""),_display_(/*27.52*/routes/*27.58*/.DealsController.dealsForSale()),format.raw/*27.89*/("""">Comprar</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container">

            """),_display_(/*35.14*/if(flash.containsKey("danger"))/*35.45*/{_display_(Seq[Any](format.raw/*35.46*/("""
                """),format.raw/*36.17*/("""<div class="alert alert-danger">
                    """),_display_(/*37.22*/flash/*37.27*/.get("danger")),format.raw/*37.41*/("""
                """),format.raw/*38.17*/("""</div>
            """)))}),format.raw/*39.14*/("""
            """),_display_(/*40.14*/if(flash.containsKey("success"))/*40.46*/{_display_(Seq[Any](format.raw/*40.47*/("""
                """),format.raw/*41.17*/("""<div class="alert alert-success">
                """),_display_(/*42.18*/flash/*42.23*/.get("success")),format.raw/*42.38*/("""
                """),format.raw/*43.17*/("""</div>
            """)))}),format.raw/*44.14*/("""
            """),_display_(/*45.14*/body),format.raw/*45.18*/("""
        """),format.raw/*46.9*/("""</div>

        <script src='"""),_display_(/*48.23*/routes/*48.29*/.Assets.versioned("../../public/js/jquery-3.4.1.min.js")),format.raw/*48.85*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*49.23*/routes/*49.29*/.Assets.versioned("../../public/js/bootstrap.min.js")),format.raw/*49.82*/("""' type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 28 18:29:54 BRT 2019
                  SOURCE: C:/Users/myghv/Documents/desafio-peixe-guilherme/app/views/layout.scala.html
                  HASH: 3496a0795b9f6aa2eecdac209cb80d873b9f41f3
                  MATRIX: 954->1|1078->30|1106->32|1168->68|1193->73|1362->216|1376->222|1447->272|1530->329|1544->335|1620->390|1703->447|1717->453|1795->510|1883->572|1897->578|1957->617|2632->1265|2647->1271|2691->1294|2890->1466|2905->1472|2950->1496|3113->1632|3128->1638|3180->1669|3358->1820|3398->1851|3437->1852|3483->1870|3565->1925|3579->1930|3614->1944|3660->1962|3712->1983|3754->1998|3795->2030|3834->2031|3880->2049|3959->2101|3973->2106|4009->2121|4055->2139|4107->2160|4149->2175|4174->2179|4211->2189|4270->2221|4285->2227|4362->2283|4447->2341|4462->2347|4536->2400
                  LINES: 28->1|33->1|34->2|36->4|36->4|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|53->21|53->21|53->21|56->24|56->24|56->24|59->27|59->27|59->27|67->35|67->35|67->35|68->36|69->37|69->37|69->37|70->38|71->39|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|76->44|77->45|77->45|78->46|80->48|80->48|80->48|81->49|81->49|81->49
                  -- GENERATED --
              */
          