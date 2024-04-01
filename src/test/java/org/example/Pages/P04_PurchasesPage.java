package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

import static org.example.StepDefinition.Hooks.driver;

public class P04_PurchasesPage extends BasePage{
    public P04_PurchasesPage() {
        super(driver);
    }
    public void addToCart(){
        Actions actions=new Actions(driver);
        List<String> productNames = new ArrayList<>();
//        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        WebElement addButton = driver.findElement(By.xpath("(//article//button[@type=\"button\"])[6]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addButton);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo( 0,200);");
        for (int i = 1; i <= 3; i++) {
            if(i!=2){
                WebElement addToCartButton = driver.findElement(By.xpath("(//article//button[@type=\"button\"])["+i+"]"));
                actions.moveToElement(addToCartButton).build().perform();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                click(addToCartButton);
                SoftAssert softAssert=new SoftAssert();
                softAssert.assertTrue(successfullyAddedMessage().isDisplayed());
//                WebElement closeMessageButton=driver.findElement(By.xpath("//button[@class=\"close\"]"));
//                click(closeMessageButton);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                WebElement product=driver.findElement(By.xpath("(//article//button[@type=\"button\"])["+i+"]/parent::*/parent::*/preceding-sibling::*"));
                String name=product.getAttribute("data-name");
                productNames.add(name);

            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(shoppingCart());
        String firstItem=driver.findElement(By.xpath("(//h3)[1]")).getText();
        String secondItem=driver.findElement(By.xpath("(//h3)[2]")).getText();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(productNames.contains(firstItem));
        softAssert.assertTrue(productNames.contains(secondItem));

    }

    public WebElement successfullyAddedMessage(){
        By successMessage=By.xpath("//aside[@class=\"noti\" and contains(.,'Product added successfully')]");
        return driver.findElement(successMessage);
    }

    public double getExpectedItemsPrice(){
        double subtotal = 0.0;
        for (int i = 1; i <= 2; i++) {
            WebElement priceElement = driver.findElement(By.xpath("(//div[@class='prc'])["+i+"]"));

            String priceText = priceElement.getText().replace("EGP ", "");
            double price = Double.parseDouble(priceText);
            subtotal += price;
        }
        return subtotal;
    }

    public WebElement shoppingCart(){
        By shoppingCart=By.id("ci");
        return driver.findElement(shoppingCart);
    }
    public WebElement actualSubtotalPrice(){
        By subtotalElement =By.xpath("//div[@class='__ps-to-header -ptm']//p[contains(text(), 'Subtotal')]/following-sibling::p[@class='-fs20 -plm -tar']");
        return driver.findElement(subtotalElement);
    }
    public double actualSubtotalPriceValue(){
        String subtotalText = actualSubtotalPrice().getText();
        return Double.parseDouble(subtotalText.replaceAll("[^0-9.]", ""));
    }
}
