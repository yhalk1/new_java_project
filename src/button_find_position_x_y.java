import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        //find button position and size
        WebElement element = driver.findElement(By.id("position"));
        Point location = element.getLocation();
        int x = location.getX();
        int y = location.getX();
        double elementWidth = element.getSize().getWidth();
        double elementHight = element.getSize().getHeight();
        System.out.println("Coordinates: x= " + x + " and y= " + y);
        System.out.println("Width: " + elementWidth + " and Hight " + elementHight);
        //get button text
        System.out.println(element.getText());
        Thread.sleep(4000);
        driver.close();


    }
}
