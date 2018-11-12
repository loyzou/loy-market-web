package org.xxjr.market.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.xxjr.*"})
public class MarketApplication {
	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
		System.out.println("........market web start.........");
	}
}
