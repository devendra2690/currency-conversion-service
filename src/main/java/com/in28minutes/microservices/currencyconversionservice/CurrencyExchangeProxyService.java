package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="currency-conversion-service",url="localhost:8000")
public interface CurrencyExchangeProxyService {

	@GetMapping("/currency-exchnage/{from}/to/{to}")
	public CurrencyConversion getExChangeRate(@PathVariable("from") String from, @PathVariable("to") String to);
}
