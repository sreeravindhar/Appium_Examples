package com.greens.browser;

import com.greens.base.BaseClass;

public class Browser extends BaseClass{
	
	public static void main(String[] args) {
		
		startService();
		initializeDriver();
		
		stopService();
		
	}

}
