package common.sort;

//�������Ƚϣ�С�ķ�ǰ��n����Ҫ�Ƚ�n-1�֣��Ƚ��ʺϱ����ͱȽ��й��ɵ����������

public class MaoPaoMainTest {
	public static void main(String[] args) {
		int[] arr = {6,8,9,1,5,10};
		System.out.println("����ǰ��");
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
			System.out.println("��" + (i+1) + "��������Ϊ��");
			for(int a : arr) {
				System.out.print(a + " ");
			}
			if(value==0) {
				break;
			}
		}
		System.out.println("");
		System.out.println("���ս��Ϊ");
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
