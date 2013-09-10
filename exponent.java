// import java.util.Scanner;

public class exponent {

	public static void main(String[] args) {
		// Scanner ex = new Scanner(System.in);
		integerPower(2);

	}

	public static void integerPower(int x) {
		double term = x;
		double q=1.0;

		double answer = q*x+1;

		System.out.println("iteration: " + 1);
		System.out.println("term: " + term);

		double y = 2;
		double increment = Math.pow(x, y);
		double factorial = increment/y;

		double trueanswer = factorial + answer;
		System.out.println("sum: " + trueanswer);

		for (int q = 2; q <= 20; q++){

		        term *= x/q;

		        sum += term;

		        System.out.println("time: " + q);

		        System.out.println("term: " + term);

		        System.out.println("sum: " + sum);

		    };
		}
	}
	
}
