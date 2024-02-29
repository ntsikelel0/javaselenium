import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ntsiki {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://ntsikelel0.github.io");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();



    }
}
