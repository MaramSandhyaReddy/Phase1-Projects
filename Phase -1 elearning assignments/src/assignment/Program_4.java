//Write a program to demonstrate different methods of different return types.
package assignment;

public class Program_4 {

	//static method without specific return type and with arguments
		public static void registration(String name,String email,long contact)
		 {
		 System.out.println("Name :"+name);
		 System.out.println("Email address:"+email);
		 System.out.println("Contact details: "+contact); 
		 }
		
	// method with return type
		public static String sname()
		 {
			 return "abcd";
		 }
		public static long phnofield()
		 {
		 return 1234567890;
		 }
		 public static char genderfield()
		 {
		 return 'M';
		 }
		 public static int empId()
		 {
			 return 12345678;
		 }
		//non-static method without specific return type and with arguments
			public  void registration1(String name,String email,long contact)
			 {
			 System.out.println("Name :"+name);
			 System.out.println("Email address:"+email);
			 System.out.println("Contact details: "+contact); 
			 }
			//non-static method with return type
			public  String sname1()
			 {
				 return "abcd";
			 }
			public  long phnofield1()
			 {
			 return 1234567890;
			 }
			 public char genderfield1()
			 {
			 return 'M';
			 }
			 public  int empId1()
			 {
				 return 12345678;
			 }
		
		 
		
		public static void main(String[] args) {
			
			System.out.println("Static methods with and without arguments");
			registration("Abc","abc123@gmail.com",1234567890);
			System.out.println("Name : "+sname());
			System.out.println("Adhar Details : "+phnofield());
			System.out.println("Gender : "+genderfield());
			System.out.println("Emp Id : "+empId());
			
			//object creation for non static members
		Program_4 p=new Program_4();
		
		
		System.out.println("Non-Static methods with and without arguments");
			p.registration1("Abc","abc123@gmail.com",1234567890);
			System.out.println("Name : "+p.sname1());
			System.out.println("Adhar Details : "+p.phnofield1());
			System.out.println("Gender : "+p.genderfield1());
			System.out.println("Emp Id : "+p.empId1());
			
			
			

		

	}

}
