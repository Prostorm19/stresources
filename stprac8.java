/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumgcd;

/**
 *
 * @author catch
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class stprac8 
{
    static String driverPath = "C:/Pratham/books/sem 5/ST/geckodriver.exe";
    
    public static void main(String[] args) 
    {
        System.setProperty("webdriver.gecko.driver",driverPath);
        WebDriver driver = new FirefoxDriver();
        
        String appUrl = "C:/Users/catch/OneDrive/Documents/NetBeansProjects/Seleniumgcd/src/seleniumgcd/combobox.html";
        
        driver.get(appUrl);
        Select oSelect = new Select(driver.findElement(By.id("continents")));
        List<WebElement> oSize = oSelect.getOptions();
        int iListSize = oSize.size();
        for (int i = 0; i < iListSize; i++) 
        {
            String sValue = oSelect.getOptions().get(i).getText();
            System.out.println(sValue);
        }
        System.out.println("Total No. Items in Dropdown: " + iListSize);
    }
}

