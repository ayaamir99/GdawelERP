package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.StepDefinition.Hooks.driver;

public class D02_LoginStepDef {
    P02_LoginPage login=new P02_LoginPage();
//    @And("I click on Account then SignIn")
//    public void NavigateToLoginScreen(){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.navigate().to("https://gdawel.app/login");
//
//    }

    @Given("I Open {string}")
    public void i_open(String string) {
    // Write code here that turns the phrase above into concrete actions
        driver.get("https://gdawel.app/login");
        String expected = "https://gdawel.app/login";
        String LoginUrl = driver.getCurrentUrl();
        Assert.assertEquals(LoginUrl, expected);

    throw new io.cucumber.java.PendingException();
    }
    @When("I user click on SignIn Button")
    public void i_user_click_on_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.sendKeys(login.EmailLoginButton(),"detebag627@elixirsd.com");
        login.sendKeys(login.passwordLoginButton(),""+74108520);
        login.click(login.loginButton());

        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be redirected to the Dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
//    @And("I am on the login page")
//    public void user_is_on_login_page(){
//        String expected = "https://gdawel.app/login";
//        String LoginUrl = driver.getCurrentUrl();
//        Assert.assertEquals(LoginUrl, expected);
//
//    }
//    @When("I enter valid email{string} and valid password{string}")
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
//    @And(" And I user click on SignIn Button")
//    public void I_user_click_on_SignIn_Button(){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        login.click(login.loginButton());
//
//    }

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
