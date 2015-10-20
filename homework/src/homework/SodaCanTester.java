package homework;

public class SodaCanTester {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SodaCan sodacan = new SodaCan(2.0,3.0);
        System.out.print("Volume: ");
        System.out.println(sodacan.getVolume());
        System.out.print("Surface Area: ");
        System.out.println(sodacan.getSurfaceArea());
    }
}
