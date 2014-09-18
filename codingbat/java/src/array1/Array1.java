package array1;

public class Array1 {

	public static Boolean firstLast6(int[] is) {
		return is[0] == 6 || is[is.length-1] == 6;
	}

	public static Boolean sameFirstLast(int[] is) {
		return is[0] == is[is.length-1];
	}

	public static int[] makePi() {
		return new int[] {3,1,4};
	}

	public static Boolean commonEnd(int[] is, int[] is2) {
		return is[0] == is2[0] || is[is.length-1] == is2[is2.length-1];
	}

	public static Integer sum3(int[] is) {
		int sum = 0;
		for (int i=0; i < is.length; i++)
			sum += is[i];
		return sum;
	}

}