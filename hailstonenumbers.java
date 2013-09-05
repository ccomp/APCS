import java.util.Scanner;

public class hailstonenumbers {
	

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);

		System.out.println("What is your initial number?");
		int first = ns.nextInt();


		while (int first%2==0 && int first>1) {
			System.out.print(first);
			System.out.println("\teven, next value is"+ first+"/2");
			int first=first/2;
			return first;
		}

		for (int first%2!=0 && int first>1) {
			System.out.print(first);
			System.out.println("\todd, next value is" + "3*" + first + " +1");
			int first=(3*first)+1;
			return first;
		}

		if (int first == 1 ) {
			System.out.print(first);
			System.out.println("\tstop calculation");
		}





	}


}