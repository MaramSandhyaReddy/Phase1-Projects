//Write a program to create single-dimensional and multidimensional arrays.
package assignment;

public class Program10 {

	public static void main(String[] args) {
		
		
		// Single Dimensional Array
			
			int numbers[]= {10,20,30};
			System.out.print("Single Dimensional Array : ");
			for(int number:numbers) {
				System.out.print(number+" ");
			}
			
		// MultiDimensional Array
			System.out.println();
			System.out.println("Multidimensional Array : ");
			{
			int[][] arr=new int[10][20];
			arr[0][0]=1;
			arr[0][1]=2;

			for(int i=0;i<1;i++) { 
				 for(int j=0;j<2;j++) { 
				 System.out.println("Value at arr["+i+"]["+j+"]th : "+arr[i][j]);
				 }} 

			}

	}

}
