package com.google.gwt.sample.stockwatcher.client;

public class DelistedException extends Exception {
	
	private String symbol;
	
	public DelistedException(){}
	
	public DelistedException(String symbol)
	{
		this.symbol = symbol;
	
	}
	
	public String getSymbol()
	{
		return symbol;
	}

}
