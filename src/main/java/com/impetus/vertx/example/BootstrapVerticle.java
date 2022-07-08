package com.impetus.vertx.example;

import io.vertx.core.AbstractVerticle;

public class BootstrapVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        vertx.deployVerticle("com.impetus.vertx.example.FirstVerticle");
//        vertx.deployVerticle(FirstVerticle.class.getName());
//        vertx.deployVerticle(new FirstVerticle());
    }
}
