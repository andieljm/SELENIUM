/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *
 * @author Lenovo
 */
public class iniciarC extends Thread {

    @Override
    public void run() {
        //inicio de seccion
        WebDriver test1C = new ChromeDriver();
        // driver de Chrome
        test1C.get("https://www.saucedemo.com/");
        test1C.manage().window().maximize();
        //datos de login
        String username = "standard_user";
        String password = "secret_sauce";

        //localizando id
        WebElement usernameInput = test1C.findElement(By.id("user-name"));
        WebElement passwordInput = test1C.findElement(By.id("password"));
        WebElement loginbt = test1C.findElement(By.id("login-button"));
        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbt.click();
    }

}
