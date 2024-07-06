package org.example.servicediscoveryjuly6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryJuly6Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryJuly6Application.class, args);
    }

}
