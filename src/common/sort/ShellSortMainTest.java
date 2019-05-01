package common.sort;

/**
 * shell����һ��ʼ����Ϊlengh/2��Ҳ����˵ÿ������������
 * ȡһ��ֵ�����һ���µ����飬Ȼ����������������ź�֮����ȡ����/2
 * ��Ϊ�µ�������ֱ������Ϊ1
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
