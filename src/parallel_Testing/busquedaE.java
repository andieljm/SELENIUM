/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *
 * @author Lenovo
 */
public class busquedaE extends Thread {

    @Override
    public void run() {
        WebDriver test4E = new EdgeDriver();
        // driver de Chrome
        test4E.get("https://www.globalsqa.com/");
        test4E.manage().window().maximize();

        //datos de formulario
        String bus1 = "selenium";
        String bus2 = "android";
        String bus3 = "Coded UI";
        //localizamos
//        WebElement cokiInput = test4E.findElement(By.id("onetrust-accept-btn-handler"));
        WebElement bus1Input = test4E.findElement(By.id("s"));
        //buscamos 
//        cokiInput.click();
//        JavascriptExecutor jsC = (JavascriptExecutor) test4E;
//        jsC.executeScript("window.scrollBy(0,900)");
        bus1Input.sendKeys(bus1);
        bus1Input.sendKeys(Keys.RETURN);
        test4E.findElement(By.id("s")).clear();
        // busqueda 2
        WebElement bus2Input = test4E.findElement(By.id("s"));
        bus2Input.sendKeys(bus2);
        bus2Input.sendKeys(Keys.RETURN);
        test4E.findElement(By.id("s")).clear();
        //busqueda 3
        WebElement bus3Input = test4E.findElement(By.id("s"));
        bus3Input.sendKeys(bus3);
        bus3Input.sendKeys(Keys.RETURN);

    }
}
