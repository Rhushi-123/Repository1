package Data_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class KeyWord_Driven {
	public String PropertyFetch(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\manis\\eclipse-workspace\\Selenium_Maven01\\src\\test\\resources\\Properties\\Keyword_Driven1.propertties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String data = pobj.getProperty(key);
		return data;
	}


}
