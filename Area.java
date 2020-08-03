import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		double radius;
		double area;
		final double PIE_ = 3.14;
		Scanner input_radius = new Scanner(System.in);
		System.out.println("Enter radius value....");
		radius = input_radius.nextDouble();
		area = PIE_ * radius * radius;
		System.out.println("Area of a circle is " + area);
		// TODO Auto-generated method stub

	}

}
