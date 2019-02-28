package offer.title38;

public class PailieMain {
	
	public static void pailie(char[] list, int index) {
		
		if(index == list.length-1) {
			System.out.println(list);
		}
		
		for (int i = index; i < list.length; i++) {
			char temp = list[i];
			list[i] = list[index];
			list[index] = temp;
			
			pailie(list, index+1);
			
			temp = list[i];
			list[i] = list[index];
			list[index] = temp;
		}
		
	}

	public static void main(String[] args) {
		String str = "abcdef";
		char[] list = str.toCharArray();
		pailie(list, 0);
	}
}
