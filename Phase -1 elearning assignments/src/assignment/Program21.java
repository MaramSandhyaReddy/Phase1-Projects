//21.Write a program to read, write, and append a file.
package assignment;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

	public class Program21 {
	public static void main(String[] args) {
		
		 
			
			//creating an object of a file
		 File myObj = new File("filename.txt");  
	     
		
			
			if (myObj.exists()) {
				
			//returning the file name
			System.out.println("File name: "+myObj.getName());
			
			//returning the path of the file
			System.out.println("Absolute publicpath: "+myObj.getAbsolutePath());
		
			//displaying whether the file is writable
			System.out.println("Writable: "+myObj.canWrite());
			
			//Displaying whether the file is readable or not
			System.out.println("Readable: "+myObj.canRead());
			
			//Returning the length of the file in bytes
			System.out.println("File size in bytes: "+myObj.length());
			
		}
			else {
				System.out.println("The file doesnot exists");
			}

			//file append
			
			try {
				String data="iam a learner";
				File f1=new File("E:\\java projects\\java programs\\SL_Assignment\\filename.txt");
				if(!f1.exists()) {
					f1.createNewFile();
				}
				FileWriter fileWritter= new FileWriter(f1.getName(),true);
				BufferedWriter bw=new BufferedWriter(fileWritter);
				bw.write(data);
				bw.close();
				System.out.println("done");
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			}
		    }
	
	

