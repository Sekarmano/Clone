package orh.test.clone;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saravanan\\Desktop\\Selenium Tasks\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.snapdeal.com");
		driver.findElement(By.id("inputValEnter")).sendKeys("iphonex");
		driver.findElement(By.id("inputValEnter")).sendKeys("iphonex");
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		List<WebElement> l = driver.findElements(By.xpath("//p[@class='product-title']"));
		int h = l.size();
		System.out.println(h);
		for  (WebElement x:l) {
			System.out.println(x.getText());
			
		}
		l.get(5).click();
		
		}
		

}
