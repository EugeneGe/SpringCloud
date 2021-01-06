package xyz.chuxuezhe.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author EugeneGe
 * @description
 * @date 2020-09-19 14:29
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenter3344Aplication {
    public static void main(String[] args) {

        SpringApplication.run(ConfigCenter3344Aplication.class);
    }
}
