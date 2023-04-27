package com.demowebshop.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;

public class Propertyy implements Frames_constant

{
	public static String prop(String key) throws IOException
	{
	FileInputStream fis=new FileInputStream(prop_path);
    Properties pro=new Properties();
    pro.load(fis);
    String value=pro.getProperty(key);
    return value;
    
	
	
	
	
	}	
}
