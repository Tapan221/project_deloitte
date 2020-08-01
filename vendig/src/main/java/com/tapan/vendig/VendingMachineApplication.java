package com.tapan.vendig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tapan.vendig.repository.MachineRespsitory;

@SpringBootApplication
public class VendingMachineApplication {

	@Autowired
	private MachineRespsitory machineRespsitory;
	
	public static void main(String[] args) {
		
		SpringApplication.run(VendingMachineApplication.class, args);
		init();
		
	}

	private static void init() {
		MachineRespsitory.init();		
	}

}
