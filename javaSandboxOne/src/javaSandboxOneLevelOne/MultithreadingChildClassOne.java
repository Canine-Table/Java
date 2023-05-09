package javaSandboxOneLevelOne;

/** @author Table **/
public class MultithreadingChildClassOne extends Thread
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
				System.out.println(2/0);
				System.out.println("\n\tThread #1 has been completed.");
			}
	}