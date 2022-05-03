package com.currency.exhcange.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.currency.exhcange.model.CurrencyExchange;

@Service
public class CurrencyRepositoryImpl implements CurrencyRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	public int save(CurrencyExchange currencyExchange) {
		String sql = "INSERT INTO micro.currency_exchange(froms, tos, conversionmultiple) VALUES(:from,:to,:conversionMultiple)";
		Map<String,Object> map=new HashMap<String,Object>();  
		map.put("from", currencyExchange.getFroms());
		map.put("to",currencyExchange.getTo());  
		map.put("conversionMultiple",currencyExchange.getConversionMultiple());  
		
		return template.update(sql,map);
	}
}
