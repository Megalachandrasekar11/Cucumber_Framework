package JavaProgram;

public class SeleniumTestingSplit {

	public static void main(String[] args) {
     String S= "Selenium Testing";
     String[] r=S.split(" ");
     String test = "";
     
     for(int i=0;i<=2;i++)
     {
    	 test+=r[0].charAt(i);
    	 for(int j=0;j<=1;j++)
    	 {
    		 if(i!=2)
    		 {
    		 test+=r[1].charAt(i);
    		 break;
    	 }}
     }
     System.out.println(test);
  
     
	}
}