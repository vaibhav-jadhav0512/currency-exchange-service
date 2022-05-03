package com.currency.exhcange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.currency.exhcange.model.CurrencyExchange;
import com.currency.exhcange.repository.CurrencyRepositoryImpl;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;

	@Autowired
	private CurrencyRepositoryImpl currencyRepo;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable(value = "from") String from,
			@PathVariable(value = "to") String to) {
		CurrencyExchange currencyExchange = currencyRepo.findByFromAndTo(from, to);
		currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
		return currencyExchange;
	}

	@PostMapping("/currency")
	public int createCurrency(@RequestBody CurrencyExchange currencyExchange) {
		System.out.println(currencyExchange.toString());
		return currencyRepo.save(currencyExchange);
	}

}
