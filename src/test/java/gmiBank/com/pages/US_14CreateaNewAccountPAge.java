package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_14CreateaNewAccountPAge {


    public US_14CreateaNewAccountPAge() {        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myOperationsButton;

    @FindBy(xpath = "//a[@href='/tp-account']")
    public WebElement manageAccountsButton;

    @FindBy(xpath = "//a[@href='/tp-account/new']")
    public WebElement createnewAccountButton;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionInput;

    @FindBy(xpath = "//input[@name='balance']")
    public WebElement balanceInput;

    @FindBy(xpath = "//input[@name='createDate']")
    public WebElement createDateInput;

    @FindBy(xpath = "//input[@name='closedDate']")
    public WebElement closedDateInput;

    @FindBy(id = "save-entity")
    public WebElement saveButton;







}
