package JavaProgram;

public class WordReverseString {

	public static void main(String[] args) {

		String S= "I am Beautifull";
		String[] S1= S.split(" ");
		String reverse =" ";
		
		for (int i=S1.length-1;i>=0;i--)
			
		{
			reverse=reverse+S1[i];
		}
		
		System.out.println("The reverse word is "+ reverse);
		
	}

}
