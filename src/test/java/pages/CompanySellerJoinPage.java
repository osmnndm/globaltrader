package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CompanySellerJoinPage {

    public CompanySellerJoinPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy ( xpath = "//a[@href = 'https://www.glbtrader.com/register_vendor-1.html']" )
    public WebElement SellerJoinLinki;

    @FindBy ( id = "vender_type1")
    public WebElement CompanySellerRadioButton;

    @FindBy ( id = "company_name")
    public WebElement CompanyName;

    @FindBy ( id = "company_mobile")
    public WebElement CompanyMobile;

    @FindBy ( id = "company_address")
    public WebElement companyAdress;

    @FindBy ( id = "vender_name")
    public WebElement venderName;

    @FindBy ( id = "email")
    public WebElement email;

    @FindBy ( id = "sub_domain")
    public WebElement subDomain;

    @FindBy ( id = "vender_mobile")
    public WebElement venderMobile;

    @FindBy ( xpath = "//select[@name = 'country']")
    public WebElement country;

    @FindBy ( id = "select_state")
    public WebElement state;

    @FindBy ( id = "select_city")
    public WebElement city;

    @FindBy ( id = "vender_address")
    public WebElement venderAdress;

    @FindBy ( id = "zip_code_input")
    public WebElement PostalCode;

    @FindBy ( xpath = "//select [@name = 'category']")
    public WebElement category;

    @FindBy ( id = "password")
    public WebElement password;

    @FindBy ( xpath = "//button[@name = 'submit' and @value='Login']")
    public WebElement registerButton;

    @FindBy ( xpath = "//p [@class = 'text-center'][2]")
    public WebElement text;











}
