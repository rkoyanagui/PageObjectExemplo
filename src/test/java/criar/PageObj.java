package criar;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageObj extends Dsl
{

	public PageObj(ChromeDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void campoBusca() throws InterruptedException 
	{
		Thread.sleep(1500);
		escrever("search","1");
		
	}

}
