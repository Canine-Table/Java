package javaSandboxOneLevelOne;

public class MultithreadingChildClassThree implements Runnable
	{
		@Override
		public void run() 
			{
				for(int i=10;i<20;i++)
					{
						System.out.println("\n\tThread #3: ("+i+")");
						try 
						{
							Thread.sleep(1000);
						} catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
					}
				System.out.println("\n\tThread #3 has been completed.");
			}
	}