package com.wipprep.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

/*    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p ->
                        p.path("/users")
                                .filters(f -> f.circuitBreaker(config ->
                                        config.setName("myCmd").setFallbackUri("forward:/fallback")))
                                .uri("http://localhost:8083")
                )
                .route(p ->
                        p.path("/departments")
                                .filters(f -> f.circuitBreaker(config ->
                                        config.setName("myCmd2").setFallbackUri("forward:/fallback2")))
                                .uri("http://localhost:8082")
                )
                .build();
    }*/
}
