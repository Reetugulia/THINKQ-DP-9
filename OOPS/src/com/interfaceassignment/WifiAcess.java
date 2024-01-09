package com.interfaceassignment;
interface	WiFi
{
	
	abstract void  enterpassword(String password);
}

class Employee1 implements  WiFi
{
    protected String name;
	protected final String password;
	@Override
	public void enterpassword(String password) {
		if(password=="abc@123")
			System.out.println("you are connected");
		else
			System.out.println("you have entered wrong password");
		
	}
	Employee1(String name)
	{
		this.password = "abc@123";
		this.name=name;
		
	}
	
}
class Admin extends Employee1
{
	Admin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String aname;

	public void enterpassword(String password) {
		if(password=="abc@123")
			System.out.println("you are connected");
		else
			System.out.println("you have entered wrong password");
		
	}
	
	
}


public class WifiAcess {
	public static void main(String[] args) {
		WiFi w;
		w=new Employee1("reetu");
		w.enterpassword("abc@123");
		w=new Admin("naveen");
		w.enterpassword("123");
	}

}
