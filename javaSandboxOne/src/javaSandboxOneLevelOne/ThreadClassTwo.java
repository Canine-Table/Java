package javaSandboxOneLevelOne;

/** @author Table **/

public class ThreadClassTwo extends Thread
	{			
		@Override
		public void run()
			{
				System.out.println("\tThis thread is running.");
				System.out.println("\tActive Thread Count: "+Thread.activeCount());
			}
	}