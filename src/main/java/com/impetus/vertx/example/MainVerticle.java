package com.impetus.vertx.example;

import io.vertx.core.Vertx;

public class MainVerticle {

    public static void main(String[] args) {

        Vertx vertx = Vertx.vertx();
        FirstVerticle fv = new FirstVerticle();
        vertx.deployVerticle(fv);
    }
}
