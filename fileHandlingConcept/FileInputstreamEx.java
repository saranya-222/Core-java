package fileHandlingConcept;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputstreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in=new FileInputStream("F:\\New folder\\Example.txt");
		int i=0;
		while((i=in.read())!=-1)
		{
			System.out.print((char)i);
		}
		in.close();
	}

}
