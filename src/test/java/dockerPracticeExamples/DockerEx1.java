package dockerPracticeExamples;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerEx1 {
	
@Test
	public void dockerstart() throws MalformedURLException {
	
	
	
	
	
		DesiredCapabilities dc = DesiredCapabilities.chrome();

		
			URL url = new URL("http://172.17.0.2:4444/wd/hub");
		

		RemoteWebDriver driver = new RemoteWebDriver(url,dc);

		driver.get("https://demo.opencart.com/admin");
		System.out.println("title of page is " + driver.getTitle());
		driver.quit();

	}

}
