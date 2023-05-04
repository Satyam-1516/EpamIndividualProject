package org.example;

import com.Browser.BrowserParameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ModuleTwoB {
    ChromeDriver driver = new ChromeDriver();

    @Test
    public void GoogleCloud() throws InterruptedException {
        WebDriver driver= BrowserParameter.setupBrowser("chrome","https://cloud.google.com/");

        GoogleCloudObject calculatorPage=new GoogleCloudObject(driver);
        calculatorPage.homePage();
        calculatorPage.sendKeyInToNumberOfInstancesField("4");
        calculatorPage.selectSeriesOfMachine();
        calculatorPage.selectMachineType();
        calculatorPage.clickAddGpusCheckBox();
        calculatorPage.selectGpuType();
        calculatorPage.selectNumberOfGpus();
        calculatorPage.selectLocalSsd();
        calculatorPage.selectDataCenterLocation();
        calculatorPage.selectCommittedUsage();
        calculatorPage.pushAddToEstimate();
    }
}
