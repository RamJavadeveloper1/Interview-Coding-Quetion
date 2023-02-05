package test.practice;

import java.util.Scanner;

public class MagazineNote {

	public boolean checkNoteOfMagazin(char[] noteChar, char[] magzinChar) {
		int flag = 0;

		for (int i = 0; i <= noteChar.length - 1; i++) {
			for (int j = 0; j <= magzinChar.length - 1; j++) {
				if (noteChar[i] == magzinChar[j]) {
					magzinChar[j] = 1;
					flag++;
				}
			}
		}

		if (flag == noteChar.length) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the magazine latter : ");
		String magazin = sc.nextLine();
		char[] magzinChar = magazin.toCharArray();

		System.out.println("Enter the Note latter : ");
		String note = sc.nextLine();
		char[] noteChar = note.toCharArray();

		MagazineNote magazineNote = new MagazineNote();
		boolean flag = magazineNote.checkNoteOfMagazin(noteChar, magzinChar);
		
		if (flag) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
