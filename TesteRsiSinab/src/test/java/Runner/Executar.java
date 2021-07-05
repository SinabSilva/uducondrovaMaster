package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// mostrar o caminho das features
		features = "src/test/resources/features/",
		// mostrar pacote est�o os steps para execu��o
		glue = "tests",
		//tags para direcionar a execus�o dos testes
		tags = "@allTest",
		// formatac�o do console cucumber | report html
		plugin = {"pretty", "html:target/report.html"},
		// monchrome deixa mais limpo o console, sem trazer caracteres especiais
		monochrome = true,
		// Deixa os metodos com padrao da linguagem Java ao inves de underline 
		snippets = SnippetType.CAMELCASE,
		// n�o executa o teste ele so valida o mapeamento se falta terminar alguma coisa, padr�o deixar false
		dryRun = false
		)

public class Executar {

}
