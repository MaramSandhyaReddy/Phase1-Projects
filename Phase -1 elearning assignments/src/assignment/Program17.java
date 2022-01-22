//17.You are given a project to demonstrate a program implementing the concept of exception  handling available in Java and the custom exception handlers.
package assignment;

class MyExeception extends Exception {
	 String str1;
	 MyExeception(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("Program17 Occurred: "+str1) ;
	   }
	}
public	class Program17{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyExeception ("This is My error Message");
		}
		catch(MyExeception exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }

}

