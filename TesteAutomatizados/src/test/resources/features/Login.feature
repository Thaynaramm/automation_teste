#language: pt
#encoding: UTF-8
#Autor: Thaynara Sales Matias Monteiro

@Login
Funcionalidade: teste
    
   Contexto: Dado que eu esteja acessando a pagina de checkbox
   
@loginSucesso
    
  Cenario: Login registrado com sucesso
  Quando eu informar o campo login "Thaynara2" 
  E informar o campo senha "9131Thay@"
  E clicar no botao login 
  Entao o sistema apresenta mensagem "Thaynara2" 
  
@loginInválido
    
  Cenario: Login registrado com sucesso
  Quando eu informar o campo login "Thaynara1" 
  E informar o campo senha "123Th@"
  E clicar no botao login 
  Entao o sistema apresenta mensagem "Invalid username or password!"
    
  