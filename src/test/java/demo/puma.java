package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class puma {
    WebDriver driver;
    Actions action;
    @BeforeTest
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://in.puma.com/in/en");
        action =new Actions(driver);
    }
    @Test(priority = 3)//outline
    public void shoes() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class=\"hidden lg:block\"]")).click();
        driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("Shoes");
        driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(8000);
        String display = driver.findElement(By.xpath("//li[@class=\"text-neutral-100 whitespace-nowrap flex items-center h-5 leading-5 flex-1 truncate font-normal leading-none px-2 mobile:hidden tablet:hidden\"]")).getText();
        Assert.assertEquals(display, "Shoes");
        //size
        driver.findElement(By.xpath("//div[@data-test-id=\"size-filter-pill\"]//button")).click();
        driver.findElement(By.xpath("//button[@data-value=\"m\"]")).click();
        driver.findElement(By.xpath("//button[@data-test-id=\"close-btn\"]")).click();
        Assert.assertTrue( driver.findElement(By.xpath("//h1[@class=\"text-2xl md:text-3xl lg:text-4xl xl:text-4xl capitalize font-bold\"]")).isDisplayed());
        //colour
        driver.findElement(By.xpath("//div[@data-test-id=\"color-filter-pill\"]//button")).click();
        driver.findElement(By.xpath("//button[@data-value=\"Black\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"relative w-4 opacity-100 mr-0 ml-0 rtl:ml-0 rtl:mr-0\"]")).click();
        Assert.assertTrue( driver.findElement(By.xpath("//section[@aria-label=\"Product results\"]")).isDisplayed());

    }
    @Test(priority = 1)
        public void women_action() throws InterruptedException {
        driver.get("https://in.puma.com/in/en");
        action.moveToElement(driver.findElement(By.xpath("(//div[@class='flex-1 flex relative'])[2]"))).build().perform();
        WebElement women = driver.findElement(By.xpath("(//div[@data-test-id=\"secondary-nav-menu\"])[2]"));
        Thread.sleep(3000);
        Assert.assertTrue(women.isDisplayed());
        //sustainability
        driver.findElement(By.xpath("(//a[@class=\"tw-hqslau tw-xbcb1y text-puma-black-300 hover:text-puma-gold font-bold text-lg leading-6 whitespace-normal\"])[4]")).click();
        Thread.sleep(8000);
       String text=driver.findElement(By.xpath("//li[@class=\"text-neutral-100 whitespace-nowrap flex items-center h-5 leading-5 flex-1 truncate font-normal leading-none px-2 mobile:hidden tablet:hidden\"]")).getText();
        Thread.sleep(4000);
        Assert.assertEquals(text,"Sustainability");
        //product
        driver.findElement(By.xpath("//button[@data-test-id=\"open-filters-btn\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//button[@data-test-id=\"undefined-btn\"])[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id=\"Caps\"]")).click();
        driver.findElement(By.xpath("(//span[@class=\"transform rotate-180\"])[1]")).click();
        Thread.sleep(6000);
        //gender
        driver.findElement(By.xpath("(//button[@data-test-id=\"undefined-btn\"])[4]")).click();
        driver.findElement(By.xpath("//input[@id=\"Female\"]")).click();
        //click
        driver.findElement(By.xpath("(//button[@type=\"button\"])[36]")).click();
        Thread.sleep(3000);
        WebElement products=driver.findElement(By.xpath("//ul[@id=\"product-list-items\"]"));
        Assert.assertTrue(products.isDisplayed());
    }
    @Test(priority = 2)
    public void women_click() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='flex-1 flex relative'])[2]")).click();
        Thread.sleep(2000);
       String text2= driver.findElement(By.xpath("//li[@class=\"text-neutral-100 whitespace-nowrap flex items-center h-5 leading-5 flex-1 truncate font-normal leading-none px-2 mobile:hidden tablet:hidden\"]")).getText();
       Assert.assertEquals(text2,"Women");
        Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@data-test-id=\"open-filters-btn\"]")).click();
       //Catergory
       driver.findElement(By.xpath("(//button[@data-test-id=\"undefined-btn\"])[1]")).click();
       //accesories
       driver.findElement(By.xpath("//input[@id=\"Accessories\"]")).click();
       driver.findElement(By.xpath("//span[@class=\"transform rotate-180\"]")).click();
       //price
       driver.findElement(By.xpath("(//button[@data-test-id=\"undefined-btn\"])[3]")).click();
       //amt
       driver.findElement(By.xpath("//input[@id=\"(0..1000)\"]")).click();
       //click
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class=\"group tw-1kgrzpe tw-g57ppu flex-row after::absolute after::hidden after::pointer-events-none after::-left-1 after::-top-1 after::-right-1 after::-bottom-1 after::border-2 after::border-outline after::rounded-sm focus:after::block tw-10skrdm mt-6 w-full\"]")).click();
        driver.findElement(By.xpath("(//div[@class=\"hidden lg:block\"])[2]")).click();
        WebElement products1=driver.findElement(By.xpath("//ul[@id=\"product-list-items\"]"));
        Assert.assertTrue(products1.isDisplayed());
        driver.findElement(By.xpath("//div[@class=\"hidden sm:block\"]")).click();
        WebElement products2=driver.findElement(By.xpath("//ul[@id=\"product-list-items\"]"));
        Assert.assertTrue(products1.isDisplayed());

    }
    @Test(priority = 4)
    public void Pincode() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class=\"hidden lg:block\"]")).click();
        driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("Shoes");
        driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(8000);
        String display = driver.findElement(By.xpath("//li[@class=\"text-neutral-100 whitespace-nowrap flex items-center h-5 leading-5 flex-1 truncate font-normal leading-none px-2 mobile:hidden tablet:hidden\"]")).getText();
        Assert.assertEquals(display, "Shoes");
        //colour
        driver.findElement(By.xpath("//div[@data-test-id=\"color-filter-pill\"]//button")).click();
        driver.findElement(By.xpath("//button[@data-value=\"Black\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"relative w-4 opacity-100 mr-0 ml-0 rtl:ml-0 rtl:mr-0\"]")).click();
        Assert.assertTrue( driver.findElement(By.xpath("//section[@aria-label=\"Product results\"]")).isDisplayed());
        //gender
        driver.findElement(By.xpath("//div[@data-test-id=\"gender-filter-pill\"]//button")).click();


      // driver.findElement(By.xpath("//input[@id=\"Male\"]")).click();
       driver.findElement(By.id("Male")).click();



        driver.findElement(By.xpath("//button[@data-test-id=\"close-btn\"]")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[@data-test-id=\"product-list-total-count\"]")).isDisplayed());
        driver.findElement(By.xpath("(//div[@class=\"w-full flex-none transform-gpu\"])[1]")).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//h1[@id=\"pdp-product-title\"]")).isDisplayed());
        ///wrong pincode


 //       driver.findElement(By.xpath("//input[@id=\"pincode\"]")).sendKeys("58000");
        driver.findElement(By.id("pincode")).sendKeys("58000");


        driver.findElement(By.xpath("//button[@data-test-id=\"check-pincode\"]")).click();
       String text3=driver.findElement(By.xpath("(//div[@class=\"w-full\"])[6]")).getText();
       Assert.assertEquals(text3,"Pincode must be 6 digits");
        //pincode
        driver.findElement(By.xpath("//input[@id=\"pincode\"]")).sendKeys("580001");
        driver.findElement(By.xpath("//button[@data-test-id=\"check-pincode\"]")).click();
        //message
        Thread.sleep(5000);
        String text6=driver.findElement(By.xpath("//div[@data-test-id=\"pdp-shipping-message\"]")).getText();
        Assert.assertTrue(text6.contains("EXPECTED BY"));

    }
    @Test(priority = 5)
    public void whishlist_andcart() throws InterruptedException {
        driver.get("https://in.puma.com/in/en");
        //whishlist
       driver.findElement(By.id("nav-wishlist-link")).click();
       Thread.sleep(5000);
       Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"text-xl text-center font-bold w-full py-3 mb-8 border-b-2 border-puma-black\"]")).isDisplayed());
       //cart
        Thread.sleep(5000);
       driver.findElement(By.xpath("//a[@data-test-id=\"nav-cart-link\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"tw-hqslau tw-xbcb1y underline uppercase text-sm text-puma-black font-bold inline-block mx-0.5\"]")).click();
        String login=driver.findElement(By.xpath("//div[@class=\"text-xl text-center font-bold w-full py-3 mb-8 border-b-2 border-puma-black\"]")).getText();
        Assert.assertTrue(login.contains("Login / Register"));


    }

    }




