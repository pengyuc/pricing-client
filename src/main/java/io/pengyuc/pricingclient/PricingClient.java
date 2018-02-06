package io.pengyuc.pricingclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PricingService", url = "http://localhost:8080")
public interface PricingClient {
    @GetMapping(value = "/pricing", consumes = "application/json")
    Price getPrice();

}
