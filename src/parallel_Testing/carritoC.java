/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Lenovo
 */
public class carritoC extends Thread {

    @Override
    public void run() {
        WebDriver test2C = new ChromeDriver();
        // driver de Chrome
        test2C.get("https://www.saucedemo.com/");
        test2C.manage().window().maximize();
        //datos de login
        String username = "standard_user";
        String password = "secret_sauce";

        //localizando id
        WebElement usernameInput = test2C.findElement(By.id("user-name"));
        WebElement passwordInput = test2C.findElement(By.id("password"));
        WebElement loginbt = test2C.findElement(By.id("login-button"));
        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbt.click();

        //localizamos 
        WebElement agregar1 = test2C.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        WebElement agregar2 = test2C.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        WebElement agregar3 = test2C.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        WebElement carrito = test2C.findElement(By.id("shopping_cart_container"));
        //agregamos al carrito
        agregar1.click();
        agregar2.click();
        agregar3.click();

        //verificamos que se guardaron en el carrito
        carrito.click();

    }
}
