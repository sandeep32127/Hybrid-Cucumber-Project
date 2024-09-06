package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	
	
	public ConfigReader() {
		try {
			loadProperties();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadProperties() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream("./src/test/resources/config.properties"));
	}
	
	public String getProperty(String propertyKey) {
		return prop.getProperty(propertyKey);
	}

}
