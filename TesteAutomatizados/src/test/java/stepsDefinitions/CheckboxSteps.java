package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CheckboxPage;

public class CheckboxSteps {
	
	CheckboxPage checkboxPage = new CheckboxPage(); 

	@Quando("^expandir a pasta home$")
	public void expandirAPastaHome() throws Throwable {
		checkboxPage.clicarBotaoExpandirPastaHome();
	}

	@E("^expandir pasta downloads$")
	public void expandirPastaDownloads() throws Throwable {
		checkboxPage.clicarBotaoExpandirPastaDownloads();
	}

	@E("^clicar no checkbox Word File$")
	public void clicarNoCheckboxWordFile() throws Throwable {
		checkboxPage.clicarCheckboxWordFile();
	}

	@E("^clicar no checkbox Excel File$")
	public void clicarNoCheckboxExcelFile() throws Throwable {
		checkboxPage.clicarCheckboxExcelFile();
	}

	@Entao("^o sistema apresenta mensagem de arquivos selecionados \"([^\"]*)\"$")
	public void oSistemaApresentaMensagemDeArquivosSelecionados(String msg) throws Throwable {
		checkboxPage.validarMsgArquivos(msg);
	}

	
		
}
