package seleniumgcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class checkbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/Pratham/books/sem 5/ST/geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("browserName", "firefox");
        options.setCapability("version", "128.0.3");  // Ensure this matches your Firefox version
        options.setCapability("platform", "WINDOWS");

        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://localhost/stprac/login.html");

        java.util.List<WebElement> c = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Count of Checkboxes: " + c.size());

        java.util.List<WebElement> d = driver.findElements(By.xpath("//input[@type='checkbox' and @checked]"));
        System.out.println("Count of Checkboxes checked: " + d.size());

        java.util.List<WebElement> e = driver.findElements(By.xpath("//input[@type='checkbox' and not(@checked)]"));
        System.out.println("Count of Checkboxes not checked: " + e.size());

         // Always quit the driver at the end
    }
}
