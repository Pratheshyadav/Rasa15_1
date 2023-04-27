package com.demowebshop.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class Dataprovider implements Frames_constant
{
	@DataProvider(name = "testdata")
	public Object[][] data() throws EncryptedDocumentException, IOException
	{
		Object[][]arr=Excel.exedata(shet);
		return arr;
		
		/*Object[][]arr= {{"pratheshyadav98@gmail.com","Prathesh@67"}};
		return arr;*/
		
		
	}

	

	

	
}
