package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
    @FindBy(name="g")
    WebElement inputBuscar;

    @FindBy(xpath = "//input[contains(@data-ved,'0ahUKEwiSqpzdjpL4AhWRDdQKHZO4AdYQ4dUDCAs')]")
    WebElement btnBuscar;

    public Google(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }
    public void ingresarBusqueda(String busqueda){
        inputBuscar.sendKeys(busqueda);
    }
    public void clicBtnBuscar(){
        btnBuscar.click();
    }

}
