package javaSandboxOneLevelOne;

/** @author Table **/
public class MultithreadingChildClassFive implements Runnable 
	{
		@Override
		public void run() 
			{
				for(int i=10;i>0;i--)
					{
						System.out.println("\n\tThread #1: ("+i+")");
						try 
							{
								Thread.sleep(1000);
							} catch (InterruptedException e) 
								{
									e.printStackTrace();
								}
					}
				System.out.println("\n\tThread #5 has been completed.");
			}
	
	}