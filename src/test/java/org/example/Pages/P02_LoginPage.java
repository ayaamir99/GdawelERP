package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

import static org.example.StepDefinition.Hooks.driver;

public class P02_LoginPage extends BasePage{
    public P02_LoginPage() {
        super(driver);
    }
    public final String username ="detebag627@elixirsd.com";
    public final String password ="74108520";
    public WebElement EmailLoginButton(){
        By EmailLoginButton=By.name("email");
        return driver.findElement(EmailLoginButton);
    }
    public WebElement passwordLoginButton(){
        By passwordLoginButton=By.name("password");
        return driver.findElement(passwordLoginButton);
    }
    public WebElement loginButton(){
        By loginButton=By.xpath("//*[@id=\"kt_body\"]/div/div/div/div/div/div[2]/div/form/button");
        return driver.findElement(loginButton);
    }
//    public WebElement supermarket(){
//        By supermarket=By.xpath("//span[contains(.,'Supermarket')]");
//        return driver.findElement(supermarket);
//    }
//    public WebElement bakery(){
//        By bakery=By.xpath("//a[contains(.,'Bakery')]");
//        return driver.findElement(bakery);
//    }




}
