package common.sort;

/**
 * shell排序，一开始增量为lengh/2，也就是说每隔增量个数，
 * 取一个值，组成一个新的数组，然后插入排序，所有组排好之后再取增量/2
 * 作为新的增量，直到增量为1
 * @author Administrator
 *
 */
public class ShellSortMainTest {

	public static void main(String[] args) {
		
		int[] arr = {6,8,9,1,5,10};
		
		for(int r = arr.length/2; r>=1; r/=2){
			
			for(int i = r; i<arr.length; i+=r) {
				int temp = arr[i];
				int j = i-r;
				while(j>=0 && temp<arr[j]) {
					arr[j+r] = arr[j];
					j-=r;
				}
				arr[j+r] = temp;
			}
			
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
		
		
	}
	
}
