
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Validar funcionalides de login e cadastro
    Given que eu esteja no site "https://advantageonlineshopping.com/#/"
    When eu clicar para cadastrar-me no site
    And  preencha os campos com os dados requisitados
    And clique no botao de criar a conta
    And seja cadastrado 
    Then valide os campo de username e passoword com sucesso
    