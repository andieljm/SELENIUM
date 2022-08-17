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
        if (alea == 4) {
            String nombre1 = "josue";
            nombreM = nombre1;
            String limite = "500000";
            limM = limite;
        } else if (alea == 2) {
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

    public void limite() {
        WebDriver lim = new EdgeDriver();

        lim.get("http://localhost:8080");
        lim.manage().window().maximize();

        //datos de login
        String username = "admin";
        String password = "123";

        //localizando id
        WebElement usernameInput = lim.findElement(By.id("username"));
        WebElement passwordInput = lim.findElement(By.id("password"));
        WebElement loginbt = lim.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/div/div[2]/form/div[3]/button"));
        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbt.click();

        //localizamos Clientes
        WebElement clientesbt = lim.findElement(By.xpath("//*[@id=\"clie\"]"));

        //ingresamos a clientes
        clientesbt.click();

        retraso();

        //actualizar
        WebElement actbt = lim.findElement(By.xpath("//*[@id=\"clientes\"]/div/div/div[1]/div/div[2]/table/tbody/tr[1]/td[5]/a"));
        actbt.click();

        retraso();

        //control de limite
        WebElement limm = lim.findElement(By.xpath("//*[@id=\"credito.limite\"]"));
        limm.clear();

        WebElement limmo = lim.findElement(By.xpath("//*[@id=\"credito.limite\"]"));
        limmo.sendKeys("2000000");

        WebElement modifica = lim.findElement(By.xpath("//*[@id=\"actions\"]/div/div/div[2]/button"));
        modifica.click();

    }

    public void carrito() {
        WebDriver car = new EdgeDriver();

        car.get("http://localhost:8080");
        car.manage().window().maximize();

        //datos de login
        String username = "joel";
        String password = "123";

        //localizando id
        WebElement usernameInput = car.findElement(By.id("username"));
        WebElement passwordInput = car.findElement(By.id("password"));
        WebElement loginbt = car.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/div/div[2]/form/div[3]/button"));
        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbt.click();

        //agregamos
        //verificamos carrito
        WebElement carrito = car.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li/a"));
        carrito.click();
    }

    public void categorias() {
        WebDriver cate = new EdgeDriver();

        cate.get("http://localhost:8080");
        cate.manage().window().maximize();

        //datos de login
        String username = "admin";
        String password = "123";

        //localizando id
        WebElement usernameInput = cate.findElement(By.id("username"));
        WebElement passwordInput = cate.findElement(By.id("password"));
        WebElement loginbt = cate.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/div/div[2]/form/div[3]/button"));
        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbt.click();

        //localizamos Categorias
        WebElement categoriasbt = cate.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul[1]/li[2]/a"));

        //ingresamos a categorias
        categoriasbt.click();

        retraso();

        //localizamos
        WebElement agrec = cate.findElement(By.xpath("/html/body/section[1]/div/div/div/button"));
        agrec.click();

        retraso();

        String dis = "Discos";
        //localizamos
        WebElement desp = cate.findElement(By.xpath("//*[@id=\"agregarCategoria\"]/div/div/form/div[1]/div[1]/input"));
        WebElement act = cate.findElement(By.xpath("//*[@id=\"agregarCategoria\"]/div/div/form/div[1]/div[2]/input"));
        WebElement guar = cate.findElement(By.xpath("//*[@id=\"agregarCategoria\"]/div/div/form/div[2]/button"));
        desp.sendKeys(dis);
        act.click();
        guar.click();

        // de nuevo
        WebElement agrec1 = cate.findElement(By.xpath("/html/body/section[1]/div/div/div/button"));
        agrec1.click();
        retraso();
        WebElement desp1 = cate.findElement(By.xpath("//*[@id=\"agregarCategoria\"]/div/div/form/div[1]/div[1]/input"));
        WebElement act1 = cate.findElement(By.xpath("//*[@id=\"agregarCategoria\"]/div/div/form/div[1]/div[2]/input"));
        WebElement guar1 = cate.findElement(By.xpath("//*[@id=\"agregarCategoria\"]/div/div/form/div[2]/button"));
        desp1.sendKeys(dis);
        act1.click();
        guar1.click();

        WebElement agrec2 = cate.findElement(By.xpath("/html/body/section[1]/div/div/div/button"));
        agrec2.click();
        retraso();
        WebElement desp2 = cate.findElement(By.xpath("//*[@id=\"agregarCategoria\"]/div/div/form/div[1]/div[1]/input"));
        WebElement act2 = cate.findElement(By.xpath("//*[@id=\"agregarCategoria\"]/div/div/form/div[1]/div[2]/input"));
        WebElement guar2 = cate.findElement(By.xpath("//*[@id=\"agregarCategoria\"]/div/div/form/div[2]/button"));
        desp2.sendKeys(dis);
        act2.click();
        guar2.click();

        JavascriptExecutor jsC = (JavascriptExecutor) cate;
        jsC.executeScript("window.scrollBy(0,400)");

        retraso();

        String categoriaN = "";
        int ale;
        ale = (int) (Math.random() * 5 + 1);
        if (ale == 2) {
            categoriaN = "Parlantes";
        } else if (ale == 3) {
            categoriaN = "Juegos";
        } else if (ale == 4) {
            categoriaN = "Celulares MV";
        } else {
            categoriaN = "Celulares Gama alta";
        }

        //modificar
        WebElement modi = cate.findElement(By.xpath("//*[@id=\"categorias\"]/div/div/div/div/div[2]/table/tbody/tr[4]/td[5]/a"));
        modi.click();

        WebElement catel = cate.findElement(By.xpath("//*[@id=\"descripcion\"]"));
        catel.clear();

        WebElement cateN = cate.findElement(By.xpath("//*[@id=\"descripcion\"]"));
        cateN.sendKeys(categoriaN);

        retraso();
        //guardamos
        WebElement guarm = cate.findElement(By.xpath("//*[@id=\"actions\"]/div/div/div[2]/button"));
        guarm.click();

        JavascriptExecutor js1 = (JavascriptExecutor) cate;
        js1.executeScript("window.scrollBy(0,400)");

        retraso();
        WebElement elimi1 = cate.findElement(By.xpath("//*[@id=\"categorias\"]/div/div/div/div/div[2]/table/tbody/tr[5]/td[4]/a"));
        elimi1.click();

        JavascriptExecutor js2 = (JavascriptExecutor) cate;
        js2.executeScript("window.scrollBy(0,400)");
    }

    public void idioma() {
        WebDriver idioma = new EdgeDriver();

        idioma.get("http://localhost:8080");
        idioma.manage().window().maximize();

        //datos de login
        String username = "admin";
        String password = "123";

        //localizando id
        WebElement usernameInput = idioma.findElement(By.id("username"));
        WebElement passwordInput = idioma.findElement(By.id("password"));
        WebElement loginbt = idioma.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/div/div[2]/form/div[3]/button"));
        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbt.click();

        //cambiamos de idioma
        WebElement ingles = idioma.findElement(By.xpath("/html/body/footer/div/div/p/a[2]"));
        ingles.click();
    }

    public void revisarA() {
        WebDriver revi = new EdgeDriver();

        revi.get("http://localhost:8080");
        revi.manage().window().maximize();

        //datos de login
        String username = "admin";
        String password = "123";

        //localizando id
        WebElement usernameInput = revi.findElement(By.id("username"));
        WebElement passwordInput = revi.findElement(By.id("password"));
        WebElement loginbt = revi.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/div/div[2]/form/div[3]/button"));
        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbt.click();
        
        //localizamos articulos
        WebElement ar = revi.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul[1]/li[3]/a"));
        ar.click();
        
        retraso();
        
        WebElement re = revi.findElement(By.xpath("//*[@id=\"articulos\"]/div/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a"));
        re.click();
        
        retraso();
        
        WebElement revisa = revi.findElement(By.xpath("//*[@id=\"idCategoria\"]"));
        revisa.click();
        
        retraso();
        retraso();
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
