package org.example.base;

import com.microsoft.playwright.*;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.aspectj.lang.annotation.After;
import org.example.factory.BrowserFactory;
import org.example.pages.HomePage;
import org.example.pages.Pages;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class BaseTest {
    private final BrowserFactory browserFactory = new BrowserFactory();
    protected Properties properties = browserFactory.initializeConfigProperties(new Browser.NewContextOptions()
            .setViewportSize(1920, 1080).setRecordVideoDir(Paths.get("video/")));
    protected static Page page;
    private String browserName;

    @BeforeMethod
    @Parameters({"browserName", "headless"})
    public void setUp(@Optional("chrome") String browserName, @Optional("false") String headless) throws IllegalArgumentException {
        this.browserName = browserName;

        Playwright playwright = Playwright.create();
        BrowserType browserType = playwright.chromium();
        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        BrowserContext context;
        if(Boolean.parseBoolean(System.getProperty("recordVideo", "false")))
            context = browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("video/")).setViewportSize(1920,1080));
        else
            context = browser.newContext( new Browser.NewContextOptions().setViewportSize(1920, 1080));

        page = context.newPage();
        page.navigate(properties.getProperty("BASE_URL").trim());

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
            String formattedDateTime = formatter.format(currentDateTime);

            String resultName = result.getName() + "_" + browserName + "_" + formattedDateTime;
            Path screenshotPath = Paths.get("./target/screenshots/" + resultName + ".png");

            page.screenshot(new Page.ScreenshotOptions().setPath(screenshotPath));
            attachScreenshotToAllureReport(resultName, screenshotPath);
        }
        else
            System.out.println(Constans.successMessage);
    }

    @After("")
    public void closeAll(){
        page.context().browser().close();
    }

    @Attachment(type = "image/png")
    private void attachScreenshotToAllureReport(String resultName, Path screenshotPath) throws IOException {
        Allure.addAttachment(resultName, new ByteArrayInputStream(Files.readAllBytes(screenshotPath)));
    }
}
