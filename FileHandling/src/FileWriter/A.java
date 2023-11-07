package FileWriter;

import java.io.FileReader;
import java.io.FileWriter;

public class A {
	
	public static void main(String[] args) {
	
	try {
//		FileWriter fw = new FileWriter("//D:text.txt");
//		fw.write("I am a java developer");
//		fw.flush();
//		fw.close();
//		System.out.println("file created sucessfully");
		
		FileReader fr = new FileReader("//D:text.txt");
		try {

		int i;
		while( (i = fr.read())!= -1)
		{
		System.out.print((char)i);
		}
		}
		finally {
			fr.close();
			System.out.println();
			System.out.println("file closed");
		}
	}
	catch(Exception e) {
		System.out.println("unable to create file");
	
	}
 
	finally {
		
	}
	}
}