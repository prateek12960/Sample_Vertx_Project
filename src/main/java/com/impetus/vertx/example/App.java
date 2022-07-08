package com.impetus.vertx.example;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

public class App {
    public static void main(String[] args) {

        Vertx vertx = Vertx.vertx();
        HttpServer httpServer = vertx.createHttpServer();

        Router router = Router.router(vertx);
        Route handler1 = router.route("/hello").handler(routingContext -> {
            HttpServerResponse response = routingContext.response();
            response.setChunked(true);
            response.write("Handler 1 Write Method");
            routingContext.vertx().setTimer(5000, tid -> routingContext.next());
            response.putHeader("content-type", "text/plain");
            response.end("Hello World");
        });
        Route handler2 = router.route("/hello").handler(routingContext -> {
            HttpServerResponse response = routingContext.response();
            response.write("Handler 2 Write Method");
            routingContext.vertx().setTimer(5000, tid -> routingContext.next());
            response.putHeader("content-type", "text/plain");
            response.end("Hello World");
        });
        Route handler3 = router.route("/hello").handler(routingContext -> {
            HttpServerResponse response = routingContext.response();
            response.write("Handler 3 Write Method");
            routingContext.vertx().setTimer(5000, tid -> routingContext.next());
            response.putHeader("content-type", "text/plain");
            response.end("Hello World");
        });
        System.out.println("Hii");
        httpServer.requestHandler(router).listen(8091);
    }
}
