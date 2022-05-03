package com.currency.exhcange.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.currency.exhcange.model.CurrencyExchange;

public class CurrencyExchangeMapper implements RowMapper<CurrencyExchange> {

	@Override
	public CurrencyExchange mapRow(ResultSet rs, int rowNum) throws SQLException {
		CurrencyExchange currencyExchange = new CurrencyExchange();
		currencyExchange.setId(rs.getLong("id"));
		currencyExchange.setFrom(rs.getString("froms"));
		currencyExchange.setTo(rs.getString("tos"));
		currencyExchange.setConversionMultiple(rs.getBigDecimal("conversionmultiple"));
		return currencyExchange;
	}
}
