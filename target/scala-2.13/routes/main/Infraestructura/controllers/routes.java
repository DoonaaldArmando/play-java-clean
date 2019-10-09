// @GENERATOR:play-routes-compiler
// @SOURCE:/home/donald-armando/Workspace/Java/Play/play-samples-play-java-rest-api-example/conf/routes
// @DATE:Tue Oct 08 20:01:19 COT 2019

package Infraestructura.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final Infraestructura.controllers.ReverseHomeController HomeController = new Infraestructura.controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final Infraestructura.controllers.javascript.ReverseHomeController HomeController = new Infraestructura.controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
