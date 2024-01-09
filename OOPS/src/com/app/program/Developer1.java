package com.app.program;

	

public class Developer1 {
	
		private String developername;
		private int experience;
		private String skills;
		Developer1()
		{
			
		}
		public Developer1(String developername,int experience,String skills)
		{
			this.developername=developername;
			this.experience=experience;
			this.skills=skills;
			
		}
		public String getDevelopername() {
			return developername;
		}
		public void setDevelopername(String developername) {
			this.developername = developername;
		}
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		public String getSkills() {
			return skills;
		}
		public void setSkills(String skills) {
			this.skills = skills;
		}
		void debugApp() 
		{
			System.out.println("debug the app");
		}
		void integrateCode()
		{
			System.out.println("integrate code");
		}
		@Override
		public String toString() {
			return "Developer [developername=" + developername + ", experience=" + experience + ", skills=" + skills + "]";
		}
}


