package practisejava01;

public class Unique {

	public static void main(String[] args) {
		int input1=292;
		String str = Integer.toString(input1);
		int len = str.length();
		int count =0;
		for (int i=0;i<len-1;i++) {
			
			for(int j=i+1;j<len;j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					
					count++;
					break;
				}
			}
		}
System.out.println(len-count);
	}
	

}
