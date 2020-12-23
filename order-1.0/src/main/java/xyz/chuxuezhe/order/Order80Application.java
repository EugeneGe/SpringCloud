package xyz.chuxuezhe.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author EugeneGe
 * @date 2020-12-22 10:41
 */
@SpringBootApplication
@EnableEurekaClient
public class Order80Application {
    public static void main(String[] args) {
        SpringApplication.run(Order80Application.class, args);
    }
}
