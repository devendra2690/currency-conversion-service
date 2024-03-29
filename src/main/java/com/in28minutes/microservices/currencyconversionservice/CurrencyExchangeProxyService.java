package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currency-conversion-service",url="localhost:8000")
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeProxyService {

	//@GetMapping("/currency-exchange/{from}/to/{to}")
	@GetMapping("/currency-exchange-service/currency-exchange/{from}/to/{to}")
	public CurrencyConversion getExChangeRate(@PathVariable("from") String from, @PathVariable("to") String to);
}
