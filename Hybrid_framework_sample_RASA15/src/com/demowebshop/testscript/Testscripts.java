package com.demowebshop.testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.demowebshop.generic.Baseclasss;
import com.demowebshop.generic.Dataprovider;
import com.demowebshop.generic.Propertyy;
import com.demowebshop.generic.Utility_jacascript;
import com.demowebshop.generic.Utility_select;
import com.demowebshop.generic.Utility_string;
import com.demowebshop.pomclass.Pom_class;

public class Testscripts extends Baseclasss
{
	@Test(dataProvider = "testdata",dataProviderClass = Dataprovider.class)
	public void scripts(String user,String pass) throws IOException, InterruptedException
	{
		Pom_class pmc=new Pom_class(driver);
		pmc.loginlink().click();
		pmc.emailtext().sendKeys(user);
		pmc.passwordtext().sendKeys(pass);
		pmc.loginbtn().click();
		pmc.bookbyn().click();
		WebElement sortdrop = pmc.sortd();
		Utility_select.sele(sortdrop).selectByVisibleText(Propertyy.prop("drop1"));
		WebElement display_drop = pmc.displayd();
		Utility_select.sele(display_drop).selectByVisibleText(Propertyy.prop("drop2"));
		WebElement view_drop = pmc.viewd();
		Utility_select.sele(view_drop).selectByVisibleText(Propertyy.prop("drop3"));
		pmc.comuttingcart().click();
		Thread.sleep(1500);
		WebElement fit = pmc.fictioncart();
		Thread.sleep(1500);
		Utility_jacascript.scroll().executeScript("arguments[0].scrollIntoView();", fit);
		Thread.sleep(2000);
		pmc.fictioncart().click();
		Thread.sleep(2000);
		WebElement ht = pmc.healthcart();
		Thread.sleep(2000);
		Utility_jacascript.scroll().executeScript("arguments[0].scrollIntoView();", ht);
		Thread.sleep(2000);
		pmc.healthcart().click();
		Thread.sleep(2000);
		WebElement shpcartt = pmc.shoppingcart();
		Thread.sleep(2000);
		Utility_jacascript.scroll().executeScript("arguments[0].click();", shpcartt);
		Thread.sleep(1500);
		WebElement t1 = pmc.computtingvalue();
		String v1 = t1.getText();
		//double d1 = Double.parseDouble(v1);
		//System.out.println(v1);
		//System.out.println(d1);
		double d1 = Utility_string.convert(v1);
		WebElement t2 = pmc.fictionvalue();
		String v2 = t2.getText();
		//double d2 = Double.parseDouble(v2);
		double d2 = Utility_string.convert(v2);
		WebElement t3 = pmc.healthvalue();
		String v3 = t3.getText();
		//double d3 = Double.parseDouble(v3);
		double d3 = Utility_string.convert(v3);
		if(d2>d1)
		{
			pmc.f_cbox().click();
			pmc.updaterem().click();
			//System.out.println(d2);
		}
		else if (d2>d3) 
		{
			pmc.h_cbox().click();
			pmc.updaterem().click();
			//System.out.println(d3);
			
		}
		else
		{
			pmc.c_cbox().click();
			pmc.updaterem().click();
			//System.out.println(d1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
