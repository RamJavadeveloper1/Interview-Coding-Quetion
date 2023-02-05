package stream.practice;

import java.util.Scanner;

public class StarRating {
	public static String StarRating(String str) {
		// code goes here
		// System.out.println(str.length());
		if (str.length() < 4) {
			System.out.println(str.length());
			str = str.concat("0");
		}
		String rateing = "full ";
		String halfStr = str.substring(2, 4);
		String fullStr = str.substring(0, 1);
		int fullCount = Integer.parseInt(fullStr);
		int halfStrRate = Integer.parseInt(halfStr);
		int emaptyCount = 0;

		if (halfStrRate > 0) {
			emaptyCount = 5 - (fullCount + 1);
		} else {
			emaptyCount = 5 - (fullCount);
		}

		if (fullCount > 0) {
			for (int i = 1; i < fullCount; i++) {
				rateing = rateing.concat("full ");
			}
			if (halfStrRate > 0) {
				rateing = rateing.concat("half ");
			}

			if (emaptyCount > 0) {
				for (int i = 0; i < emaptyCount; i++) {
					rateing = rateing.concat("empty ");
				}
			}
		} else if (halfStrRate > 0) {
			rateing = "half empty empty empty empty";
		} else {
			rateing = "empty empty empty empty empty";
		}

		return rateing;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no...");
		System.out.print(StarRating(s.nextLine()));
	}

}
