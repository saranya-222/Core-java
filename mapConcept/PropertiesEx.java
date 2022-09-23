package mapConcept;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f=new FileReader("E:\\Edu-project\\core java\\src\\mapConcept\\db.properties");
		Properties p=new Properties();
		p.load(f);
		System.out.println("Key :"+p.getProperty("Username"));
		System.out.println("KeyValue :"+p.getProperty("Password"));
		

	}

}
