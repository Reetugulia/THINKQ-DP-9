package com.app.program;

public class Application1 {
	private String versionTCyused;
	public Developer1 developer;
	public Application1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Application1(String versionTCyused, Developer1 developer) {
		super();
		this.versionTCyused = versionTCyused;
		this.developer = developer;
	}
	public String getVersionTCyused() {
		return versionTCyused;
	}
	public void setVersionTCyused(String versionTCyused) {
		this.versionTCyused = versionTCyused;
	}

	
	void install() 
	{
		System.out.println("install the app");
	}
	void uninstall()
	{
		System.out.println("uninstall the app");
	}
	@Override
	public String toString() {
		return "Application [versionTCyused=" + versionTCyused + ", developer=" + developer + "]";
	}

}
