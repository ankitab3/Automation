package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoProperties {

	public static void main(String[] args)throws IOException  {
		
		//step 1
		FileInputStream fis=new FileInputStream("./src/test/resources/commonData.properties");
	
		Properties p=new Properties();
		
		p.load(fis);

		p.put("url2", "https://www.google.com/");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/commonData.properties");
		p.store(fos, "properties file updated successfully"); 
	}

}
