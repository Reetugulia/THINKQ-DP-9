package com.overridingassign;
class Shape {
   
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}


class Circle extends Shape {
    
    @Override
    void draw() {
        System.out.println("Drawing a circle");
      
    }
}


class Square extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a square");
        
    }
}


class Rectangle extends Shape {
   
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
       
    }
}
public class Shapeques {
	 public static void main(String[] args) {
	       
	        Shape Shape = new Shape();
	        Circle circle = new Circle();
	        Square square = new Square();
	        Rectangle rectangle = new Rectangle();

	     
	        Shape.draw();
	        circle.draw();
	        square.draw();
	        rectangle.draw();
	    }

}
