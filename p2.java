public class p2 {
	//----------------------------------------------------------------
	// For fib sequence < 4mill, find the sum of the even-valued
	// terms, starting with 1 and 2
	//----------------------------------------------------------------
	public static void main(String[] args) {
		int sum = 0;

		int prev1 = 1;
		int prev2 = 2;

		while (prev2 < 4000000) {
			// if even, add to sum
			if (prev2 % 2 == 0)
				sum = sum + prev2;

			int tmp = prev2;
			prev2 = prev2 + prev1;
			prev1 = tmp;
		}

		System.out.println("The sum of even fibonacci terms below 4 million is " + sum);

	}
}
