package shape3d;

import java.util.Scanner;

/**
 *  27/08/2018
 * @author Chiko Mutandwa
 */
public abstract class Shape3D {
private double length;
public abstract double volume();

    public Shape3D(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double height, widith, length;
        System.out.println("Enter the length of the object");
        length = input.nextDouble();
        System.out.println("Enter the widith of the object");
        widith = input.nextDouble();
        System.out.println("Enetr the height of the object");
        height = input.nextDouble();
    Cube cm = new Cube(length);
    Cuboid cm1 = new Cuboid(height, widith, length);
        System.out.println("The volume of the cube is " + cm.volume());
        System.out.println("The volume of the cuboid is " + cm1.volume());
    }
    
}
class Cube extends Shape3D{
    public Cube(double length) {
        super(length);
    }
    @Override
    public double volume() {
        return super.getLength() * super.getLength() * super.getLength();
    }
    
}
class Cuboid extends Shape3D{
    double height, widith;
    public Cuboid(double height, double widith, double length) {
        super(length);
        this.height = height;
        this.widith = widith;
    }
    @Override
    public double volume() {
        return super.getLength() * this.height * this.widith;
    }
    
}