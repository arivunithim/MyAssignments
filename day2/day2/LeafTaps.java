package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arivunithi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthusamy");
		
		//Handling dropdown
		//select Class
		
		//step1: Find the Element
		// return type of findElement is WebElement
		
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//step2: Instantiate the Select Class
		
		
		Select dd1= new Select(sourceDropdown);
		
		//dd1.selectByIndex(2);
		
		//dd1.selectByVisibleText("Employee");
		
		dd1.selectByValue("LEAD_DIRECTMAIL");
		
		WebElement marketCampaignDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select dd2= new Select(marketCampaignDropdown);
		
		dd2.selectByVisibleText("Automobile");
		
		WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select dd3=new Select(ownershipDropdown);
		
		dd3.selectByValue("OWN_SCORP");
		
		driver.findElement(By.className("smallSubmit"));
		
		driver.close();
		
		
		
	}

}
