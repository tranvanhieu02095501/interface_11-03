package student;
  

import java.io.*;

public class ListSV {

	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s = new Student("Tran Van Hieu", "09-01-1000", '1', 8.5, 4);
		
		
		//Clone
		Student s2 = (Student) s.clone();
		System.out.println("Clone:");
		
		System.out.println("s2: " + s2.toString());
		
		//Seriable
		//
		FileOutputStream fos = new FileOutputStream("D:\\Student.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(s);
	    
	    // De-serializing 'a'
	    FileInputStream fis = new FileInputStream("D:\\Student.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Student b = (Student)ois.readObject(); // down-casting object
	    
	    System.out.print("Sau khi down-cast: ");
	    System.out.println(b.toString());
	
	    // closing streams
	    oos.close();
	    ois.close();
	    
	    //Compare
	    System.out.println("Compare");
	    Student c = new Student("Trần Văn Hi", "19-22-2002", '1', 5, 4);
	    
	    System.out.print("So sanh " + s.getFullName() + " co gpa " + s.getGpa() + " va Social Activities " + s.getSocialActivities() + " voi ");
	    System.out.println(c.getFullName() + " voi gpa: " + c.getGpa() + " va Social Acts " + c.getSocialActivities());


	    int result = s.compareTo(c);
	    if(result == 1)
	    	System.out.println(s.getFullName() + " gioi hon " + c.getFullName());
	    else if(result == 0)
	    	System.out.println(s.getFullName() + " gioi bang " + c.getFullName());
	    else if(result == -1)
	    	System.out.println(s.getFullName() + " kem hon " + c.getFullName());
	}

}