package JavaProgram;

public class StringReverse {

	public static void main(String[] args) {

		String S= "Megala";
		String S1= "";
		char[] S2= S.toCharArray();
		
		for(int i=S2.length-1;i>=0;i--)
			
		{
			S1=S1+S2[i];
		}
		
		System.out.println("The reverse string is " + S1);
	}

}
