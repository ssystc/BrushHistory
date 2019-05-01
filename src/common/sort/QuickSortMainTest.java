package common.sort;
/**
 * 
 * @author Administrator
 * �������򣺷���˼�룬ȡһ����������С�ķ���ߣ���ķ��ұߣ�
 * Ȼ����߽���ͬ���������ұ߽���ͬ������
 */
public class QuickSortMainTest {

	public static void main(String[] args) {
		int[] a = {12,20,5,16,15,1,30,45,23,9};
		int start = 0;
		int end = a.length-1;
		sort(a, start, end);
		for(int num:a) {
			System.out.print(num+" ");
		}
	}
	
	public static void sort(int[] a,int low,int high){
        int start = low;
        int end = high;
        int key = a[low];
        
        
        while(end>start){
            //�Ӻ���ǰ�Ƚ�
            while(end>start&&a[end]>=key)  //���û�бȹؼ�ֵС�ģ��Ƚ���һ����ֱ���бȹؼ�ֵС�Ľ���λ�ã�Ȼ���ִ�ǰ����Ƚ�
                end--;
            if(a[end]<=key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //��ǰ����Ƚ�
            while(end>start&&a[start]<=key)//���û�бȹؼ�ֵ��ģ��Ƚ���һ����ֱ���бȹؼ�ֵ��Ľ���λ��
               start++;
            if(a[start]>=key){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        //��ʱ��һ��ѭ���ȽϽ������ؼ�ֵ��λ���Ѿ�ȷ���ˡ���ߵ�ֵ���ȹؼ�ֵС���ұߵ�ֵ���ȹؼ�ֵ�󣬵������ߵ�˳���п����ǲ�һ���ģ���������ĵݹ����
        }
        //�ݹ�
        if(start>low) sort(a,low,start-1);//������С���һ������λ�õ��ؼ�ֵ����-1
        if(end<high) sort(a,end+1,high);//�ұ����С��ӹؼ�ֵ����+1�����һ��
    }
}
