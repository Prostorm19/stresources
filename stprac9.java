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
import org.openqa.selenium.firefox.FirefoxOptions;

public class stprac9
{

    static String driverPath = "C:/Pratham/books/sem 5/ST/geckodriver.exe";

    public static void main(String[] args) 
    {
        System.setProperty("webdriver.gecko.driver", driverPath);
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);
        String appUrl = "C:/Users/catch/OneDrive/Documents/NetBeansProjects/Seleniumgcd/src/seleniumgcd/checkbox.html"; 

        driver.get(appUrl);
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        int checkedCount = 0;
        int uncheckedCount = 0;

        for (int i = 0; i < checkBoxes.size(); i++) 
        {
            System.out.println(i + " checkbox is selected: " + checkBoxes.get(i).isSelected());
            if (checkBoxes.get(i).isSelected()) 
            {
                checkedCount++;
            } 
            else 
            {
                uncheckedCount++;
            }
        }
        System.out.println("No. of selected checkboxes: " + checkedCount);
        System.out.println("No. of unselected checkboxes: " + uncheckedCount);
        
    }
}
