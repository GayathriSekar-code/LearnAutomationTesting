package week1.day2;

public class LearnMethod {
	//accessModifiers returnType methodname
	
	public void userName() {
		System.out.println("userName is entered successfully");
		}
	
	public void password() {
		System.out.println("password is entered successfully");
	}
	
	public void click() {
		System.out.println("logged in successfully");
	}
	
	 	//to call the method we need main method
		//When creating methods outside the main method, we can call this method anywhere we want
		//when the methods are created inside the main method, we can call this method only inside that class
		//How to call a method - create an object for a class
		//Syntax for creating an object: ClassName object = new ClassName();
	public static void main(String[] args) {
		LearnMethod lm= new LearnMethod(); //lm is the object here
		lm.userName();
		lm.password();
		lm.click();		
		
	}
}

