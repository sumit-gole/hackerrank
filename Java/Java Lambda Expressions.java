/*  This Java 8 challenge tests your knowledge of Lambda expressions!

Write the following methods that return a lambda expression performing a specified action:

PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.
Input Format

Input is handled for you by the locked stub code in your editor.

Output Format

The locked stub code in your editor will print T lines of output.

Sample Input

The first line contains an integer, T (the number of test cases).

The T  subsequent lines each describe a test case in the form of 2 space-separated integers: 
The first integer specifies the condition to check for (1 for Odd/Even,2  for Prime, or 3 for Palindrome). The second integer denotes the number to be checked.

5
1 4
2 5
3 898
1 3
2 12
Sample Output

EVEN
PRIME
PALINDROME
ODD
COMPOSITE      */

/*****************************************************************************************************************************//

// Write your code here
	public static PerformOperation isOdd() {
		return n -> ((n & 1) == 1);
	}
	public static PerformOperation isPrime() {
		return n -> {
			if (n < 2) {
				return false;
			} else {
				int k = (int) Math.sqrt(n);
				for (int i = 2; i <= k; i++) {
					if (n % i == 0)
						return false;
				}
				return true;
			}
		};
	}
	public static PerformOperation isPalindrome() {
		return n -> {
			String org = n + "";
			String newString = new StringBuffer(org).reverse().toString();
			return org.equals(newString);
		};
	}
}

/*****************************************************************************************************************************//
