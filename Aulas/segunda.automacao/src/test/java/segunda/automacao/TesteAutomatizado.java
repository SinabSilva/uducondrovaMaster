package segunda.automacao;

import static org.junit.Assert.*;

import javax.security.auth.login.CredentialException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizado {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExemplo() {
		

		
	}

}
