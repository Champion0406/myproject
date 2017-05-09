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
	public Student(){
		
	}
	public Student(int english,int math,int chinese){
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	public void print(){
		System.out.println(getscore(english)+"\t"+getscore(math)+"\t"+getscore(chinese));
		
	}
	private String getscore(int score){
		if (score<pass){
			return String.valueOf(score)+"*";
		}else{
				return String.valueOf(score);
			}
		}
	public String toString(){
		return
				"eng:"+english+"\n"+
				"chinese:"+chinese+"\n"+
				"math:"+math;
				
	}
	}
