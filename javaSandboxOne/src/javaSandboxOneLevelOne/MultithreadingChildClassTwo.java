package javaSandboxOneLevelOne;

/** @author Table **/
public class MultithreadingChildClassTwo extends Thread
	{		
		@Override
		public void run()
			{
				for(int i=0;i<10;i++)
					{
						System.out.println("\n\tThread #2: ("+i+")");
						try 
						{
							Thread.sleep(1000);
						} catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
					}
				System.out.println("\n\tThread #2 has been completed.");
			}
	}