package com.tapan.vendig.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tapan.vendig.model.Order;
import com.tapan.vendig.model.ReturnItems;
import com.tapan.vendig.sevice.VendingService;

@RestController
@RequestMapping("/api")
public class MachineController {
	@Autowired
	private VendingService VendingService;
	
	
	@PostMapping("/order")
	public ReturnItems processRequest(@RequestBody Order order) {
		
		if(VendingService.checkItemExistInMachine(order.getItem())) {
			Map<String, Integer> map= VendingService.getBalanceAmount(order);
			if(map != null)
			return new ReturnItems(map,order.getItem());
			else {
				Map<String, Integer> map1= VendingService.coinsReceivedFromOrder(order);
				return new ReturnItems(map1,"Insufficient Amount");
			}
		}
		else {
			Map<String, Integer> map= VendingService.coinsReceivedFromOrder(order);
			return new ReturnItems(map,"The item: "+order.getItem()+ " does not exit in Vending machine, so returning all change provided");
		}
		
		
	}

}
