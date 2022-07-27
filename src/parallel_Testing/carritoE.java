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
public class carritoE extends Thread {

    @Override
    public void run() {
        WebDriver test2E = new EdgeDriver();
        // driver de MS edge
        test2E.get("https://www.saucedemo.com/");
        test2E.manage().window().maximize();
        //datos de login
        String username2 = "standard_user";
        String password2 = "secret_sauce";

        //localizando id
        WebElement usernameInput2 = test2E.findElement(By.id("user-name"));
        WebElement passwordInput2 = test2E.findElement(By.id("password"));
        WebElement loginbt2 = test2E.findElement(By.id("login-button"));
        //login
        usernameInput2.sendKeys(username2);
        passwordInput2.sendKeys(password2);
        loginbt2.click();

        //localizamos 
        WebElement agregarE1 = test2E.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        WebElement agregarE2 = test2E.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        WebElement agregarE3 = test2E.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        WebElement carritoE = test2E.findElement(By.id("shopping_cart_container"));
        //agregamos al carrito
        agregarE1.click();
        agregarE2.click();
        agregarE3.click();
        //verificamos que se guardaron en el carrito
        carritoE.click();
    }
}
