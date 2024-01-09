package com.inheritenceassignment;
class IPLTeam 
{
	
	void play()
	{
		System.out.println("number of teams :7");
	}
	}
class CSK extends IPLTeam
{
	CSK(){
		System.out.println("Csk team");
	}
	}
class RCB extends IPLTeam
{
	RCB()
	{
		System.out.println("RCB Team");
	}
	}
public class IplMatch {
	public static void main(String[] args) {
		CSK team1=new CSK();
		team1.play();
		System.out.println("------------------------------------------------------------");
		RCB team2=new RCB();
		team2.play();
		
	}

}
