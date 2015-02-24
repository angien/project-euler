public class p1 {
	//----------------------------------------------------------------
	// Find the sum of all multiples of 3 or 5 below args[0], in this 
	// case, 1000
	//----------------------------------------------------------------
	public static void main(String[] args) {
		try {
			if (args.length != 1)
				throw new Exception();

			int num = new Integer(args[0]);
			int sum = 0;

			for (int i = 0; i < num; i++) {
				if (i % 3 == 0 || i % 5 == 0)
					sum = sum + i;
			}

			System.out.println("The sum of all multiples of 3 or 5 below " 
				+ num + " is " + sum);

		} 
		catch (Exception e) {
			System.out.println("Usage: java p1 <input number>");
			return;
		}

	}
}
