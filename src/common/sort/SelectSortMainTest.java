package common.sort;


/**
 * ѡ������ÿ��ѡ����С��������������ǰ��
 * ���������ʣ�µ�n-1����������ѡ����С�ķ���n-1�����ݵĵ�һλ���Դ�����
 */


public class SelectSortMainTest {

	public static void main(String[] args) {
		int[] arr = {6,8,9,1,5,10};
		System.out.print("����ǰ��");
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
			System.out.print("��" + (i+1) + "������Ϊ��");
			for(int a : arr) {
				System.out.print(a + " ");
			}
		}
		System.out.println("");
		System.out.print("���ս����");
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
