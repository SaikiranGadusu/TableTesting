package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TableTest {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // here we got total num of rows
        int row = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
        System.out.println(" Total num of rows ====>" +row);

        // now we will know total num of column
        int column = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//th")).size();
        System.out.println(" Total num of colums ====>" +column);

        // now let capture all the data
        List<WebElement> details = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//td"));

        for (WebElement data:details) {System.out.println(data.getText());}
        driver.quit();
    }
}
