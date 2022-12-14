package selenium_Proyecto;

import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Documents\\Selelinum\\msedgedriver.exe");
        Menu();

    }

    public static void Menu() {
        inicio iniciar = new inicio();
        clientes cc = new clientes();
        byte opcion;

        opcion = Byte.parseByte(JOptionPane.showInputDialog(null,
                "****MENÚ PRINCIPAL****\n\n"
                + "1.Prueba de inicio de seccion \n"
                + "2.Cliente CRUD \n"
                + "3.Control de Limite \n"
                + "4.Carrito de compras \n"
                + "5.Categoria CRUD \n"
                + "6.Cambio de idioma \n"
                + "7.Revirsar articulos \n"
                + "8.Articulos CRUD \n"
                + "9.Comprar \n"
                + "10.Vista de inventario\n"
                + "11.Salir \n\n"
                + "Digite su opción:"));

        switch (opcion) {
            case 1: {
                System.out.println("Ejecutando prueba 1");
                iniciar.user();
                Menu();
                break;

            }
            case 2: {
                System.out.println("Ejecutando prueba 2");
                cc.crud();
                Menu();
                break;
            }
            case 3: {
                System.out.println("Ejecutando prueba 3");
                cc.limite();
                Menu();
                break;
            }
            case 4: {
                System.out.println("Ejecutando prueba 4");
                cc.carrito();
                Menu();
                break;
            }
            case 5: {
                System.out.println("Ejecutando prueba 5");
                cc.categorias();
                Menu();
                break;
            }
            case 6: {
                System.out.println("Ejecutando prueba 6");
                cc.idioma();
                Menu();
                break;
            }
            case 7: {
                System.out.println("Ejecutando prueba 7");
                cc.revisarA();
                Menu();
                break;
            }
            case 8: {
                System.out.println("Ejecutando prueba 8");

                Menu();
                break;
            }
            case 9: {
                System.out.println("Ejecutando prueba 9");

                Menu();
                break;
            }
            case 10: {
                System.out.println("Ejecutando prueba 10");
                Menu();
                break;
            }
            case 11: {
                break;
            }
            default: {
                Menu();

            }
        }

    }
}
