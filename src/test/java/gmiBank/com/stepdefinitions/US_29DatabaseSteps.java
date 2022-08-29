package gmiBank.com.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static gmiBank.com.utilities.DatabaseUtility.createConnection;

public class US_29DatabaseSteps {
    @Given("user connects to GMIBank database by using {string}, {string} and {string}")
    public void userConnectsToGMIBankDatabaseByUsingAnd(String url, String username, String password) {
        createConnection(url,username,password);
    }

    @Given("user should be reads all users data from database")
    public void userShouldBeReadsAllUsersDataFromDatabase() {

    }

    @And("user should be all users data validate")
    public void userShouldBeAllUsersDataValidate() {
    }

    @Given("user should be reads all countries data from database")
    public void userShouldBeReadsAllCountriesDataFromDatabase() {
    }

    @And("user should be all countries data validate")
    public void userShouldBeAllCountriesDataValidate() {
    }

    @Given("user should be reads all states data of related to USA from database")
    public void userShouldBeReadsAllStatesDataOfRelatedToUSAFromDatabase() {
    }

    @And("user should be validate the data which all states of related to USA")
    public void userShouldBeValidateTheDataWhichAllStatesOfRelatedToUSA() {
    }

    @Then("user should be exit GMIBank database")
    public void userShouldBeExitGMIBankDatabase() {
    }
}
