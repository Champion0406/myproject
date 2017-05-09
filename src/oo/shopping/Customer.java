package oo.shopping;

public class Customer {
	int price;
	float discount = 0.1f;
	float back = 0.05f;

	public Customer() {

	}

	public Customer(int price, int discount, int back) {
		super();
		this.price = price;
		this.discount = discount;
		this.back = back;
	}
		public void print(){
			System.out.println(price+"\t"+discount+"\t"+back);
		}
	}
