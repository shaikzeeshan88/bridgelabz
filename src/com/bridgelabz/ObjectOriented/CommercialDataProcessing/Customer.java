package com.bridgelabz.ObjectOriented.CommercialDataProcessing;

public class Customer {
	
	String name;
	int amount;
	int numberOfShares;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	
	public int getNumberShares() {
		return numberOfShares;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void setNumberShares(int numberShares) {
		this.numberOfShares = numberShares;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", amount=" + amount + ", numberShares=" + numberOfShares
				+ "]";
	}
	

}