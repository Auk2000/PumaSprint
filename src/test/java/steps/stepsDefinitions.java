package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import pages.Homepage;
import utils.BrowserManager;
import utils.QaProps;
import utils.TestDataReader;

import java.util.HashMap;

public class stepsDefinitions {
    WebDriver driver;
    Homepage  homepage;
    Actions action;
    WebElement element;
    String url;
    HashMap<String, String> data;
    Scenario scenario;




    public stepsDefinitions(BrowserManager browserManager) {
        this.driver = browserManager.getDriver();
    }

    @Before(order=1)
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

//Scenario 1: Verify that user should take the cursor on element present on the home page
    //user navigate to the home page
    @Given("user navigate to the home page")
    public void user_navigate_to_the_home_page() {
            url = QaProps.getValue("url");
            driver.get(url);
            data = TestDataReader.getData(scenario.getName());

    }
//user move cursor on women icon
    @When("user move cursor on women icon")
    public void user_move_cursor_on_women_icon() {
        action=new Actions(driver);
        homepage= new Homepage(driver);
        action.moveToElement(homepage.getWomenAction()).build().perform();
    }
//user display the page of women icon
    @Then("user display the page of women icon")
    public void user_display_the_page_of_women_icon() throws InterruptedException {
        WebElement women= homepage.getWomenpage();
        new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOf(homepage.getWomenpage()));
        Assert.assertTrue(women.isDisplayed());

    }
//user able to click on the sustainability
    @Then("user able to click on the sustainability")
    public void user_able_to_click_on_the_sustainability() throws InterruptedException {
        //sustainability
        homepage.getSustainabilityclick().click();


    }
//user should get display the text
    @Then("user should get display the text")
    public void user_should_get_display_the_text() throws InterruptedException {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getTextdisplay()));
        String text=homepage.getTextdisplay().getText();
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getTextdisplay()));

        Assert.assertEquals(text,"Sustainability");
    }

    //user able to click on the product and gender icon
    @And("user able to click on the product and gender icon")
    public void user_able_to_click_on_the_product_and_gender_icon() throws InterruptedException {
        //product
        homepage.getProductf().click();
        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(homepage.getGetProduct()));
        homepage.getGetProduct().click();
        Thread.sleep(4000);
        homepage.getCapsclick().click();
        homepage.getBackclick().click();
        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(homepage.getGender()));
        //gender
        homepage.getGender().click();
        homepage.getFemale().click();
        //click
        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(homepage.getClick()));
                homepage.getClick().click();

    }
    //user should display the product list page
    @Then("user should display the product list page")
    public void user_should_display_the_product_list_page() {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getResultdisplay1()));
        WebElement products=homepage.getResultdisplay1();
        Assert.assertTrue(products.isDisplayed());
    }

//    Scenario 2:Verify that user able to click on the element
    //user navigate to home page
    @Given("user navigate to home page")
    public void user_Navigate_To_Home_Page() {
        url = QaProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());

    }

