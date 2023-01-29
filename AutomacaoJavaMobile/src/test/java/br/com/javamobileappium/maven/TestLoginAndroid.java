package br.com.javamobileappium.maven;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;





public class TestLoginAndroid {
	
	
		
	public static ScreenLogin ScreenLogin;
	public static AppiumDriver<RemoteWebElement> driver;
	
	@BeforeClass
	public static void caps() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "C:\\Users\\mitbu\\Desktop\\CursoJava\\ProjetoJava\\testMobile\\apps\\app-debug.apk");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability(MobileCapabilityType.VERSION, "9.0");
		capabilities.setCapability("unicodeKeyboard", true);
		driver = new AndroidDriver<RemoteWebElement>(new URL("http:\\localhost:4723\\wd\\hub"), capabilities);
		ScreenLogin = new ScreenLogin(driver);
		
	}
		
	
	
	@Test
	public void testLoginAndroid() {
		ScreenLogin.Testelogar();
	}
	
}
