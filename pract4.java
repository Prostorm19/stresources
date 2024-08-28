/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumgcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import java.util.Scanner;


public class pract4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Username To Automate :- ");
        String username = scanner.nextLine();

        System.out.print("Enter Your Password To Automate :- ");
        String password = scanner.nextLine();

        System.setProperty("webdriver.gecko.driver", "C:/Pratham/books/sem 5/ST/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);
        driver.get("http://localhost:80//stprac/login.html");

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("button")).click();

    }

}
