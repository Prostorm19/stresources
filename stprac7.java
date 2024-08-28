/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumgcd;

/**
 *
 * @author catch
 */
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.firefox.FirefoxOptions; 

public class stprac7 
{
    static String driverPath = "C:/Pratham/books/sem 5/ST/geckodriver.exe"; 

    public static void main(String[] args) 
    { 
        System.setProperty("webdriver.gecko.driver", driverPath); 
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options); 
        String appUrl = "https://www.google.co.in/"; 
        driver.get(appUrl); 
        java.util.List<WebElement> links = driver.findElements(By.tagName("a")); 
        for (int i = 0; i < links.size(); i++) 
        { 
            System.out.println(links.get(i).getText()); 
        } 
        System.out.println("Total No. of Links: " + links.size()); 
        driver.quit();
    }
}
