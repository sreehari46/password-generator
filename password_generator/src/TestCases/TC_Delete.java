package TestCases;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genric.TC_Deleting_Password;


public class TC_Delete {
	TC_Deleting_Password delete;
		
		@Test
		public void Deleting() {
			delete=new TC_Deleting_Password(driver);
			
			delete.getClickingOnIcon().click();
			
			delete.getClickingOnLoginid().click();
			delete.getClickingOnLoginid().sendKeys("abcd@gmail.com");
			
			delete.getClickingOnLoginpass().click();
			delete.getClickingOnLoginpass().sendKeys("Abcd@1234");
			
			delete.getClickingOnLogin().click();
			
			delete.getClickingOnDeleteIcon().click();
			
			delete.getClickingOnPassField().click();
			delete.getClickingOnPassField().sendKeys("Abcd@1234");
			
			delete.getClickingOnSubmitIcon().click();
			
			delete.getClickingOnLogoutIcon().click();
			
		}
		
		}
	
		

	
	}
	
	
	
		
		
	
	


