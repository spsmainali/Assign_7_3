	import java.util.*;
	import java.lang.String;
	 
	public class Assign_7_3 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Please enter a  String: ");
	        String string2 = input.next();// taking input of second string
	        input.nextLine();
	        System.out.print("Please enter a sub String: ");
	        String string1 = input.next(); // taking input of first string
	        if (isSubstring(string1, string2)) {
	            System.out.println("Sub String Found");
	        } else {
	            System.out.println("Sub Sring Not Found.");
	        }
	    }   
	    public static boolean isSubstring(String string1, String string2) { // a function is defined to check and compare two string provided
	        char c;
	        char d;
	        boolean match = true;
	        for (int i = 0; i < string1.length(); i++) {
	            c = string1.charAt(i);
	            for (int j = 0; j < string2.length(); j++) {
	                d = string2.charAt(j);
	                if (c != d) {
	                    match = false;
	                } else {
	                    match = true;
	                }   
	            }
	        }
	        return match;
	    }
	}
