// @GENERATOR:play-routes-compiler
// @SOURCE:/home/donald-armando/Workspace/Java/Play/play-samples-play-java-rest-api-example/conf/routes
// @DATE:Tue Oct 08 20:01:19 COT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_0: Infraestructura.controllers.HomeController,
  // @LINE:4
  posts_Routes_0: posts.Routes,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_0: Infraestructura.controllers.HomeController,
    // @LINE:4
    posts_Routes_0: posts.Routes
  ) = this(errorHandler, HomeController_0, posts_Routes_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, posts_Routes_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """Infraestructura.controllers.HomeController.index"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """id<[^/]+>""", """Infraestructura.controllers.HomeController.update(request:Request, id:String)"""),
    prefixed_posts_Routes_0_2.router.documentation,
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val Infraestructura_controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val Infraestructura_controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "Infraestructura.controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val Infraestructura_controllers_HomeController_update1_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val Infraestructura_controllers_HomeController_update1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.update(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "Infraestructura.controllers.HomeController",
      "update",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "PUT",
      this.prefix + """""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] val prefixed_posts_Routes_0_2 = Include(posts_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v1/posts"))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case Infraestructura_controllers_HomeController_index0_route(params@_) =>
      call { 
        Infraestructura_controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:2
    case Infraestructura_controllers_HomeController_update1_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        Infraestructura_controllers_HomeController_update1_invoker.call(
          req => HomeController_0.update(req, id))
      }
  
    // @LINE:4
    case prefixed_posts_Routes_0_2(handler) => handler
  }
}
