package TestCases;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import genric.TC_Deleting_Password;
import genric.TC_Editing_Password;

public class TC_Edit {
	TC_Editing_Password edit;
	
	@Test
	public void Editing() {
		edit=new TC_Editing_Password(driver);
		
		edit.getClickingOnIcon().click();
		
		edit.getClickingOnLoginid().click();
		edit.getClickingOnLoginid().sendKeys("abcd@gmail.com");
		
		edit.getClickingOnLoginpass().click();
		edit.getClickingOnLoginpass().sendKeys("Abcd@1234");
		
		edit.getClickingOnLogin().click();
		
		edit.getClickingOnEditIcon().click();
		
		edit.getClickingOnPassField().click();
		edit.getClickingOnPassField().sendKeys("Abcd@1234");
		
		edit.getClickingOnSubmitIcon().click();
		
		edit.getClickingOnChange().click();
		
		edit.getClickingOnUpdate().click();
		
		edit.getClickingOnLogoutIcon().click();
		
	}
	
	}

