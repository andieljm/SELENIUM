/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *
 * @author Lenovo
 */
public class comprarE extends Thread {

    @Override
    public void run() {
        WebDriver test3E = new EdgeDriver();
        // driver de MS edge
        test3E.get("https://www.saucedemo.com/");
        test3E.manage().window().maximize();
        //datos de login
        String username2 = "standard_user";
        String password2 = "secret_sauce";

        //localizando id
        WebElement usernameInput2 = test3E.findElement(By.id("user-name"));
        WebElement passwordInput2 = test3E.findElement(By.id("password"));
        WebElement loginbt2 = test3E.findElement(By.id("login-button"));
        //login
        usernameInput2.sendKeys(username2);
        passwordInput2.sendKeys(password2);
        loginbt2.click();

        //localizamos 
        WebElement agregarE1 = test3E.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        WebElement agregarE2 = test3E.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        WebElement agregarE3 = test3E.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        WebElement carritoE = test3E.findElement(By.id("shopping_cart_container"));
        //agregamos al carrito
        agregarE1.click();
        agregarE2.click();
        agregarE3.click();
        //verificamos que se guardaron en el carrito
        carritoE.click();

        //localizamos para comprar
        WebElement comprarE = test3E.findElement(By.id("checkout"));
        comprarE.click();

        // persona que compra
        String nombreE = "joses";
        String apellidoE = "lopez";
        String codigoE = "4006";

        // ingresamos datos
        WebElement nombreInputE = test3E.findElement(By.id("first-name"));
        WebElement apellidoInputE = test3E.findElement(By.id("last-name"));
        WebElement codigoInputE = test3E.findElement(By.id("postal-code"));
        WebElement continuarE = test3E.findElement(By.id("continue"));

        nombreInputE.sendKeys(nombreE);
        apellidoInputE.sendKeys(apellidoE);
        codigoInputE.sendKeys(codigoE);
        continuarE.click();
        // desplazamos hacia abajo
//        test3C.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        JavascriptExecutor jsE = (JavascriptExecutor) test3E;
        jsE.executeScript("window.scrollBy(0,400)");
        //pagamos
        WebElement pagarE = test3E.findElement(By.id("finish"));
        pagarE.click();
        jsE.executeScript("window.scrollBy(0,-425)");
    }
}
