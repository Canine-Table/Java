package theSandboxOne;

import java.util.Random;

public class DiffieHellman {

	Random random = new Random();
	String user;
	long digit = random.nextLong(21)+1;
	static int P = 23;
	static int Y = 17;
	long A = 0;
	long B = 0;
	

	
	public DiffieHellman( String _User)
	{
		this.user = _User;
		long digit = random.nextLong(21)+1;
		this.digit = digit;
		
	}
	public static void main(String args[])
	{
		DiffieHellman Bob = new DiffieHellman("Bob");
			System.out.println( "Bob has the random intiger of: " + Bob.digit);
			for (int i = 0; i <= Bob.digit; i++ ) 
			{


			}
		DiffieHellman Alice = new DiffieHellman("Alice");
			System.out.println( "Alice has the random intiger of: " + Alice.digit );
			for (int i = 0; i <= Alice.digit; i++ ) 
				{
				}
	}
}
