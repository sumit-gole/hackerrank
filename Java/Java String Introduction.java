/* "A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does  come before A in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
Input Format

The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of A and B. 
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead. 
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java. */
/*************************************************************************************************************************************************************************/

public class JavaStringsIntroduction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(A.length() + B.length());
		int l = A.length() > B.length() ? B.length() : A.length();
		String str = "";
		for (int i = 0; i < l; i++) {
			if ((int) (A.toLowerCase()).charAt(i) > (int) (B.toLowerCase()).charAt(i)) {
				str = "Yes";
				break;
			} else if ((A.toLowerCase()).charAt(i) < (B.toLowerCase()).charAt(i)) {
				str = "No";
				break;
			}
		}
		if (str == "") {
			if (A.length() > B.length()) {
				str = "Yes";
			} else {
				str = "No";
			}
		}
		System.out.println(str);
		System.out.println((A.toUpperCase()).charAt(0) + A.substring(1, A.length()) + " " + (B.toUpperCase()).charAt(0)
				+ B.substring(1, B.length()));
		sc.close();
	}
}

/*************************************************************************************************************************************************************************/
