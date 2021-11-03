package bai2;

import java.io.*;
//import interface_03_11.Student;

public class main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Car c = new Car("Mercedes 123", "Turbo", 4, "21-02-2021");
		
		
		//
		FileOutputStream fos = new FileOutputStream("D:\\Car.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(c);
	    
	    // De-serializing 'a'
	    FileInputStream fis = new FileInputStream("D:\\Car.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Car b = (Car)ois.readObject(); 
	    // down-casting object
	    
	    System.out.print("Doc tu file Car.txt: " + b.toString());
	
	    // closing streams
	    oos.close();
	    ois.close();
	}

}