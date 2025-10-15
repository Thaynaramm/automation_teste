package pageObjects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class DinamicosPage {
	
	// Elementos

	private SelenideElement botaoEnableAfter = $(By.id("enableAfter"));
	
		
	
	//método
	
	public void clicarBotaoEnableAfter(){
		botaoEnableAfter.click();
	}
	
	public void validarBotaoEnableAfter(){
		botaoEnableAfter.should(enabled);
	}
	
			
		
	
	
}
