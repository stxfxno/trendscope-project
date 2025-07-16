package com.trendscope.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("trendscope-service", r -> r.path("/api/trends/**", "/api/auth/**")
                .uri("http://microservice:8080"))
            .route("external-data-service", r -> r.path("/api/external/**")
                .uri("http://dummy-service:8081"))
            .build();
    }
}