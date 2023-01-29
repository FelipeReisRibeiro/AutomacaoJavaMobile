package br.com.javamobileappium.maven;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.WithTimeout;
import java.time.temporal.ChronoUnit;


public class ScreenLogin { 
	
	
	public ScreenLogin(AppiumDriver<RemoteWebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
		
		
		@WithTimeout(time = 500, chronoUnit = ChronoUnit.SECONDS) 
		@AndroidFindBy( id=  "login_username")		
		private static RemoteWebElement  campologin;
		
		@AndroidFindBy( id = "login_password")
		private static RemoteWebElement camposenha;
		
		@AndroidFindBy( id = "login_button")
		private static RemoteWebElement btnlogin;
		
		
		
		public void Testelogar() {
			
			campologin.sendKeys("felipereiribeiro@gmail.com");
			camposenha.sendKeys("1234");
			btnlogin.click();
		
		}
		
}
	

