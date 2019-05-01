package common.sort;

//相邻数比较，小的放前，n个数要比较n-1轮，比较适合本来就比较有规律的数组的排序

public class MaoPaoMainTest {
	public static void main(String[] args) {
		int[] arr = {6,8,9,1,5,10};
		System.out.println("排序前：");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		
		for(int i = 0; i<arr.length-1; i++) {
			int value = 0;
			for(int j = 0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					value++;
				}
			}
			System.out.println("");
			System.out.println("第" + (i+1) + "次排序结果为：");
			for(int a : arr) {
				System.out.print(a + " ");
			}
			if(value==0) {
				break;
			}
		}
		System.out.println("");
		System.out.println("最终结果为");
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
