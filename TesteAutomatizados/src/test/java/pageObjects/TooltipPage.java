package pageObjects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class TooltipPage {
	
	// Elementos
	private SelenideElement botaoHover = $(By.id("toolTipButton"));
	private SelenideElement msgTooltip = $(By.xpath("//div[@class='tooltip-inner']"));

		
	
	//método
	
	public void colocarMouseBotaoHover(){
		botaoHover.hover();
		
	}
	
	public void validarMsgTooltip(String text){
		msgTooltip.should(exactText(text));
			
	}
}
