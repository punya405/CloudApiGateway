package com.spring.axxya.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/ms02/**")
                        .uri("http://localhost:8200"))
                .route(r -> r.path("/ms03/**")
                        .uri("http://localhost:8300"))
                .build();
    }

}
