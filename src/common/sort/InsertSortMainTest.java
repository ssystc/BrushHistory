package common.sort;

/**
 * 
 * @author Administrator
 *�Ƚ����������ź�λ�ã�Ȼ����������ݲ��뵽Ӧ�õ�λ�ã����ĸ����ݲ��뵽Ӧ�õ�λ�ã������...................
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
			System.out.print("��" + i + "��������Ϊ��");
			for(int a : arr) {
				System.out.print(a + " ");
			}
		}
		System.out.println("");
		System.out.print("�����");
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
	
}
