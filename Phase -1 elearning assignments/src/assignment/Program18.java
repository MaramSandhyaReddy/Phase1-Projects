//18.You are given a project to demonstrate the create, read, update, and delete operations on the files in Java.
package assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program18 {
	
	
	public static void main(String[] args) {
		
		
		
		// Create File
		
		        File myFile = new File("javadiscover.txt");
		        try{
		        if(!(myFile.exists())){ // checking file exist or not
		            myFile.createNewFile(); // Creating new file
		            System.out.println("New File created....");
		        }else{
		            System.out.println("File already exisit....");
		        }
		        }catch (IOException e) {
		            e.printStackTrace();
		        }
		        
		// Write File 
		
		        FileWriter fWrite = null;
		        BufferedWriter bWrite = null;
		        
		        String content = "Hi All, Welcome to Java Discover";
		        File myFile1 = new File("javadiscover.txt");
		        
		        try{
		            if(!(myFile1.exists())){
		                myFile1.createNewFile();
		        }
		        fWrite = new FileWriter(myFile1, true); // true for appending content to the existing file
		            bWrite = new BufferedWriter(fWrite);
		            bWrite.write(content);
		            bWrite.close();
		            
		            System.out.println("File write complete.....");
		            
		        }catch (IOException e1) {
		            e1.printStackTrace();
		        }finally{
		            if(fWrite != null) 
		                try { fWrite.close(); } catch (IOException e1) { e1.printStackTrace(); }
		            if(bWrite != null) 
		                try { bWrite.close(); } catch (IOException e1) { e1.printStackTrace(); }            
		        }
		        
		 // Delete File
		        
		        try{
		            File myFile2 = new File("javadiscover.txt");
		            if(myFile2.exists()){
		                myFile2.delete();
		                System.out.println("File deleted successfully....");
		            }else{
		                System.out.println("File NOT Exisit....");
		            }
		        }catch (Exception e) {
		            e.printStackTrace();
		        }
		          
		}

}
