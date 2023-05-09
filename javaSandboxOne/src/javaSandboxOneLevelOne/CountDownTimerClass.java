package javaSandboxOneLevelOne;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/** @author Table **/

public class CountDownTimerClass 
	{
		static int counter = 10;
		public static void main(String[] args)
			{
				/**
				 * 
				 * Timer = A facility for threads to schedule tasks
				 *         for future execution in a background thread
				 * 
				 * TimerTask = A task that can be scheduled for one-time 
				 * 			   or repeated execution by a Timer.
				 * 
				 **/

				Timer timer = new Timer();
				TimerTask task = new TimerTask() 
					{
						@Override
						public void run() 
							{
								if (counter>=0) 
									{
										System.out.println("("+counter+") seconds.");
										counter--;
									}
								else 
									{
										System.out.println("Happy new year!");
										timer.cancel();
									}
							}	
					};
				
				Calendar date = Calendar.getInstance();
				date.set(Calendar.YEAR,2023);
				date.set(Calendar.MONTH,Calendar.JANUARY);
				date.set(Calendar.DAY_OF_MONTH,6);
				date.set(Calendar.HOUR_OF_DAY,12);
				date.set(Calendar.MINUTE,53);
				date.set(Calendar.SECOND,20);
				date.set(Calendar.MILLISECOND,38);					
				timer.schedule(task,date.getTime(),1000);

			}
	}
