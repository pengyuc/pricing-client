package io.pengyuc.pricingclient;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

@RunWith(SpringRunner.class)
@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.NONE, properties = {
		"stubrunner.idsToServiceIds.price-service=PriceService"
})
@AutoConfigureStubRunner(ids="io.pengyuc:price-service", workOffline = true)
public class PricingClientApplicationTests {
    @Inject
    PricingClient client;
	@Test
	public void contextLoads() {
	    Price p = client.getPrice();
        Assert.assertEquals(1024, p.getPrice());
	}

}
