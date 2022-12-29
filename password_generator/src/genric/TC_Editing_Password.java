package genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_Editing_Password {
	
	public TC_Editing_Password(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    @FindBy(css="svg[data-testid='LoginIcon']") private WebElement ClickingOnIcon;
	
	@FindBy(id="outlined-basic") private WebElement ClickingOnLoginid;
	
	@FindBy(id="outlined-adornment-password") private WebElement ClickingOnLoginpass;
	
	@FindBy(css="button[type='submit']") private WebElement ClickingOnLogin;
	
	@FindBy(css="svg[data-testid='EditOutlinedIcon']") private WebElement ClickingOnEditIcon;
	
    @FindBy(id=":rb:") private WebElement ClickingOnPassField;
	
	@FindBy(css="button[type='submit']") private WebElement ClickingOnSubmitIcon;
	
	@FindBy(css="button[role='button']") private WebElement ClickingOnChange;
	
	@FindBy(css="button[type='submit']") private WebElement ClickingOnUpdate;
	
	@FindBy(css="svg[data-testid='LogoutIcon']") private WebElement ClickingOnLogoutIcon;

	
	
	//getters
	
	
	public WebElement getClickingOnIcon() {
		return ClickingOnIcon;
	}

	public WebElement getClickingOnLoginid() {
		return ClickingOnLoginid;
	}

	public WebElement getClickingOnLoginpass() {
		return ClickingOnLoginpass;
	}

	public WebElement getClickingOnLogin() {
		return ClickingOnLogin;
	}

	public WebElement getClickingOnEditIcon() {
		return ClickingOnEditIcon;
	}

	public WebElement getClickingOnPassField() {
		return ClickingOnPassField;
	}

	public WebElement getClickingOnSubmitIcon() {
		return ClickingOnSubmitIcon;
	}

	public WebElement getClickingOnChange() {
		return ClickingOnChange;
	}

	public WebElement getClickingOnUpdate() {
		return ClickingOnUpdate;
	}

	public WebElement getClickingOnLogoutIcon() {
		return ClickingOnLogoutIcon;
	}
	
	

}
