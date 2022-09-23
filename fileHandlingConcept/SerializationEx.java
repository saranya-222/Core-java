package fileHandlingConcept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee e=new Employee(101,"Priya",23);
		FileOutputStream out=new FileOutputStream("F:\\New folder\\Serialization.txt");
		ObjectOutputStream s=new ObjectOutputStream(out);
       s.writeObject(e);//converting object to byte;
       s.flush();
       System.out.println("Converted in to byte stream");
	}

}
