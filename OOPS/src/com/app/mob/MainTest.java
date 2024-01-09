package com.app.mob;

import com.app.program.DesktopApplication1;
import com.app.program.Developer1;
import com.app.program.Webapplication1;

public class MainTest {
	public static void main(String[] args) {
		Developer1 d= new Developer1("sunil",10,"java");
		Webapplication1 w=new Webapplication1("java",d,"abc");
		System.out.println(w);
		System.out.println("--------------------------------------------------------------");
		DesktopApplication1 a=new DesktopApplication1("python",d,"version 8");
		System.out.println(a);
		System.out.println("--------------------------------------------------------------------");
		MobileAplication m=new MobileAplication("ios",d,"video callig");
		System.out.println(m);
	}

}
