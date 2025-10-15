package pageObjects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class MenuPage {
	
	// Elementos
	private SelenideElement menuNivelUm = $(By.xpath("//a[.='Main Item 2']"));
	private SelenideElement menuNivelDois = $(By.xpath("//a[.='SUB SUB LIST »']"));
	private SelenideElement menuNivelTres = $(By.xpath("//a[.='Sub Sub Item 1']"));
			
	//método
	
	public void acessarMenuNivel2(){
		menuNivelUm.hover();
		menuNivelDois.hover();
		
	}
	
	public void validarMenuNivel3(){
		menuNivelTres.shouldBe(visible);
		
		
	}
	
	
	
}
