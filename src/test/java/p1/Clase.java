package p1;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

public class Clase {
    WebDriver driver;

    public Clase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public static SelenideElement btnAceptar(){ return $(By.id("zV9nZe")); }
    public static SelenideElement btnSesion(){ return $(By.cssSelector("a[class='gb_4 gb_5 gb_ae gb_ce gb_4c']")); }

    public static SelenideElement texto(){ return $(By.cssSelector("span[jsslot]")); }

    //Ponemos a "Dormir" el programa durante los ms que queremos
    static public void Dormir(){
        try {
            Thread.sleep(500*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
