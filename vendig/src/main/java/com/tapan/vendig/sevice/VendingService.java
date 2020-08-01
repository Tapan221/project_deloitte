package com.tapan.vendig.sevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tapan.vendig.model.Order;
import com.tapan.vendig.repository.MachineRespsitory;


@Service
public class VendingService {
	
	@Autowired
	private MachineRespsitory machineRespsitory;
	
	public int getCostOfTheItem(Order order) {
		String itemOrdered = order.getItem();
		int priceOfTheitem = machineRespsitory.getItemMap().get(itemOrdered);
		return priceOfTheitem;
	}
	
	public int getTotalBalanceInMachine() {
		Map<String, Integer> map = machineRespsitory.getCoinMap();
		return map.get("cent")*1 +map.get("nickle")*5 + map.get("dime")*10+ map.get("quarter")*25;
		
	}
	
	public boolean checkItemExistInMachine(String item) {
		return machineRespsitory.getItemMap().containsKey(item);
	}
	
	public Map<String,Integer> getBalanceAmount(Order order) {
		int bal=  valueOfCoinReceivedFromUser(order)-getCostOfTheItem(order);	
		if(bal >0)
		return getCoins(bal);
		else
			return null;
	}
	
	public int valueOfCoinReceivedFromUser(Order order) {
		Map<String, Integer> map = machineRespsitory.getCoinMap();
		int c=order.getCent();
		int n=order.getNickle();
		int d=order.getDime();
		int q=order.getQuarter();
		
		map.put("cent",map.get("cent")+c);
		map.put("nickle",map.get("nickle")+n);
		map.put("dime",map.get("dime")+d);
		map.put("quarter",map.get("quarter")+q);
		
		return c*1+ n*5+d*10+q*25;
	}
	
	
	public Map<String, Integer> coinsReceivedFromOrder(Order order) {
		
		Map<String, Integer> map = new HashMap<>();
		int c=order.getCent();
		int n=order.getNickle();
		int d=order.getDime();
		int q=order.getQuarter();
		map.put("cent",c);
		map.put("nickle",n);
		map.put("dime",d);
		map.put("quarter",q);
		return map;
		
	}
		
	public Map<String,Integer> getCoins(int balance){
		
		Map<String,Integer> coin = new HashMap<>();
		int quarter, dime, nickle, cent;
		quarter = balance / 25;
		balance = balance - quarter * 25;
		dime = balance / 10;
		balance = balance - dime * 10;
		nickle = balance / 5;
		balance = balance - nickle * 5;
		cent = balance;		
		coin.put("quarter", quarter);
		coin.put("dime", dime);
		coin.put("nickle", nickle);
		coin.put("cent", cent);
		return coin;
		
	}
	
	
	
	

		
	
	
		

}
