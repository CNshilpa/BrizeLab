import java.util.Scanner;

public class Fibonacci {
	static int fib(int n) {
		if (n <= 1)

			return n;

		return fib(n - 1) + fib(n - 2);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = scanner.nextInt();
		scanner.close();
		int result = fib(num);
		for (int i = 0; i < result; i++) {
			System.out.println("Fibonacci series are :" + fib(i));
		}

	}

}
