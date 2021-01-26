package com.phoneDirectory;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		PhoneDirectory pd = new PhoneDirectory();

		String contacts[] = { "avinash", "avi", "kumar", "aviabc", "wipro", "wiproo" };

		pd.insertIntoPhoneDirectory(contacts);

		System.out.println("Enter a string to test");

		Scanner in = new Scanner(System.in);
		String query = in.nextLine();
		if (query.isEmpty()) {
			System.out.println("Entered string is empty");
		}
		pd.displayContacts(query);

		in.close();
	}
}
