import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		scanner.close();
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}

		System.out.println("Reversed Number:" + rev);
	}

}
