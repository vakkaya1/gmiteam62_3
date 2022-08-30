package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class denemePage {

    public denemePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="account-menu")
    public WebElement menuzimbirtisi;

    @FindBy(xpath = "//a[@class='dropdown-item'][2]")
    public WebElement resisterrrrr;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnBox;


}
