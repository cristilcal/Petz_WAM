package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.Base;
import org.openqa.selenium.WebDriver;
import pages.Home;
import pages.List;
import pages.Product;

import static org.junit.Assert.assertEquals;

public class SearchProduct extends Base {
    private Base base;
    private Home home;
    private List list;
    private Product product;


    public SearchProduct(WebDriver driver, Base base) {
        super(driver);
        this.base = base;
    }



    @Given("^I access Petz HomePage$")
    public void iAccessPetzHomePage() {
       this.base.driver.get("https://www.petz.com.br");
    }

    @When("^I search \"([^\"]*)\"$")
    public void iSearch(String product){
        home.searchWithEnter(product);

    }

    @Then("^I see a list of product \"([^\"]*)\"$")
    public void iSeeAListOfProduct(String product){
        assertEquals(product + " - Produtos pet em promoção | Petz",list.ReadTitleTab());
        assertEquals("Resultado para \"" + product + "\"",list.readResultBy());
    }

    @And("^I click in product \"([^\"]*)\"$")
    public void iClickInProduct(String product){
        list.clickAtDesiredProduct(product);


    }

    @Then("^I show the Title \"([^\"]*)\" and the price \"([^\"]*)\"$")
    public void iShowTheTitleAndThePrice(String product, String price){
        assertEquals(product, this.product.readProductTitle());
        assertEquals(price, this.product.readPriceCurrent());

    }
}
