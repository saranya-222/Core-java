package fileHandlingConcept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileOutputStream out=new FileOutputStream("F:\\New folder\\Example.txt");
		FileOutputStream out=new FileOutputStream("F:\\New folder\\Example.txt",true);//need to append(add) the text by not removing the older one
		//String s="Welcome home!!!";
		String s="hello World....";
		byte[] br=s.getBytes();//converting string to byte...
		out.write(br);
		out.close();//used to close a file...
       System.out.println("File Created...");
	}

}
