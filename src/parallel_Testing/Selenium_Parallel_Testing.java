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

public class Selenium_Parallel_Testing extends Thread {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selelinum\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Documents\\Selelinum\\msedgedriver.exe");
        Menu();
    }

    public static void Menu() {
        byte opcion;

        opcion = Byte.parseByte(JOptionPane.showInputDialog(null,
                "****MENÚ PRINCIPAL****\n\n"
                + "1.Prueba de inicio de seccion \n"
                + "2.Prueba de agregar al carrito \n"
                + "3.Prueba de compra \n"
                + "4.Prueba  \n\n"
                + "Digite su opción:"));

        switch (opcion) {
            case 1: {
                System.out.println("Ejecutando prueba 1");
                iniciarC ic = new iniciarC();
                iniciarE ie = new iniciarE();
                ic.start();
                ie.start();
                Menu();
                break;

            }
            case 2: {
                System.out.println("Ejecutando prueba 2");
                carritoE ce = new carritoE();
                carritoC cc = new carritoC();
                ce.start();
                cc.start();
                Menu();
                break;
            }
            case 3: {
                System.out.println("Ejecutando prueba 3");
                compraC comC = new compraC();
                comprarE comE = new comprarE();
                comC.start();
                comE.start();
                Menu();
                break;
            }
            case 4: {

                Menu();
                break;
            }
            case 5: {

                break;
            }
            default: {
                Menu();

            }

        }

    }

}
