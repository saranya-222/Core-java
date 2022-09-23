package fileHandlingConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream in=new FileInputStream("F:\\New folder\\Serialization.txt");
        ObjectInputStream ob=new ObjectInputStream(in);		
         Employee e=(Employee) ob.readObject();//converting byte stream into object...
        System.out.println(e);
        ob.close();

	}

}
