package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emlak {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\selce\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        int sayac = 0;
        int control = 0;

        String siteURL = "http://127.0.0.1:3000/";
        String anasayfaPageURL = "http://127.0.0.1:3000/anasayfa";
        String kiralikPageURL = "http://127.0.0.1:3000/kiralik";
        String satilikPageURL = "http://127.0.0.1:3000/satilik";
        String hakkimizdaPageURL = "http://127.0.0.1:3000/hakkimizda";
        String adminPageURL = "http://127.0.0.1:3000/admin";
        String ilanEklemePageURL = "http://127.0.0.1:3000/ilanEkleme";
        String ilanSilPageURL = "http://127.0.0.1:3000/ilanSil";
        String ilanDuzenlePageURL = "http://127.0.0.1:3000/ilanDuzenle";
        String ekipUyeEklePageURL = "http://127.0.0.1:3000/ekipUyeEkle";
        String ekipUyeDuzenlePageURL = "http://127.0.0.1:3000/ekipUyeDuzenle";
        String ekipUyeSilPageURL = "http://127.0.0.1:3000/ekipUyeSil";
        String hakkimdaDuzenlePageURL = "http://127.0.0.1:3000/hakkimdaDuzenle";

        String anasayfaButonPATH = "//*[@id=\"navbarText\"][@href=\"/anasayfa\"]";
        String kiralikButonPATH = "//*[@id=\"navbarText\"][@href=\"/kiralik\"]";
        String satilikButonPATH = "//*[@id=\"navbarText\"][@href=\"/satilik\"]";
        String hakkimizdaButonPATH = "//*[@id=\"navbarText\"][@href=\"/hakkimizda\"]";
        String adminButonPATH = "//*[@id=\"navbarText\"][@href=\"/admin\"]";

        String backAnasayfaPATH = "//*[@id='root']/div/div/div[1]/div/a[1]";
        String ilanEklemePagePATH = "//*[@id='root']/div/div/div[1]/div/a[2]";
        String ilanSilPagePATH = "//*[@id=\"root\"]/div/div/div[1]/div/a[3]";
        String ilanDuzenlePagePATH = "//*[@id=\"root\"]/div/div/div[1]/div/a[4]";
        String ekipUyeEklePagePATH = "//*[@id=\"root\"]/div/div/div[1]/div/a[5]";
        String ekipUyeDuzenlePagePATH = "//*[@id='root']/div/div/div[1]/div/a[6]";
        String ekipUyeSilPagePATH = "//*[@id='root']/div/div/div[1]/div/a[7]";
        String hakkimdaDuzenlePagePATH = "//*[@id='root']/div/div/div[1]/div/a[8]";

        String isimYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[1]";
        String fiyatYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[2]";
        String ozellikYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[3]";
        String sehirSecimPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]";
        String sehirBosPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]/option[1]";
        String sehirIstanbulPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]/option[2]";
        String sehirAnkaraPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]/option[3]";
        String satisTuruSecimPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]";
        String satisTuruBosPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]/option[1]";
        String satisTuruKiralikPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]/option[2]";
        String satisTuruSatilikPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]/option[3]";
        String aktiklikTuruSecimPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]";
        String aktiflikTuruBosPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]/option[1]";
        String aktiflikTuruAktifPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]/option[2]";
        String aktiflikTuruPasifPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]/option[3]";
        String ilanEkleButonPATH = "//*[@id=\"root\"]/div/div/div[2]/div/button";
        String messagePATH = "//*[@id=\"root\"]/div/div/div[2]/h5[2]";

        String personelIsimYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[1]";
        String personelSoyisimYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[2]";
        String personelGorevYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[3]";
        String personelGithubYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[4]";
        String personelLinkedinYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[5]";
        String personelGmailYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[6]";
        String personelEkleButonPATH = "//*[@id=\"root\"]/div/div/div[2]/div/button";

        String personelIsimDegistirmeYeriPATH = "//*[@id=\"isim11\"]";
        String personelSoyisimDegistirmeYeriPATH = "//*[@id=\"soyisim11\"]";
        String personelGorevDegistirmeYeriPATH = "//*[@id=\"g??rev11\"]";
        String personelGithubDegistirmeYeriPATH = "//*[@id=\"github11\"]";
        String personelLinkedinDegistirmeYeriPATH = "//*[@id=\"linkedin11\"]";
        String personelGmailDegistirmeYeriPATH = "//*[@id=\"mail11\"]";
        String personelGuncelleButonPATH = "//*[@id=\"button11\"]";

        String sirketIsimYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[1]";
        String sirketSektorYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[2]";
        String sirketAmacYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[3]";
        String sirketAdresYeriPATH = "//*[@id=\"root\"]/div/div/div[2]/div/form/input[4]";
        String sirketBilgiGuncelleButonPATH = "//*[@id=\"root\"]/div/div/div[2]/div/button";

        String resimSagKaydirPATH = "//*[@id=\"root\"]/div/div/div[2]/div/div/a[2]/span[1]";
        String resimSolKaydirPATH = "//*[@id=\"root\"]/div/div/div[2]/div/div/a[1]/span[1]" ;
        String ilanResimSagKaydirPATH = "//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/a[2]/span[1]";
        String ilanResimSolKaydirPATH = "//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/a[1]/span[1]";
        String resim1GirisSayfasiPATH = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[1]/img";
        String resim2GirisSayfasiPATH = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/img";
        String resim1DetailsSayfasiPath = "//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div[2]/div[1]/img";
        String resim2DetailsSayfasiPath = "//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div[2]/div[2]/img";

        String semihGithubPATH = "//*[@id=\"2\"][@href=\"https://github.com/hsemihaktas\"]";
        String semihLinkedinPATH = "//*[@id=\"2\"][@href=\"https://www.linkedin.com/in/hsemihaktas\"]";
        String semihGmailPATH = "//*[@id=\"2\"][@href=\"mailto:hsemihaktas@gmail.com\"]";
        String semihGithubURL = "https://github.com/hsemihaktas";


        driver.get(siteURL);
        driver.manage().window().maximize();

        if(driver.getCurrentUrl().equals(siteURL)){
            System.out.println("Site a????ld??");
        }
        else{
            System.out.println("Site a????lamad??");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(resimSolKaydirPATH)).click();
        if(!(driver.findElement(By.xpath(resim2GirisSayfasiPATH)).isDisplayed())){
            control += 1;
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath(resimSagKaydirPATH)).click();
        if(!(driver.findElement(By.xpath(resim1GirisSayfasiPATH)).isDisplayed())){
            control += 1;
        }

        if(control == 0){
            System.out.println("Slider ba??ar??l??");
        }
        else{
            System.out.println("Slider ba??ar??s??z");
        }

        control = 0;

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,650)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='32']")).click();

        if(driver.getCurrentUrl().equals("http://127.0.0.1:3000/32")){
            System.out.println("Senaryo 24 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 24 ba??ar??s??z");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(ilanResimSolKaydirPATH)).click();
        if(!(driver.findElement(By.xpath(resim2DetailsSayfasiPath)).isDisplayed())){
            control += 1;
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath(ilanResimSagKaydirPATH)).click();
        if(!(driver.findElement(By.xpath(resim1DetailsSayfasiPath)).isDisplayed())){
            control += 1;
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(anasayfaButonPATH)).click();

        if(driver.getCurrentUrl().equals(anasayfaPageURL)){
            System.out.println("Senaryo 2 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 2 ba??ar??s??z");
            sayac += 1;
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(resimSolKaydirPATH)).click();

        if(!(driver.findElement(By.xpath(resim2GirisSayfasiPATH)).isDisplayed())){
            control += 1;
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath(resimSagKaydirPATH)).click();

        if(!(driver.findElement(By.xpath(resim1GirisSayfasiPATH)).isDisplayed())){
            control += 1;
        }

        if(control == 0){
            System.out.println("Senaryo 1 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 1 ba??ar??s??z");
        }

        control = 0;

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,650)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='32']")).click();

        if(driver.getCurrentUrl().equals("http://127.0.0.1:3000/32")){
            System.out.println("Details button ba??ar??l??");
        }
        else{
            System.out.println("Details button ba??ar??s??z");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(ilanResimSolKaydirPATH)).click();
        if(!(driver.findElement(By.xpath(resim2DetailsSayfasiPath)).isDisplayed())){
            control += 1;
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath(ilanResimSagKaydirPATH)).click();
        if(!(driver.findElement(By.xpath(resim1DetailsSayfasiPath)).isDisplayed())){
            control += 1;
        }


        Thread.sleep(2000);
        driver.findElement(By.xpath(kiralikButonPATH)).click();

        if(driver.getCurrentUrl().equals(kiralikPageURL)){
            System.out.println("Senaryo 3 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 3 ba??ar??s??z");
            sayac += 1;
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"33\"]")).click();

        if(driver.getCurrentUrl().equals("http://127.0.0.1:3000/33")){
            System.out.println("Senaryo 22 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 22 ba??ar??s??z");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(ilanResimSolKaydirPATH)).click();
        if(!(driver.findElement(By.xpath(resim2DetailsSayfasiPath)).isDisplayed())){
            control += 1;
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath(ilanResimSagKaydirPATH)).click();
        if(!(driver.findElement(By.xpath(resim1DetailsSayfasiPath)).isDisplayed())){
            control += 1;
        }


        Thread.sleep(2000);
        driver.findElement(By.xpath(satilikButonPATH)).click();

        if(driver.getCurrentUrl().equals(satilikPageURL)){
            System.out.println("Senaryo 4 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 4 ba??ar??s??z");
            sayac += 1;
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='32']")).click();

        if(driver.getCurrentUrl().equals("http://127.0.0.1:3000/32")){
            System.out.println("Senaryo 23 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 23 ba??ar??s??z");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(ilanResimSolKaydirPATH)).click();
        if(!(driver.findElement(By.xpath(resim2DetailsSayfasiPath)).isDisplayed())){
            control += 1;
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath(ilanResimSagKaydirPATH)).click();
        if(!(driver.findElement(By.xpath(resim1DetailsSayfasiPath)).isDisplayed())){
            control += 1;
        }

        if(control == 0){
            System.out.println("Senaryo 26 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 26 ba??ar??s??z");
        }

        control = 0;

        Thread.sleep(2000);
        driver.findElement(By.xpath(hakkimizdaButonPATH)).click();

        if(driver.getCurrentUrl().equals(hakkimizdaPageURL)){
            System.out.println("Senaryo 5 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 5 ba??ar??s??z");
            sayac += 1;
        }

        if(sayac == 0){
            System.out.println("Senaryo 25 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 25 ba??ar??s??z");
        }

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,550)", "");

        Thread.sleep(2000);
        driver.findElement(By.xpath(semihGithubPATH)).click();

        if(driver.getCurrentUrl().equals(semihGithubURL)){
            System.out.println("Github ba??ar??l??");
        }
        else{
            System.out.println("Github ba??ar??s??z");
            control += 1;
        }

        Thread.sleep(2000);
        driver.navigate().back();

        js.executeScript("window.scrollBy(0,550)", "");

        Thread.sleep(2000);
        driver.findElement(By.xpath(semihLinkedinPATH)).click();

        if(driver.getTitle().equals("Oturum A????n | LinkedIn")){
            System.out.println("Linkedin ba??ar??l??"); //giri??
        }
        else if(driver.getTitle().equals("Kaydolun | LinkedIn")){
            System.out.println("Linkedin ba??ar??l??"); //kaydol
        }
        else if(driver.getTitle().equals("G??venlik Do??rulamas?? | LinkedIn")){
            System.out.println("Linkedin ba??ar??l??"); //g??venlik
        }
        else if(driver.getTitle().equals("Hasan Semih Akta?? - ??stanbul Medeniyet ??niversitesi - Pendik, ??stanbul, T??rkiye | LinkedIn")){
            System.out.println("Linkedin ba??ar??l??");
        }
        else{
            System.out.println(driver.getTitle());
            System.out.println("Linkedin ba??ar??s??z");
            control += 1;
        }

        Thread.sleep(2000);
        driver.navigate().back();

        js.executeScript("window.scrollBy(0,550)", "");

        Thread.sleep(2000);
        driver.findElement(By.xpath(semihGmailPATH)).click();

        js.executeScript("window.scrollBy(0,-550)", "");

        if(control == 0){
            System.out.println("Senaryo 6 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 6 ba??ar??s??z");
        }

        control = 0;

        Thread.sleep(2000);
        driver.findElement(By.xpath(adminButonPATH)).click();

        if(driver.getCurrentUrl().equals(adminPageURL)){
            System.out.println("Senaryo 7 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 7 ba??ar??s??z");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(ilanEklemePagePATH)).click();

        if(driver.getCurrentUrl().equals(ilanEklemePageURL)){
            System.out.println("Senaryo 9 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 9 ba??ar??s??z");
        }

        driver.findElement(By.xpath(ilanEkleButonPATH)).click();
        if(!(driver.findElement(By.xpath(messagePATH)).getText().equals("L??tfen bo?? alan b??rakmay??n??z!"))){
            //sayac += 1;
            System.out.println("Senaryo 11 ba??ar??s??z");
        }
        else{
            System.out.println("Senaryo 11 ba??ar??l??");
        }
        Thread.sleep(2000);
        driver.navigate().refresh();

        Thread.sleep(1000);
        driver.findElement(By.xpath(isimYeriPATH)).sendKeys("St??dyo Daire");
        Thread.sleep(1000);
        driver.findElement(By.xpath(fiyatYeriPATH)).sendKeys("1700");
        Thread.sleep(1000);
        driver.findElement(By.xpath(ozellikYeriPATH)).sendKeys("metroya yak??n");
        Thread.sleep(1000);
        driver.findElement(By.xpath(sehirSecimPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(sehirBosPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(sehirAnkaraPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(sehirIstanbulPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(satisTuruSecimPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(satisTuruBosPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(satisTuruKiralikPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(satisTuruSatilikPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(aktiklikTuruSecimPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(aktiflikTuruBosPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(aktiflikTuruPasifPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(aktiflikTuruAktifPATH)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(ilanEkleButonPATH)).click();


        if(driver.findElement(By.xpath(messagePATH)).getText().equals("Ba??ar??l?? bir ??ekilde eklendi!")){
            System.out.println("Senaryo 10 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 10 ba??ar??s??z");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(ilanSilPagePATH)).click();

        if(!(driver.getCurrentUrl().equals(ilanSilPageURL))){
            control +=1;
        }

        Thread.sleep(2000);
        driver.findElement(By.id("75")).click();
        Thread.sleep(2000);

        if(!(driver.findElement(By.xpath(messagePATH)).getText().equals("Ba??ar??l?? bir ??ekilde silindi!"))){
            control += 1;
        }

        if(control == 0){
            System.out.println("Senaryo 12 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 12 ba??ar??s??z");
        }

        control = 0;

        Thread.sleep(2000);
        driver.findElement(By.xpath(ilanDuzenlePagePATH)).click();

        if(!(driver.getCurrentUrl().equals(ilanDuzenlePageURL))){
            control += 1;
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"31\"][@class=\"select\"]"));

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"31\"]/option[1]")); //-

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"31\"]/option[2]")); //aktif

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"31\"]/option[3]")).click(); //pasif

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"31\"][@class=\"button\"]")).click();

        if(driver.findElement(By.xpath(messagePATH)).getText().equals("L??tfen ayn?? durumu se??meyiniz!")){
            control += 1;
        }

        if(control == 0){
            System.out.println("Senaryo 13 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 13 ba??ar??s??z");
        }
        control = 0;

        Thread.sleep(2000);
        driver.findElement(By.xpath(ekipUyeEklePagePATH)).click();

        if(driver.getCurrentUrl().equals(ekipUyeEklePageURL)){
            System.out.println("Senaryo 14 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 14 ba??ar??s??z");
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath(personelEkleButonPATH)).click();
        Thread.sleep(1000);
        if(!(driver.findElement(By.xpath(messagePATH)).getText().equals("L??tfen bo?? alan b??rakmay??n??z!"))){
            System.out.println("Senaryo 16 ba??ar??s??z");
        }
        else{
            System.out.println("Senaryo 16 ba??ar??l??");
        }

        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelIsimYeriPATH)).sendKeys("Selcen Fethiye");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelSoyisimYeriPATH)).sendKeys("MERS??NL??");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelGorevYeriPATH)).sendKeys("Tester");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelGithubYeriPATH)).sendKeys("selcenfethiye");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelLinkedinYeriPATH)).sendKeys("selcen-fethiye-mersinli-59180b19b/");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelGmailYeriPATH)).sendKeys("selcenfethiyemersinli@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelEkleButonPATH)).click();
        Thread.sleep(1000);
        if(driver.findElement(By.xpath(messagePATH)).getText().equals("Ba??ar??l?? bir ??ekilde eklendi!")){
            System.out.println("Senaryo 15 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 15 ba??ar??s??z");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(ekipUyeDuzenlePagePATH)).click();

        if(!(driver.getCurrentUrl().equals(ekipUyeDuzenlePageURL))){
            control += 1;
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath(personelGuncelleButonPATH)).click();
        Thread.sleep(1000);
        if(!(driver.findElement(By.xpath(messagePATH)).getText().equals("L??tfen bir tane alana yaz??n??z!"))){
            control += 1;
        }

        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelIsimDegistirmeYeriPATH)).sendKeys("Selcen Fethiye");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelSoyisimDegistirmeYeriPATH)).sendKeys("MERS??NL??");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelGorevDegistirmeYeriPATH)).sendKeys("Tester");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelGithubDegistirmeYeriPATH)).sendKeys("selcenfethiye");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelLinkedinDegistirmeYeriPATH)).sendKeys("selcen-fethiye-mersinli-59180b19b/");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelGmailDegistirmeYeriPATH)).sendKeys("selcenfethiyemersinli@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath(personelGuncelleButonPATH)).click();
        Thread.sleep(1000);

        if((driver.findElement(By.xpath(messagePATH)).getText().equals("Ba??ar??l?? Bir ??ekilde De??i??tirildi!")) && (control == 0)){
            System.out.println("Senaryo 17 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 17 ba??ar??s??z");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(ekipUyeSilPagePATH)).click();

        if(!(driver.getCurrentUrl().equals(ekipUyeSilPageURL))){
            control += 1;
        }

        Thread.sleep(2000);
        driver.findElement(By.id("38")).click();
        Thread.sleep(2000);

        if(!(driver.findElement(By.xpath(messagePATH)).getText().equals("Ba??ar??l?? bir ??ekilde silindi!"))){
            control += 1;
        }

        if(control == 0){
            System.out.println("Senaryo 18 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 18 ba??ar??s??z");
        }


        Thread.sleep(2000);
        driver.findElement(By.xpath(hakkimdaDuzenlePagePATH)).click();

        if(driver.getCurrentUrl().equals(hakkimdaDuzenlePageURL)){
            System.out.println("Senaryo 19 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 19 ba??ar??s??z");
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath(sirketBilgiGuncelleButonPATH)).click();
        if(!(driver.findElement(By.xpath(messagePATH)).getText().equals("L??tfen bo?? alan b??rakmay??n??z!"))){
            System.out.println("Senaryo 21 ba??ar??s??z");
        }
        else{
            System.out.println("Senaryo 21 ba??ar??l??");
        }

        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.findElement(By.xpath(sirketIsimYeriPATH)).sendKeys("Mersinli");
        Thread.sleep(1000);
        driver.findElement(By.xpath(sirketSektorYeriPATH)).sendKeys("Gayrimenkul Sat??????");
        Thread.sleep(1000);
        driver.findElement(By.xpath(sirketAmacYeriPATH)).sendKeys("Ticaret");
        Thread.sleep(1000);
        driver.findElement(By.xpath(sirketAdresYeriPATH)).sendKeys("Yeni??ehir/Mersin");
        Thread.sleep(1000);
        driver.findElement(By.xpath(sirketBilgiGuncelleButonPATH)).click();

        if(driver.findElement(By.xpath(messagePATH)).getText().equals("Ba??ar??l?? bir ??ekilde g??ncellendi!")){
            System.out.println("Senaryo 20 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 20 ba??ar??s??z ");
        }


        Thread.sleep(2000);
        driver.findElement(By.xpath(backAnasayfaPATH)).click();

        if(driver.getCurrentUrl().equals(anasayfaPageURL)){
            System.out.println("Senaryo 8 ba??ar??l??");
        }
        else{
            System.out.println("Senaryo 8 ba??ar??s??z");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
