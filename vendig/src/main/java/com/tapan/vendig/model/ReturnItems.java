package com.tapan.vendig.model;

import java.util.Map;

public class ReturnItems {
	
	private Map<String, Integer> map;
	
	private String itemOrdered;
	
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	public String getItemOrdered() {
		return itemOrdered;
	}
	public void setItemOrdered(String itemOrdered) {
		this.itemOrdered = itemOrdered;
	}
	public ReturnItems(Map<String, Integer> map, String itemOrdered) {
		super();
		this.map = map;
		this.itemOrdered = itemOrdered;
	}
	public ReturnItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ReturnItems [map=" + map + ", itemOrdered=" + itemOrdered + "]";
	}
	
	

}
