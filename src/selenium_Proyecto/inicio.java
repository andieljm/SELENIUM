/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selenium_Proyecto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *
 * @author Lenovo
 */
public class inicio {

    public void user() {
        WebDriver user = new EdgeDriver();

        user.get("http://localhost:8080");
        user.manage().window().maximize();

        //datos de login
        String username = "joel";
        String password = "123";

        //localizando id
        WebElement usernameInput = user.findElement(By.id("username"));
        WebElement passwordInput = user.findElement(By.id("password"));
        WebElement loginbt = user.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/div/div[2]/form/div[3]/button"));
        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbt.click();
    }

    public void admin() {
        WebDriver user = new EdgeDriver();

        user.get("http://localhost:8080");
        user.manage().window().maximize();

        //datos de login
        String username = "admin";
        String password = "123";

        //localizando id
        WebElement usernameInput = user.findElement(By.id("username"));
        WebElement passwordInput = user.findElement(By.id("password"));
        WebElement loginbt = user.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/div/div[2]/form/div[3]/button"));
        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbt.click();
    }

}
