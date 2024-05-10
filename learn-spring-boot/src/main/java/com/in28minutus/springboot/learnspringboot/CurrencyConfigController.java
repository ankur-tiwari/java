package com.in28minutus.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {
	@Autowired
	private CurrencyConfigService currencyConfiguration;
	
	@RequestMapping("/currency")
	public CurrencyConfigService retriveConfig() {
		return currencyConfiguration;
	}
}
