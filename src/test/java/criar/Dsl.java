package criar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dsl extends PageElements
{

	public Dsl(ChromeDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void escrever(String id, String texto) throws InterruptedException 
	{
		
		//driver.findElementById(id).click();
//	driver.findElementById(id).sendKeys(texto);
		WebElement element ;
    element = driver.findElementByXPath("//*[@id=\"rso\"]/div[1]/div/div/div/h3/a");
    element.click();	
	element = driver.findElementByXPath("//*[@id=\"gsr\"]");
	element.click();
	Thread.sleep(2000);
    element.sendKeys("qualquercoisaqfuncione");
	}

}
