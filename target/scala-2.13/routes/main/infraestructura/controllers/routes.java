// @GENERATOR:play-routes-compiler
// @SOURCE:/home/donald-armando/Workspace/Java/Play/play-samples-play-java-rest-api-example/conf/routes
// @DATE:Tue Oct 08 19:42:13 COT 2019

package infraestructura.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final ReverseHomeController HomeController = new ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final ReverseHomeController HomeController = new ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
