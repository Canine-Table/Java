package javaSandboxOneLevelOne;

public class ToStringMethod {

	public static void main(String [] args)
		{
			VehiclesClass Corolla = new VehiclesClass("Toyota","Corolla","Blue","Sedan",2023,169,21550,35);
			Corolla.Stats();
			Corolla.Drive();
			Corolla.Stop();
			Corolla.Park();
			System.out.println(Corolla.toString());
			System.out.println(Corolla);
		}
}