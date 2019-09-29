// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/myghv/Documents/desafio-peixe-guilherme/conf/routes
// @DATE:Sat Sep 28 22:42:35 BRT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:8
  DealsController_2: controllers.DealsController,
  // @LINE:16
  BuyOptionsController_3: controllers.BuyOptionsController,
  // @LINE:29
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:8
    DealsController_2: controllers.DealsController,
    // @LINE:16
    BuyOptionsController_3: controllers.BuyOptionsController,
    // @LINE:29
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, DealsController_2, BuyOptionsController_3, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, DealsController_2, BuyOptionsController_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals""", """controllers.DealsController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals/create""", """controllers.DealsController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals/""" + "$" + """id<[^/]+>""", """controllers.DealsController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals/edit/""" + "$" + """id<[^/]+>""", """controllers.DealsController.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals/create""", """controllers.DealsController.save()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals/edit""", """controllers.DealsController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals/delete/""" + "$" + """id<[^/]+>""", """controllers.DealsController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals/buyoptions/create/""" + "$" + """id<[^/]+>""", """controllers.BuyOptionsController.create(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals/buyoptions/edit/""" + "$" + """id<[^/]+>""", """controllers.BuyOptionsController.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals/buyoptions/create""", """controllers.BuyOptionsController.save()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals/buyoptions/edit""", """controllers.BuyOptionsController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals/buyoptions/""" + "$" + """id<[^/]+>""", """controllers.BuyOptionsController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sales""", """controllers.DealsController.dealsForSale()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sales/buyoption/""" + "$" + """id<[^/]+>""", """controllers.BuyOptionsController.sell(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sales/deal/""" + "$" + """deal<[^/]+>""", """controllers.DealsController.searchByUrl(deal:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sales/""" + "$" + """deal<[^/]+>""", """controllers.BuyOptionsController.buyOptionsForSale(deal:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_DealsController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals")))
  )
  private[this] lazy val controllers_DealsController_index1_invoker = createInvoker(
    DealsController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DealsController",
      "index",
      Nil,
      "GET",
      this.prefix + """deals""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_DealsController_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals/create")))
  )
  private[this] lazy val controllers_DealsController_create2_invoker = createInvoker(
    DealsController_2.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DealsController",
      "create",
      Nil,
      "GET",
      this.prefix + """deals/create""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_DealsController_show3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DealsController_show3_invoker = createInvoker(
    DealsController_2.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DealsController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """deals/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_DealsController_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DealsController_edit4_invoker = createInvoker(
    DealsController_2.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DealsController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """deals/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_DealsController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals/create")))
  )
  private[this] lazy val controllers_DealsController_save5_invoker = createInvoker(
    DealsController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DealsController",
      "save",
      Nil,
      "POST",
      this.prefix + """deals/create""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_DealsController_save6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals/edit")))
  )
  private[this] lazy val controllers_DealsController_save6_invoker = createInvoker(
    DealsController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DealsController",
      "save",
      Nil,
      "POST",
      this.prefix + """deals/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_DealsController_destroy7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DealsController_destroy7_invoker = createInvoker(
    DealsController_2.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DealsController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """deals/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_BuyOptionsController_create8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals/buyoptions/create/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BuyOptionsController_create8_invoker = createInvoker(
    BuyOptionsController_3.create(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BuyOptionsController",
      "create",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """deals/buyoptions/create/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_BuyOptionsController_edit9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals/buyoptions/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BuyOptionsController_edit9_invoker = createInvoker(
    BuyOptionsController_3.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BuyOptionsController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """deals/buyoptions/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_BuyOptionsController_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals/buyoptions/create")))
  )
  private[this] lazy val controllers_BuyOptionsController_save10_invoker = createInvoker(
    BuyOptionsController_3.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BuyOptionsController",
      "save",
      Nil,
      "POST",
      this.prefix + """deals/buyoptions/create""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_BuyOptionsController_save11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals/buyoptions/edit")))
  )
  private[this] lazy val controllers_BuyOptionsController_save11_invoker = createInvoker(
    BuyOptionsController_3.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BuyOptionsController",
      "save",
      Nil,
      "POST",
      this.prefix + """deals/buyoptions/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_BuyOptionsController_destroy12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals/buyoptions/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BuyOptionsController_destroy12_invoker = createInvoker(
    BuyOptionsController_3.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BuyOptionsController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """deals/buyoptions/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_DealsController_dealsForSale13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sales")))
  )
  private[this] lazy val controllers_DealsController_dealsForSale13_invoker = createInvoker(
    DealsController_2.dealsForSale(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DealsController",
      "dealsForSale",
      Nil,
      "GET",
      this.prefix + """sales""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_BuyOptionsController_sell14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sales/buyoption/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BuyOptionsController_sell14_invoker = createInvoker(
    BuyOptionsController_3.sell(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BuyOptionsController",
      "sell",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """sales/buyoption/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_DealsController_searchByUrl15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sales/deal/"), DynamicPart("deal", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DealsController_searchByUrl15_invoker = createInvoker(
    DealsController_2.searchByUrl(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DealsController",
      "searchByUrl",
      Seq(classOf[String]),
      "GET",
      this.prefix + """sales/deal/""" + "$" + """deal<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_BuyOptionsController_buyOptionsForSale16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sales/"), DynamicPart("deal", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BuyOptionsController_buyOptionsForSale16_invoker = createInvoker(
    BuyOptionsController_3.buyOptionsForSale(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BuyOptionsController",
      "buyOptionsForSale",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """sales/""" + "$" + """deal<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_versioned17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned17_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_DealsController_index1_route(params@_) =>
      call { 
        controllers_DealsController_index1_invoker.call(DealsController_2.index())
      }
  
    // @LINE:9
    case controllers_DealsController_create2_route(params@_) =>
      call { 
        controllers_DealsController_create2_invoker.call(DealsController_2.create())
      }
  
    // @LINE:10
    case controllers_DealsController_show3_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_DealsController_show3_invoker.call(DealsController_2.show(id))
      }
  
    // @LINE:11
    case controllers_DealsController_edit4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_DealsController_edit4_invoker.call(DealsController_2.edit(id))
      }
  
    // @LINE:12
    case controllers_DealsController_save5_route(params@_) =>
      call { 
        controllers_DealsController_save5_invoker.call(DealsController_2.save())
      }
  
    // @LINE:13
    case controllers_DealsController_save6_route(params@_) =>
      call { 
        controllers_DealsController_save6_invoker.call(DealsController_2.save())
      }
  
    // @LINE:14
    case controllers_DealsController_destroy7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_DealsController_destroy7_invoker.call(DealsController_2.destroy(id))
      }
  
    // @LINE:16
    case controllers_BuyOptionsController_create8_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BuyOptionsController_create8_invoker.call(BuyOptionsController_3.create(id))
      }
  
    // @LINE:17
    case controllers_BuyOptionsController_edit9_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BuyOptionsController_edit9_invoker.call(BuyOptionsController_3.edit(id))
      }
  
    // @LINE:18
    case controllers_BuyOptionsController_save10_route(params@_) =>
      call { 
        controllers_BuyOptionsController_save10_invoker.call(BuyOptionsController_3.save())
      }
  
    // @LINE:19
    case controllers_BuyOptionsController_save11_route(params@_) =>
      call { 
        controllers_BuyOptionsController_save11_invoker.call(BuyOptionsController_3.save())
      }
  
    // @LINE:20
    case controllers_BuyOptionsController_destroy12_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BuyOptionsController_destroy12_invoker.call(BuyOptionsController_3.destroy(id))
      }
  
    // @LINE:22
    case controllers_DealsController_dealsForSale13_route(params@_) =>
      call { 
        controllers_DealsController_dealsForSale13_invoker.call(DealsController_2.dealsForSale())
      }
  
    // @LINE:23
    case controllers_BuyOptionsController_sell14_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BuyOptionsController_sell14_invoker.call(BuyOptionsController_3.sell(id))
      }
  
    // @LINE:24
    case controllers_DealsController_searchByUrl15_route(params@_) =>
      call(params.fromPath[String]("deal", None)) { (deal) =>
        controllers_DealsController_searchByUrl15_invoker.call(DealsController_2.searchByUrl(deal))
      }
  
    // @LINE:25
    case controllers_BuyOptionsController_buyOptionsForSale16_route(params@_) =>
      call(params.fromPath[Integer]("deal", None)) { (deal) =>
        controllers_BuyOptionsController_buyOptionsForSale16_invoker.call(BuyOptionsController_3.buyOptionsForSale(deal))
      }
  
    // @LINE:29
    case controllers_Assets_versioned17_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned17_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
