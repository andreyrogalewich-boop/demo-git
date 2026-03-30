package by.onliner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistPage {
    private ChromeDriver driver;

    public RegistPage(ChromeDriver driver) {
        this.driver = driver;
    }

    private final String URL = "https://profile.onliner.by/registration";


    private final String TITLE = "//*[@id=\"container\"]/div/div/div/form/div[2]/div/div[1]";
    private final String INPUT_IMAIL = "//*[@id=\"container\"]/div/div/div/form/div[2]/div/div[5]/div/div/div/div/input";
    private final String INPUT_PASSWORD = "//*[@id=\"container\"]/div/div/div/form/div[2]/div/div[6]/div/div/div/div/input";
    private final String INPUT_REPEAD_PASSWORD = "//*[@id=\"container\"]/div/div/div/form/div[2]/div/div[8]/div/div/div/div/input";

    private final String BUTTON_SUBMIT = "//*[@id=\"container\"]/div/div/div/form/div[2]/div/div[9]/button";
    private final String LINK_LOGIN = "//*[@id=\"container\"]/div/div/div/form/div[2]/div/div[10]/a";
    //private final String LNK_FORGOT_PASSWORD = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[4]/div[2]/a";
    //private final String BUTTON_CLOSE = "//*[@id=\"auth-container\"]/div/div[1]/div[2]";

    public String getTitleText(){
        return driver.findElement(By.xpath(TITLE)).getText();
    }

    public void setInputImail(String imail){
        driver.findElement(By.xpath(INPUT_IMAIL)).sendKeys(imail);
    }

    public void setInputPassword(String password){
        driver.findElement(By.xpath(INPUT_PASSWORD)).sendKeys(password);
    }
    public void setInputRepeadPassword(String password){
        driver.findElement(By.xpath(INPUT_REPEAD_PASSWORD)).sendKeys(password);
    }

    public void clickSubmitButton (){
        driver.findElement(By.xpath(BUTTON_SUBMIT)).click();
    }

    public void clickLinkLogin () {
        driver.findElement(By.xpath(LINK_LOGIN)).click();
    }

}
