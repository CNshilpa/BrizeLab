import java.util.Scanner;

public class PrimeNumber {

	static void prime(int n) {
		for (int j = 2; j <= n; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(j + " ");
			}
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = scanner.nextInt();
		scanner.close();
		System.out.println("The prime numbers between 1 to " + n + " are ");
		prime(n);
	}
}