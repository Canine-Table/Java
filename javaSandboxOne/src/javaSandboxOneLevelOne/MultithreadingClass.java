package javaSandboxOneLevelOne;

/** @author Table **/
public class MultithreadingClass
	{
	
		public static void main(String[] args) throws InterruptedException 
			{
				MultithreadingChildClassOne	myThreadOne = new MultithreadingChildClassOne();
				MultithreadingChildClassTwo myThreadTwo = new MultithreadingChildClassTwo();
				MultithreadingChildClassThree myThreadThree = new MultithreadingChildClassThree();
				Thread threadThree = new Thread(myThreadThree);
				MultithreadingChildClassFive myThreadFive = new MultithreadingChildClassFive();
				Thread threadFive = new Thread(myThreadFive);
				myThreadOne.start();
				myThreadOne.join(3000);
				myThreadTwo.start();
				threadThree.start();
				threadFive.setDaemon(true);				
				threadFive.start();
				threadFive.join();
				System.out.println(2/0);
				

			}
	}