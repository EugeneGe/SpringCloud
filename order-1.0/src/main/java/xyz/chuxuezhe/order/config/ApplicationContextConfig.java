package xyz.chuxuezhe.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author EugeneGe
 * @description 消费者只关心微服务名称.
 * @date 2020-09-14 16:54
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 将RestTemplate 注入spring容器中
     *
     * @return
     */
    @Bean
//    @LoadBalanced //为了试验自己写的rule
    //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
