package GrouTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BaseUrl extends BaseDrive{
	//String url ="https://en.wikipedia.org/wiki/PRAN-RFL_Group";
	@Test(priority=1)
	public void browserstart() throws InterruptedException {
		driver.get("https://timf.imikrof.com/home");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		
	}
	@Test(priority=2)
	public void login() throws InterruptedException {
		WebElement user = driver.findElement(By.id("email"));
		user.clear();
		user.sendKeys("imikrof");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("@#$imikrof@2022");
		
		WebElement login= driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"));
		login.click();
		Thread.sleep(5000);
	}
}


