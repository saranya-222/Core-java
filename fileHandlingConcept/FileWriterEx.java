package fileHandlingConcept;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("F:\\New folder\\Ex2.txt");
		String s="Welcome to Edubridge";
        f.write(s);
		System.out.println("File created..");
		f.close();

	}

}
