package fileHandlingConcept;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilereaderEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader r=new FileReader("F:\\New folder\\Ex2.txt");
		int i;
		while((i=r.read())!=-1)
		{
			System.out.print((char)i);
		}
		r.close();

	}

}
