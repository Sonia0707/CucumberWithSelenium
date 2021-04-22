package steps;

import com.codeborne.selenide.Condition;
import static p1.Clase.*;

public class StepsClase {
    static public void ClickAceptar(){
        btnAceptar().should(Condition.visible).click();
    }
    static public void ClickSesion(){
        btnSesion().should(Condition.visible).click();
    }
    static public String divTexto() {
        return texto().should(Condition.visible).getText();
    }

}
