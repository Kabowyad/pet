package net.yan.pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigurationServiceApp {

    public static void main(String[] args) {

        SpringApplication.run(ConfigurationServiceApp.class, args);
    }
}
