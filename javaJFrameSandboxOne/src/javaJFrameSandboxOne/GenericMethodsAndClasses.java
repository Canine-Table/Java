package javaJFrameSandboxOne;

/** @author Table **/
@SuppressWarnings("unused")
public class GenericMethodsAndClasses 
	{
	
		public static <Thing> void displayArray(Thing[] array)
			{
				for(Thing i : array)
					{
						System.out.print(i+" ");
					}
				System.out.println();
			}
		

		public static <Thing> Thing displayThings(Thing[] array)
			{
				return array[0];
			}
		
		public static void main(String[] args)
			{
			Integer[] intArray = {0,1,2,3,4,5,6,7,8,9};
			Double[] doubleArray = {0.0,1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
			Character[] charArray = {'h','e','l','l','o'};
			String[] stringArray = {"B","y","e"};
			
			displayArray(intArray);
			displayArray(doubleArray);
			displayArray(charArray);
			displayArray(stringArray);
			
			System.out.println(displayThings(intArray));
			System.out.println(displayThings(doubleArray));
			System.out.println(displayThings(charArray));
			System.out.println(displayThings(stringArray));

			}
	}