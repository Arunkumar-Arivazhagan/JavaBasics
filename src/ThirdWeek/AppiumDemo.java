package driverUtils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
	
	private static String APP = "/Users/arun/eclipse-workspace/Appium/App/sprint_11_1.apk";
	private static URL url = null;
	private static AndroidDriver driver;
	private static DesiredCapabilities dCap = new DesiredCapabilities();
	private static String DEVICE_ID = "d35898d8";
	
	public static void setUp() throws MalformedURLException
	{
		
		dCap.setCapability("platformName", "Android");
		dCap.setCapability("appium:platformVersion", "12");
		dCap.setCapability("appium:deviceName", "OnePlus");
		dCap.setCapability("appium:automationName", "UiAutomator2");
		dCap.setCapability("appium:app", APP);
		dCap.setCapability("appium:udid", DEVICE_ID);
	
	url = new URL("http://localhost:4724");
	
	driver = new AndroidDriver(url, dCap);
			
	}
	
	public static void main(String[] args) throws MalformedURLException {
		setUp();
	}
}
