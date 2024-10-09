package com.mphasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication
@EnableHystrixDashboard
public class StoreappConsumerEurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappConsumerEurekaFeignApplication.class, args);
	}

}