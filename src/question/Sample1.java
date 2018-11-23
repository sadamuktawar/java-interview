package question;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sample1 {
	
WebDriver driver;
public void isAlert() {
try {
	driver.switchTo().alert();
	
}catch(Exception e) {
e.printStackTrace();	
}
}
@Test
public void allQuestion() {
	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();
Alert text=driver.switchTo().alert();
System.out.println(text.getText());

System.out.println("!...........................................................!");

	driver.switchTo().frame(0);
	driver.switchTo().frame("myframe");
	driver.switchTo().frame(driver.findElement(By.xpath("")));

System.out.println("!...........................................................!");
String pidwindow=driver.getWindowHandle();
Set<String>allwindows=driver.getWindowHandles();
Iterator<String> itr=allwindows.iterator();
String ParentWindow=itr.next();
driver.switchTo().window(pidwindow);
String ChildWindow=itr.next();
driver.switchTo().window(ChildWindow);
driver.switchTo().defaultContent();//to return to parent window

System.out.println("!...........................................................!");


WebDriverWait wait=new WebDriverWait(driver, 30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
System.out.println("!...........................................................!");

Actions action=new Actions(driver);
action.moveToElement(driver.findElement(By.xpath(""))).build().perform();
System.out.println("!...........................................................!");

/*
 * select Dropdown
 */
Select sel=new Select(driver.findElement(By.xpath("")));

sel.selectByIndex(0);
sel.selectByValue("sad");
sel.selectByVisibleText("text");
System.out.println("!...........................................................!");

//Right click in selenium 
Actions action1=new Actions(driver);
action1.contextClick();

System.out.println("!...........................................................!");

//drag and drop 

Actions action2=new Actions(driver);
WebElement source=driver.findElement(By.xpath(""));
WebElement target=driver.findElement(By.xpath(""));
action2.dragAndDrop(source, target);

}

File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(src new File("D:// htmak//saso"));
}