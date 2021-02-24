public class Palindrome {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			String s = args[i];
			String s2="";
			char[] charray=s.toCharArray();
			for(int j=0;j<charray.length;j++)
				s2=charray[j]+s2;
			
			System.out.println(s.equals(s2));
		}
	}
}