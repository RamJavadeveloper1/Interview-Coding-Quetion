package stream.practice;

public class StringUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stubruy
		
		String name = "Ramkisho";
		char sname[] = name.toCharArray();
		int flag =0;
		for (int i = 0; i < sname.length; i++) {
			for (int j = i+1; j < sname.length; j++) {
				if(sname[i] == sname[j]) {
					flag=1;
					System.out.println("Not unique name");
				} else {
					System.out.println("unique name");
				}
				
			}
		}
		

	}

}
