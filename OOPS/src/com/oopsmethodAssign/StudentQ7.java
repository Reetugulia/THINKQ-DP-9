package com.oopsmethodAssign;

public class StudentQ7 {
	private String name;
    private int marksMath;
    private int marksScience;
    private int marksEnglish;

    
    public StudentQ7(String name, int marksMath, int marksScience, int marksEnglish) {
        this.name = name;
        this.marksMath = marksMath;
        this.marksScience = marksScience;
        this.marksEnglish = marksEnglish;
    }

    public double calculatePercentage(double marks) {
      int per=((marksMath+marksScience+marksEnglish)*100)/300;
     
      return per;
    }

    
    public void displayStudentData() {
        System.out.println("Student Name: " + name);
        System.out.println("Math Marks: " + marksMath);
        System.out.println("Science Marks: " + marksScience);
        System.out.println("English Marks: " + marksEnglish);
    }

    
    public void StudentQ7(String newName, int newMarksMath, int newMarksScience, int newMarksEnglish) {
        name = newName;
        marksMath = newMarksMath;
        marksScience = newMarksScience;
        marksEnglish = newMarksEnglish;
       
    }

    public static void main(String[] args) {
       
        StudentQ7 s1 = new StudentQ7("REETU", 90, 85, 78);

       
        System.out.println("Initial Student Data:");
        s1.displayStudentData();
        s1.calculatePercentage(345);
        s1.StudentQ7("isha", 95, 88, 82);

        


    }
}
