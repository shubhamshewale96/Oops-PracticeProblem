package com.bl.Oops.Practiceproblem;

import java.util.Scanner;

public class Account {
	public int accountBalance = 192000;

	public static void main(String[] args) {
		Account obj = new Account();
		obj.debit();
	}

	void debit() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Amount You Want To Debit");
		int amount = input.nextInt();
		if (amount <= accountBalance) {
			accountBalance -= amount;
			System.out.println(
					"Your account is debited by RS " + amount + " and Available Balance is RS " + accountBalance);
		} else {
			System.out.println("Debit amount exceeded account Balance and Available Balance is RS" + accountBalance);
		}
	}
}
