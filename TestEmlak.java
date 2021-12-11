package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEmlak {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\selce\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("http://127.0.0.1:3000/");
        driver.manage().window().maximize();

        // Senaryo 3
        WebElement kiralikPage = driver.findElement(By.xpath("//*[@id=\"navbarText\"][@href=\"/kiralik\"]"));
        kiralikPage.click();

        // Senaryo 4
        WebElement satilikPage = driver.findElement(By.xpath("//*[@id=\"navbarText\"][@href=\"/satilik\"]"));
        satilikPage.click();

        // Senaryo 5
        WebElement hakkimizdaPage = driver.findElement(By.xpath("//*[@id=\"navbarText\"][@href=\"/hakkimizda\"]"));
        hakkimizdaPage.click();

        // Senaryo 6
        WebElement githubButton = driver.findElement(By.className("fa-github"));
        js.executeScript("arguments[0].scrollIntoView();",githubButton);
        Thread.sleep(2000);
        githubButton.click();

        driver.get("http://127.0.0.1:3000/hakkimizda");

        WebElement linkedinButton = driver.findElement(By.className("fa-linkedin"));
        js.executeScript("arguments[0].scrollIntoView();",linkedinButton);
        Thread.sleep(2000);
        linkedinButton.click();

        driver.get("http://127.0.0.1:3000/hakkimizda");

        WebElement gmailButton = driver.findElement(By.className("fa-envelope"));
        js.executeScript("arguments[0].scrollIntoView();",gmailButton);
        Thread.sleep(2000);
        gmailButton.click();

        driver.get("http://127.0.0.1:3000/hakkimizda");

        // Senaryo 2
        WebElement anasayfaPage = driver.findElement(By.xpath("//*[@id=\"navbarText\"][@href=\"/anasayfa\"]"));
        anasayfaPage.click();

        // Senaryo 1
        WebElement cardLeftButton = driver.findElement(new By.ByCssSelector(".carousel-control-prev-icon[aria-hidden='true']"));
        cardLeftButton.click();

        WebElement cardRightButton = driver.findElement(new By.ByCssSelector(".carousel-control-next-icon[aria-hidden='true']"));
        cardRightButton.click();

        // Senaryo 7
        WebElement adminPage = driver.findElement(By.xpath("//*[@id=\"navbarText\"][@href=\"/admin\"]"));
        Thread.sleep(2000);
        adminPage.click();

        // Senaryo 9
        WebElement addAdvertPage = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/a[2]"));
        Thread.sleep(2000);
        addAdvertPage.click();

        // Senaryo 11
        WebElement advertName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[1]"));
        advertName.click();
        advertName.sendKeys("Varisli Yalı!!!");
        Thread.sleep(1000);
        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button"));
        addButton.click();

        Thread.sleep(2000);
        // Senaryo 10
        WebElement advertPrice = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[2]"));
        advertPrice.click();
        advertPrice.sendKeys("12000000");

        WebElement advertProperties = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[3]"));
        advertProperties.click();
        advertProperties.sendKeys("3 katlı");

        WebElement selectionCity = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]"));
        selectionCity.click();

        WebElement selectionCity1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]/option[1]"));
        Thread.sleep(1000);
        selectionCity1.click();

        WebElement selectionCity2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]/option[2]"));
        Thread.sleep(1000);
        selectionCity2.click();

        WebElement selectionCity3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]/option[3]"));
        Thread.sleep(1000);
        selectionCity3.click();

        WebElement selectionTypeofSales = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]"));
        selectionTypeofSales.click();

        WebElement selectionTypeofSales1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]/option[1]"));
        Thread.sleep(1000);
        selectionTypeofSales1.click();

        WebElement selectionTypeofSales2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]/option[2]"));
        Thread.sleep(1000);
        selectionTypeofSales2.click();

        WebElement selectionTypeofSales3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]/option[3]"));
        Thread.sleep(1000);
        selectionTypeofSales3.click();

        WebElement selectionTypeofActivity = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]"));
        selectionTypeofActivity.click();

        WebElement selectionTypeofActivity1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]/option[1]"));
        Thread.sleep(1000);
        selectionTypeofActivity1.click();

        WebElement selectionTypeofActivity2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]/option[2]"));
        Thread.sleep(1000);
        selectionTypeofActivity2.click();

        WebElement selectionTypeofActivity3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]/option[3]"));
        Thread.sleep(1000);
        selectionTypeofActivity3.click();

        Thread.sleep(1000);
        addButton.click();

        // Senaryo 12
        WebElement deleteAdvertPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/a[3]"));
        Thread.sleep(1000);
        deleteAdvertPage.click();

        WebElement deleteButton = driver.findElement(By.id("35"));
        Thread.sleep(1000);
        deleteButton.click();

        // Senaryo 13
        WebElement changeAdvertActiviyPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/a[4]"));
        Thread.sleep(1000);
        changeAdvertActiviyPage.click();

        WebElement changeAdvertActivityBox = driver.findElement(By.xpath("//*[@id=\"3\"][@class=\"select\"]"));
        Thread.sleep(1000);
        changeAdvertActivityBox.click();

        WebElement changeOption1 = driver.findElement(By.xpath("//*[@id=\"3\"]/option[1]"));
        Thread.sleep(1000);
        changeOption1.click();

        WebElement changeOption2 = driver.findElement(By.xpath("//*[@id=\"3\"]/option[2]"));
        Thread.sleep(1000);
        changeOption2.click();

        WebElement changeOption3 = driver.findElement(By.xpath("//*[@id=\"3\"]/option[3]"));
        Thread.sleep(1000);
        changeOption3.click();

        WebElement changeButton = driver.findElement(By.xpath("//*[@id=\"3\"][@class=\"button\"]"));
        Thread.sleep(1000);
        changeButton.click();

        // Senaryo 14
        WebElement addTeamMemberPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/a[5]"));
        Thread.sleep(1000);
        addTeamMemberPage.click();

        // Senaryo 16
        WebElement personName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[1]"));
        Thread.sleep(1000);
        personName.click();
        personName.sendKeys("Selcen Fethiye");
        WebElement addButton2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button"));
        addButton2.click();

        Thread.sleep(2000);
        // Senaryo 15
        WebElement personSurname = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[2]"));
        personSurname.click();
        personSurname.sendKeys("MERSİNLİ");

        WebElement personMission = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[3]"));
        personMission.click();
        personMission.sendKeys("Tester");

        WebElement personGithub = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[4]"));
        personGithub.click();
        personGithub.sendKeys("selcenfethiye");

        WebElement personLinkedin = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[5]"));
        personLinkedin.click();
        personLinkedin.sendKeys("selcen-fethiye-mersinli-59180b19b/");

        WebElement personMail = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[6]"));
        personMail.click();
        personMail.sendKeys("selcenfethiyemersinli@gmail.com");

        addButton2.click();

        // Senaryo 17
        WebElement arrangementTeamMemberPage = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/a[6]"));
        Thread.sleep(1000);
        arrangementTeamMemberPage.click();

        WebElement arrangementTeamMemberName = driver.findElement(By.xpath("//*[@id=\"isim11\"]"));
        arrangementTeamMemberName.click();
        arrangementTeamMemberName.sendKeys("Selcen");

        WebElement arrangementTeamMemberSurname = driver.findElement(By.xpath("//*[@id=\"soyisim11\"]"));
        arrangementTeamMemberSurname.click();
        arrangementTeamMemberSurname.sendKeys("Mersinli");

        WebElement arrangementTeamMemberMission = driver.findElement(By.xpath("//*[@id=\"görev11\"]"));
        arrangementTeamMemberMission.click();
        arrangementTeamMemberMission.sendKeys("Test Mühendisi");

        WebElement arrangementTeamMemberGithub = driver.findElement(By.xpath("//*[@id=\"github11\"]"));
        arrangementTeamMemberGithub.click();
        arrangementTeamMemberGithub.sendKeys("selcenfethiye");

        WebElement arrangementTeamMemberLinkedin = driver.findElement(By.xpath("//*[@id=\"linkedin11\"]"));
        arrangementTeamMemberLinkedin.click();
        arrangementTeamMemberLinkedin.sendKeys("selcen-fethiye-mersinli-59180b19b/");

        WebElement arrangementTeamMemberGmail = driver.findElement(By.xpath("//*[@id=\"mail11\"]"));
        arrangementTeamMemberGmail.click();
        arrangementTeamMemberGmail.sendKeys("selcenfethiyemersinli@gmail.com");

        WebElement arrangementTeamMemberButton = driver.findElement(By.xpath("//*[@id=\"button11\"]"));
        arrangementTeamMemberButton.click();

        // Senaryo 18
        WebElement deleteTeamMemberPage = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/a[7]"));
        Thread.sleep(1000);
        deleteTeamMemberPage.click();

        WebElement deleteButton2 = driver.findElement(By.id("12"));
        deleteButton2.click();

        // Senaryo 19
        WebElement editCompanyInformationPage = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/a[8]"));
        Thread.sleep(1000);
        editCompanyInformationPage.click();

        // Senaryo 21
        WebElement companyName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[1]"));
        companyName.click();
        companyName.sendKeys("Mersinli");
        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button"));
        editButton.click();

        Thread.sleep(2000);
        // Senaryo 20
        WebElement companySector = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[2]"));
        companySector.click();
        companySector.sendKeys("Gayrimenkul Satışı");

        WebElement companyGoal = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[3]"));
        companyGoal.click();
        companyGoal.sendKeys("Ticaret");

        WebElement companyAddress = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[4]"));
        companyAddress.click();
        companyAddress.sendKeys("Yenişehir/Mersin");

        editButton.click();

        // Senaryo 8
        WebElement backMainPage = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/a[1]"));
        Thread.sleep(1000);
        backMainPage.click();

        Thread.sleep(1000);
        driver.quit();
    }
}
