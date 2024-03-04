package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.Pages.P02_LoginPage;
import org.example.Pages.P03_ProductsPage;

import java.time.Duration;

import static org.example.StepDefinition.Hooks.driver;

public class D03_AddProductStepDef {

    P02_LoginPage login=new P02_LoginPage();
    P03_ProductsPage Products = new P03_ProductsPage();
    @Given("I Open Products Page")
    public void NavigateToProductsScreen(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //     private final By productsAndWarehouseMenu = By.id("products-menu");
        //    //    private final By products = By.xpath("//a[@href='https://gdawel.app/dashboard/products']");
        //    private final By products = By.id("product-list-menu");
            Products.ClickOnproductsAndWarehouseMenu().click();
            Products.ClickOnProductsMenu().click();
    }
//    @And("I enter valid email{string} and valid password{string}")
//    public void validEmailAndPassword(String email,String password){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        login.sendKeys(login.EmailLoginButton(),"detebag627@elixirsd.com");
//        login.sendKeys(login.passwordLoginButton(),""+74108520);
//
//    }
//    @And("I click on Account then SignIn")
//    public void NavigateToLoginScreen(){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.navigate().to("https://gdawel.app/login");
//
//    }
}
