package javaProjectOne;




public class CircularSawBladeVerifier {
	public static final double EPSILON = 0.015625;
	public static final double EXPECTED_DIAMETER = 7.25; 
	public static final double EXPECTED_KERF = 0.059;
	
	
	private CircularSawBladeVerifier() {}
	
	
	public static boolean isDiameterInTolerance(CircularSawBlade blade) {
        if ((EXPECTED_DIAMETER - blade.getDiameter() <= EPSILON)
                && (blade.getDiameter() - EXPECTED_DIAMETER <= EPSILON)) {
            return true;
        }

        return false; // placeholder so the code will compile, update with the actual true or false
    }

    public static boolean isKerfInTolerance(CircularSawBlade blade) {
        if ((EXPECTED_KERF - blade.getKerf() <= EPSILON) && (blade.getKerf() - EXPECTED_KERF <= EPSILON)) {
            return true;
        }

        return false; // placeholder so the code will compile, update with the actual true or false
    }
    }

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */
