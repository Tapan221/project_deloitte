package demo.vendingmachine.factory;

import demo.vendingmachine.impl.VendingMachineImpl;

public class VendingMachineFactory { 
	public static VendingMachine createVendingMachine() { 
		return new VendingMachineImpl(); 
		
	} 
	
}


