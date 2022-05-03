package com.currency.exhcange.repository;

import com.currency.exhcange.model.CurrencyExchange;

public interface CurrencyRepository {
	public int save(CurrencyExchange currencyExchange);
}
