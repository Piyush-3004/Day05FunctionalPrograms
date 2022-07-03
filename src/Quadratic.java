import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a = scanner.nextInt();
		System.out.println("Enter value of b");
		int b = scanner.nextInt();
		System.out.println("Enter value of c");
		int c = scanner.nextInt();
		System.out.println("Equation is :"+a+"X^2 + "+b+"X + "+c);
		
		double delta = b*b - 4*a*c;

		if(delta>0.0) {
		double root1 = (-b+Math.sqrt(delta))/(2*a);
		double root2 = (-b+Math.sqrt(delta))/(2*a);
		System.out.println("Roots are"+root1+" and "+root2);
		}
		else if(delta==0) {
			double root1= -b/(2.0*a);
			System.out.println("root is "+root1);
		}
		else
			System.out.println("Roots are not real");
	}

}
