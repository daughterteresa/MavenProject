import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDetail {

    static void goToWebsite(String site){
        WebDriver driver = new ChromeDriver();
        driver.get(site);
    }
}
