package oop.classes;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Radius: " + circle.getRadius() + "\nArea: " + circle.getArea());
		
		Circle circle2 = new Circle(2.0);
		System.out.println("Radius: " + circle2.getRadius() + "\nArea: " + circle2.getArea());
		
		Circle circle3 = new Circle(3.0, "blue");
		System.out.println("Radius: " + circle3.getRadius() + "\nArea: " + circle3.getArea());
		
		Circle circle4 = new Circle();
		circle4.setRadius(5.0);
		System.out.println("radius is: " + circle4.getRadius());
		circle4.setColor("BLUE");
		System.out.println("color is: " + circle4.getColor());
		
		System.out.println(circle4.toString());
	}

}
