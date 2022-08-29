package gmiBank.com.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static gmiBank.com.utilities.DatabaseUtility.*;

public class DatabaseSteps {

    public static void main(String[] args) {
        createConnection();
        String query1="select * from tp_customer";
        List<String> columns=getColumnNames(query1);
        System.out.println(columns);
        String query2="select * from tp_customer where first_name like '%Ali%'";
        List<Object> Alicolonu=getColumnData(query2,"first_name");
        System.out.println(Alicolonu);
        System.out.println(getCellValue(query1,8,7));
        closeConnection();
    }

    List<Object> objectlist;


    @Given("database ders bank{int} user creates a connection with db using {string} , {string} and {string}")
    public void databaseDersBankUserCreatesAConnectionWithDbUsingAnd(int arg0, String arg1, String arg2, String arg3) {
   createConnection(arg1,arg2,arg3);
    }

    @And("database ders bank{int} user reads the Customers data using {string} and {string}")
    public void databaseDersBankUserReadsTheCustomersDataUsingAnd(int arg0, String arg1, String arg2) {
     objectlist=getColumnData(arg1,arg2);
        System.out.println(objectlist.toString());
    }

    @Then("database ders bank{int} validate customers data")
    public void databaseDersBankValidateCustomersData(int arg0) {
        Assert.assertTrue(objectlist.contains("462-38-7492"));
        System.out.println("===============");
        System.out.println("validation is successfull");
        closeConnection();

    }
}
