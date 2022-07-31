package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
	public static String getPropertyValue(String PropertyName) {

		FileReader input = null;

		try {
			input = new FileReader(
					"C:\\workspace\\eclipse-workspace\\AutomationFrameworkProject\\src\\main\\java\\configuration\\config.properties");
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}

		Properties p = new Properties();

		try {
			p.load(input);
		} catch (IOException e) {
   
			e.printStackTrace();
		}
    
		String propvalue=p.getProperty(PropertyName);
  
		return propvalue;
		
	}

}
