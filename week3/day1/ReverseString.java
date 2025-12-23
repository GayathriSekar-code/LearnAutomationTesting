package week3.day1;

public class ReverseString {
	
	public static void main(String args[]) {
		String s="Gayathri";
		char[] charArray = s.toCharArray();
		//for(int i=0; i<charArray.length; i++ ) { //printing string in correct order
			//System.out.println(charArray[i]);
		for(int i=charArray.length-1; i>=0; i-- ) { //printing string in reverse order
				System.out.println(charArray[i]);
		}
		
	}

}
