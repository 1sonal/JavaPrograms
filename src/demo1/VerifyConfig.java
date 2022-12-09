package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class VerifyConfig {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/demo1/config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		

	}

}
