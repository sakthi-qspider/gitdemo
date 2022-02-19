package gitdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebApp {

	public static void main(String[] args) throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakthi\\eclipse-workspace\\gitdemo\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		System.out.println("Application Title is........"+driver.getTitle());
		

	}

}
