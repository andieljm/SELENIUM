/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parallel_Testing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/**
 *
 * @author Lenovo
 */
public class compraC extends Thread {

    @Override
    public void run() {
        WebDriver test3C = new ChromeDriver();
        Wait<WebDriver> espera = new FluentWait<WebDriver>(test3C)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5));
        // driver de Chrome
        test3C.get("https://www.saucedemo.com/");
        test3C.manage().window().maximize();
        //datos de login
        String username = "standard_user";
        String password = "secret_sauce";

        //localizando id
        WebElement usernameInput = test3C.findElement(By.id("user-name"));
        WebElement passwordInput = test3C.findElement(By.id("password"));
        WebElement loginbt = test3C.findElement(By.id("login-button"));
        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbt.click();

        //localizamos 
        WebElement agregar1 = test3C.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        WebElement agregar2 = test3C.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        WebElement agregar3 = test3C.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        WebElement carrito = test3C.findElement(By.id("shopping_cart_container"));
        //agregamos al carrito
        agregar1.click();
        agregar2.click();
        agregar3.click();

        //verificamos que se guardaron en el carrito
        carrito.click();

        //localizamos para comprar
        WebElement comprarC = test3C.findElement(By.id("checkout"));
        comprarC.click();

        // persona que compra
        String nombre = "jose";
        String apellido = "lopez";
        String codigo = "4006";

        // ingresamos datos
        WebElement nombreInput = test3C.findElement(By.id("first-name"));
        WebElement apellidoInput = test3C.findElement(By.id("last-name"));
        WebElement codigoInput = test3C.findElement(By.id("postal-code"));
        WebElement continuar = test3C.findElement(By.id("continue"));

        nombreInput.sendKeys(nombre);
        apellidoInput.sendKeys(apellido);
        codigoInput.sendKeys(codigo);
        continuar.click();
        // desplazamos hacia abajo
//        test3C.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        JavascriptExecutor jsC = (JavascriptExecutor) test3C;
        jsC.executeScript("window.scrollBy(0,400)");
        //pagamos
//        WebElement pagarC = test3C.findElement(By.id("finish"));
        WebElement pagarC = espera.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver test3C) {
                return test3C.findElement(By.id("finish"));
            }
        });
        retraso();
        pagarC.click();
        jsC.executeScript("window.scrollBy(0,-425)");
    }

    public static void retraso() {
        try {
            for (int i = 0; i < 1; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
