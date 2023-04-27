package com.demowebshop.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class 
{
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement login_link;
	
	@FindBy(id="Email")
	private WebElement email_text;
	
	@FindBy(id="Password")
	private WebElement pass_text;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement login_btn;
	
	@FindBy(xpath="//ul[@class='top-menu']/li[1]/a")
	private WebElement book_btn;
	
	@FindBy(xpath="//select[@id='products-orderby']")
	private WebElement sortby_drop;
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	private WebElement display_drop;
	
	@FindBy(xpath="//select[@id='products-viewmode']")
	private WebElement view_drop;
	
	@FindBy(xpath="//a[text()='Computing and Internet']/../following-sibling::div[3]/div[2]")
	private WebElement computing_cart;
	
	@FindBy(xpath="//a[text()='Fiction']/../following-sibling::div[3]/div[2]")
	private WebElement fiction_cart;
	
	@FindBy(xpath="//a[text()='Health Book']/../following-sibling::div[3]/div[2]")
	private WebElement health_cart;
	
	@FindBy (xpath="//span[text()='Shopping cart']")
	private WebElement shp_cart;
	
	@FindBy(xpath="//tr[@class='cart-header-row']/../following-sibling::tbody[1]/tr[1]/td[6]/span[2]")
	private WebElement compvalue;
	
	@FindBy(xpath="//tr[@class='cart-header-row']/../following-sibling::tbody[1]/tr[2]/td[6]/span[2]")
	private WebElement fictvalue;
	
	@FindBy(xpath="//tr[@class='cart-header-row']/../following-sibling::tbody[1]/tr[3]/td[6]/span[2]")
	private WebElement healthvalue;
	
	@FindBy(xpath="/tr[@class='cart-header-row']/../following-sibling::tbody[1]/tr[1]/td[1]/input")
	private WebElement cummuting_cbox;
	
	@FindBy(xpath="//tr[@class='cart-header-row']/../following-sibling::tbody[1]/tr[2]/td[1]/input")
	private WebElement fiction_cbox;
	
	@FindBy(xpath="//tr[@class='cart-header-row']/../following-sibling::tbody[1]/tr[3]/td[1]/input")
	private WebElement health_cbox;
	
	@FindBy(xpath="//input[@value='Update shopping cart']")
	private WebElement update_rem;
	
	public Pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement loginlink()
	{
		return login_link;
	}
	
	public WebElement emailtext()
	{
		return email_text;
	}
	
	public WebElement passwordtext()
	{
		return pass_text;
	}
	
	public WebElement loginbtn()
	{
		return login_btn;
	}
	
	public WebElement bookbyn()
	{
		return book_btn;
	}
	
	public WebElement sortd()
	{
		return sortby_drop;
	}
	
	public WebElement displayd()
	{
		return display_drop;
	}
	
	public WebElement viewd()
	{
		return view_drop;
	}
	
	public WebElement comuttingcart()
	{
		return computing_cart;
	}
	
	public WebElement fictioncart()
	{
		return fiction_cart;
	}
	
	public WebElement healthcart()
	{
		return health_cart;
	}
	
	public WebElement shoppingcart()
	{
		return shp_cart;
	}
	
	public WebElement computtingvalue()
	{
		return compvalue;
	}
	
	public WebElement fictionvalue()
	{
		return fictvalue;
	}
	
	public WebElement healthvalue()
	{
		return healthvalue;
	}
	
	public WebElement c_cbox()
	{
		return cummuting_cbox;
	}
	
	public WebElement f_cbox()
	{
		return fiction_cbox;
	}
	
	public WebElement h_cbox()
	{
		return health_cbox;
	}
	
	public WebElement updaterem()
	{
		return update_rem;
	}
	
		
}
