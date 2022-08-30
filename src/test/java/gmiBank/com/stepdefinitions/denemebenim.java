package gmiBank.com.stepdefinitions;

import gmiBank.com.pages.denemePage;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class denemebenim {

    denemePage denemea=new denemePage();


    @Given("User navigates go tooo {string}")
    public void userNavigatesGoTooo(String gmi) {

        Driver.getDriver().get(ConfigReader.getProperty(gmi));

    }

    @Then("click menu iconnn")
    public void clickMenuIconnn() {

    denemea.menuzimbirtisi.click();

    }

    @Then("click register buttonn")
    public void clickRegisterButtonn() {

    denemea.resisterrrrr.click();
    }

    @Then("send valid SSN number")
    public void sendValidSSNNumber() {

    denemea.ssnBox.sendKeys("369-87-1238");

    }
}
