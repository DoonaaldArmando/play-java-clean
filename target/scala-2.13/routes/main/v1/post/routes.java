// @GENERATOR:play-routes-compiler
// @SOURCE:/home/donald-armando/Workspace/Java/Play/play-samples-play-java-rest-api-example/conf/posts.routes
// @DATE:Tue Oct 08 19:15:30 COT 2019

package v1.post;

import posts.RoutesPrefix;

public class routes {
  
  public static final v1.post.ReversePostController PostController = new v1.post.ReversePostController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final v1.post.javascript.ReversePostController PostController = new v1.post.javascript.ReversePostController(RoutesPrefix.byNamePrefix());
  }

}
