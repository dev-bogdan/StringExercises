import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAllAppearances {

	public static String replaceAllAppearances(String sourceString, String oldString, String newString) {
		
		Pattern p = Pattern.compile(oldString);
		Matcher m = p.matcher(sourceString);
		StringBuilder sb = new StringBuilder();
		while(m.find()) {
			m.appendReplacement(sb, newString);
		}
		m.appendTail(sb);
		
		return sb.toString();
	}
	
	///easiest way
	public static String replaceAllAppearances2(String sourceString, String oldString, String newString) {
		StringBuilder sb = new StringBuilder(sourceString);
		
		sb = sb.replace(sb.indexOf(oldString), sb.indexOf(oldString) + oldString.length(), newString);
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "Bogdan e nebun";
		String old = "nebun";
		String newS = "frumos";
		
		String s2 = replaceAllAppearances(s, old, newS);
		String s3 = replaceAllAppearances2(s, old, newS);
		
		System.out.println(s2);
		System.out.println(s3);

	}

}
