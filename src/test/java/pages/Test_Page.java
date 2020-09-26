package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Test_Page {
    public Test_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
