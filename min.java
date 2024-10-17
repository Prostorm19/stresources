/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumgcd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
/**
 *
 * @author catch
 */
public class min {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/Pratham/books/sem 5/ST/geckodriver.exe");

        
        FirefoxProfile fp = new FirefoxProfile();
        fp.setPreference(FirefoxProfile.PORT_PREFERENCE, "7055");
        
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(fp);
        
        WebDriver driver = new FirefoxDriver(options);
        driver.get("C:\\Users\\catch\\OneDrive\\Desktop\\ST prints\\min.html");
        driver.manage().window().maximize();
        
        driver.findElement(By.name("n1")).sendKeys("36");
        driver.findElement(By.name("n2")).sendKeys("6");
        driver.findElement(By.name("n3")).sendKeys("10");
        driver.findElement(By.name("n4")).sendKeys("12");
        driver.findElement(By.name("n5")).sendKeys("8");
        driver.findElement(By.name("btn")).click();
        
        String result = driver.findElement(By.name("result")).getAttribute("value");
        System.out.println("GCD = " + result);
        
        
    }
}
