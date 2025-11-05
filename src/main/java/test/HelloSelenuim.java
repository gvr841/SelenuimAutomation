package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenuim {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://admin-demo.nopcommerce.com/login");
		String title=driver.getTitle();
		System.out.println("Title is :"+title);
	//driver.close();
	//driver.quit();
	}




}
