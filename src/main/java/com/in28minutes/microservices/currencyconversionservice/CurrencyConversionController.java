package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	
	@GetMapping("currency-conversion/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion currencyConverion(@PathVariable("from") String from,@PathVariable("to") String to,
			                                           @PathVariable("quantity") int quantity) {
		
		return new CurrencyConversion(1001, "USD", "INR", 1000, 65000, 1000, 65);
	}
}
