// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/myghv/Documents/desafio-peixe-guilherme/conf/routes
// @DATE:Sat Sep 28 22:42:35 BRT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
