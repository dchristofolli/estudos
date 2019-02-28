package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.intellij.icons.AllIcons.General.Web;

public class chrome {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void before(){

        System.setProperty("webdriver.chrome.driver", "/home/daniel/estudos/estudos_gradle/Artifact/drive/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://google.com.br/");
        driver.manage().window().maximize();
    }
    @After
    public void after(){
        driver.quit();
    }
    @Test
    public void acessaOGoogle(){
        /**Aqui vamos apenas abrir o navegador,
         * um pequeno ato para a automação, mas um grande avanço para o automatizador!
         */
    }
}
