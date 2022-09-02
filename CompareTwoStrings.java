
public class CompareTwoStrings {
	public static int compareTwoStrings(String str1, String str2) {
		String ss;
		if(str1.length() > str2.length()) {
			ss = new String(str1);
		} else {
			ss = new String(str2);
		}
		
		
		int res = 0;
		int counterStr1 = 0;
		int counterStr2 = 0;
		
		
		for (int i = 0; i < ss.length(); i++) {
			if(counterStr1 == str1.length()) {
				res = 1;
				break;
			}
			if(counterStr2 == str2.length()) {
				res = -1;
				break;
			}
			
			if (str1.charAt(counterStr1) == str2.charAt(counterStr2)) {
				res = 0;
				counterStr1++;
				counterStr2++;
			} else if (str1.charAt(i) < str2.charAt(i)) {
				res = -1;
				counterStr1++;
				counterStr2++;
				break;
			} else if (str1.charAt(i) > str2.charAt(i)) {
				res = 1;
				counterStr1++;
				counterStr2++;
				break;
			}
			
			

		}

		return res;
	}

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hell";

		System.out.println(str1.compareTo(str2));
		System.out.println(compareTwoStrings(str1, str2));
	
	}

}
