package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchtheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		 //click Leads
		 driver.findElement(By.linkText("Leads")).click();
		 //click create lead
		 driver.findElement(By.linkText("Create Lead")).click();
		 //Enter the company name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swapna");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Swap");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Biotechnology");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Non IT to IT");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("swapna@gmail.com");
		 driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("swapna@gmail.com");

		 WebElement source1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select drop2=new Select(source1);
		 drop2.selectByVisibleText("New York");
		 
		 driver.findElement(By.name("submitButton")).click();
		
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
