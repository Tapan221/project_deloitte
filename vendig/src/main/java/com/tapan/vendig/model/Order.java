package com.tapan.vendig.model;

public class Order {
	
	private String item;
	private int cent;
	private int nickle;
	private int dime;
	private int quarter;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getCent() {
		return cent;
	}
	public void setCent(int cent) {
		this.cent = cent;
	}
	public int getNickle() {
		return nickle;
	}
	public void setNickle(int nickle) {
		this.nickle = nickle;
	}
	public int getDime() {
		return dime;
	}
	public void setDime(int dime) {
		this.dime = dime;
	}
	public int getQuarter() {
		return quarter;
	}
	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}
	public Order(String item, int cent, int nickle, int dime, int quarter) {
		super();
		this.item = item;
		this.cent = cent;
		this.nickle = nickle;
		this.dime = dime;
		this.quarter = quarter;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [item=" + item + ", cent=" + cent + ", nickle=" + nickle + ", dime=" + dime + ", quarter="
				+ quarter + "]";
	}
	
	
	


		
}
