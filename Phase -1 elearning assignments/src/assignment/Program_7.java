//Write a program to demonstrate the uses of map.
package assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Program_7 {

	public static void main(String[] args) {
		
		// hash map  
//		 introduced in 1.2v 
//		• Heterogeneous data allowed 
//		• Data structure is hash table 
//		• duplicate keys are not allowed but values can be duplicate 
//		• random order based on hash code 
//		• only one null key is allowed and multiple null values are allowed.
		
		HashMap<Integer,String> m1=new HashMap<>(); 
		 m1.put(101,"Samsung"); 
		 m1.put(102,"Realme"); 
		 m1.put(103,"Oppo"); 
		 m1.put(104,"Vivo");
		 m1.put(null,"Vivo");
		 System.out.println("Hash Map Objects are : "+m1); 
		 
	// LinkedHashMap
//		 • introduced in 1.4v 
//		 • Heterogeneous data allowed 
//		 • Data structure is hash table 
//		 • duplicate keys are not allowed but values can be duplicate,if we add 
//		 duplicate key it 
//		 • replaces with original one. 
//		 • As per Insertion order 
//		 • only one null key is allowed and multiple null values are allowed.
		 
		 LinkedHashMap<Integer,String> m2=new LinkedHashMap<>(); 
		 m2.put(388,"Rahul"); 
		 m2.put(1,"Pooja"); 
		 m2.put(103,"Riya"); 
		 m2.put(103,"Riya");
		 m2.put(null,"Riya");
		 
		 System.out.println("LinkedHash Map Objects are : "+m2);
		 
	// TreeMap
//		 introduced in 1.2v 
//		 • only homogeneous data allowed ,if we add heterogeneous objects will 
//		 get class cast exception 
//		 • Data structure is Tree 
//		 • duplicate keys are not allowed but values can be duplicate 
//		 • sorting order. 
//		 • Null keys are not allowed. 

		 
		 TreeMap<Integer,String> m3=new TreeMap<>(); 
		 m3.put(105,"Rahul"); 
		 m3.put(103,"Riya"); 
		 m3.put(102,"Pooja");
		 System.out.println("Tree Map Objects are : "+m3);


	}

}
