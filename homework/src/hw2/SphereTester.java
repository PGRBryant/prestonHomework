package hw2;


public class SphereTester {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        
        System.out.print("Volume: ");
        System.out.println(sphere.getVolume());
        System.out.print("Surface Area: ");
        System.out.println(sphere.getSurfaceArea());
        System.out.print("Radius: ");
        System.out.println(sphere.getRadius());
        
        //now let's add some VOLUME.
        System.out.println("adding dat volume");
        sphere.addAir(100.0);
        System.out.print("Volume: ");
        System.out.println(sphere.getVolume());
        System.out.print("Surface Area: ");
        System.out.println(sphere.getSurfaceArea());
        System.out.print("Radius: ");
        System.out.println(sphere.getRadius());
        
        //MORE COWBELL. I mean, volume.
        System.out.println("IT'S GONNA BLOWW!!!");
        sphere.addAir(100.0);
        System.out.print("Volume: ");
        System.out.println(sphere.getVolume());
        System.out.print("Surface Area: ");
        System.out.println(sphere.getSurfaceArea());
        System.out.print("Radius: ");
        System.out.println(sphere.getRadius());
    }
}
