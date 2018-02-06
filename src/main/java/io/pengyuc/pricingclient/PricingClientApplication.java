package io.pengyuc.pricingclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class PricingClientApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PricingClientApplication.class, args);
		PricingClient client = ctx.getBean(PricingClient.class);
		Price p = client.getPrice();
		System.out.println("Price is " + p.getPrice());

	}
}
