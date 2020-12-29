package xyz.chuxuezhe.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author EugeneGe
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class OrderHystrixDashboard9001Application {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixDashboard9001Application.class);
    }
}
