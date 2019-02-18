package offer.title16;

public class MainTest {
	
	public static void main(String[] args) {
		System.out.println(power(3, 5));
	}

	public static double power(double base, int exponent) {
		if(base==0.0) {
			return 0.0;
		}
		if(exponent == 0.0) {
			return 1.0;
		}
		if(exponent == 1.0) {
			return base;
		}
		if(exponent<0) {
			exponent = -exponent;
			double result = powerWithUnsingedExponent2(base, exponent);
			return 1/result;
		}
		double result = powerWithUnsingedExponent2(base, exponent);
		return result;

	}
	
	public static double powerWithUnsingedExponent(double base, int exponent) {
		double result = 1.0;
		for(int i=0; i<exponent; i++) {
			result = result * base;
		}
		return result;
	}
	
	//还一个方法计算乘方：计算指数的一半次方，得到的结果相乘，减少运算量
	public static double powerWithUnsingedExponent2(double base, int exponent) {
		if(exponent==0) {
			return 1.0;
		}
		if(exponent==1) {
			return base;
		}
		
		double result = powerWithUnsingedExponent2(base, exponent>>1);
		result = result * result;
		if(exponent%2 != 0) {
			result = result*base;
		}
		return result;
	}
	
}