//user click on the women icon
    @When("user click on the women icon")
    public void user_click_on_the_women_icon() throws InterruptedException {
        homepage= new Homepage(driver);
        new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(homepage.getWomenclick()));
        homepage.getWomenclick().click();


    }
    //user should display the text of women
    @Then("user should display the text of women")
    public void user_should_display_the_text_of_women() throws InterruptedException {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getWomentext()));
        String text2=homepage.getWomentext().getText();
        Assert.assertEquals(text2,"Women");

    }
    //user able to select the category,accessories and price
    @Then("user able to select the category,accessories and price")
    public void user_able_to_select_the_category_accessories_and_price() throws InterruptedException {
        //new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOf(homepage.getFilterc()));
        Thread.sleep(8000);
        homepage.getFilterc().click();
        //Category
        homepage.getCategoryclick().click();
        //accessories
        homepage.getAccesclick().click();
        homepage.getBack().click();
        //price
        homepage.getPrice().click();
        //amt
        homepage.getAmt().click();
        //click
        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(homepage.getClick1()));
        homepage.getClick1().click();
        homepage.getClick2().click();

    }
    //user should display the products list page
    @Then("user should display the products list page")
    public void user_should_display_the_products_list_page() {
        WebElement products1=homepage.getProduct1();
        Assert.assertTrue(products1.isDisplayed());

    }
    //user able to click on the grid
    @Then("user able to click on the grid")
    public void user_able_to_click_on_the_grid() {
        homepage.getGrid().click();


    }
    //user should navigate to the page according to grid
    @Then("user should navigate to the page according to grid")
    public void user_should_navigate_to_the_page_according_to_grid() {
        WebElement products2=homepage.getGridp();
        Assert.assertTrue(products2.isDisplayed());



// Scenario 3:Verify that user able to enter the product name in search bar
    }
    //user navigate to puma home page
    @Given("user navigate to puma home page")
    public void user_navigate_to_puma_home_page() {
        url = QaProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());


    }
    //user able to enter the product name\\(Shoes) in the search bar
    @When("user able to enter the product name\\(Shoes) in the search bar")
    public void user_able_to_enter_the_product_name_shoes_in_the_search_bar() throws InterruptedException {
        homepage= new Homepage(driver);
        homepage.getSearchb().click();
        homepage.getSearchtype().sendKeys(data.get("data"));
        homepage.getSearchtype().sendKeys(Keys.ENTER);


    }
    //"user should get display the product name"
    @Then("user should get display the product name")
    public void user_should_get_display_the_product_name() {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getShoestext()));
        String display=homepage.getShoestext().getText();
        Assert.assertEquals(display, "Shoes");

    }
    //user able to select the size of the shoes
    @And("user able to select the size of the shoes")
    public void user_able_to_select_the_size_of_the_shoes() {
        //size
        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(homepage.getFilterb()));
        homepage.getFilterb().click();
        homepage.getSize().click();
        homepage.getClose1().click();

    }

    //user should get display the size
    @Then("user should get display the size")
    public void user_should_get_display_the_size() {
      Assert.assertTrue(homepage.getMsize().isDisplayed());

    }

    //user able to select the colour of the shoes
    @And("user able to select the colour of the shoes")
    public void user_able_to_select_the_colour_of_the_shoes() {
        homepage.getColourf().click();
        homepage.getBlackc().click();
        homepage.getClose2().click();

    }
    //user should get display the products based on the size and colour
    @Then("user should get display the products based on the size and colour")
    public void user_should_get_display_the_products_based_on_the_size_and_colour() {
       Assert.assertTrue(homepage.getDisplay3().isDisplayed());
    }




    // Scenario 4: Verify that user able to enter the  invalid pincode

    //user navigate to the puma home page
    @Given("user navigate to the puma home page")
    public void user_navigate_to_the_puma_home_page() {
        url = QaProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }
    //user able to enter the product name Shoes in search bar
    @When("user able to enter the product name Shoes in search bar")
    public void user_able_to_enter_the_product_name_shoes_in_search_bar() {
        homepage= new Homepage(driver);
        homepage.getSearchbar().click();
        homepage.getSearchtype1().sendKeys(data.get("data"));
        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(homepage.getSearchtype1()));
        homepage.getSearchtype1().sendKeys(Keys.ENTER);
    }
    //user should get display the name of product
    @Then("user should get display the name of product")
    public void user_should_get_display_the_name_of_product() throws InterruptedException {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getTextshoes()));
        String display=homepage.getTextshoes().getText();
        Assert.assertEquals(display, "Shoes");

    }
   // user able to select the colour of shoes
    @And("user able to select the colour of shoes")
    public void user_able_to_select_the_colour_of_shoes() {
        homepage.getFilter1().click();
        homepage.getColourb().click();
        homepage.getCloseb().click();
    }

  //  user should get display the products
    @Then("user should get display the products")
    public void user_should_get_display_the_products() {
        Assert.assertTrue(homepage.getProductlist().isDisplayed());

    }

    //user able to click on the gender from the dropdown
    @And("user able to click on the gender from the dropdown")
    public void user_able_to_click_on_the_gender_from_the_dropdown() throws InterruptedException {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getGenderselect()));
        homepage.getGenderselect().click();
        homepage.getSelectmale().click();
        homepage.getClose4().click();

    }

    //    user should get display the products based on the selected from the dropdown
    @Then("user should get display the products based on the selected from the dropdown")
    public void user_should_get_display_the_products_based_on_the_selected_from_the_dropdown() {
Assert.assertTrue(homepage.getProductslist().isDisplayed());

    }

    //user able to click on the product which is displayed based on the colour and gender
    @And("user able to click on the product which is displayed based on the colour and gender")
    public void user_able_to_click_on_the_product_which_is_displayed_based_on_the_colour_and_gender() throws InterruptedException {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getSelectproduct()));
        homepage.getSelectproduct().click();

    }

    //user should display the title of the product
    @Then("user should display the title of the product")
    public void user_should_display_the_title_of_the_product() {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getProducttitle()));
        Assert.assertTrue(homepage.getProducttitle().isDisplayed());

    }

    //user enter the invalid pincode
    @And("user enter the invalid pincode")
    public void user_enter_the_invalid_pincode() throws InterruptedException {
        //wrong pincode
        new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOf(homepage.getInvalidp()));
        homepage.getInvalidp().sendKeys(data.get("pincode"));
        homepage.getCheck1().click();

    }
    //"user should display the error message"
    @Then("user should display the error message")
    public void user_should_display_the_error_message() {
        String text3=homepage.getError().getText();
       // Assert.assertEquals(text3,"Pincode must be 6 digits");
        Assert.assertEquals(text3,"You need to give a valid PIN code.");


    }



//    Scenario 5: Verify that user able to click on the icon
    //user navigate to home page of puma

    @Given("user navigate to home page of puma")
    public void user_navigate_to_home_page_of_puma() {
        url = QaProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());


    }
    //user able to click on the wishlist icon
    @When("user able to click on the wishlist icon")
    public void user_able_to_click_on_the_wishlist_icon() {
        homepage= new Homepage(driver);
        homepage.getWishlist().click();

    }
    //user should navigate login page
    @Then("user should navigate login page")
    public void user_should_navigate_login_page() throws InterruptedException {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getLoginpage()));
      Assert.assertTrue(homepage.getLoginpage().isDisplayed());
    }
    //user should navigate login page
    @And("user able to click on the cart icon")
    public void user_able_to_click_on_the_cart_icon() {
       homepage.getCart().click();
       homepage.getSignin().click();
    }
    //user should navigate to the login and Register page
    @Then("user should navigate to the login and Register page")
    public void userShouldNavigateToTheLoginRegisterPage() {
        String login=homepage.getLoginregisterpage().getText();
        Assert.assertTrue(login.contains("Login / Register"));

    }







    //    Scenario Outline: Search
    //user is on home page
    @Given("user is on home page")
    public void user_is_on_home_page() {
         url= QaProps.getValue("url");
        driver.get(url);

    }
    //user able to type {string
    @When("user able to type {string}")
    public void user_able_to_type(String text) {
        homepage=new Homepage(driver);
        homepage.getSearchbarp().click();
        homepage.getType().sendKeys(text);
        homepage.getType().sendKeys(Keys.ENTER);


    }
    //{string} are displayed
    @Then("{string} are displayed")
    public void are_displayed(String result) throws InterruptedException {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getResults()));
        String display=homepage.getResults().getText();
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(homepage.getResults()));
        Assert.assertEquals(display, result);


    }


}

