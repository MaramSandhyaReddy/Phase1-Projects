//write a program to demonstrate how and when access modifiers are used
package assignment;

public class Program_2 {
	
	//default Access Modifier
		static void message()
		{
			System.out.println("This is default message");
		}
	//public Access Modifier
		
		public static void stdName()
		{
			String name="abcd";
			System.out.println("Student Name : "+name);
		}
	//private Access Modifier
		
		private static void stid()
		{
			int id=1234;
			System.out.println("Student id : "+id);
			
		}
	//protected Access Modifier
		
	    protected static void stcontact()
	    {
	    	long cont=1234567890;
	    	System.out.println("Contact Number : "+cont);
	    }
	    public static void main(String[] args) {
			
	    	//method Invoke
	    		message();
	    		stdName();
	    		stid();
	    		stcontact();
	    }
	
	

}
