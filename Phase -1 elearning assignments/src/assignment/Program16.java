//16.You are given a project to demonstrate the uses of the throws, throw, finally, and custom exceptions in Java.
package assignment;

import java.io.IOException;

class Example_Throws { 
    //declare exception using throws in the method signature
  void testMethod(int num) throws IOException, ArithmeticException{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ArithmeticException("ArithmeticException");
  } }

public class Program16 {
	
	public static void main(String args[])
	{
	  // throw keyword
		int a=45,b=0,rs;
       System.out.println("Declaring the Exception using throw");
        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                rs = a / b;
                System.out.print("\n\tThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        
     // finally
        
        int[] array = new int[3];
        try 
        {
            array[7] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        { 
        	System.out.println("finally block executed");
            System.out.println("The array is of size " + array.length);
        }
        
        System.out.println("Declaring the exception using throws");
        try{ 
            //this try block calls the above method so handle the exception
          Example_Throws obj=new Example_Throws(); 
          obj.testMethod(1); 
        }catch(Exception ex){
          System.out.println(ex);
         } 
          
        
       
	}
	
	


}
