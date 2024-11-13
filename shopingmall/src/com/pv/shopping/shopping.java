package com.pv.shopping;

import com.pvr.shopping.entity.Customer;
import com.pvr.shopping.imp_ordering.ComputerTool;
import com.pvr.shopping.imp_ordering.MobileTool;
import com.pvr.shopping.interfacesample.Order; 

public class shopping {
	public static void main(String[] args) {
		Customer c1 =  new Customer();
		c1.setCid(101);
		c1.setCname("Santhosh");
		c1.setCity("tvm");
		c1.setProduct("computertools");
		
		Order order;
		String choice = c1.getProduct();
		if(choice.equals("mobiletools"))
		{
			order=MobileTool.getMobiletools();
		}
		else {
			order=ComputerTool.getComputertools();
		}
		order.ordering();
	}
}