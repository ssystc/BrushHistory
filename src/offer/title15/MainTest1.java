package offer.title15;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		System.out.println(calcOneNum(34));		//100010
		System.out.println(calcOneNum(31)); 	//11111
		
//		int n = 7;
//		int m = 4;
//		System.out.println(m&n);
//		
//		int x = 17;
//		System.out.println(x>>1);
//		
//		System.out.println(x<<1);
//		
		System.out.println(Integer.toBinaryString(17));
		System.out.println(17>>1);
		System.out.println(Integer.toBinaryString(-17));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
	
	public static int calcOneNum(int x) {
		
		int count = 0;
		while(x!=0) {
			x = x&(x-1);
			count++;
		}
		return count;
	}

}
