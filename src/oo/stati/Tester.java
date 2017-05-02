package oo.stati;

import java.awt.GraphicsDevice;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		System.out.println(Student.pass);
		Student stu1 = new Student(85, 73, 90);
		Student stu2 = new Student(68, 84, 89);
		Student stu3 = new Student(75, 99, 59);
		stu1.print();
		stu1.print();
		stu2.print();
		GraduateStudent gstu1= new GraduateStudent(60, 50, 77);
		GraduateStudent gstu2= new GraduateStudent(78, 58, 78);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(85, 73, 90));
		list.add(new Student(68, 84, 89));
		list.add(new Student(75, 99, 59));
		list.add(new GraduateStudent(60, 50, 77));
		list.add(new GraduateStudent(78, 58, 78));
		for (int i = 0; i<list.size(); i++){
			Student stu = list.get(i);
			stu.print();
		}
		
		
		
		
		
	}

}