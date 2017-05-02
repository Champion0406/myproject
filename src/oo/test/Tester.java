package oo.test;
import java.util.ArrayList;

import oo.obstration.Car;
public class Tester {

	public static void main(String[] args) {
		Car c = new Car("xxxx",25000,"name","000");
		ArrayList<String> a = new ArrayList();
		a.add("331");
		a.add("821");
		a.add("886");
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.set(3, "839");
		System.out.println(a);
		String data = a.get(3);
		//int n = (int)a.get(4);
		Student stu = new Student();
		

		
	}

}
