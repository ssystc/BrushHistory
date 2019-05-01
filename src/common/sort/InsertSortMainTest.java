package common.sort;

/**
 * 
 * @author Administrator
 *先将两个数据排好位置，然后第三个数据插入到应该的位置，第四个数据插入到应该的位置，第五个...................
 *
 */

public class InsertSortMainTest {

	public static void main(String[] args) {
		int[] arr = {6,8,9,1,5,10};
		
		int i, j;
		int n = arr.length;
		int temp;
		
		for(i = 1; i < n; i++) {
			j = i;
			temp = arr[i];
			
			while(j > 0 && temp<arr[j-1]) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
			
			
			System.out.println("");
			System.out.print("第" + i + "次排序结果为：");
			for(int a : arr) {
				System.out.print(a + " ");
			}
		}
		System.out.println("");
		System.out.print("结果：");
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
	
}
