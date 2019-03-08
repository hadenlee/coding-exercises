public class Sums134Iterative {
	static long compute(int n) {
		long[] D = new long[1024];

		// Handle base cases.
		D[1] = ..;
		D[2] = ..;
		..

		for(int i = ..; i <= n; i++) {
			// Use the recurrence.
			D[i] = .. ;
		}

		return D[n];
	}

	// Do not change the code below.
	public static void main(String[] args) {
		for(int n = 1; n <= 40; n++) {
			System.out.println(String.format(
				"D[%d] = %d", n, compute(n) ));
		}
	}
}

