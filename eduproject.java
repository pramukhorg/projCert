import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class eduproject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://localhost:8080/");
		//driver.manage().window().maximize();
		driver.findElement(By.id("About Us")).click();
		Thread.sleep(20);
		String textvalue = driver.findElement(By.id("PID-ab2-pg")).getText();
		Thread.sleep(20);
		//String at = driver.getTitle();
		System.out.println(textvalue);
		//System.out.println(at);
		//String ext = "gmail";
		driver.close();
		if(textvalue.contains("about"))
		{
			System.out.println("Test Success");
			
		}
		else
		{
			System.out.println("Test failed");
		}

	}

}

