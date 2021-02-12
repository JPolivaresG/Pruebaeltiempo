package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;


@DefaultUrl("http://sahitest.com/demo/training/login.htm")

public class Login extends PageObject {
	
	String txt_usuario= "//tbody/tr[1]/td[2]/input[1]";
	String txt_contrasena="//tbody/tr[2]/td[2]/input[1]";
	String btn_ingresar="//tbody/tr[3]/td[2]/input[1]";
	String title_ingreso_fallido="//div[@id='errorMessage']";
	String btn_registro="//a[contains(text(),'Register')]";
	String txt_nuevousuario= "//input[@id='uid']";
	String txt_nuevopwd= "//input[@id='pid']";
	String txt_confirmpwd= "//input[@id='pid2']";
	String rbtn_male="//tbody/tr[4]/td[2]/input[1]";
	String rbtn_female="//tbody/tr[4]/td[2]/input[2]";
	String txt_addres= "//textarea[@id='taid']";
	String txt_billaddres= "//textarea[@id='btaid']";
	String select_state="//option[contains(text(),'Karnataka')]";
	String check_box="//body/center[1]/div[1]/form[1]/input[1]";
	String btn_regis= "//body/center[1]/div[1]/form[1]/input[2]";
	
	
	@WhenPageOpens
	public void maximiseScreen() {
	    getDriver().manage().window().maximize();
	}
	
	public void ingresar_usuario(String usuario) {
		find(By.xpath(txt_usuario)).sendKeys(usuario);
	}
	
	public void ingresar_contrasena(String contrasena) {
		find(By.xpath(txt_contrasena)).sendKeys(contrasena);
	}
	
	public void click_en_boton_ingresar() {
		find(By.xpath(btn_ingresar)).click();
	}
	
	public void se_valida_el_ingreso_incorrecto() {
	
	assertEquals("Invalid username or password", find(By.xpath(title_ingreso_fallido)).getText());
	}
	
	/*public void click_en_boton_registro() {
		find(By.xpath(btn_registro)).click();
	}
		
	public void click_en_boton_ingresar(String usuario) {
		find(By.xpath(txt_nuevousuario)).sendKeys(usuario);;
	}*/
		
}
