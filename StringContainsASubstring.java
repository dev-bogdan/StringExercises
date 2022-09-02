import java.util.Arrays;

public class StringContainsASubstring {

	public static int[] containsString(String sourceString, String searchString) {

		sourceString = sourceString.toLowerCase();
		searchString = searchString.toLowerCase();

		String[] array = sourceString.split("\\W+");
		int len = searchString.length();
		int count = 0;
		int[] arr = new int[len + 2];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < searchString.length(); j++) {
				for (int k = 0; k < array[i].length(); k++) {
					if (searchString.charAt(j) == array[i].charAt(k)) {
						arr[count] = k;
						count++;
						break;
					}
				}
			}
		}

		return arr;
	}

	public static boolean ex5() {
		
		
		
		int[] arr = containsString("Bdgo", "ogd");
		
		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		
		int n = arr.length;
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				count2++;
			}
		}
		
		int[] newArr = new int[count2];
		
		
		for(int i = 0;i<newArr.length;i++) {
			newArr[i] = temp[i];
		}

		for(int i = 0;i<temp.length;i++) {
			System.out.print(temp[i] + " ");
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {

		System.out.println(ex5());

	}

}
