package stream.practice;

import java.util.Arrays;
import java.util.List;

public class FriendEmailCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> friendEmailList = Arrays.asList("friend@catena-technologies.com", "bff@uni.edu.sg",
				"provost@uni.edu.sg", "john@doe.com");

		List<String> AllEmailsList = Arrays.asList("enemy@uni.edu.sg", "bff@uni.edu.sg", "evil@spam.com", "bff@uni.edu.sg",
				"friend@catena-technologies.com");

		int flag = 0;

		for (String string : AllEmailsList) {
			for (String string2 : friendEmailList) {
				if(string2 == string) {
					flag++;
				}
			}
		}
		System.out.println(flag);
	}

}
