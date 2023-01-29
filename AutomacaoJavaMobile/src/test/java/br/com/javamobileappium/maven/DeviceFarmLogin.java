package br.com.javamobileappium.maven;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class DeviceFarmLogin {

	public static ScreenLogin ScreenLogin;
	public static AppiumDriver<RemoteWebElement> driver;
	
	
	
	@BeforeClass
	public static void caps() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		
		// Set your access credentials
		caps.setCapability("browserstack.user", "felipereis_ChZkuQ");
    	caps.setCapability("browserstack.key", "gAEadH2JXDXbCWNX245h");
    	
    	// Set URL of the application under test
    	caps.setCapability("app", "bs://850bfbd98f1b896275edaadb69c6e899a3fe86fc");
    	
    	// Specify device and os_version for testing
    	caps.setCapability("device", "Google Pixel 3");
    	caps.setCapability("os_version", "9.0");
        
    	       
    	// Initialise the remote Webdriver using BrowserStack remote URL
    	// and desired capabilities defined above
       	
		
		driver = new AndroidDriver<RemoteWebElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);
		ScreenLogin = new ScreenLogin(driver);
	}
		
	
	
	@Test
	public void testLoginAndroid() {
		ScreenLogin.Testelogar();
	}
	

}
