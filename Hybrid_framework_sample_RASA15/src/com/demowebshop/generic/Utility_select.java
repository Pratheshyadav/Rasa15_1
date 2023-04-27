package com.demowebshop.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_select 
{
public static Select sele(WebElement drop)
{
	Select sel=new Select(drop);
	return sel;
}
	
}
