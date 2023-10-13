import java.util.*;
public class Panagram {

	public static void main(String[] args) {
		String sentence = "This is an assessment given by cloudvadhana";
		ArrayList<Character> l = new ArrayList<>();

		sentence.toLowerCase();

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (l.contains(ch)) {
				continue;
			} else if (ch >= 'a' && ch <= 'z') {
				l.add(ch);
			}
		}
		System.out.println(l + " length is : " + l.size());
		if (l.size() == 26) {
			System.out.println("The sentence is a panagram");
		} else {
			System.out.println("The sentence is not a panagram");
		}
	}
}