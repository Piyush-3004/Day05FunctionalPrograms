import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for int array \n Enter 2 to create Double array ");
		int ch = scanner.nextInt();
		System.out.println("Enter rows");
		System.out.println("Enter columns");
		int rowCount = scanner.nextInt();
		int colCount = scanner.nextInt();
		switch (ch) {
		case 1:
			createIntArray(rowCount, colCount);
			break;
		case 2:
			createDoubleArray(rowCount, colCount);
			break;
		}
	}

	public static void createIntArray(int rowCount, int colCount) {
		Scanner scanner = new Scanner(System.in);
		int arrInt[][] = new int[rowCount][colCount];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				int data = scanner.nextInt();
				arrInt[i][j] = data;
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(arrInt[i][j]);
			}
		}
	}

	public static void createDoubleArray(int rowCount, int colCount) {
		Scanner scanner = new Scanner(System.in);
		double[][] arrDouble = new double[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				double data = scanner.nextDouble();
				arrDouble[i][j] = data;
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(arrDouble[i][j]);
			}
		}
	}

}
