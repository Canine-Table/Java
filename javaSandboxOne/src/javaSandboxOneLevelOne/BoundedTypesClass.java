package javaSandboxOneLevelOne;

public class BoundedTypesClass <Thing1 extends Number, Thing2 extends Number>
	{
		Thing1 x;
		Thing2 y;
		BoundedTypesClass(Thing1 x, Thing2 y)
			{
				this.x = x;
				this.y = y;
			}
		
		public static void main(String[] args)
			{
				BoundedTypesClass<Double,Integer> myOne = new BoundedTypesClass<>(3.3,1);
				System.out.println(myOne.x);
				System.out.println(myOne.y);
			}
	}