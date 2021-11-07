import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class button_find_position_x_y {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/home.html");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        //find and click main Button
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
        Thread.sleep(4000);
        //find and click button go to home page
        driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
        Thread.sleep(4000);
        driver.close();


    }
}
