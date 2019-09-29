// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/myghv/Documents/desafio-peixe-guilherme/conf/routes
// @DATE:Sat Sep 28 22:42:35 BRT 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBuyOptionsController BuyOptionsController = new controllers.ReverseBuyOptionsController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDealsController DealsController = new controllers.ReverseDealsController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBuyOptionsController BuyOptionsController = new controllers.javascript.ReverseBuyOptionsController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDealsController DealsController = new controllers.javascript.ReverseDealsController(RoutesPrefix.byNamePrefix());
  }

}
