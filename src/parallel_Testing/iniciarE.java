/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *
 * @author Lenovo
 */
public class iniciarE extends Thread {

    @Override
    public void run() {
        WebDriver test1E = new EdgeDriver();
        // driver de MS edge
        test1E.get("https://www.saucedemo.com/");
        test1E.manage().window().maximize();
        //datos de login
        String username2 = "standard_user";
        String password2 = "secret_sauce";

        //localizando id
        WebElement usernameInput2 = test1E.findElement(By.id("user-name"));
        WebElement passwordInput2 = test1E.findElement(By.id("password"));
        WebElement loginbt2 = test1E.findElement(By.id("login-button"));
        //login
        usernameInput2.sendKeys(username2);
        passwordInput2.sendKeys(password2);
        loginbt2.click();
    }
}
