import java.util.Scanner;

public class exponent {

	public static void main(String[] args) {
		Scanner ex = new Scanner(System.in);
		integerPower(2);

	}

	public static void integerPower(int x) {
		double term = x;
		double n=1.0;

		double answer = n*x+1;

		System.out.println("iteration: " + 1);
		System.out.println("term: " + term);

		double y = 2;
		double increment = Math.pow(x, y);
		double factorial = increment/y;

		double trueanswer = factorial + answer;
		System.out.println("sum: " + trueanswer);

		for (double i=1; i>1.0E-12; i=i/10) {
			while (n<=20) {
				n=2;
				n++;
				y++;
				answer+=term;
				term = x*i;
				x++;
			}

		}
	}
	
}