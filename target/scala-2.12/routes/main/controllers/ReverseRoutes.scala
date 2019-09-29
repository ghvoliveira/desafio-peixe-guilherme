// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/myghv/Documents/desafio-peixe-guilherme/conf/routes
// @DATE:Sat Sep 28 22:42:35 BRT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:29
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:16
  class ReverseBuyOptionsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deals/buyoptions/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:16
    def create(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deals/buyoptions/create/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:25
    def buyOptionsForSale(deal:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sales/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("deal", deal)))
    }
  
    // @LINE:20
    def destroy(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deals/buyoptions/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:23
    def sell(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sales/buyoption/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:18
    def save(): Call = {
    
      () match {
      
        // @LINE:18
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "deals/buyoptions/create")
      
      }
    
    }
  
  }

  // @LINE:8
  class ReverseDealsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deals/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:9
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deals/create")
    }
  
    // @LINE:10
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deals/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:14
    def destroy(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deals/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:22
    def dealsForSale(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sales")
    }
  
    // @LINE:24
    def searchByUrl(deal:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sales/deal/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("deal", deal)))
    }
  
    // @LINE:12
    def save(): Call = {
    
      () match {
      
        // @LINE:12
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "deals/create")
      
      }
    
    }
  
    // @LINE:8
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deals")
    }
  
  }


}
