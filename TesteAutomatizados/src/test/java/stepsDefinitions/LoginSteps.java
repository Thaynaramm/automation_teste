package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {

	LoginPage loginPage = new LoginPage();
	
	@Quando("eu informar o campo login {string}")
	public void euInformarOCampoLogin(String userName) {
	    loginPage.escreverNoCampoUserName(userName);
	}
	@Quando("informar o campo senha {string}")
	public void informarOCampoSenha(String password) {
	    loginPage.escreverNoCampoPassword(password);
	}
	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
	   loginPage.clicarNoBotaoLogin();
	}
	
	@Entao("^o sistema apresenta mensagem \"([^\"]*)\"$")
	public void oSistemaApresentaMensagem(String userName) throws Throwable {
	   loginPage.validarTextoUserName(userName);
	}
	
	@Entao("o sistema apresenta uma mensagem de erro {string}")
	public void oSistemaApresentaUmaMensagemDeErro(String textErro) {
	  loginPage.validarMsgErro(textErro);
	
   }
}

	
