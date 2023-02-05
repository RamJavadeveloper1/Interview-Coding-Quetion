package test.practice;

public class DublicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Great responsibility";
		int count;
		char[] sc =s.toCharArray();
		
		for (int i = 0; i < sc.length; i++) {
			count=1;
			
			for(int j =i+1; j< sc.length; j++) {
				
				if(sc[i]==sc[j] && sc[i]!=' ') {
					++count;
					sc[j]='0';
				}
			}
			
			if(count>1 && sc[i]!='0') {
				System.out.println(sc[i] + ""+ count);
			}
		}
		

	}

}
