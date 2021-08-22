package com.monkatos.monkaw.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

import com.monkatos.monkaw.middleware.MockHandler;

@Configuration
public class Router {

    @Bean
    public RouterFunction<ServerResponse> productsRoute(MockHandler mockHandler){
        return RouterFunctions
        .route(GET("/bumble/profiles").and(accept(MediaType.APPLICATION_JSON)),mockHandler::get);
                // .andRoute(POST("/product").and(accept(MediaType.APPLICATION_JSON))
                //         ,productHandler::createProduct)
                // .andRoute(DELETE("/product/{id}").and(accept(MediaType.APPLICATION_JSON))
                //         ,productHandler::deleteProduct)
                // .andRoute(PUT("/product/{id}").and(accept(MediaType.APPLICATION_JSON))
                //         ,productHandler::updateProduct);
    }

}
