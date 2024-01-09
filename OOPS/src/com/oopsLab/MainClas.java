package com.oopsLab;

public class MainClas {
	double overloadedMethod(double d)
	{
		return d*=d;
	}
	int overloadedMethod(int i)
	{
		return overloadedMethod(i*i);
	}
	float overloadedMethod(float f)
	{
		return overloadedMethod(f*=f);
	}
	public static void main(String[] args) {
		MainClas main=new MainClas();
		System.out.println(main.overloadedMethod(100));
	}
 
}
