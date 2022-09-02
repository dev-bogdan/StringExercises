
public class SearchForAKeyInAString {

	public static int ex1_1(String str, String key) {

		int counter = 0;
		String[] result = str.split("\\W+");

		for (int i = 0; i < key.length(); i++) {
			for (int j = 0; j < result.length; j++) {
				for (int k = 0; k < result[j].length(); k++) {
					result[j] = result[j].toLowerCase();
					if (key.charAt(i) == result[j].charAt(k)) {
						counter++;
					}
				}
			}
		}

		return counter;
	}

	public static int ex1_2(String str, String key) {

		int counter = 0;
		String[] result = str.split("\\W+");

		for (int i = 0; i < key.length(); i++) {
			for (int j = 0; j < result.length; j++) {
				result[j] = result[j].toLowerCase();
				if (key.charAt(i) == result[j].charAt(0)) {
					counter++;
				}
			}
		}

		return counter;
	}

	public static int ex1_bonus(String str, String key) {
		int counter = 0;
		StringBuilder sb = new StringBuilder(str);
		for (int j = 0; j < key.length(); j++) {
			for (int i = 0; i < sb.length(); i++) {
				if (i > 0 && !Character.isLetter(sb.charAt(i))) {
					continue;
				} else if (Character.isLetter(sb.charAt(i))) {
					if (key.charAt(j) == sb.charAt(i)) {
						counter++;
					}
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		String str = "If you haven’t booked your accommodation yet,"
				+ " we suggest visiting our search engine, where you’ll find all types of hotels, hostels and apartments with the best rates guaranteed."
				+ " You can get up to a 75% discount and pay once you get to your destination.";
		String key = "bo";

		System.out.println(ex1_1(str, key));
		System.out.println(ex1_2(str, key));
		System.out.println(ex1_bonus(str, key));
	}

}
