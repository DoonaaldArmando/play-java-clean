package infraestructura.controllers;

import play.libs.Json;
import play.mvc.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public CompletionStage<Result> index() {
        return CompletableFuture
                .completedStage(
                        ok(Json.toJson(new hola("Hola mundo")))
                );
    }

    public CompletionStage<Result> update(Http.Request request, String id) {
        return CompletableFuture.completedStage(ok(Json.toJson(request.getHeaders().toMap())));
    }

}


