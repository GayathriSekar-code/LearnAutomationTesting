package week3.day1;

public class ReverseString1 {
	
	public static void main(String args[]) {
		String s ="TESTLEAF";
		
		//converting String to character array
		char[] charArray = s.toCharArray();

		//printing string in reverse order
		for(int i=charArray.length-1; i>=0; i-- ) { 
		 System.out.print(charArray[i]);
		}
		
	}

}
