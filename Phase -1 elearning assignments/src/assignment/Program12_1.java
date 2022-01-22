//12.You are given a project to demonstrate the implementation of thread creation mechanisms.
package assignment;

	public class Program12_1 extends Thread {

		
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	 		Program12_1  mt = new Program12_1();
	  		mt.start();
	 	}
	

}

