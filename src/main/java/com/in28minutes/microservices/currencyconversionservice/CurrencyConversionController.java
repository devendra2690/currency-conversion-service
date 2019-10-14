package com.in28minutes.microservices.currencyconversionservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	CurrencyExchangeProxyService currencyExchangeProxyService;
	
	@GetMapping("currency-conversion/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion currencyConverion(@PathVariable("from") String from,@PathVariable("to") String to,
			                                           @PathVariable("quantity") int quantity) {
		
		
		Map<String, String> paramter = new HashMap<>();
		paramter.put("from", from);
		paramter.put("to", to);
		
		ResponseEntity<CurrencyConversion> response =  
				new RestTemplate().getForEntity("http://localhost:8000/currency-exchnage/{from}/to/{to}", 
						CurrencyConversion.class, paramter);
		
		return new CurrencyConversion(response.getBody().getId(), from, to, quantity, 
				                          (quantity * response.getBody().getExchangeRate()), 
				                          response.getBody().getServerPort(), response.getBody().getExchangeRate());
	}
	
	@GetMapping("currency-conversion-feign/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion currencyConverionFein(@PathVariable("from") String from,@PathVariable("to") String to,
			                                           @PathVariable("quantity") int quantity) {
		
		
		
		CurrencyConversion response =  currencyExchangeProxyService.getExChangeRate(from, to);
		
		return new CurrencyConversion(response.getId(), from, to, quantity, 
				                          (quantity * response.getExchangeRate()), 
				                          response.getServerPort(), response.getExchangeRate());
	}
	
}
