/* Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If a and b are case-insensitive anagrams, print “Anagrams”; otherwise, print “Not Anagrams” instead.

Input Format

The first line contains a string denoting a. 
The second line contains a string denoting b.

Constraints

1 ≤ length(a),length(b) ≤ 50

Strings a and b consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print “Anagrams” if a and b are case-insensitive anagrams of each other; otherwise, print “Not Anagrams” instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams */
//******************************************************************************************************************************************************************/

public class JavaAnagrams {
	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		} else {
			for (int i = 0; i < a.length(); i++) {
				char ch = a.toLowerCase().charAt(i);
				b = b.toLowerCase();
				if (b.indexOf(ch) != -1) {
					b = b.replaceFirst(ch + "", "");
				} else {
					return false;
				}
			}
			return b.length() == 0;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}

//******************************************************************************************************************************************************************/
