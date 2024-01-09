package com.interfaceassignment;
interface Playable
{
	void play();
}
class football implements Playable
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("football team");
	}
	
}
class Volleyball implements Playable
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("volleyball team");
	}
	
}
class Basketball implements Playable
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("basketball team");
	}
	
}
public class PlayInterface {
	public static void main(String[] args) {
		Playable p;
		p=new Basketball();
		p.play();
		p=new Volleyball();
		p.play();
		p=new football();
		p.play();
		
	}

}
