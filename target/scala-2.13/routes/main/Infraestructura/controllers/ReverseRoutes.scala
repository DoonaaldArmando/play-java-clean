// @GENERATOR:play-routes-compiler
// @SOURCE:/home/donald-armando/Workspace/Java/Play/play-samples-play-java-rest-api-example/conf/routes
// @DATE:Tue Oct 08 20:01:19 COT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package Infraestructura.controllers {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def update(id:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
