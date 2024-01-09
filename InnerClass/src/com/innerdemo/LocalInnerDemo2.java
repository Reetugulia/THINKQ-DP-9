package com.innerdemo;
class Mall
{
	private String mallname="Pacific";
	private String loc="pune";
	
	void doshopping() 
	{
		class Cart
		{
			String item;
			double price;
			static double bill=0;
			
			public void additem(String item,double price) 
			{
				this.item=item;
				this.price=price;
				System.out.println(this.item+":"+this.price);
				bill+=price;
			}
			public void displaybill() 
			{
				System.out.println("===========================");
				System.out.println("total bill:"+bill);
				System.out.println("thank you for shopping :"+mallname+":"+loc);
			}
		}
		Cart c1=new Cart();
		c1.additem("fruits", 200);
		c1.additem("phone", 50000);
		c1.additem("grocery", 2000);
		c1.displaybill();
	}
	
}
public class LocalInnerDemo2 {
	public static void main(String[] args) {
		Mall m1=new Mall();
		m1.doshopping();
	}

}
