package test.practice;

import java.util.Scanner;

public class RomanNumeral {

	public int romanToIntl(String str) {
		// Initialize result
		int res = 0;

		for (int i = 0; i < str.length(); i++) {
			int s1 = rCharToInt(str.charAt(i));

			if (i + 1 < str.length()) {
				int s2 = rCharToInt(str.charAt(i + 1));

				if (s1 >= s2) {
					res = res + s1;
				} else {
					res = res + s2 - s1;
					i++;
				}
			} else {
				res = res + s1;
			}
		}
		return res;
	}

	public int rCharToInt(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roman digit : ");
		String roman = sc.nextLine().toUpperCase();

		RomanNumeral numeral = new RomanNumeral();
		System.out.println(numeral.romanToIntl(roman));
	}

}
