public class Sums134Memoization {
	static long[] D;

	static long compute(int n) {
		// Handle the base cases when n <= 4.
		if( .. ) return .. ;
		..
	
		if(D[n] == 0) {
			// Use the recurrence here!
			D[n] = ..;		
		}

		return D[n];
	}

	// No need to change the code below.
	public static void main(String[] args) {
		for(int n = 1; n <= 40; n++) {
			D = new long[n+1];
			long answer = compute(n);

			System.out.println(String.format(
			  "D[%d] = %d", n, answer));
		}
	}
}
