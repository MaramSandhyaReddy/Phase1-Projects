//Write a program to search a specific string from the given set of strings using regular expressions.
package assignment;

public class Program11 {

	public static void main(String[] args) {
		
		// search specific String 
				String str="This is Sandhya";
				int index = str.indexOf("Sandhya");
				if(index==-1)
				{
					System.out.println("Sandhya not Found");
				}
				else
				{
					System.out.println("Sandhya is Found at index of "+index);
				}
			}


	

}
