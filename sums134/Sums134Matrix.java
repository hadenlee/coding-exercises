public class Sums134Matrix {
	static long[][] exp(long[][] M, long[][] I, int e) {
		// Handle the base case(s) (assume e >= 0).
		if(..) return ..;

		long[][] result = exp(.., .., ..);
		result = multiply(.., ..);
		if(e % 2 == 1) {
			result = multiply(.., ..);
		}

		return result;
	}

	public static void main(String[] args) {
		long[][] M = new long[][]
		{ new long[]{0, 0, .. },
		  .. 
		};
		long[][] I = new long[][]
		{ new long[]{0, 0, .. },
		  .. 
		};

		// No need to change the code below.

		for(int n = 1; n <= 40; n++) {
			long[][] result = exp(M, I, n); 
			System.out.println(String.format(
				"D[%d] = %d", n, result[0][0])); 
		}
	}

	// No need to change the code below.
	// ------------------------------------
	static long[][] multiply(long[][] A, long[][] B) {
		int dim = A.length;
		long[][] C = new long[dim][];
		for(int i = 0; i < dim; i++)
			C[i] = new long [dim];
		for(int i = 0; i < dim; i++) 
			for(int j = 0; j < dim; j++)
				for(int k = 0; k < dim; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
		return C;
	}
}
