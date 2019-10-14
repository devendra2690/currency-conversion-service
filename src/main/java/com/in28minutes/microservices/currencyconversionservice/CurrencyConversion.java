package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;


public class CurrencyConversion {
	
	private int id;
	private String fromCurrency;
	private String toCurrency;
	private int quantity;
	private int totalConversion;
	private int serverPort;
	private int exchangeRate;
	
	public CurrencyConversion(int id, String fromCurrency, String toCurrency, int quantity, int totalConversion,
			int serverPort, int exchangeRate) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.quantity = quantity;
		this.totalConversion = totalConversion;
		this.serverPort = serverPort;
		this.exchangeRate = exchangeRate;
	}

	public CurrencyConversion() {
		
	}

	public int getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(int exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalConversion() {
		return totalConversion;
	}

	public void setTotalConversion(int totalConversion) {
		this.totalConversion = totalConversion;
	}

	public int getServerPort() {
		return serverPort;
	}

	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency
				+ ", quantity=" + quantity + ", totalConversion=" + totalConversion + ", serverPort=" + serverPort
				+ ", conversionRate=" + exchangeRate + "]";
	}
}
