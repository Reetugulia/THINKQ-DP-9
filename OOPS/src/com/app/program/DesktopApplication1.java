package com.app.program;

public class DesktopApplication1 extends Application1{
	
		private String desktopversion;

		public DesktopApplication1() {
			super();
			// TODO Auto-generated constructor stub
		}	
		public DesktopApplication1(String versionTCyused, Developer1 developer, String desktopversion) {
			super(versionTCyused, developer);
			this.desktopversion = desktopversion;
		}
		void install()
		{
			System.out.println("install desktop application");
		}
		void uninstall() 
		{
			System.out.println("uninstall desktop application");
		}
		public String getDesktopversion() {
			return desktopversion;
		}
		public void setDesktopversion(String desktopversion) {
			this.desktopversion = desktopversion;
		}
		@Override
		public String toString() {
			return super.toString()+"DesktopApplication [desktopversion=" + desktopversion + "]";
		}

}
