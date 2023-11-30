#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Cliente faz saque de dinheiro como um cliente,
eu gostaria de sacar dinheiro em caixa eletronico, 
para que eu nao tenha que esperar em uma fila de banco

  @tag1
  Scenario: Cliente especial com saldo negativo
    Given Um cliente especial com saldo atual de -200 reais
    When For solicitado um saque no valor de 100 reais 
    Then Deve efetuar o saque e atualizar o saldo da conta para -300 reais
    And Check more outcomes

  @tag2
  Scenario Outline: Cliente comum com saldo negativo
    Given Um cliente comum com saldo atual de -200 reais
    When Solicitar um saque de 200 reais
    Then Nao deve efetuar o saque e deve retornar a mensagem de saldo insuficiente