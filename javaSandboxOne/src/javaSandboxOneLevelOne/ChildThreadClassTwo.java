package javaSandboxOneLevelOne;

/** @author Table **/

public class ChildThreadClassTwo 
	{
		public class ChildThread extends Thread
			{				
				@Override
				public void run()
					{
						System.out.println("\tActive Thread Count: "+Thread.activeCount());
					}
			}
		
		public static void main(String[] args)
			{
				final ChildThreadClassTwo.ChildThread thread1 = new ChildThreadClassTwo().new ChildThread();
				final ChildThreadClassTwo.ChildThread thread2 = new ChildThreadClassTwo().new ChildThread();
				final ChildThreadClassTwo.ChildThread thread3 = new ChildThreadClassTwo().new ChildThread();
				ThreadClassTwo thread4 = new ThreadClassTwo();
				
				Thread.currentThread().setName("Main");
				System.out.println("\n\tThread Name: "+Thread.currentThread().getName());
				Thread.currentThread().setPriority(10);
				System.out.println("\tActive Threads: "+Thread.activeCount());
				System.out.println("\tPriority: "+Thread.currentThread().getPriority());
				System.out.println("\tThread Hash: "+Thread.currentThread().hashCode());
				System.out.println("\tThread ID: "+Thread.currentThread().threadId());
				System.out.println("\tAlive: "+Thread.currentThread().isAlive());
				System.out.println("\tDaemon: "+Thread.currentThread().isDaemon());
				System.out.println("\tState Values: "+Thread.State.values());
				System.out.println("\tUncaught Exception Handler: "+Thread.UncaughtExceptionHandler.class);
				System.out.println("\tBuilder: "+Thread.Builder.class);
				System.out.println("\tState: "+Thread.currentThread().getState());
				System.out.println("\tContext Class Loader: "+Thread.currentThread().getContextClassLoader());
				System.out.println("\tStack Trace: "+Thread.currentThread().getStackTrace()+"\n");

				for(int i=5;i>=0;i--)
					{
						try 
							{
								Thread.sleep(0);
							} catch (InterruptedException e) 
								{
									e.printStackTrace();
								}
						System.out.println("\t("+i+") more Seconds until Main is awake.");
					}
				
				


				thread4.start();
				thread1.start();
				thread1.setName("Thread-1");
				System.out.println("\n\tThread Name: "+thread1.getName());
				thread1.setPriority(1);
				System.out.println("\n\tThread Priority: "+thread1.getPriority()+"\n");

				thread2.start();
				thread2.setName("Thread-2");
				System.out.println("\tThread Name: "+thread2.getName());
				thread2.setPriority(2);
				System.out.println("\tThread Priority: "+thread2.getPriority()+"\n");

				thread3.start();
				thread3.setName("Thread-3");
				System.out.println("\tThread Name: "+thread3.getName());
				thread3.setPriority(3);								
				System.out.println("\n\tThread Priority: "+thread3.getPriority()+"\n");

				
				thread4.setName("Thread-4");
				System.out.println("\tThread Name: "+thread4.getName());
				thread4.setPriority(4);
				System.out.println("\n\tThread Priority: "+thread4.getPriority());
				thread4.setDaemon(true);
				System.out.println("\n\tDaemon Thread: "+thread4.isDaemon());

			
			}
	}