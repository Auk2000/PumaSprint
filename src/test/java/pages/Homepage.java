package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    private WebDriver driver;
    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //   Scenario: Verify that user should take the cursor on element present on the home page
    @FindBy(xpath = "(//div[@class='flex-1 flex relative'])[2]")
     private  WebElement womenAction;

    //Get the page
    @FindBy(xpath = "(//div[@data-test-id=\"secondary-nav-menu\"])[2]")
    private  WebElement womenpage;

 //click on the sustainability
    @FindBy(xpath = "(//a[@class=\"tw-hqslau tw-xbcb1y text-puma-black-300 hover:text-puma-gold font-bold text-lg leading-6 whitespace-normal\"])[4]")
    private  WebElement sustainabilityclick;

    //display the text
    @FindBy(xpath = "//li[@class=\"text-neutral-100 whitespace-nowrap flex items-center h-5 leading-5 flex-1 truncate font-normal leading-none px-2 mobile:hidden tablet:hidden\"]")
    private  WebElement textdisplay;
    //product filter
    @FindBy(xpath = "//button[@data-test-id=\"open-filters-btn\"]")
    private  WebElement productf;
    //product
    @FindBy(xpath = "(//button[@data-test-id=\"undefined-btn\"])[2]")
    private  WebElement getProduct;
    //caps
    @FindBy(xpath = "//input[@id=\"Caps\"]")
    private   WebElement capsclick;

    //backbutton
    @FindBy(xpath = "(//span[@class=\"transform rotate-180\"])[1]")
    private WebElement backclick;
    //gender
    @FindBy(xpath = "(//button[@data-test-id=\"undefined-btn\"])[4]")
    private    WebElement gender;
    //female
    @FindBy(xpath = "//input[@id=\"Female\"]")
    private  WebElement female;

    public WebElement getWomenAction() {
        return womenAction;
    }

    public WebElement getWomenpage() {
        return womenpage;
    }

    public WebElement getSustainabilityclick() {
        return sustainabilityclick;
    }

    public WebElement getTextdisplay() {
        return textdisplay;
    }

    public WebElement getProductf() {
        return productf;
    }

    public WebElement getGetProduct() {
        return getProduct;
    }

    public WebElement getCapsclick() {
        return capsclick;
    }

    public WebElement getBackclick() {
        return backclick;
    }

    public WebElement getGender() {
        return gender;
    }

    public WebElement getFemale() {
        return female;
    }

    public WebElement getClick() {
        return click;
    }

    public WebElement getResultdisplay1() {
        return resultdisplay1;
    }

    //click
    @FindBy(xpath = "(//button[@type=\"button\"])[36]")
    private  WebElement click;
    //Display the result
    @FindBy(xpath = "//ul[@id=\"product-list-items\"]")
    private  WebElement resultdisplay1;

  //  Scenario:Verify that user able to click on the element

    //click on the women icon
    @FindBy(xpath = "(//div[@class='flex-1 flex relative'])[2]")
    private  WebElement womenclick;
    //women text display
    @FindBy(xpath = "//li[@class=\"text-neutral-100 whitespace-nowrap flex items-center h-5 leading-5 flex-1 truncate font-normal leading-none px-2 mobile:hidden tablet:hidden\"]")
    private  WebElement womentext;
    //filter click
    @FindBy(xpath = "//button[@data-test-id=\"open-filters-btn\"]")
    private   WebElement filterc;
    //category click
    @FindBy(xpath = "(//button[@data-test-id=\"undefined-btn\"])[1]")
    private  WebElement categoryclick;
    //accessories click
    @FindBy(xpath = "//input[@id=\"Accessories\"]")
    private  WebElement accesclick;
    //backclick
    @FindBy(xpath = "//span[@class=\"transform rotate-180\"]")
    private   WebElement back;
    //price
    @FindBy(xpath = "(//button[@data-test-id=\"undefined-btn\"])[3]")
    private   WebElement price;
    //amt
    @FindBy(xpath = "//input[@id=\"(0..1000)\"]")
    private  WebElement amt;
    //click1
    @FindBy(xpath = "//button[@class=\"group tw-1kgrzpe tw-g57ppu flex-row after::absolute after::hidden after::pointer-events-none after::-left-1 after::-top-1 after::-right-1 after::-bottom-1 after::border-2 after::border-outline after::rounded-sm focus:after::block tw-10skrdm mt-6 w-full\"]")
    private WebElement click1;
    //click2
    @FindBy(xpath = "(//div[@class=\"hidden lg:block\"])[2]")
    private  WebElement click2;
    //product1
    @FindBy(xpath = "//ul[@id=\"product-list-items\"]")
    private WebElement product1;

    public WebElement getWomenclick() {
        return womenclick;
    }

    public WebElement getWomentext() {
        return womentext;
    }

    public WebElement getFilterc() {
        return filterc;
    }

    public WebElement getCategoryclick() {
        return categoryclick;
    }

    public WebElement getAccesclick() {
        return accesclick;
    }

    public WebElement getBack() {
        return back;
    }

    public WebElement getPrice() {
        return price;
    }

    public WebElement getAmt() {
        return amt;
    }

    public WebElement getClick1() {
        return click1;
    }

    public WebElement getClick2() {
        return click2;
    }

    public WebElement getProduct1() {
        return product1;
    }

    public WebElement getGrid() {
        return grid;
    }

    public WebElement getGridp() {
        return gridp;
    }

    //gridclick
    @FindBy(xpath = "//div[@class=\"hidden sm:block\"]")
    private   WebElement grid;
    //gridpage
    @FindBy(xpath = "//ul[@id=\"product-list-items\"]")
    private  WebElement gridp;

    //    Scenario:Verify that user able to enter the product name in search bar
    //search bar
    @FindBy(xpath = "//div[@class=\"hidden lg:block\"]")
    private  WebElement searchb;
    //searchtype
    @FindBy(xpath = "//input[@type=\"search\"]")
    private  WebElement searchtype;

    //shoestext
    @FindBy(xpath = "//li[@class=\"text-neutral-100 whitespace-nowrap flex items-center h-5 leading-5 flex-1 truncate font-normal leading-none px-2 mobile:hidden tablet:hidden\"]")
    private   WebElement shoestext;
    //filterb
    @FindBy(xpath = "//div[@data-test-id=\"size-filter-pill\"]//button")
    private    WebElement filterb;
    //size
    @FindBy(xpath = "//button[@data-value=\"m\"]")
    private   WebElement size;
    //close1
    @FindBy(xpath = "//button[@data-test-id=\"close-btn\"]")
    private  WebElement close1;
    //display the size m
    @FindBy(xpath = "//h1[@class=\"text-2xl md:text-3xl lg:text-4xl xl:text-4xl capitalize font-bold\"]")
    private   WebElement msize;
    //colourf
    @FindBy(xpath = "//div[@data-test-id=\"color-filter-pill\"]//button")
    private  WebElement colourf;
    //blackc
    @FindBy(xpath = "//button[@data-value=\"Black\"]")
    private  WebElement blackc;
    //close2
   @FindBy(xpath = "//div[@class=\"relative w-4 opacity-100 mr-0 ml-0 rtl:ml-0 rtl:mr-0\"]")
   private WebElement close2;

    public WebElement getSearchb() {
        return searchb;
    }

    public WebElement getSearchtype() {
        return searchtype;
    }


    public WebElement getShoestext() {
        return shoestext;
    }

    public WebElement getFilterb() {
        return filterb;
    }

    public WebElement getSize() {
        return size;
    }

    public WebElement getClose1() {
        return close1;
    }

    public WebElement getMsize() {
        return msize;
    }

    public WebElement getColourf() {
        return colourf;
    }

    public WebElement getBlackc() {
        return blackc;
    }

    public WebElement getClose2() {
        return close2;
    }

    public WebElement getDisplay3() {
        return display3;
    }

    //diplay the products
    @FindBy(xpath = "//section[@aria-label=\"Product results\"]")
    private WebElement display3;



    //   Scenario: Verify that user able to enter the  invalid pincode
    //searchbar
    @FindBy(xpath = "//div[@class=\"hidden lg:block\"]")
    private WebElement searchbar;
    //searchtype and enter
    @FindBy(xpath = "//input[@type=\"search\"]")
    private  WebElement searchtype1;
    //getshoestext
    @FindBy(xpath = "//li[@class=\"text-neutral-100 whitespace-nowrap flex items-center h-5 leading-5 flex-1 truncate font-normal leading-none px-2 mobile:hidden tablet:hidden\"]")
    private WebElement textshoes;
    //filter
    @FindBy(xpath = "//div[@data-test-id=\"color-filter-pill\"]//button")
    private WebElement filter1;
    //black
    @FindBy(xpath = "//button[@data-value=\"Black\"]")
    private  WebElement colourb;
    //closeb
    @FindBy(xpath = "//div[@class=\"relative w-4 opacity-100 mr-0 ml-0 rtl:ml-0 rtl:mr-0\"]")
    private  WebElement closeb;
    //productlist
    @FindBy(xpath = "//section[@aria-label=\"Product results\"]")
    private WebElement productlist;
    //genderm
    @FindBy(xpath = "//div[@data-test-id=\"gender-filter-pill\"]//button")
    private WebElement genderselect;
    //male
    @FindBy(id = "Male")
    private WebElement selectmale;
    //close button
    @FindBy(xpath = "//button[@data-test-id=\"close-btn\"]")
    private  WebElement close4;
    //Dispaly the products
    @FindBy(xpath = "//section[@aria-label=\"Product results\"]")
    private   WebElement productslist;
    //cilck on the products
    @FindBy(xpath = "(//div[@class=\"w-full flex-none transform-gpu\"])[1]")
    private  WebElement selectproduct;
    //display the page
    @FindBy(xpath = "//h1[@id=\"pdp-product-title\"]")
    private WebElement producttitle;
    //invalid pincode
    @FindBy(id = "pincode")
    private WebElement invalidp;
    //check
    @FindBy(xpath = "//button[@data-test-id=\"check-pincode\"]")
    private  WebElement check1;
    //error message
    @FindBy(xpath = "(//div[@class=\"w-full\"])[6]")
    private  WebElement error;
    //valid pincode
    @FindBy(xpath = "//input[@id=\"pincode\"]")
    private  WebElement validp;
    //check
    @FindBy(xpath = "//button[@data-test-id=\"check-pincode\"]")
    private  WebElement check2;
    //message
    @FindBy(xpath = "div[@data-test-id=\"pdp-shipping-message\"]")
    private WebElement success;

    public WebElement getSearchbar() {
        return searchbar;
    }

    public WebElement getSearchtype1() {
        return searchtype1;
    }

    public WebElement getTextshoes() {
        return textshoes;
    }

    public WebElement getFilter1() {
        return filter1;
    }

    public WebElement getColourb() {
        return colourb;
    }

    public WebElement getCloseb() {
        return closeb;
    }

    public WebElement getProductlist() {
        return productlist;
    }

    public WebElement getGenderselect() {
        return genderselect;
    }

    public WebElement getSelectmale() {
        return selectmale;
    }

    public WebElement getClose4() {
        return close4;
    }

    public WebElement getProductslist() {
        return productslist;
    }

    public WebElement getSelectproduct() {
        return selectproduct;
    }

    public WebElement getProducttitle() {
        return producttitle;
    }

    public WebElement getInvalidp() {
        return invalidp;
    }

    public WebElement getCheck1() {
        return check1;
    }

    public WebElement getError() {
        return error;
    }

    public WebElement getValidp() {
        return validp;
    }

    public WebElement getCheck2() {
        return check2;
    }

    public WebElement getSuccess() {
        return success;
    }


    //
    //       Scenario: Verify that user able to click on the icon
    //click on the wishlist
    @FindBy(id= "nav-wishlist-link")
    private  WebElement wishlist;
    //login page
    @FindBy(xpath = "//div[@class=\"text-xl text-center font-bold w-full py-3 mb-8 border-b-2 border-puma-black\"]")
    private WebElement loginpage;
    //cart
    @FindBy(xpath = "//a[@data-test-id=\"nav-cart-link\"]")
    private  WebElement cart;
    //signin
    @FindBy(xpath = "//a[@class=\"tw-hqslau tw-xbcb1y underline uppercase text-sm text-puma-black font-bold inline-block mx-0.5\"]")
    private WebElement signin;
    //login and registerpage
    @FindBy(xpath = "//div[@class=\"text-xl text-center font-bold w-full py-3 mb-8 border-b-2 border-puma-black\"]")
    private  WebElement loginregisterpage;

    public WebElement getWishlist() {
        return wishlist;
    }

    public WebElement getLoginpage() {
        return loginpage;
    }

    public WebElement getCart() {
        return cart;
    }

    public WebElement getSignin() {
        return signin;
    }

    public WebElement getLoginregisterpage() {
        return loginregisterpage;
    }

    //scenario outline
    //    Scenario Outline: Search
    //searchbar
    @FindBy(xpath = "//div[@class=\"hidden lg:block\"]")
    private WebElement searchbarp;
    //type the text
    @FindBy(xpath = "//input[@type=\"search\"]")
    private  WebElement type;
    //results
    @FindBy(xpath = "//li[@class=\"text-neutral-100 whitespace-nowrap flex items-center h-5 leading-5 flex-1 truncate font-normal leading-none px-2 mobile:hidden tablet:hidden\"]")
  private  WebElement results;

    public WebElement getSearchbarp() {
        return searchbarp;
    }

    public WebElement getType() {
        return type;
    }

    public WebElement getResults() {
        return results;
    }
}
