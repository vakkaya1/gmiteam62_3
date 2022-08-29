package gmiBank.com.stepdefinitions;

import gmiBank.com.pojos.Country6;
import gmiBank.com.pojos.Customer6;
import gmiBank.com.utilities.PDFGenerator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.List;

import static gmiBank.com.utilities.DatabaseUtility.*;
import static gmiBank.com.utilities.PDFGenerator.pdfGenerator;
import static gmiBank.com.utilities.PDFGenerator.pdfGeneratorRowsAndCellsWithListFirstToTenBank8;

public class pdfSteps {

    public static void main(String[] args) {
       // PDFGenerator.pdfGenerator("Deneme_bank8", "Deneme_dersi");
    List<Customer6> list=new ArrayList<>();
    Customer6 customer6=new Customer6();
    customer6.setFirstName("Ali");
    customer6.setSsn("1488");
    Country6 country6=new Country6();
    country6.setName("Arizonam");
    customer6.setCountry(country6);
    customer6.setState("Andavalli");
    customer6.setZipCode("39279");
    list.add(customer6);

    PDFGenerator.pdfGeneratorRowsAndCellsWithList6("Deneme_name",list,"deneme_olmuyor.pdf");



    }


    @Given("pdf_ders_bank{int} user creates a connection with db using {string} , {string} and {string}")
    public void pdf_ders_bankUserCreatesAConnectionWithDbUsingAnd(int arg0, String url, String user, String password) {
    createConnection(url,user,password);

    }

    @And("pdf_ders_bank{int} user provides the query {string}")
    public void pdf_ders_bankUserProvidesTheQuery(int arg0, String query) {
    List<Customer6> customer6List=new ArrayList<>();

    List<List<Object>> lists=getQueryResultList(query);
        for (int i = 0; i < 10; i++) {
            Customer6 customer6=new Customer6();

            customer6.setFirstName(lists.get(i).get(1).toString());
            customer6.setLastName(lists.get(i).get(2).toString());
            customer6.setId(Integer.parseInt(lists.get(i).get(0).toString()));
            customer6.setEmail(lists.get(i).get(4).toString());
            customer6.setMobilePhoneNumber(lists.get(i).get(5).toString());

            customer6List.add(customer6);
        }

        pdfGeneratorRowsAndCellsWithListFirstToTenBank8("hfksj",customer6List,"ulangenemi.pdf");

        closeConnection();
    }
}
