package co.nvqa.example_1.glue;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Dini Seprilia
 */

public class Sample03Steps {
    private static final long DELAY_IN_MILLIS = 1_000;
    private WebDriver webDriver;

   
    @Given("User open Gist with this URL \"([^\"]*)\"")
    public void openGist (String url) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--window-size=1366,768");
        chromeOptions.addArguments("--window-position=0,0");
        chromeOptions.addArguments("-- disable-notification");

        webDriver = new ChromeDriver(chromeOptions);
        webDriver.get(url);
        Thread.sleep(DELAY_IN_MILLIS);

    }

    @Given("User Sign in to Gist")
    public void signIn () throws InterruptedException {
        WebElement signInButton = webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/a[2]"));
        signInButton.click();
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Given("User Enter Username : \"([^\"]*)\" to Gist")
    public void enterUsername (String username) throws InterruptedException {
        WebElement enterUsername = webDriver.findElement(By.xpath("//*[@id=\"login_field\"]"));
        enterUsername.sendKeys(username);
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Given("User Enter Password : \"([^\"]*)\" to Gist")
    public void enterPassword (String password) throws InterruptedException {
        WebElement enterPassword = webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        enterPassword.sendKeys(password);
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Given("User Click Sign in Button to Gist")
    public void clickSignIn () throws InterruptedException {
        WebElement signInButton = webDriver.findElement(By.xpath("//*[@id=\"login\"]/form/div[2]/input[3]"));
        signInButton.click();
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Given("User Create New Gist")
    public void goToNewGist () throws InterruptedException {
        WebElement newGist = webDriver.findElement(By.xpath("//*[@id=\"user-links\"]/li[1]/a"));
        newGist.click();
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Given("User Enter Description : \"([^\"]*)\"")
    public void enterDescription (String nameOfDescription) throws InterruptedException {
        WebElement description = webDriver.findElement(By.xpath("//*[@id=\"gists\"]/input"));
        description.sendKeys(nameOfDescription);
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Given("User Enter Filename Including Extension : \"([^\"]*)\"")
    public void enterFilename (String nameOfFile ) throws InterruptedException {
        WebElement filename = webDriver.findElement(By.xpath("//*[@id=\"gists\"]/div[2]/div/div[1]/div[2]/input[2]"));
        filename.sendKeys(nameOfFile);
        Thread.sleep(DELAY_IN_MILLIS);
    }


    @Given("User Enter File Body: \"([^\"]*)\"")
    public void enterFileBody (String fileBody ) throws InterruptedException {
        WebElement clickBody = webDriver.findElement(By.xpath("//*[@id=\"gists\"]/div[2]/div/div[2]/div/div[5]/div[1]/div/div/div/div[4]"));
        clickBody.click();

        WebElement body = webDriver.findElement(By.xpath("//*[@id=\"gists\"]/div[2]/div/div[2]/div/div[5]"));
        JavascriptExecutor executor = (JavascriptExecutor)webDriver;
        executor.executeScript("arguments[0].setAttribute(‘style’, ‘visibility: visible;’);", body);
        body.sendKeys(fileBody);
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Given("User Click Create Public Gist Button to Gist")
    public void clickCreatePublicButton () throws InterruptedException {
        WebElement clickPublicButton = webDriver.findElement(By.xpath("//*[@id=\"new_gist\"]/div/div[2]/button[1]"));
        clickPublicButton.click();
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Given("User See All Gits")
    public void seeAllGits () throws InterruptedException {
        WebElement allGits = webDriver.findElement(By.xpath("//*[@id=\"gist-pjax-container\"]/div[1]/div/div/ul/li[3]/a"));
        allGits.click();
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Given("User Open : \"([^\"]*)\"")
    public void openFile (String nameofFile) throws InterruptedException {
        WebElement clickFile = webDriver.findElement(By.linkText(nameofFile));
        clickFile.click();
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Given("User Click Edit Button")
    public void editButton () throws InterruptedException {
        WebElement editButton = webDriver.findElement(By.xpath("//button[text()='Save' and @class='btn btn-sm']"));
        editButton.click();
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Given("User Click Delete Button")
    public void deleteButton () throws InterruptedException {
        WebElement deleteButton = webDriver.findElement(By.xpath("//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[2]/form/button"));
        deleteButton.click();
        Thread.sleep(DELAY_IN_MILLIS);
    }



    @After("@CloseBrowser")
    public void closeBrowser()
    {
        if(webDriver!=null)
        {
            webDriver.quit();
        }
    }





}
