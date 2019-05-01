package common.sort;


public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {1,4,7,8,3,6,9};
		
		sort(arr, 0, arr.length-1);
		
		for(int value : arr) {
			System.out.print(value + ",");
		}
		
	}
	
	//左边界右边界
	public static void sort(int[] arr, int left, int right) {
		if(left == right) return;
		
		//分成两半
		int mid = (left + right)/2;

		//左边排序
		sort(arr, left, mid);
		
		//右边排序
		sort(arr, mid+1, right);
		
		merge(arr, left, mid+1, right);
	}
	
	//假设数组是有两个排好序的数组组成的，如[1,2,4,9,3,5,7]那么应该如下排序
//	public static void merge0(int[] arr) {
//		int mid = arr.length/2;
//		int[] temp = new int[arr.length];
//		
//		int i = 0;
//		int j = mid+1;
//		int k = 0;
//		
//		while(i <= mid && j < arr.length) {
//			if(arr[i] <= arr[j]) {
//				temp[k] = arr[i];
//				i++;
//				k++;
//			}else {
//				temp[k] = arr[j];
//				j++;
//				k++;
//			}
//		}
//		
//		while(i<=mid) {
//			temp[k++] = arr[i++];
//		}
//		while(j<arr.length) {
//			temp[k++] = arr[j++];
//		}		
//	}
	
	//改进
	public static void merge(int[] arr, int leftPtr, int rightPtr, int rightBound) {
		int mid = rightPtr-1;
		int[] temp = new int[rightBound - leftPtr + 1];
		
		int i = leftPtr;
		int j = rightPtr;
		int k = 0;
		
		while(i <= mid && j <=rightBound) {
			if(arr[i] <= arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;
			}else {
				temp[k] = arr[j];
				j++;
				k++;
			}
		}
		
		while(i<=mid) {
			temp[k++] = arr[i++];
		}
		while(j<=rightBound) {
			temp[k++] = arr[j++];
		}
	
		//把temp的值赋给arr
		for(int m = 0; m<temp.length; m++) {
			arr[leftPtr + m] = temp[m];
		}
	}
	
}
