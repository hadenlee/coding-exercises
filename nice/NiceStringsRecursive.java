public class NiceStringsRecursive { 
	static long cntCallOne, cntCallZero;

  static long computeOne(int n) {
		cntCallOne++;
    if(n == 1) return __(1)__;
    return __(2)__;
  }

  static long computeZero(int n) {
		cntCallZero++;
    if(n == 1) return __(3)__;
    return __(4)__;
  }
	// ------------------------------------
  public static void main(String[] args) {
		for(int n = 1; n <= 8; n++) {
			cntCallOne = cntCallZero = 0;
			long res = computeOne(n) + computeZero(n);

			System.out.println(String.format(
				"S[%d]=%d (w/ function calls %d+%d)",
				n, res, cntCallZero, cntCallOne));
		}
  }
}
