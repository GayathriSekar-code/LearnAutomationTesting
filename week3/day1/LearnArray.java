package week3.day1;

import java.util.Arrays;

public class LearnArray {
	
	public static void main(String[] args) {
		
		/*
		 * arrays - collection of items of same data type
		 * * implementations:
		 * 1) Array Literal--->based on data
		 * syntax: datatype variablename[]={}values;
		 * 
		 * 2)Array Instantiation
		 * syntax: Datatype var.name[]=new Datatype{values}
		 * 
		 */
		
		//ArrayLiteral
		int marks[]= {98,78,65,56,90}; //index starts from 0 and length starts from 1
		
		//length of array
		int length = marks.length;
		System.out.println(length);
		
		//sort an array
		Arrays.sort(marks);; //56,65,78,98,90
		for(int i=0; i<marks.length; i++) {
		System.out.println(marks[i]);

		//printing the last value
		System.out.println(marks[length-1]);
		
		//Array Instantiation
		int marks1[]=new int[4];
		//marks1[0]=78; marks1[1]=68; marks1[2]=80; marks1[3]=18;
		System.out.println("using instantiation:"+marks1[3]);
		
		String learners[]=new String[2];
		System.out.println("from instantiation:"+learners[1]);
		
		}
	}

}
