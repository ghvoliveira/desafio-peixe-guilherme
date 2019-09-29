
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout("Bem-Vindo")/*1.21*/{_display_(Seq[Any](format.raw/*1.22*/("""
  """),format.raw/*2.3*/("""<div class="jumbotron">
    <h1 class="display-4">Bem-vindo!</h1>
    <p class="lead">Esta é a solução do candidato Guilherme Henrique Vieira de Oliveira</p>
    <hr class="my-4">
    <p>Ao clicar no botão você terá acesso a um vídeo de demonstração da solução</p>
    <a class="btn btn-primary btn-lg" href="https://drive.google.com/open?id=1I6w-K4HbGBVwkKlyJ0Gr4YVq4c5juTlj" target="_blank" role="button">Clique para ver o tutorial</a>
  </div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 28 23:15:17 BRT 2019
                  SOURCE: C:/Users/myghv/Documents/desafio-peixe-guilherme/app/views/index.scala.html
                  HASH: fceb177e7c8cd185b3d12632819e4f670b493e0d
                  MATRIX: 1030->1|1057->20|1095->21|1125->25
                  LINES: 33->1|33->1|33->1|34->2
                  -- GENERATED --
              */
          