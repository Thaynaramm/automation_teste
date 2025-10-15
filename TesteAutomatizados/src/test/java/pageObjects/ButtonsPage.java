package pageObjects;

import static com.codeborne.selenide.Condition.exist;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.codeborne.selenide.SelenideElement;

public class ButtonsPage {
	
	// Elementos
	private SelenideElement botaoDoubleClick = $(By.id("doubleClickBtn"));
	private SelenideElement botaoRightClick = $(By.id("rightClickBtn"));
	private SelenideElement msgDoubleClick = $(By.id("doubleClickMessage"));
	private SelenideElement msgRightClick = $(By.id("rightClickMessage"));
			
	//método
	
	public void cliqueBotaoDoubleClick(){
		botaoDoubleClick.doubleClick();
		
	}
	public void cliqueComDireitoRIght(){
		botaoRightClick.contextClick();
		
	}
	public void validarCliqueDoubleTextParcial(String msg){
		msgDoubleClick.shouldHave(text(msg));
		
	}
	
	public void validarMensagemRightClickTextParcial(String msg){
		msgRightClick.shouldHave(text(msg));
		
	}
	public void validarCliqueDuploClickTextoVisivel(){
		msgDoubleClick.shouldBe(visible);
    }

	public void validarCliqueDireitoExistel(){
		msgRightClick.shouldBe(exist);
		
    }	
    public void clicarEsegurar() {
		Actions acao = new Actions(getWebDriver());
        acao.clickAndHold(botaoDoubleClick).build().perform();
	}
	
	
}
