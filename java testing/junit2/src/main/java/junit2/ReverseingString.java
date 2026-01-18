package junit2;

public class ReverseingString {
	public String reverseString(String str) {
		char[] charArray=str.toCharArray();
		int left=0;
		int right=charArray.length-1;
		
		while (left<right) {
			char t = charArray[left];
			charArray[left]=charArray[right];
			charArray[right] = t;
			left++;
			right--;
		}
		return new String(charArray);
	}

}
