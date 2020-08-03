package demo.vendingmachine.utility;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> { 
	
	private Map<T, Integer> map = new HashMap<T, Integer>(); 
	
	public int getQuantity(T item){ 
		Integer value = map.get(item); 
		return value == null? 0 : value ; 
	}
	
	public void add(T item){ 
		int count = map.get(item); 
		map.put(item, count+1); 
	} 
	
	public void deduct(T item) { 
		if (hasItem(item)) { 
			int count = map.get(item); 
			map.put(item, count - 1); 
		} 
	} 
	
	public boolean hasItem(T item){ 
		return getQuantity(item) > 0; 
		
	} 
	
	public void clear(){ 
		map.clear(); 
		
	} public void put(T item, int quantity) { 
		map.put(item, quantity); 
		
	} 
	
}


