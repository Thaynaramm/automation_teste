#language: pt
#encoding: UTF-8
#Autor: Thaynara Sales Matias Monteiro

@Checkbox
Funcionalidade: teste
    
   Contexto: Dado que eu esteja acessando a pagina de login
   
@selecionarCheckbox
    
  Cenario: selecionar checkbox
  Quando expandir a pasta home
  E expandir pasta downloads
  E clicar no checkbox Word File
  E clicar no checkbox Excel File 
  Entao o sistema apresenta mensagem de arquivos selecionados "You have selected : downloads wordFile excelFile"

  
  
    
  