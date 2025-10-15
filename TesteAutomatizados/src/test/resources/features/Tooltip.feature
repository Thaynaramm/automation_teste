#language: pt
#encoding: UTF-8
#Autor: Thaynara Sales Matias Monteiro

@Tooltip
Funcionalidade: teste
    
   Contexto: Dado que eu esteja acessando a pagina de tooltip
   
@visualizarTooltip
    
  Cenario: Visualizar tooltip
  Quando eu colocar o mouse encima do botao hover
  Entao o sistema apresenta a mensagem do tooltip "You hovered over the button"
    
  