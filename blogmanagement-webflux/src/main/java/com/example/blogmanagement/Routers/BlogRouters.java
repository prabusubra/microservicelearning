package com.example.blogmanagement.Routers;

import com.example.blogmanagement.Repositories.BlogRepository;
import com.example.blogmanagement.beans.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Mono;

@Configuration
public class BlogRouters {
    @Autowired
    BlogRepository blogRepository;
    @Bean
    public RouterFunction blogroute(){
        return RouterFunctions.nest(RequestPredicates.path("/api"),
                RouterFunctions.route(RequestPredicates.GET("/blogs"),
                        req-> ServerResponse.ok().body(blogRepository.findAll(),Topic.class))
                .andRoute(RequestPredicates.GET("/blogs/id/{id}"),
                        req -> ServerResponse.ok().body(blogRepository.findById(req.pathVariable("id")),Topic.class))
                .andRoute(RequestPredicates.POST("/blogs"),
                        req -> ServerResponse.ok().body(blogRepository.saveAll(req.bodyToFlux(Topic.class)),Topic.class))
                .andRoute(RequestPredicates.DELETE("/blogs/id/{id}"),
                        req -> ServerResponse.ok().body(blogRepository.deleteById(req.pathVariable("id")),Void.class))
        );
    }

}
/*
@Component
class BlogHandlers{

    @Autowired
    BlogRepository blogRepository;

    Mono<ServerResponse> getAll(ServerRequest req){
        return ServerResponse.ok().body(blogRepository.findAll(),Topic.class);
    }
    Mono<ServerResponse> getById(ServerRequest req){
        return ServerResponse.ok().body(blogRepository.findById(req.pathVariable("id")),Topic.class);
    }
    Mono<ServerResponse> createData(ServerRequest req){
        return ServerResponse.ok().body(blogRepository.saveAll(req.bodyToFlux(Topic.class)),Topic.class);
    }
    Mono<ServerResponse> deleteById(ServerRequest req){
        return ServerResponse.ok().body(blogRepository.deleteById(req.pathVariable("id")),Void.class);
    }

}*/
