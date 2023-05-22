
public class Done {
	public static void main(String[] args) {
		Long input1 = 27468945689l;
		String s = Long.toString(input1);
		long ans=0;
		int l =0;
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			long d = (Character.getNumericValue(c));
			if(d%2==0) {
				ans = ans + d +3;
			}
			else if(d%2 ==1) {
				ans = ans + d;
			}
			else if(d==0) {
				l =i;
				break;
			}
		}
		if(l ==0) {
			System.out.println(ans);
		}
		else {
			long k = Long.parseLong(s.substring(l+1));
			System.out.println(ans + "" +k);
		}
	}

}
