package com.pvr.shopping.imp_ordering;

import com.pvr.shopping.interfacesample.Order;

public class ComputerTool implements Order {
	
	private static ComputerTool computertools=new ComputerTool();

	public static ComputerTool getComputertools() {
		return computertools;
	}
	public static void setcomputertools(ComputerTool computertools) {
		ComputerTool.computertools = computertools;
	}
	
	private ComputerTool() {
		
	}
	@Override
	public void ordering() {
		System.out.println("im buying harddisk");
	}

}
