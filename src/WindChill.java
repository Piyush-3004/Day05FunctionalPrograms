import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit Less than 50 ");
		double t = scanner.nextDouble();
		System.out.println("Enter v in miles per hour in range 3 to 120 ");
		double v = scanner.nextDouble();
		
		double x = (0.4275*t - 35.75);

		double y = x* Math.pow(v, 0.16);
		double w = 35.74+0.6215*t +y;
		
		System.out.println("value of w is : "+ w);

	}

}
