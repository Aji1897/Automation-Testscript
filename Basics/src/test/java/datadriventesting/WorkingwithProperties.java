package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WorkingwithProperties {

	public static void main(String[] args) throws IOException {
FileInputStream fis = new FileInputStream("C:\\Users\\sarvesh\\Documents\\selenium\\testdata.properties");
Properties pobj = new Properties();
pobj.load(fis);

System.out.println(pobj.getProperty("url"));
System.out.println(pobj.getProperty("un"));
System.out.println(pobj.getProperty("pwd"));
	}

}
