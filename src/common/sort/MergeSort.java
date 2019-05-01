package common.sort;


public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {1,4,7,8,3,6,9};
		
		sort(arr, 0, arr.length-1);
		
		for(int value : arr) {
			System.out.print(value + ",");
		}
		
	}
	
	//��߽��ұ߽�
	public static void sort(int[] arr, int left, int right) {
		if(left == right) return;
		
		//�ֳ�����
		int mid = (left + right)/2;

		//�������
		sort(arr, left, mid);
		
		//�ұ�����
		sort(arr, mid+1, right);
		
		merge(arr, left, mid+1, right);
	}
	
	//�����������������ź����������ɵģ���[1,2,4,9,3,5,7]��ôӦ����������
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
	
	//�Ľ�
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
	
		//��temp��ֵ����arr
		for(int m = 0; m<temp.length; m++) {
			arr[leftPtr + m] = temp[m];
		}
	}
	
}
