import java.net.MalformedURLException;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CloudTesting {
	
	public static final String USERNAME = "vsm_vidhya";
	  public static final String ACCESS_KEY = "4e39a0fc-f77e-4747-9e88-3741710c60ef";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  
	  public static void main(String[] args) throws Exception {
	  
		  DesiredCapabilities caps = DesiredCapabilities.firefox();
		  caps.setCapability("platform", "Windows 7");
		  caps.setCapability("version", "83.0");
	  
	    WebDriver driver = new RemoteWebDriver(new java.net.URL("https://vsm_vidhya:4e39a0fc-f77e-4747-9e88-3741710c60ef@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), caps);
	
	
	/*public static final String USERNAME = "vsm_vidhya";
	  public static final String ACCESS_KEY = "4e39a0fc-f77e-4747-9e88-3741710c60ef";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 7");
		browserOptions.setCapability("browserVersion", "84.0");
		browserOptions.setCapability("sauce:options", sauceOptions);
		WebDriver driver=new RemoteWebDriver(new java.net.URL(URL),browserOptions);*/
		driver.get("https://www.google.co.uk/");
		System.out.println(driver.getTitle());
		
		
	}

}
