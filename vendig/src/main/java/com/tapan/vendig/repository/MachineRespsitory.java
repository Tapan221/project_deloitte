package com.tapan.vendig.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;



@Repository
public class MachineRespsitory {
	//items and its price
	static Map<String, Integer> itemsMap = new HashMap<>();
	
	//coin and its count
	static Map<String, Integer> coinsMap = new HashMap<>();
	
	// initializing these values during program start up
	public static void init() {
		coinsMap.put("cent",100);
		coinsMap.put("nickle",100);
		coinsMap.put("dime",100);
		coinsMap.put("quarter",100);
		
		itemsMap.put("coke",25);
		itemsMap.put("candy",30);
		itemsMap.put("chocolate",35);
		itemsMap.put("tea",60);
		itemsMap.put("samosa",80);
		itemsMap.put("chips",15);
	}
	
	
	
	public Map<String, Integer> getCoinMap() {		
		return coinsMap;
	
	}
	
	public Map<String, Integer> getItemMap() {		
		return itemsMap;
	}
	
	
	
	

		
	
	
	
	
}
