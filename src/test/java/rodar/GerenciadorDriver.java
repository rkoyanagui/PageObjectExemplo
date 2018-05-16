package rodar;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import criar.Dsl;

public class GerenciadorDriver extends Constate
{
	public Dsl dsl;
	
	public GerenciadorDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	
    @Before
	public void inicializaNavegador() 
	{
            
		driver.get("https://www.google.com.br/search?q=google&oq=googl&aqs=chrome.0.0l3j69i65j69i57j69i60.5503j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		dsl = new Dsl(driver);

	}
	
	@After
	public void encerraNavegador() throws IOException 
	{
		
		driver.quit();
		
	}

}
