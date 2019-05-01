package common.sort;


/**
 * 选择排序：每次选出最小的数放在数组最前，
 * 下轮排序从剩下的n-1个数据中再选出最小的放在n-1个数据的第一位，以此类推
 */


public class SelectSortMainTest {

	public static void main(String[] args) {
		int[] arr = {6,8,9,1,5,10};
		System.out.print("排序前：");
		for(int a : arr) {
			System.out.print(a + " ");
		}
		for(int i = 0; i < arr.length; i++) {
			
			int temp = arr[i];
			int index = i;
			int flag = 0;
			for(int j = i+1; j<arr.length; j++) {
				if(temp > arr[j]) {
					temp = arr[j];
					index = j;
					flag++;
				}
			}
			if(flag==0) {
				break;
			}
			arr[index] = arr[i];
			arr[i] = temp;
			
			System.out.println("");
			System.out.print("第" + (i+1) + "排序结果为：");
			for(int a : arr) {
				System.out.print(a + " ");
			}
		}
		System.out.println("");
		System.out.print("最终结果：");
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
