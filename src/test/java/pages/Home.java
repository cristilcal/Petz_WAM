package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {
    //1 o -  mapeamento de Elemento
    @FindBy (id = "search")
    private WebElement inputSearchTextBox;

    @FindBy (css = "button.button-search")
    private WebElement btnSearch;



    //2 Construtor

    public Home(WebDriver driver) {
        super(driver);
    }

    //3 - Ações dos elementos

    public void search(String product) {
        inputSearchTextBox.click();
        inputSearchTextBox.clear();
        inputSearchTextBox.sendKeys(product);
    }
    public void searchWithMagnifierButton(String product){
        search(product);
        btnSearch.click();
    }

    public void searchWithEnter(String product){
        search(product);
        inputSearchTextBox.sendKeys((Keys.ENTER));
    }

}
