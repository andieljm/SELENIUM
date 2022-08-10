/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selenium_Proyecto;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *
 * @author Lenovo
 */
public class clientes {

    public void crud() {
        WebDriver crud = new EdgeDriver();

        crud.get("http://localhost:8080");
        crud.manage().window().maximize();

        //datos de login
        String username = "admin";
        String password = "123";

        //localizando id
        WebElement usernameInput = crud.findElement(By.id("username"));
        WebElement passwordInput = crud.findElement(By.id("password"));
        WebElement loginbt = crud.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/div/div[2]/form/div[3]/button"));
        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbt.click();

        //localizamos Clientes
        WebElement clientesbt = crud.findElement(By.xpath("//*[@id=\"clie\"]"));

        //ingresamos a clientes
        clientesbt.click();

        //localizamos agregar
        WebElement agregarbt = crud.findElement(By.xpath("/html/body/section[1]/div/div/div/button"));

        agregarbt.click();

        //tomamos datos
        String nombre = "";
        int ale;
        ale = (int) (Math.random() * 5 + 1);
        if (ale == 4) {
            String nombre1 = "pedro";
            nombre = nombre1;
        } else if (ale == 2) {
            String nombre2 = "brayan";
            nombre = nombre2;
        } else {
            String nombre3 = "kevin";
            nombre = nombre3;
        }
        String apellidos = "ramirez";
        String correo = "pa@gmail.com";
        String tel = "70892838";
        String lim = "50000";
        retraso();
        //localizamos datos
        WebElement nombreIN = crud.findElement(By.xpath("//*[@id=\"agregarCliente\"]/div/div/form/div[1]/div[1]/input"));
        WebElement apellidoIN = crud.findElement(By.xpath("//*[@id=\"agregarCliente\"]/div/div/form/div[1]/div[2]/input"));
        WebElement correoIN = crud.findElement(By.xpath("//*[@id=\"agregarCliente\"]/div/div/form/div[1]/div[3]/input"));
        WebElement telIN = crud.findElement(By.xpath("//*[@id=\"agregarCliente\"]/div/div/form/div[1]/div[4]/input"));
        WebElement limIN = crud.findElement(By.xpath("//*[@id=\"agregarCliente\"]/div/div/form/div[1]/div[5]/input"));
        WebElement guarbt = crud.findElement(By.xpath("//*[@id=\"agregarCliente\"]/div/div/form/div[2]/button"));
        //creamos
        nombreIN.sendKeys(nombre);
        apellidoIN.sendKeys(apellidos);
        correoIN.sendKeys(correo);
        telIN.sendKeys(tel);
        limIN.sendKeys(lim);
        guarbt.click();

        //actualizar
        WebElement actbt = crud.findElement(By.xpath("//*[@id=\"clientes\"]/div/div/div[1]/div/div[2]/table/tbody/tr[1]/td[5]/a"));
        actbt.click();

        retraso();

        //datos modificados
        String nombreM = "";
        String limM = "";
        int alea;
        alea = (int) (Math.random() * 6 + 1);
        if (alea >= 4) {
            String nombre1 = "josue";
            nombreM = nombre1;
            String limite = "500000";
            limM = limite;
        } else if (alea <= 2) {
            String nombre2 = "dani";
            nombreM = nombre2;
            String limite = "1000000";
            limM = limite;
        } else {
            String nombre3 = "john";
            nombreM = nombre3;
            String limite = "200000";
            limM = limite;
        }
        //localizamos
        WebElement nombrem = crud.findElement(By.xpath("//*[@id=\"nombre\"]"));
        WebElement limm = crud.findElement(By.xpath("//*[@id=\"credito.limite\"]"));
        //limpiamos
        nombrem.clear();
        limm.clear();
        //localizamos
        WebElement nombremo = crud.findElement(By.xpath("//*[@id=\"nombre\"]"));
        WebElement limmo = crud.findElement(By.xpath("//*[@id=\"credito.limite\"]"));

        nombremo.sendKeys(nombreM);
        limmo.sendKeys(limM);

        //localizamos
        WebElement modifica = crud.findElement(By.xpath("//*[@id=\"actions\"]/div/div/div[2]/button"));
        modifica.click();
        
        //eliminar
        //localizamos
        retraso();
        JavascriptExecutor jsC = (JavascriptExecutor) crud;
        jsC.executeScript("window.scrollBy(0,400)");
        WebElement eliminar1 = crud.findElement(By.xpath("//*[@id=\"clientes\"]/div/div/div[1]/div/div[2]/table/tbody/tr[4]/td[4]/a"));
        eliminar1.click();

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
