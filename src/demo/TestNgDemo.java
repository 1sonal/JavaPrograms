package demo;

import org.testng.annotations.Test;

public class TestNgDemo {

	@Test(priority=2)
	public void doLogin(){
		System.out.println("Login successful");
	}
	
	@Test(priority=3)
	public void doRegistration(){
		System.out.println("Registration successful");
	}
	
	//lowest priority
	@Test(priority=1,dependsOnMethods={"doLogin"} )
	public void verifyTitle(){
		System.out.println("Title verified"); 
	}
}
