package hw2;

public class Sphere {
	//local variables
	private double radius;	
	
	//constructor, empty balloon
	public Sphere() {
		radius = 0;
	}
	
	//return the volume
	public double getVolume() {
		return (4.0/3.0)*Math.PI*Math.pow(radius, 3);
	}
	
	public double getSurfaceArea() {
		return 4.0*Math.PI*Math.pow(radius, 2);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void addAir(double air) {
		radius = Math.cbrt((3.0*(this.getVolume()+air))/(4.0*Math.PI)); //solve for radius with new air added 
	}
}
