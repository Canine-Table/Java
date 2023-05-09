package javaProjectOne;



public class CircularSawBlade {



	public static final double EXPECTED_DIAMETER = 7.25; 
	public static final double EXPECTED_KERF = 0.059;
	private double diameter; // Measured diameter in inches
	private double kerf; // Measured kerf in inches
	
	public CircularSawBlade() {
		this(EXPECTED_DIAMETER, EXPECTED_KERF); 
	}
	
	
	public CircularSawBlade(double diameter, double kerf) {
		this.diameter = diameter;
		this.kerf = kerf;
	}

	
	public double getDiameter() {
		return diameter;
	}

	
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	
	public double getKerf() {
		return kerf;
	}

	
	public void setKerf(double kerf) {
		this.kerf = kerf;
	}
	
	public String toString() {
		String result;

	
		result = String.format(
				"""
				diameter: %.4f (inch), width: %.4f (inch) \
				""", diameter, kerf);
		
		return result;
	}
	
}
