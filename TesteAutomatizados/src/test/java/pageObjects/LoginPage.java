package pageObjects;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class LoginPage {
	
	// Elementos
	private SelenideElement campoUserName = $(By.id("userName"));
	private SelenideElement campoPassword = $(By.id("password"));
	private SelenideElement botaoLogin = $(By.id("login"));
	private SelenideElement textoUserName = $(By.id("userName-value"));
	private SelenideElement textoDeErro = $(By.id("name"));

	//metodos
	
	public void escreverNoCampoUserName(String userName) {
		campoUserName.sendKeys(userName);
	}
	public void escreverNoCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	public void clicarNoBotaoLogin(){
		botaoLogin.click();
	}
	public void validarTextoUserName(String userName) {
		textoUserName.shouldHave(exactText("Thaynara1"));
	}
	public void validarMsgErro(String txtErro) {
		textoDeErro.shouldHave(exactText("txtErro"));
	}
}
