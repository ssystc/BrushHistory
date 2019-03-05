package offer.title31;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MainTest {

	public static boolean method(List<Integer> yaru, List<Integer> tanchu) {
		if(yaru.size() != tanchu.size()) {
			return false;
		}
		
		int j = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i<yaru.size(); i++) {
			stack.add(yaru.get(i));
			while(!stack.isEmpty() && stack.peek() == tanchu.get(j)) {
				stack.pop();
				j++;
			}
		}
		
		
		if(stack.isEmpty() && j == yaru.size()) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		Integer[] yaruArray = {1,2,3,4,5};
		List<Integer> yaru = new ArrayList<>(Arrays.asList(yaruArray));
//		Integer[] tanchuArray = {1,2,4,3,5};
//		Integer[] tanchuArray = {1,2,4,5,3};
//		Integer[] tanchuArray = {2,5,3,4,1};
		Integer[] tanchuArray = {2,5,4,3,1};
		
		List<Integer> tanchu = new ArrayList<>(Arrays.asList(tanchuArray));
		
		boolean result = method(yaru, tanchu);
		System.out.println(result);
	}
	
}
