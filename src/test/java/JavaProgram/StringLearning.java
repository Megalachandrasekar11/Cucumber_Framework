package JavaProgram;

public class StringLearning {

	public static void main(String[] args) {

		String S1= "Life is beautifull";
		System.out.println(S1.charAt(2));
		System.out.println(S1.length());
		System.out.println(S1.substring(7));
		System.out.println(S1.equalsIgnoreCase(S1));
		String[] S2 =S1.split("");
		System.out.println("The split word is "+S2[0]+" and" + S2[1]);
		System.out.println(S1.trim());
		System.out.println(S1.toUpperCase());
		System.out.println(S1.toLowerCase());
		System.out.println(S1.valueOf(false));
		System.out.println(S1.replace("G", "T"));
		
		String Test= "Am I beautifull";
		
		StringBuffer sb= new StringBuffer();
		sb.append(Test);
		sb.reverse();
		System.out.println("The reverse string is :" +sb);
		
		
		String Test1 = "Love the life you live";
		StringBuilder sB= new StringBuilder();
		sB.append(Test1);
		sB.replace(0, 5, Test1);
		System.out.print(sB);
		
		
	}

}
