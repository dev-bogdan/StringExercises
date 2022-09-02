
public class CountVowels {
	public static int countVowels(String str) {
		str = str.toLowerCase();
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') counter++;
		}

		return counter;
	}

	public static void main(String[] args) {
		String str = "Andrei va deveni programator";

		System.out.println(countVowels(str));
	}

}
