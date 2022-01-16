//Write a program to search a string entered by a user from the array of strings.
package assignment;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		
		// search specific String 
				String str="sky is blue";
				String str1 = str.toLowerCase();
				Scanner sc=new Scanner(System.in);
				System.out.println("Search here");
				String word = sc.next();
				int index = str1.indexOf(word);
				if(index==-1)
				{
					System.out.println(word+" not Found");
				}
				else
				{
					System.out.println(word+" is Found at index of "+index);
				}

	}

}
