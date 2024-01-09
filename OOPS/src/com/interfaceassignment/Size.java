package com.interfaceassignment;
interface Resizable
{
	void resizewidth(int width);
	void resizeHeight(int height);
	
}
class Rectangle implements Resizable
{

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void resizewidth(int width) {
		// TODO Auto-generated method stub
		System.out.println("new width:"+(width+10));
	}

	@Override
	public void resizeHeight(int height) {
		// TODO Auto-generated method stub
		System.out.println("new height:"+(height+10));
	}
	
}





public class Size {
	public static void main(String[] args) {
		Resizable r;
		r=new  Rectangle();
		r.resizewidth(4);
		r.resizeHeight(2);
	}

}
