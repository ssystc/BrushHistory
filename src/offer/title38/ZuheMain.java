package offer.title38;

import java.util.ArrayList;
import java.util.List;

/*
 * 假设我们想在长度为n的字符串中求m个字符的组合，
 * m从1到n。我们先从头扫描字符串的第一个字符。针对第一个字符，我们有两种选择：
 * 		一是把这个字符放到组合中 去，接下来我们需要在剩下的n-1个字符中选取m-1个字符；
 * 		二是不把这个字符放到组合中去，接下来我们需要在剩下的n-1个字符中选择m个字符。
 * 这两种 选择都很容易用递归实现。
 * 
 */
public class ZuheMain {
	
	public static void zuhe(char[] cs) {
		List<Character> list = new ArrayList<Character>();
		for (int i = 1; i <= cs.length; i++) {
			zuhe(cs, 0, i, list);
		}
		
	}
	
	public static void zuhe(char[] cs, int begin, int num, List<Character> list) {
		if(num == 0) {
			System.out.println(list.toString());
			return;
		}
		
		if(begin == cs.length){
            return;
        }
		
		//如果组合包括第一个字符，则在n-1个字符中再选取m-1个字符
        //如果组合不包括第一个字符，则在n个字符中选取m个字符
        list.add((Character)cs[begin]);
        zuhe(cs, begin+1, num-1, list);
        list.remove((Character)cs[begin]);
        zuhe(cs, begin+1, num, list);
	}
	
	public static void main(String[] args) {
		String str = "abcdef";
		char[] cs = str.toCharArray();
		zuhe(cs);
	}

}
