package selenium_Proyecto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selelinum\\chromedriver.exe");

        WebDriver test1 = new ChromeDriver();
        
        test1.get("http://localhost:70/index.html");
        test1.manage().window().maximize();
        
    }

}
