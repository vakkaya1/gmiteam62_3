package gmiBank.com.stepdefinitions;

import gmiBank.com.pages.US_14CreateaNewAccountPAge;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class US_08_CreateaNewAccountStepDefs {
    US_14CreateaNewAccountPAge createaccount=new US_14CreateaNewAccountPAge();

    @And("User clicks to My Operations menu")
    public void userClicksToMyOperationsMenu() {
        createaccount.myOperationsButton.click();
    }

    @Then("User clicks to Manage Accounts button")
    public void userClicksToManageAccountsButton() {
        createaccount.manageAccountsButton.click();
    }

    @Then("User clicks to Create a new Account button")
    public void userClicksToCreateANewAccountButton() {
        createaccount.createnewAccountButton.click();
    }

    @Then("User enter {string} in the Description and {string} in the balance boxes")
    public void userEnterInTheDescriptionAndInTheBalanceBoxes(String description, String balance) {
        createaccount.descriptionInput.sendKeys(description);
        createaccount.balanceInput.sendKeys(balance);
    }

    @Then("User enter earlier Date in Create Date box.")
    public void userEnterEarlierDateInCreateDateBox() {
        createaccount.createDateInput.sendKeys("10/10/2020 12:00 AM");
    }

    @Then("User enter the later Date at the time of creation time.")
    public void userEnterTheLaterDateAtTheTimeOfCreationTime() {
        createaccount.closedDateInput.sendKeys("10/10/2022 12:00 AM");
    }

    @Then("User enter Save button.")
    public void userEnterSaveButton() {
        createaccount.saveButton.click();
        Driver.wait(5);
    }

    @And("User checks if new account has been created")
    public void userChecksIfNewAccountHasBeenCreated() {
        String currrentURL=Driver.getDriver().getCurrentUrl();
        System.out.println(currrentURL);
        Assert.assertTrue(currrentURL.equals("https://www.gmibank.com/tp-account/new"),"BAGGGG-The date typed earlier, in the past, at the time of creation an account");

    }


}
