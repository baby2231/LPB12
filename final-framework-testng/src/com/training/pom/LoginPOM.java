package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void course() throws InterruptedException {
		driver.findElement(By.linkText("Create a course")).click();
		driver.findElement(By.id("update_course_title")).sendKeys("sel001");
		driver.findElement(By.name("visual_code")).sendKeys("00031");
		Select category = new Select( driver.findElement(By.name("category_code")));
		category.selectByVisibleText("Automation07 (NL102907)");
		
		//Select language = new Select(driver.findElement(By.name("update_course_course_language")));
		//language.selectByVisibleText("English");
		driver.findElement(By.id("update_course_submit")).click();;
		//driver.findElement(By.linkText("http://elearningm1.upskills.in/user_portal.php?nosession=true")).click();
		
		driver.findElement(By.id("course-search-keyword")).click();
		driver.findElement(By.id("course-search-keyword")).sendKeys("sel001");
		driver.findElement(By.id("search_simple_submit")).click();
		//driver.findElement(By.partialLinkText("Course home")).click();
		//driver.findElement(By.linkText("http://elearningm1.upskills.in/main/admin/course_edit.php?id=357")).click();
		//driver.findElement(By.linkText("title=\"Edit\"")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href='http://elearningm1.upskills.in/courses/00031/index.php']")).click();
		driver.findElement(By.xpath("//*[@title='Edit']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='cke_wysiwyg_frame cke_reset']")));
		
		driver.findElement(By.className("cke_editable")).clear();
		
		driver.findElement(By.className("cke_editable")).sendKeys("selenium");
		
		driver.findElement(By.id("introduction_text_intro_cmdUpdate")).click();
		
		
		
		
		//driver.findElement(By.xpath("//*[@title='Users']")).click();
		
		//int size = driver.findElements(By.tagName("iframe")).size();
		//System.out.println("the value of + 'size'");
		
		//driver.switchTo().frame(0);
		
		
		//driver.findElement(By.xpath("//[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("this is an selenium course");
		//driver.findElement(By.name("intro_cmdUpdate")).click();
	

	}
	
	
}
