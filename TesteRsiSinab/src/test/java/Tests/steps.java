package Tests;

import Elementos.elementos;
import Pages.metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {

	metodos Met = new metodos();
	elementos El = new elementos();

	@Given("^que eu esteja no site \"([^\"]*)\"$")
	public void que_eu_esteja_no_site(String site) throws Throwable {
		Met.abrirSite(site, "CHROME");
		Met.pausa(5000);
		}
	

	@When("^eu clicar para cadastrar-me no site$")
	public void eu_clicar_para_cadastrar_me_no_site() throws Throwable {
		Met.clicar(El.getBtnUser());
		Met.pausa(3000);
		Met.clicar(El.getBtnCreateNew());
		Met.pausa(4000);
		
	}

	@When("^preencha os campos com os dados requisitados$")
	public void preencha_os_campos_com_os_dados_requisitados() throws Throwable {
		Met.prencher(El.getCmUsername(), "099jjhhh474");
		Met.prencher(El.getCmEmail(), "fggkjdd4@hotmail.com");
		Met.prencher(El.getCmSenha(), "Fc23097878");
		Met.prencher(El.getCmConfirSenha(), "Fc23097878");
		Met.prencher(El.getCmPrimeiroNome(), "Sinab");
		Met.prencher(El.getCmUltimoNome(), "Silva");
		Met.prencher(El.getCmTelefone(), "11993420794");
		Met.clicar(El.getCmPais());
		Met.prencher(El.getCmCidade(), "Sao Paulo");
		Met.prencher(El.getCmEndereco(), "rua parnapoa 201");
		Met.prencher(El.getCmEstado(), "Sp");
		Met.prencher(El.getCmCep(), "04810060");
		Met.clicar(El.getBtnIgree());
		Met.screnShoot("CT-Validar campos do cadastro");
		
	}

	@When("^clique no botao de criar a conta$")
	public void clique_no_botao_de_criar_a_conta() throws Throwable {
		Met.clicar(El.getBtnRegistrer());
		Met.pausa(4000);
		Met.fechar();
		}
		

	@When("^seja cadastrado$")
	public void seja_cadastrado() throws Throwable {
		Met.pausa(4000);
		Met.fechar();
		
	
	}

	@Then("^valide os campo de username e passoword com sucesso$")
	public void valide_os_campo_de_username_e_passoword_com_sucesso(String site) throws Throwable {
		Met.abrirSite(site, "CHROME");
		Met.pausa(4000);

		Met.clicar(El.getBtnUser());
		Met.pausa(4000);
		Met.prencher(El.getCmUsernameLogin(), "099jjhhh474" );
		Met.prencher(El.getCmPassword(), "Fc23097878");
		Met.screnShoot("CT-Validar campos do login");
		Met.clicar(El.getBtnSingIn());
	}

}
