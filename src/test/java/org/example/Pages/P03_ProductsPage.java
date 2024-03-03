package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefinition.Hooks.driver;

public class P03_ProductsPage extends BasePage{
    public P03_ProductsPage() {
        super(driver);
    }
    public WebElement ClickOnproductsAndWarehouseMenu(){
        By productsAndWarehouseMenu = By.id("products-menu");
        return driver.findElement(productsAndWarehouseMenu);
    }
    public WebElement ClickOnProductsMenu(){
        // private final By products = By.id("product-list-menu");
        By productsMenu = By.xpath("//a[@href='https://gdawel.app/dashboard/products']");
        return driver.findElement(productsMenu);
    }
    public WebElement AddNewProductButton(){
        By passwordLoginButton=By.xpath("//*[@id=\"create-product\"]");
        return driver.findElement(passwordLoginButton);
    }
    public WebElement EnterProductName(){
        By ProductName=By.id("name");
        return driver.findElement(ProductName);
    }
    public WebElement EnterProductUnitQuantity(){
        By ProductUnitQuantity=By.xpath("//*[@id=\"create-product\"]");
        return driver.findElement(ProductUnitQuantity);
    }
    public WebElement EnterProductUnitCost(){
        By ProductUnitCost=By.name("unit[0][cost]");
        return driver.findElement(ProductUnitCost);
    }
    public WebElement EnterProductUnitPrice(){
        By ProductUnitPrice=By.name("unit[0][price]");
        return driver.findElement(ProductUnitPrice);
    }
    public WebElement ClickOnSaveProductButton(){
        By SaveProductButton=By.xpath("//input[@value='حفظ']");
        return driver.findElement(SaveProductButton);
    }
}
