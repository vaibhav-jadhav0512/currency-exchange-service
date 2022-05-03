package com.currency.exhcange.queries;

public class CurrencyExchangeQueries {
	public static final String SAVE_CURRENCY_DATA = "INSERT INTO micro.currency_exchange(froms, tos, conversionmultiple) VALUES(:from,:to,:conversionMultiple)";
	public static final String FIND_BY_FROM_AND_TO = "SELECT * FROM micro.currency_exchange WHERE LOWER(froms) =LOWER(:from) and LOWER(tos) =LOWER(:to)";
}
