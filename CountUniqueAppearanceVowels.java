
public class CountUniqueAppearanceVowels {
	public static int countUniqueAppearanceVowels(String str) {
		str = str.toLowerCase();
		String s2 = "aeiou";
		int counter = 0;
		int counter2 = 0;
		for (int i = 0; i < s2.length(); i++) {
			counter = 0;
			for (int j = 0; j < str.length(); j++) {
				if (s2.charAt(i) == str.charAt(j)) {
					counter++;
					if (counter > 1) {
						break;
					}
				}
			}
			if(counter <= 1) {
				System.out.print(s2.charAt(i) + " ");
				counter2++;
			}
		}

		return counter2;
	}

	public static void main(String[] args) {
		String str = "Andrei va deveni instructor";
		System.out.println(countUniqueAppearanceVowels(str));
	}

}
