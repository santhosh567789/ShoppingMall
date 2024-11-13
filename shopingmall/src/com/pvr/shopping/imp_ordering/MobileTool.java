package com.pvr.shopping.imp_ordering;

import com.pvr.shopping.interfacesample.Order;

public class MobileTool implements Order {
	
	private static MobileTool mobiletools=new MobileTool();

	public static Order getMobiletools() {
		return mobiletools;
	}
	public static void setMobiletools(MobileTool mobiletools) {
		MobileTool.mobiletools = mobiletools;
	}
	{
		
		
	}
	@Override
	public void ordering()
	{
		System.out.println("im buying bluetooth");
	}

}
