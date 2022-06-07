import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = scanner.nextInt();
		scanner.close();
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}

		}
		if (sum == num)

			System.out.println(num + " is Perfect Number");

		else
			System.out.println(num + " is not perfect Number");
	}
}
