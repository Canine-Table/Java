package javaSandboxOneLevelOne;


@SuppressWarnings("unused")
public class GenericClass <Thing>
	{
	
		Thing x;
		GenericClassInteger ClassInteger = new GenericClassInteger(4);
		GenericClassDouble ClassDouble = new GenericClassDouble(4.4);
		GenericClassFloat ClassFloat = new GenericClassFloat(95.3f);
		GenericClassCharacter ClassCharacter = new GenericClassCharacter('@');
		GenericClassLong ClassLong = new GenericClassLong(4l);
		GenericClassString ClassString = new GenericClassString("s");
		
		
		GenericClass(Thing x)
				{
					this.x = x;
				}			
		private Thing getValue()
			{
				return x;
			}

		private static <Thing> void displayArray(Thing[] x)
		{
			for(Thing i : x)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		private class GenericClassInteger
			{
				Integer x;
				GenericClassInteger(Integer x)
					{
						this.x = x;
					}
				
				private Integer getValue()
					{
						return x;
					}
			}		
		
		private class GenericClassDouble
			{
				Double x;
				GenericClassDouble(Double x)
					{
						this.x = x;
					}
				
				private Double getValue()
					{
						return x;
					}
			}	
		
		private class GenericClassFloat
			{
				Float x;
				GenericClassFloat(Float x)
					{
						this.x = x;
					}
				
				private Float getValue()
					{
						return x;
					}
			}	
		
		private class GenericClassCharacter
			{
				Character x;
				GenericClassCharacter(Character x)
					{
						this.x = x;
					}
				
				private Character getValue()
					{
						return x;
					}
			}		

		private class GenericClassString
			{
				String x;
				GenericClassString(String x)
					{
						this.x = x;
					}
				
				private String getValue()
					{
						return x;
					}
			}		
			
		private class GenericClassLong
		{
			Long x;
			GenericClassLong(Long x)
				{
					this.x = x;
				}
			
			private Long getValue()
				{
					return x;
				}
		}		
		
		public static void main(String[] args)
			{
				GenericClass<String> mySting = new GenericClass<>("Sting");
				GenericClass<Character> myCharacter = new GenericClass<>('@');
				GenericClass<Long> myLong = new GenericClass<>(44l);
				GenericClass<Float> myFloat = new GenericClass<>(44.44f);
				System.out.println();

				System.out.println(mySting.getValue());
				System.out.println(myCharacter.getValue());
				System.out.println(myLong.getValue());
				System.out.println(myFloat.getValue());	
				
				Integer[] intArray = {1,2,3,4,5};
				Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
				Character[] characterArray = {'!','@','#','$','%'};
				String[] stringArray = {"One","Two","Three","Four","Five"};
				Long[] longArray = {1l,2l,3l,4l,5l};
				System.out.println();

				displayArray(intArray);
				displayArray(doubleArray);
				displayArray(characterArray);
				displayArray(stringArray);
				displayArray(longArray);
			}
	}