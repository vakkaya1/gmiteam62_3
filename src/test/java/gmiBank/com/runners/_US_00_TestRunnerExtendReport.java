package gmiBank.com.runners;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // oluşturalacak raporun yeri ve adı veriliyor.
        },

        features = "src/test/resources/features",
        glue = "src/test/java/gmiBank/com/stepdefinitions",
        dryRun = true,
        tags = "@token"

)
public class _US_00_TestRunnerExtendReport  {


    @AfterClass
    public static void afterClass() {
        // ayarlar alındı, cucumber extend reporttan haberi oldu
        Reporter.loadXMLConfig("src/test/java/XMLFiles/extendReportSet.xml");
        Reporter.setSystemInfo("User Name", "Group 62");
        Reporter.setSystemInfo("Application Name", "AoutomationPage");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test excetuion Cucumber report");
    }
}