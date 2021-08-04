package com.ty.APIProject;

import org.testng.annotations.Test;

public class ParameterizedClassTest {
	@Test
	public void parameterizedData() {
		
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		
		System.out.println("Url: "+url);
		System.out.println("Browser: "+browser);
		
	}

}
