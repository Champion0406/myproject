package oo.obstration;

public class Main {
	public static void maun (String[] args){
		Car c = new Car("Toyota",1800,"Altis","Sedan");
		c.setMilage(25000);
		//
		float current = c.addMilage(80);
		System.out.println("目前里程為:"+current);
		
	}
}
