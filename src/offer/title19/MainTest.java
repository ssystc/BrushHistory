package offer.title19;

import javax.print.DocFlavor.INPUT_STREAM;

public class MainTest {
	
	public static void main(String[] args) {
		String a = "aaa";
		String p1 = "ab*a.";
		String p2 = "ab*a";
		
		char[] aChar = a.toCharArray();
		char[] p1Char = p1.toCharArray();
		char[] p2Char = p2.toCharArray();
		
		System.out.println(match(aChar, p1Char));
		System.out.println(match(aChar, p2Char));
	}
	
	public static boolean match(char[] str, char[] pattern) {
		if(str==null || pattern==null) {
			return false;
		}
		int strIndex = 0;
		int patternIndex = 0;
		return matchCore(str, strIndex, pattern, patternIndex);
	}
	
	
	
//	*当模式中的第二个字符是‘*’时问题要复杂一些，因为可能有多种不同的匹配方式。一个选择是在模式上向后移动两个字符。
//	*这相当于‘*’和它面前的字符被忽略掉了，因为‘*’可以匹配字符串中0个字符。如果模式中的第一个字符和字符串中的第一个字符相匹配时，
//	*则在字符串向后移动一个字符，而在模式上有两个选择：我们可以在模式上向后移动两个字符，也可以保持模式不变。

	private static boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
		
		//字符串和模式都到尾了,匹配成功
		if(strIndex == str.length && patternIndex == pattern.length) {
			return true;
		}
		
		//模式到尾，字符串没到尾，匹配失败
		if(strIndex != str.length && patternIndex == pattern.length) {
			return false;
		}
		
		//模式未结束
		//模式的第二个字符是*
		if(patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*') {
			
			if(strIndex >= str.length) {
				//匹配串已结束
				return matchCore(str, strIndex, pattern, patternIndex+2);
			}else {
				//未结束
				if(pattern[patternIndex]==str[strIndex] || pattern[patternIndex] == '.') {
					return matchCore(str, strIndex+1, pattern, patternIndex+2)
							||matchCore(str, strIndex+1, pattern, patternIndex)
							||matchCore(str, strIndex, pattern, patternIndex+2);
				}else {
					return matchCore(str, strIndex, pattern, patternIndex+2);
				}
			}
		}
		
		if(strIndex!=str.length&&(str[strIndex]==pattern[patternIndex]||pattern[patternIndex]=='.')){
			return matchCore(str, strIndex+1, pattern, patternIndex+1);
		}else{
			return false;//第一个字符不匹配并且模式第二个位置不是*
		}
	}

}
