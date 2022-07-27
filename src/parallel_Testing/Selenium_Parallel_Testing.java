package parallel_Testing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Selenium_Parallel_Testing {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selelinum\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Documents\\Selelinum\\msedgedriver.exe");
        Menu();
    }

    public static void iniciar() {
        //inicio de seccion
        System.out.println("Ejecutando prueba 1");
        WebDriver test1E = new EdgeDriver();
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

    public static void agregarCarrito() {
        System.out.println("Ejecutando prueba 2");
        WebDriver test2E = new EdgeDriver();
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

    public static void comprar() {
        System.out.println("Ejecutando prueba 3");
        WebDriver test3E = new EdgeDriver();
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

    public static void retraso() {
        try {
            for (int i = 0; i < 2; i++) {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void Menu() {
        byte opcion;

        opcion = Byte.parseByte(JOptionPane.showInputDialog(null,
                "****MENÚ PRINCIPAL****\n\n"
                + "1.Prueba de inicio de seccion \n"
                + "2.Prueba de agregar al carrito \n"
                + "3.Prueba de compra \n"
                + "4.Prueba de \n\n"
                + "Digite su opción:"));

        switch (opcion) {
            case 1: {
                iniciar();
                break;

            }
            case 2: {
                agregarCarrito();
                break;
            }
            case 3: {
                comprar();
                break;
            }
            default: {
                Menu();

            }

        }

    }

}
