package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CompanySellerJoinPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CompanySellerJoinStepDefinitions {

    CompanySellerJoinPage companySellerJoinPage = new CompanySellerJoinPage();
    @Given("kullanici {string} sayfasindadir")
    public void kullanici_sayfasindadir(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici  Seller Join Now butonuna tiklar")
    public void kullanici_Seller_Join_Now_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(1000);
        companySellerJoinPage.SellerJoinLinki.click();
    }
    @Given("kullanici Company Seller sekmesine tiklar")
    public void kullanici_Company_Seller_sekmesine_tiklar() throws InterruptedException {
        Thread.sleep(1000);
        companySellerJoinPage.CompanySellerRadioButton.click();
    }
    @Given("kullanici Company Name girer")
    public void kullanici_Company_Name_girer() {
        companySellerJoinPage.CompanyName.sendKeys(ConfigurationReader.getProperty("company_name"));
    }
    @Given("kullanici Company Mobile girer")
    public void kullanici_Company_Mobile_girer() {
        companySellerJoinPage.CompanyMobile.sendKeys(ConfigurationReader.getProperty("company_mobile"));
    }
    @Given("kullanici Company Address girer")
    public void kullanici_Company_Address_girer() {
        companySellerJoinPage.companyAdress.sendKeys(ConfigurationReader.getProperty("company_adress"));
    }
    @Given("kullanici Name girer")
    public void kullanici_Name_girer() {
        companySellerJoinPage.venderName.sendKeys(ConfigurationReader.getProperty("vender_name"));
    }
    @Given("kullanici Email girer")
    public void kullanici_Email_girer() {
        companySellerJoinPage.email.sendKeys(ConfigurationReader.getProperty("email"));
    }
    @Given("kullanici Sub Domain girer")
    public void kullanici_Sub_Domain_girer() {
        companySellerJoinPage.subDomain.sendKeys(ConfigurationReader.getProperty("sub_domain"));
    }
    @Given("kullanici Mobile Number girer")
    public void kullanici_Mobile_Number_girer() {
        companySellerJoinPage.venderMobile.sendKeys(ConfigurationReader.getProperty("vender_mobile"));
    }
    @Given("kullanici Country dropdowndan secer")
    public void kullanici_Country_dropdowndan_secer() {
        Select select = new Select(companySellerJoinPage.country);
        select.selectByVisibleText(ConfigurationReader.getProperty("country"));
    }
    @Given("kullanici State girer")
    public void kullanici_State_girer() {
        companySellerJoinPage.state.sendKeys(ConfigurationReader.getProperty("state"));
    }
    @Given("kullanici City girer")
    public void kullanici_City_girer() {
        companySellerJoinPage.city.sendKeys(ConfigurationReader.getProperty("city"));
    }
    @Given("kullanici Address girer")
    public void kullanici_Address_girer() {
        companySellerJoinPage.venderAdress.sendKeys(ConfigurationReader.getProperty("vender_adress"));
    }
    @Given("kullanici Postal Code girer")
    public void kullanici_Postal_Code_girer() {
        companySellerJoinPage.PostalCode.sendKeys(ConfigurationReader.getProperty("postal_code"));
    }
    @Given("kullanici Categories dropdowndan secer")
    public void kullanici_Categories_dropdowndan_secer() {
        Select select = new Select(companySellerJoinPage.category);
        select.selectByIndex(5);

    }
    @Given("kullanici Password girer")
    public void kullanici_Password_girer() {
        companySellerJoinPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @Given("kullanici Registration butonuna tiklar")
    public void kullanici_Registration_butonuna_tiklar() {
        companySellerJoinPage.registerButton.click();
    }
    @Then("kullanici {string} masajini gormelidir")
    public void kullanici_masajini_gormelidir(String string) {
        String text = companySellerJoinPage.text.getText();
        System.out.println(text);
        Assert.assertTrue(text.contains(string));


    }


}
