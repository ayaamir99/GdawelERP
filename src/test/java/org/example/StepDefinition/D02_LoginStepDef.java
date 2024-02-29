package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Pages.P02_LoginPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.StepDefinition.Hooks.driver;

public class D02_LoginStepDef {
    P02_LoginPage login=new P02_LoginPage();
    //     Given I am on the login page
    @And("user enter valid email{string} and valid password{string}")
    public void validEmailAndPassword(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://gdawel.app/login");
        ///,mcm,msml,sm

    }
    @And("user enter valid email{string} and valid password{string}")
    public void validEmailAndPassword(String email,String password){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.sendKeys(login.EmailLoginButton(),"detebag627@elixirsd.com");
        login.sendKeys(login.passwordLoginButton(),""+74108520);
        login.click(login.loginButton());

    }

//    @And("user hover on Supermarket and click on bakery")
//    public void hoverSupermarketClickBakery(){
//        Actions actions=new Actions(driver);
//        actions.moveToElement(login.supermarket()).build().perform();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        actions.moveToElement(login.bakery()).click().perform();
//
//    }
//    @And("add two items to cart")
//    public void addItemsToCart(){
//        login.addToCart();
//    }
//    @Then("verify items are added and subtotal is calculated correctly")
//    public void verifyItemsAddedAndSubtotalIsRight(){
//        double expected=login.getExpectedItemsPrice();
//        double actual =login.actualSubtotalPriceValue();
//        SoftAssert softAssert=new SoftAssert();
//        softAssert.assertEquals(expected,actual,"The expected is"+expected +
//                "and the actual is:"+actual);
//        System.out.println("The expected is"+expected +
//                "and the actual is:"+actual);
//    }

}
