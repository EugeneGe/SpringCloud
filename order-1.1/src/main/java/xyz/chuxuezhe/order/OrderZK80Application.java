package xyz.chuxuezhe.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author EugeneGe
 * @date 2020-12-22 10:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZK80Application {
    public static void main(String[] args) {
        SpringApplication.run(OrderZK80Application.class, args);
    }
}
