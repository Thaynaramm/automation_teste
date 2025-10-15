package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ButtonsPage;

public class ButttonsSteps {

    ButtonsPage buttonsPage = new ButtonsPage();
	
	
	@Quando("^eu fizer um duplo click no botao double click$")
	public void euFizerUmDuploClickNoBotaoDoubleClick() throws Throwable {
		buttonsPage.cliqueBotaoDoubleClick();
	}

	@Entao("^o sistema apresenta a mensagem de click \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagemDeClick(String msg) throws Throwable {
		buttonsPage.validarCliqueDoubleTextParcial(msg);
	}

	@Quando("^eu fizer um click com direito no botao right click$")
	public void euFizerUmClickComDireitoNoBotaoRightClick() throws Throwable {
		buttonsPage.cliqueComDireitoRIght();
	}

	@Entao("^o sistema apresenta a mensagem de click com direito\"([^\"]*)\"$")
	public void oSistemaApresentaAMensagemDeClickComDireito(String msg) throws Throwable {
		buttonsPage.validarMensagemRightClickTextParcial(msg);
	}

	
		
	
}

	
