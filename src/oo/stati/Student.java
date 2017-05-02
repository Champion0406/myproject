package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;
	static {
		System.out.println("STATIC!!");
		System.out.println("english");
		System.out.println("pass");
	}
	public student(){
		
	}
	public student(int english,int math,int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		
		
		
	}
}
