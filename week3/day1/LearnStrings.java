package week3.day1;

public class LearnStrings {
	
	public static void main(String[] args) {
		/**
		 * Strings:
		 * - collection of characters, Non primitive data type
		 * - immutable class(it has proper structure, behaviour, methods)
		 * 1)String literal
		 * 2)String Instantiation
		 * 
		 * 
		 */
		//String literal:syntax: Datatype var.name="values";
		//memory will be reused here
		String name="Testleaf";
		String name1="Testleaf";
		//String Instantiation
		//syntax: Class obj=new Class("values");
		String str=new String("Test Leaf");
		String str1=new String("Test Leaf");
		//everytime new memory is created even though the string is identical
		//count the no of characters
		int length = str.length();
		System.out.println(length);
		//concatenation
		System.out.println(5+9);//14
		System.out.println(5+"9");
		String s1="Welcome";
		String s2=" to TestLeaf,";
		String s3=" for Selenium Course";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2).concat(s3));
		//comparison methods		
		//equals method-->based on the content(case sensitive)
		boolean equals = str.equals(str1);
		//== method-->based on the memory address
		if (name==name) {
			System.out.println("Values matched");
		}
		else {
			System.out.println("Values not matched");
		}
		//ignore case sensitive
		boolean equalsIgnoreCase=str.equalsIgnoreCase(str1);
		System.out.println(equalsIgnoreCase);
		//toCharArray
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		//for(int i=0; i < charArray.length; i++) {
		//	System.out.println(charArray[i]);
		//charAt method
			System.out.println(name1.charAt(4));
			System.out.println(name1.charAt(5));
		//replace method
			String s="Testleaf@123";
			String replace= s.replace("e","E");
			System.out.println(replace);
			String lowerCase = s.toLowerCase();
			System.out.println(lowerCase);
		//retrieve any values
			String replaceAll = s.replaceAll("[^0-9]", "");//for values
			System.out.println(replaceAll);
			String replaceAll2= s.replaceAll("[A-z]", "");
			System.out.println(replaceAll2);
		//string to integer - when we're asked to sort prices from any eCommerce web, this will be useful
			String st="120";
			System.out.println(st+10);
			int stringToInteger = Integer.parseInt(st);
			System.out.println(stringToInteger+10);
		//integer to string
			int i1=10;
			System.out.println(i1+10);
			String integerToString = Integer.toString(i1);
			System.out.println(integerToString+10);
		//split-->split the strings to multiple strings
			String st1="Testleaf and Qeagle"; //test-->0 af and Qeag-->1(length=2)
			String [] split=st1.split("le");
			System.out.println(split[1]);
		    
			String[] split2 = st1.split(" ");
			System.out.println(split2[2]);
			
			String[] split3 = st1.split("");//t-0,e-1,s-2,t-3,l-4,e-5,a-6,f-7
			System.out.println(split3[7]);
			
			String[] split4 =st1.split("e");//t-->0 stl-->1 afandQ-->2 agl-->3
			System.out.println(split4[3]);
			
		//substring
			String st2="December";
			String substring = st2.substring(2);
			System.out.println(substring);
			String substring2 = st2.substring(2,7);//end index is n+1. last e is at the index number 6 in December.
			System.out.println(substring2);
			}
	}
	
	