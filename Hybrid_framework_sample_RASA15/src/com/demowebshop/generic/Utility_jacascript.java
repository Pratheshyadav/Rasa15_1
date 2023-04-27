package com.demowebshop.generic;

import org.openqa.selenium.JavascriptExecutor;

public class Utility_jacascript extends Baseclasss
{

	public static JavascriptExecutor scroll()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		return js;
	}
}
