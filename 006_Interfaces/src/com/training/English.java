package com.training;

public class English implements Language{

	@Override
	public void lanType(String name) {
	
		 System.out.println("Language: " + name);
		
	}

	@Override
	public void getVersion(String ver) {
		
		
		 System.out.println("Version: " + ver);
	}

}
