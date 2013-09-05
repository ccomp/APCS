import java.util.Scanner;

public class exponent {

	public static void main(String[] args) {
		Scanner ex = new Scanner(System.in);

		System.out.println("Enter x");
		integerPower();

	}

	public double integerPower() {
		double a = ex.nextDouble();
		double b = 2;
		double increment = Math.pow(a, b);
		double factorial = increment/b;

		for (double i>0.0000000000001; a++; b++) {
			System.out.println(factorial);
		}
		return factorial();
	}
	
}