package oo.obstration;

public class Car {
	    String brand;
	    int cc;
	    String name;
	    String type;
	    int status;
	    int id;
	    float milage;
	    
	    public Car(String brand,String name){
	    	this.brand;
	    	
	    }
	    
	    
	    public Car( String brand,int cc,String name,String type){
	    	this.brand = brand;
	    	this.cc = cc;
	    	this.name = name;
	    	this.type = type;
	    }
	    public void XXXX(){
	    	status = 5;
	    	
	    }
	    public void setMilage(int m){
	    	milage = m;
	    } 
	    public float addMilage(int m){
	    	milage = milage+m;
	    	return milage;
	    }
	    public void maintaun(){
	    	status = 5;
	    	
	    }
	}


