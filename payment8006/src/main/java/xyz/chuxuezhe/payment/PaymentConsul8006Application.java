package xyz.chuxuezhe.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * EnableDiscoveryClient 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
 *
 * @author EugeneGe
 * @description
 * @date 2020-09-15 17:29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8006Application {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul8006Application.class, args);
    }

}
