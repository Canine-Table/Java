package javaProjectOne;

public class Assignment02 {

	public static void main(String[] args) {

		int bladeCount = 0;
		int diameterOutTolerance = 0;
		int kerfOutTolerance = 0;

		boolean shouldContinue = true;

		while (shouldContinue) {
			CircularSawBlade blade = new CircularSawBlade();
			bladeCount++;

			double diameter;
			double kerf;

			diameter = User.inputPositiveDouble("Enter measured diameter:");
			kerf = User.inputPositiveDouble("Enter measured kerf:");

			blade.setDiameter(diameter);
			blade.setKerf(kerf);

			System.out.println(blade.toString());

			if (CircularSawBladeVerifier.isDiameterInTolerance(blade)) {
				System.out.println("Diameter is within tolerance.");
			} else {
				diameterOutTolerance++;
				System.out.println("Diameter out of tolerance.");
			}

			if (CircularSawBladeVerifier.isKerfInTolerance(blade)) {
				System.out.println("kerf in tolerance.");
			} else {
				kerfOutTolerance++;
				System.out.println("Kerf out of tolerance.");
			}

			System.out.printf("Blades Entered: %d%n", bladeCount);
			System.out.printf("Diameter(s) out of tolerance: %d%n", diameterOutTolerance);
			System.out.printf("Kerf(s) out of tolerance: %d%n", kerfOutTolerance);

			System.out.println("Program by Mossaab El Baste");

			String userInputString;
			userInputString = User.inputString("continue(yes/no)?");

			if (!userInputString.equalsIgnoreCase("yes")) {
				shouldContinue = false;
			}

		}

	}
}
