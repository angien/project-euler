import java.util.ArrayList;
import java.util.Iterator;

public class p3 {

	//----------------------------------------------------------------
	// Helper method that returns ArrayList of prime factors of x
	//----------------------------------------------------------------
	private static ArrayList<Long> getPrimeFactors(long x) {
		long num = x;
		ArrayList<Long> pfactors = new ArrayList<Long>();

		long i = 2;
		// break it alllll down into just prime numbers!
		while (num > 1) {
			// is a factor
			while (num % i == 0) {
				pfactors.add(i);
				num = num / i;
			}
			i++;
		}

		return pfactors;
	}

	//----------------------------------------------------------------
	// Find the largest prime factor of some number args[0]
	//----------------------------------------------------------------
	public static void main(String[] args) {
		try {
			if (args.length != 1)
				throw new Exception();

			// actual computation
			long num = new Long(args[0]);
			ArrayList<Long> pfactors = getPrimeFactors(num);
			Iterator<Long> it = pfactors.iterator();

			long largest = 1;

			// get largest factor
			while (it.hasNext()) {
				long tmp = it.next();
				if (tmp > largest) 
					largest = tmp;
			}
			
			System.out.println("The largest prime factor of " + num + " is " + largest);

		} 
		catch (Exception e) {
			System.out.println("Usage: java p3 <input number>");
			return;
		}

	}

}
