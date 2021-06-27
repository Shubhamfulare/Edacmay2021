import java.util.Scanner;

public class Myscanner {
	private static Scanner sc= new Scanner(System.in);
       
	
	public static int getInt(String question) {
        	System.out.println(question);
        	return sc.nextInt();
        }
	public static String getString(String question) {
	    	System.out.println(question);
	    	return sc.next();
	    }
}