package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class List extends Base {

    //1- mapeamento
    @FindBy (css =  "h1.h2Categoria.nomeCategoria")
    private WebElement lblResultBy;


    //2 - construtor
    public List(WebDriver driver) {
        super(driver);
    }

    //3 - métodos
    public String ReadTitleTab(){
        return driver.getTitle();
    }
    public void clickAtDesiredProduct(String product){
        driver.findElement(By.xpath("//h3[contains(text(),['" + product + "'])]")).click();
    }

    public String readResultBy(){
        return lblResultBy.getText();
    }
}