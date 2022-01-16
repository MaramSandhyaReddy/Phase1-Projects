//Write a program which will take a string as input and will convert it in to other primitive data types

package assignment;

public class Program_1 {

	public static void main(String[] args) {
		// String into other primitive data types
		
				String s="123";
				int i=Integer.parseInt(s);//Converts string into integer
				
				String s1="223.33"; 
				  
				 double d=Double.parseDouble(s1);//convert string to double 
				 System.out.println(i);//123223.33 
				 System.out.println(i+d);//123+223.33
				 
				String s2="1.1";
				float f=Float.parseFloat(s2);// convert string into float
				System.out.println(f);
				
				String s3="true";
				boolean b = Boolean.parseBoolean(s3);// convert String into boolean
				System.out.println(b);

	}

}
