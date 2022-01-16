//Write a program to demonstrate the uses of collections and its types.
package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Program_6 {

	public static void main(String[] args) {
		
		// Array List
				ArrayList a1=new ArrayList();
				a1.add("Java"); 
				a1.add(111); //a1.add(Integer.valueOf(111))
				a1.add(66.5f); //a1.add(Float.valueOf(66.5f))
				a1.add('A'); //a1.add(Character,valueOf('A');
				System.out.println("Collection Objects are : "+a1);
			// PriorityQueue
				PriorityQueue<Object> q1=new PriorityQueue<>(); 
				q1.add("JAVA"); 
				q1.add("HTML"); 
				q1.add("CSS"); 
				q1.add("SOAP"); 
				q1.add("AWS"); 
				q1.add("Selenium"); 
				System.out.println(q1.peek()); 
				System.out.println(q1.poll()); 
				System.out.println(q1.contains("AWS")); 
				while(q1.peek()!=null) 
				{ 
				System.out.println(q1.poll()); 
				} 
				 System.out.println("After while loop : "+q1); 
				 
			// LinkedList Queue
				 
				 Queue<Object> q=new LinkedList<>(); 
				 q.add("JAVA"); 
				 q.add("HTML"); 
				 q.add("CSS"); 
				 q.add("SOAP"); 
				 q.add("AWS"); 
				 q.add("Selenium"); 
				 while(q1.peek()!=null) 
				 { 
				 System.out.println("LinkedList Queue"+q.poll()); 
				 }
			//Hashset
				 
				 HashSet s1=new HashSet(); 
				 s1.add("java"); 
				 s1.add(1223); 
				 s1.add("selenium"); 
				 s1.add(88.9f); 
				 
				 java.util.Iterator i1=s1.iterator(); 
				 System.out.print("HashSet : ");
				 while(i1.hasNext()) 
				 { 
				 System.out.print(i1.next()+" "); 
				 }
				 System.out.println();
			//TreeSet
				 
				 TreeSet<Object> s2=new TreeSet<>(); 
				 s2.add("Rohan"); 
				 s2.add("Riya"); 
				 s2.add("Pooja"); 
//				 s2.add(445); 
//				 s2.add('A'); 
				 System.out.println("Tree set objectss are: "+s1);
				 
			// LinkedHashSet
				 
				 LinkedHashSet<Object> s3=new LinkedHashSet<>(); 
				 s3.add("Rohan"); 
				 s3.add("Riya"); 
				 s3.add("Pooja"); 
				 s3.add(445); 
				 s3.add('A'); 
				 System.out.println("LinkedHash set objectss are: "+s3); 
				 s3.add("Riya"); 
				 s3.add(445); 
				 System.out.println("After add duplicates: "+s3); 
				 s3.add(null); 
				 s3.add(null); 
				 System.out.println("After adding null objects: "+s3); 
				 System.out.println("-------Forward direction-----"); 
				 java.util.Iterator<Object> i2=s3.iterator(); 
				 while(i1.hasNext()) 
				 { 
				 System.out.println(i2.next()); 
				 } 	


	}

}
