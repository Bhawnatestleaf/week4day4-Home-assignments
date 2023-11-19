package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead {
@Test

	public void RunCreateLead() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();

		driver.findElement(By.className("inputLogin")).sendKeys("Democsr");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
	    driver.findElement(By.linkText("Create Lead")).click();
	    
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	    
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
	    
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    driver.close();

	}

}
