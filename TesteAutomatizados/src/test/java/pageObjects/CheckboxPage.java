package pageObjects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class CheckboxPage {
	
	// Elementos
	private SelenideElement botaoExpandirPastaHome = $(By.xpath("//span[.='Home']//button"));
	private SelenideElement botaoExpandirPastaDownloads = $(By.xpath("//span[.='Downloads']//button"));
	private SelenideElement checkboxWordFile = $(By.xpath("//label[@for='tree-node-wordFile']"));
	private SelenideElement checkboxExcelFile = $(By.xpath("//label[@for='tree-node-excelFile']"));
	private SelenideElement msgArquivosSelecionados = $(By.id("result"));
		
	
	//método
	
	public void clicarBotaoExpandirPastaHome(){
		botaoExpandirPastaHome.click();
		
	}
	public void clicarBotaoExpandirPastaDownloads() {
		botaoExpandirPastaDownloads.scrollTo().click();
		
	}
	public void clicarCheckboxWordFile() {
		checkboxWordFile.click();
		
	}
	public void clicarCheckboxExcelFile() {
		checkboxExcelFile.click();
		
	}
	public void validarMsgArquivos(String msg) {
		msgArquivosSelecionados.shouldHave(exactText(msg));
		System.out.print("essa eh a mensagem recuperada: "+ msgArquivosSelecionados.getText());
	}
	
}
