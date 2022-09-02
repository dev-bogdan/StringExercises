
public class NumberOfWordsWhichEndsInLettersOfKey {

	public static int ex_4_bonus_1(String str, String key) {
		int res = 0;
		String[] neb = str.split("\\W+");

		for (int i = 0; i < key.length(); i++) {
			for (int j = 0; j < neb.length; j++) {
				if (key.charAt(i) == neb[j].charAt(neb[j].length() - 1)) {
					res++;
				}
			}
		}

		return res;

	}

	public static int ex_4_bonus_2(String str, String key) {
		int res = 0;
		String[] neb = str.split("\\W+");

		for (int i = 0; i < key.length(); i++) {
			for (int j = 0; j < neb.length; j++) {
				for (int k = 0; k < neb[j].length(); k += 2) {
					neb[j] = neb[j].toLowerCase();
					if (key.charAt(i) == neb[j].charAt(k)) {
						res++;
					}
				}
			}
		}
		return res;

	}
	

	public static void main(String[] args) {
		String key = "a";
		String test = "Ana eeae nebuno auaa mono";

		System.out.println(ex_4_bonus_2(test, key));
		
	}

}
