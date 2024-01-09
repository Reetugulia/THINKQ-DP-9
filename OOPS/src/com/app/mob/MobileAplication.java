package com.app.mob;

import com.app.program.Application1;
import com.app.program.Developer1;

public class MobileAplication extends Application1{
	private String mobilefeatures;

	public MobileAplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobileAplication(String versionTCyused, Developer1 developer, String mobilefeatures) {
		super(versionTCyused, developer);
		this.mobilefeatures = mobilefeatures;
	}

	public String getMobilefeatures() {
		return mobilefeatures;
	}

	public void setMobilefeatures(String mobilefeatures) {
		this.mobilefeatures = mobilefeatures;
	}

	@Override
	public String toString() {
		return super.toString()+"MobileAplication [mobilefeatures=" + mobilefeatures + "]";
	}
	
	

}
