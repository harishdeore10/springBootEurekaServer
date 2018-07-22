package com.way2learnonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

	public static void main(String[] args) {
	System.out.println("Hello Git");
		SpringApplication.run(EurekaServer.class, args);
	}
}
