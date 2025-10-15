package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.MenuPage;

public class MenuSteps {

    MenuPage menuPage = new MenuPage();
	
	
	@Quando("^eu acessar o menu de nivel dois$")
	public void euAcessarOMenuDeNivelDois() throws Throwable {
		menuPage.acessarMenuNivel2();
	}

	@Entao("^o sistema apresenta o menu de nivel tres$")
	public void oSistemaApresentaOMenuDeNivelTres() throws Throwable {
		menuPage.validarMenuNivel3();
	}

	
	
}

	
