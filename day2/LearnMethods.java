package week1.day2;

public class LearnMethods {
/**	
* syntaxaccessModifiers returntype methodname(input arguments)
* returnType: type of output that the method is expecting
* parameter a
* parameter b
* void returns no value
*/	

	void addNumbers(int a, float b) {
		System.out.println(a+b);
	}
	
	int noOfBicycles(){
		return 2;
	}
	
	String bicycleData(String brandName, String color, int RegNo){
		return brandName+""+color+""+RegNo;
	}
	
	public static void main(String[] args) {
		LearnMethods lms = new LearnMethods();
		public lms.addNumbers(5,24.1f);//sysout is available in the method itself. Wherever we are using void, we cannot use sysout in main method.
		//lms.bicycleData("BSA", "Purple", 8134); - calling the bicycledata method
		//no sysout is written for this method
		//System.out.println(lms.bicycleData("BSA","Purple",8134));
		System.out.println("\n\" + lms.bicycleData("BSA", "Purple", 8134));
		int num = lms.noOfBicycles();//do ctrl+2,L
		System.out.println(num);
	}		
	}



//public void add() {
		//int a=4;
		//int b=5;
		//System.out.println(a+b);