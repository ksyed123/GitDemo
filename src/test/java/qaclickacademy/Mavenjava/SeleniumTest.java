package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void BrowserAutomation() {
		System.out.println("BrowserAutomation");
		
	}

	@Test
	public void ElementsUI() {
		
		System.out.println("ElementsUI");
		
	}
}
//go to mvn repository and copy the 5 lines of whatever jar you  need and then paste in pom.xml file
/*<dependency>
<groupId>io.appium</groupId>
<artifactId>java-client</artifactId>
<version>7.3.0</version>
</dependency>*/

//maven sure fire plugin is needed to execute the testcases in maven project..we need to get from maven.apache.org and paste in pom.xml
//go to above website click on usage and copy the code in pom.xml above <dependencies>
//maven surefire plugin will execute the testcases in your test folder----interview question
//then to execute go cmd navigate to C:\Users\syedk\eclipse-workspace\Mavenjava type mvn clean,then mvn compile to check if there are any syntax errors
//clean will clean all the temporary files and buils of the project
//mvn test will clean compile and execute..when it sees dependency in pom.xml it will not go to maven repository it will first chck in the .m2 folder which is the local repository
//always use keyword Test at the end of every classname. for claases that you create in the test folder