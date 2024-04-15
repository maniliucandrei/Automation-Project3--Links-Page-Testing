import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class TestingLinks {
    public static void main(String[] args) {
        // Instantiere driver
        WebDriver driver = new ChromeDriver();

        // Setare rezolutie
        driver.manage().window().setSize(new Dimension(1920, 1080));

        // Navigare catre pagina
        driver.get("https://demoqa.com/links");

        // Scrierea testului

        //La momentul testarii pentru aceste 2 linkuri rezultatul este unul bun ;
        driver.findElement(By.cssSelector("#dynamicLink")).click();
        driver.findElement(By.cssSelector("#simpleLink")).click();

        //La momentul testarii pentru aceste linkuri rezultatul este unul bun , dar pentru o intelegere mai buna se recomanda ca fiecare linie de cod sa fie executata separat;
        driver.findElement(By.cssSelector("#created")).click();
        driver.findElement(By.cssSelector("#no-content")).click();
        driver.findElement(By.cssSelector("#moved")).click();
        driver.findElement(By.cssSelector("#bad-request")).click();
        driver.findElement(By.cssSelector("#unauthorized")).click();
        driver.findElement(By.cssSelector("#forbidden")).click();
        driver.findElement(By.cssSelector("#invalid-url")).click();


    }
}