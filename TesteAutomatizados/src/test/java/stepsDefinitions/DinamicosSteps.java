package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.DinamicosPage;

public class DinamicosSteps {
	
	DinamicosPage  dinamicosPage = new DinamicosPage(); 

	
	@Quando("^clicar no botao Enable After$")
	public void clicarNoBotaoEnableAfter() throws Throwable {
		dinamicosPage.clicarBotaoEnableAfter();
	}

	@Entao("^o sistema ativa o botao$")
	public void oSistemaAtivaOBotao() throws Throwable {
		dinamicosPage.validarBotaoEnableAfter();
	
	
	}
	
}
