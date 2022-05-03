package com.currency.exhcange.model;

import java.math.BigDecimal;

public class CurrencyExchange {

	private Long id;
	private String froms;
	private String to;
	private BigDecimal conversionMultiple;
	private String environment;

	public CurrencyExchange() {
		super();
	}

	public CurrencyExchange(Long id, String froms, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.froms = froms;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFroms() {
		return froms;
	}

	public void setFroms(String froms) {
		this.froms = froms;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", froms=" + froms + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + ", environment=" + environment + "]";
	}

}
