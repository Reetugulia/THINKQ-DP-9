package com.containmentassignment;
class Address{
	private String city;
	private String state;
	 private static String country;
	
	 Address(){
		 
	 }
      Address(String city,String state)
      {
		 this.city=city;
		 this.state=state;
	 }
      public void setState(String state)
      {
    		this.state = state;
    	}
      
      public String getState() {
  		return state;
  	  }
      public void setCity(String city)
      {
    		this.city = city;
    	}
      
      public String getCity() {
  		return city;
  	}
      public static void setCountry(String country)
      {
    	  Address.country = country;
    	}
      
      public String getCountry() {
  		return country;
  	}
      public String toString() 
      {
    	  return "{"+"city:"+city+" "+"state:"+state+"country name:"+country+"}";
      }

}
public class Person {
	private String name;
	private int age;
	private String gender;
	Address address;
	
	 Person ()
	 {
		 
	 }
	 Person (String name,int age,String gender,Address address)
	 {
		 this.name=name;
		 this.gender=gender;
		 this.age=age;
		 this.address=address;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public void setGender(String gender)
	 {
		 this.gender=gender;
	 }
	 public String getGender()
	 {
		 return gender;
	 }
	 public void setAge(int age)
	 {
		 this.age=age;
	 }
	 public int getAge()
	 {
		 return age;
	 }
	 public void setAddress(Address address)
	 {
		 this.address=address;
	 }
	 public Address getAddress()
	 {
		 return address;
	 }
	 public String toString()
	 {
		 return "person name:"+name+" person age:"+age+" person address:"+address+" person gender:"+gender;
	 }
	 public static void main(String[] args) {
		 Address a1=new Address();
		 a1.setCity("pune");
		 a1.setState("maharastra");
		 
		  Address.setCountry("India");
		 Person p1=new Person();
		 p1.setName("reetu");
		 p1.setGender("female");
		 p1.setAge(28);
		 p1.setAddress(a1);
		 
		 System.out.println(p1);
		 
		 
		 
		
	}
	 
	
	
	

}
