package com.training;

public class Hindi implements Language{

	

	@Override
	public void getVersion(String ver) {
		 System.out.println("Version: " + ver);
		
	}

	@Override
	public void lanType(String name) {
		 System.out.println("Language: " + name);
		
	}

}
