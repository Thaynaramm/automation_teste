package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TooltipPage;

public class TooltipSteps2 {
	
	TooltipPage tooltipPage = new TooltipPage(); 

	@Quando("^eu colocar o mouse encima do botao hover$")
	public void euColocarOMouseEncimaDoBotaoHover() throws Throwable {
		tooltipPage.colocarMouseBotaoHover();
	}

	@Entao("^o sistema apresenta a mensagem do tooltip \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagemDoTooltip(String text) throws Throwable {
		tooltipPage.validarMsgTooltip(text);
	}

	

	

	
		
}
