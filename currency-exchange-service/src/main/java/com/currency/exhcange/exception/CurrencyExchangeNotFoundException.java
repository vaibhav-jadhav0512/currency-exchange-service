package com.currency.exhcange.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CurrencyExchangeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5859067729040327216L;

	private Object[] args;

	public CurrencyExchangeNotFoundException() {
		super();
	}

	public CurrencyExchangeNotFoundException(String message) {
		super(message);
	}

	public CurrencyExchangeNotFoundException(String message, Object[] args) {
		super(message);
		this.args = args;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}

}
