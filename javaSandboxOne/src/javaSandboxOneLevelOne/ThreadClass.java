package javaSandboxOneLevelOne;

/** @author Table **/
public class ThreadClass extends Thread
	{
		@Override
		public void run()
			{
				System.out.println("");
			}
			
		/**
		 * 
		 *	Thread = A thread of execution in a program 
		 *  (kind of line a virtual CPU). The Java Virtual
		 *  Machine allows an application to have multiple
		 *  threads running concurrently. 
		 *  Each thread has a priority
		 *  Each thread can execute parts of your code in 
		 *  parallel with the main thread
		 *  Threads with higher priority are executed in preference
		 *  compared to threads with a lower priority
		 * 
		 * The Java Virtual Machine (JVM) continues to execute threads
		 * until either of the following occurs:
		 * 
		 * 		1. The exit method of the class Runtime is called.
		 * 		2. All user threads have died
		 * 
		 * When the Java Virtual Machine (JVM) starts up, there is a thread
		 * which calls the main method. 
		 * This thread is called 'main'
		 * 
		 * 
		 * 
		 **/
		
		@SuppressWarnings("preview")
		public static void main(String[] args) 
			{
				try
					{
						Thread.sleep(1000);
					} catch(InterruptedException e)
						{
							e.getStackTrace();
						}
				
				Thread.currentThread().setName("Main");
				Thread.currentThread().setPriority(10);
				System.out.println("Thread Name: "+Thread.currentThread().getName());
				System.out.println("Thread ID: "+Thread.currentThread().threadId());
				System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
				System.out.println("Thread is Alive: "+Thread.currentThread().isAlive());
				System.out.println("Thread is a Daemon: "+Thread.currentThread().isDaemon());
				System.out.println("Thread is Virtual: "+Thread.currentThread().isVirtual());
				System.out.println("Thread Hashcode: "+Thread.currentThread().hashCode());							
				
				ChildThreadClass thread2 = new ChildThreadClass();
				ChildThreadClass thread3 = new ChildThreadClass();
				ChildThreadClass thread4 = new ChildThreadClass();
				ThreadClass thread5 = new ThreadClass();
				
				thread2.start();
				System.out.println();
				System.out.println("Thread2 Priority: "+thread2.getPriority());
				System.out.println("Thread2 ID: "+thread2.threadId());
				System.out.println("Thread2 is Alive: "+thread2.isAlive());
				thread2.setName("Thread2");
				System.out.println("Thread2 Name: "+thread2.getName());

				
				thread3.start();
				System.out.println();
				System.out.println("Thread3 Priority: "+thread3.getPriority());
				System.out.println("Thread3 ID: "+thread3.threadId());
				System.out.println("Thread3 is Alive: "+thread3.isAlive());				
				
				thread4.start();
				System.out.println();
				System.out.println("Thread4 Priority: "+thread4.getPriority());
				System.out.println("Thread4 ID: "+thread4.threadId());
				System.out.println("Thread4 is Alive: "+thread4.isAlive());				
				
				thread5.start();
				System.out.println();
				System.out.println("Thread5 Priority: "+thread5.getPriority());
				System.out.println("Thread5 ID: "+thread5.threadId());
				System.out.println("Thread5 is Alive: "+thread5.isAlive());				

				System.out.println();
				System.out.println("Active Thread Count: "+Thread.activeCount());

			}
	}