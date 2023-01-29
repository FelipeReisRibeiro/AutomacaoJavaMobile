package br.com.javamobileappium.maven;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class TestLoginUniversal {
	
	
	public static ScreenLogin ScreenLogin;
	public static AppiumDriver<RemoteWebElement> driver;
	
	@BeforeClass
	public static void caps() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "C:\\Users\\mitbu\\Desktop\\CursoJava\\ProjetoJava\\testMobile\\apps\\app-debug.apk");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("platformVersion", "9.0");
		capabilities.setCapability("unicodeKeyboard", true);
		driver = new AndroidDriver<RemoteWebElement>(new URL("http:\\localhost:4723/wd/hub"), capabilities);
		ScreenLogin = new ScreenLogin(driver);
		
	}
		
	
	
	@Test
	public void testLoginAndroid() {
		ScreenLogin.Testelogar();
	}
	


}
