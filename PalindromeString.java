
public class PalindromeString {

	public static boolean ex_2(String str) {
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder(str);
		for (int j = 0; j < sb.length(); j++) {
			for (int i = 0; i < sb.length(); i++) {
				if (!Character.isLetter(sb.charAt(i)) && !Character.isDigit(sb.charAt(i))) {
					sb.deleteCharAt(i);
				}
			}
		}
		StringBuilder sb2 = new StringBuilder(sb);
		sb.reverse();
		String reverse = sb.toString();
		String nonReverse = sb2.toString();

		System.out.println(reverse);
		System.out.println(nonReverse);

		if (nonReverse.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String test = "!A man, a plan, a canal: Panama!!";

		System.out.println(ex_2(test));
	}

}
