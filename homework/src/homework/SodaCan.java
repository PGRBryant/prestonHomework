package homework;

public class SodaCan {
	
	//local variables
	private double diameter;
	private double height;
	
	
	//constructor
	public SodaCan(double d, double h)
	{
		diameter = d;
		height = h;
	}
	
	//return the volume
	public double getVolume() {
		return Math.PI*Math.pow(diameter/2.0, 2)*height;
	}
	
	public double getSurfaceArea() {
		return Math.PI*(diameter)*height + 2.0*Math.PI*Math.pow(diameter/2.0, 2);
	}

}
