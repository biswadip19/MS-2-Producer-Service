package com.mypoc.MS2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mypoc")
@EnableDiscoveryClient
public class Ms2Application {
	public static void main(String[] args) {
		SpringApplication.run(Ms2Application.class, args);
	}
}
