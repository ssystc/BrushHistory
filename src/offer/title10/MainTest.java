package offer.title10;

//求解斐波那契数列，可变形为青蛙跳台阶问题，offer第10题
public class MainTest {
	
	//不用递归，从第一个往后加
	public static long fibonacci1(int n) {
		long result = 0;
		long first = 0;
		long second = 1;
		if(n == 0) {
			return first;
		}
		if(n==1) {
			return second;
		}
		for (int i = 2; i <= n; i++) {
			result = first + second;
			first = second;
			second = result;
		}
		
		return result;
	}
	
	//最原始的递归方法
	public static long fibonacci2(int n) {
		if (n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		else {
			return fibonacci2(n-1)+fibonacci2(n-2);
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println(fibonacci2(8));
		
	}

}
