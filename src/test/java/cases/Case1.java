package cases;

import org.junit.Test;

import criar.PageObj;
import rodar.GerenciadorDriver;

public class Case1 extends GerenciadorDriver
{
	
	public PageObj pageobj = new PageObj(driver);
	
	@Test
	public void testa () throws InterruptedException 
	{
		
		pageobj.campoBusca();
		
	}

}
