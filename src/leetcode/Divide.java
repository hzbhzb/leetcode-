package leetcode;

public class Divide {

	public static void main() {

	}

	public int divide(int dividend, int divisor) {

		int result = 0;
		int sign;
		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;
		if (dividend == 0)
			return 0;
		if ((divisor > 0 && dividend > 0) || (divisor < 0 && dividend < 0)) {
			sign = 1;
		} else
			sign = -1;
		if (dividend > 0)
			dividend = -dividend;
		if (divisor > 0)
			divisor = -divisor;
		if (dividend > divisor)
			return 0;

		int count = 0, pDivisor = divisor;
		while (pDivisor >= Integer.MIN_VALUE && pDivisor > dividend) {
			pDivisor = pDivisor << 1;
			count += 2;
		}

		while (dividend <= divisor) {
			result += 1;
			dividend -= divisor;
		}

		return sign > 0 ? (result + count) : -(result + count);
	}

}
