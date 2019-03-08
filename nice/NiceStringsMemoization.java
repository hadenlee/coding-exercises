public class NiceStringsMemoization { 
	static long cntCallOne, cntCallZero;
	static long[] Z, O;

  static long computeOne(int n) {
		cntCallOne++;
    if(n == 1) return 1L;
		if( __(1)__ ) {
			O[n] = __(2)__ ; 
		}
		return O[n];
  }

  static long computeZero(int n) {
		cntCallZero++;
    if(n == 1) return 1L;
		if( __(3)__ ) {
			Z[n] = __(4)__;
		}
		return Z[n];
  }
	// -----------------------------------
  public static void main(String[] args) {
		for(int n = 1; n <= 8; n++) {
			cntCallOne = cntCallZero = 0;
			Z = new long[n+1];
			O = new long[n+1];
			long res = computeOne(n) + computeZero(n);

			System.out.println(String.format(
				"S[%d]=%d (w/ function calls %d+%d)",
				n, res, cntCallZero, cntCallOne));
		}
  }
}
