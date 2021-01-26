package com.longestPallindrome;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		Pallindrome pd = new Pallindrome();
		System.out.println("Enter a string to test");
		Scanner in = new Scanner(System.in);
		String testString = in.nextLine();
		String lowerCaseTestString = testString.toLowerCase();

		if (lowerCaseTestString.isEmpty()) {
			System.out.println("The string entered is empty");
			in.close();
		}

		else if (lowerCaseTestString.length() == 1) {
			System.out.println("String consists of only one character so there are no possible pallindromes");
			in.close();
		} else {
			String pallindromeString = pd.getLongestPalindrome(lowerCaseTestString);

			if (pallindromeString.length() == 1) {
				System.out.println("There are no possible pallindromes in the string");
				in.close();
			} else {
				int lengthOfString = pallindromeString.length();
				int index = lowerCaseTestString.indexOf(pallindromeString);
				String finalString = testString.substring(index, index + lengthOfString);
				System.out.println("Longest possible pallindrome in the given string is " + finalString);
				in.close();
			}
		}
	}

	public String getLongestPalindrome(String lowerCaseTestString) {

		String palString = lowerCaseTestString.substring(0, 1);
		for (int i = 0; i < lowerCaseTestString.length(); i = i + 1) {
			String tmp = findPallindromeString(lowerCaseTestString, i, i);
			if (tmp.length() > palString.length()) {
				palString = tmp;
			}

			tmp = findPallindromeString(lowerCaseTestString, i, i + 1);
			if (tmp.length() > palString.length()) {
				palString = tmp;
			}
		}
		return palString;
	}

	public String findPallindromeString(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}
}
