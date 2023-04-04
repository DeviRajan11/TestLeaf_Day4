package learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_assignment2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	      
	    driver.manage().window().maximize();
	      
	    driver.get("http://leaftaps.com/opentaps/control/main");
	      
	    driver.findElement(By.id("username")).sendKeys("DemoCsr");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestAssignment2");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestFirstName2");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestLastName2");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    driver.findElement(By.linkText("Edit")).click();
	    
	    WebElement update= driver.findElement(By.id("updateLeadForm_companyName"));
	    update.clear();
	    update.sendKeys("UpdatedCompanyName");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	     
	    driver.close();
	}

}
