
public class CountUniqueVowels {
	public static int countUniqueVowels(String str) {

		String s2 = "aeiou";

		str = str.toLowerCase();

		int counter = 0;
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if(s2.charAt(i) == str.charAt(j)) {
					counter++;
					break;
				}
			}
		}

		return counter;
	}

	public static void main(String[] args) {
		String str = "Andrei va deveni programator";
		System.out.println(countUniqueVowels(str));
	}

}
