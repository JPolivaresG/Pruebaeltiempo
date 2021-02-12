package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.steps;

public class logindefinitions {
	
	@Steps
	steps login_steps;//instancia del objeto
	
	
	@Given("^Ingreso al navegador$")
	public void ingreso_al_navegador() throws Exception {
		login_steps.ingreso_a_navegador();

	}

	@When("^Ingresar usuario \"([^\"]*)\"$")
	public void ingresar_usuario(String usuario) throws Exception {
		login_steps.ingresar_usuario(usuario);

	}

	@When("^Ingresar contrasena \"([^\"]*)\"$")
	public void ingresar_contrasena(String contrasena) throws Exception {
		login_steps.ingresar_contrasena(contrasena);

	}

	@When("^Click en boton ingresar$")
	public void click_en_boton_ingresar() throws Exception {
		login_steps.click_en_boton_ingresar();

	}

	@Then("^se valida el mensaje de ingreso incorrecto$")
	public void se_valida_el_ingreso_incorrecto() throws Exception {
		login_steps.se_valida_el_ingreso_incorrecto();

	}
	/*@When("^Click en boton registro$")
	public void click_en_boton_registro() throws Exception {
		login_steps.click_en_boton_registro();

	}*/


	}


