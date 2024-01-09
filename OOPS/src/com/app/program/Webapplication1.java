package com.app.program;

public class Webapplication1 extends Application1
{
	private String server;

	
	 public Webapplication1(){
		super();
		// TODO Auto-generated constructor stub
	}

	public Webapplication1(String versionTCyused, Developer1 developer, String server) {
		super(versionTCyused, developer);
		this.server = server;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	@Override
	public String toString() {
		return super.toString()+"WebApplication [server=" + server + "]";
	}

}
