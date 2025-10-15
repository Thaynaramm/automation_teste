package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


public class SelectPage {
	
	// Elementos
	 SelenideElement selectOld = $(By.id("oldSelectMenu"));
	 SelenideElement selectDinamic= $(By.id("withOptGroup"));
		
	
	//método
	
	public void selecionarAOpcaoOldSelect(String opcao){
          selectOld.selectOption(opcao);

		}
	public void selecionarDinamica(String opcao){
        selectDinamic.click();
        SelenideElement opcaoDinamica = $(By.xpath("//div[@class=' css-26l3qy-menu']//*[.='Group 2, option 2']"));
        opcaoDinamica.click();
		}
	
}
