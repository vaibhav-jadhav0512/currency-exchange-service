package com.currency.exhcange.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.currency.exhcange.exception.CurrencyExchangeNotFoundException;
import com.currency.exhcange.model.CurrencyExchange;
import com.currency.exhcange.queries.CurrencyExchangeQueries;
import com.currency.exhcange.rowmapper.CurrencyExchangeMapper;

@Service
public class CurrencyRepositoryImpl implements CurrencyRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	public int save(CurrencyExchange currencyExchange) {
		Map<String,Object> map=new HashMap<String,Object>();  
		map.put("from", currencyExchange.getFrom());
		map.put("to",currencyExchange.getTo());  
		map.put("conversionMultiple",currencyExchange.getConversionMultiple());  
		return template.update(CurrencyExchangeQueries.SAVE_CURRENCY_DATA, map);
	}

	public CurrencyExchange findByFromAndTo(String from, String to) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("from", from);
		map.put("to", to);
		try {
		return template.queryForObject(CurrencyExchangeQueries.FIND_BY_FROM_AND_TO, map, new CurrencyExchangeMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new CurrencyExchangeNotFoundException("Currency Details not found!");
		}
	}
}
