
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
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!doctype html>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Play REST API</title>
  </head>

  <body>
    <h1>Play REST API</h1>

    <p>
      This is a placeholder page to show you the REST API.  Use <a href="https://httpie.org/">httpie</a> to post JSON to the application.
    </p>

    <p>
      To see all posts, you can do a GET:
    </p>


<pre>
    <code>http GET localhost:9000/v1/posts</code>
</pre>

    <p>
      To create new posts, do a post
    <p>

<pre>
    <code>http POST localhost:9000/v1/posts title="Some title" body="Some Body"</code>
</pre>

<p>
  You can always look at the API directly: <a href="/v1/posts">/v1/posts</a>
</p>

  </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-08T17:34:23.544550
                  SOURCE: /home/donald-armando/Workspace/Java/Play/play-samples-play-java-rest-api-example/app/views/index.scala.html
                  HASH: f9be3c21c33f33e2ecb649e9c8417343465e628b
                  MATRIX: 941->1|1037->4
                  LINES: 28->1|33->2
                  -- GENERATED --
              */
          