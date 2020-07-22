package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class AppiumTest {
	
	@Test
	public void NativeAppAndroid() {
		System.out.println("NativeAppAndroid");
		
	}

	@Test
	public void IOSApps() {
		System.out.println("IOSApps");
		
	}
}

// if u want to execute only one class file such AppiumTest.java then mvn -Dtest=AppiumTest test in cmd --nothing to to do with testng xml file
//all these commands are available in maven.apache.org
