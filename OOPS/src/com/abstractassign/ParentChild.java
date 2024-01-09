package com.abstractassign;

abstract class Parent {
	private String parentName;

	Parent(String name) {
		this.parentName = name;
	}

	abstract void cook();

	void wash() {
		System.out.println("Parent is washing.");
	}
}

class Child extends Parent {
	private String childName;

	Child(String parentName, String childName) {
		super(parentName); 
		this.childName = childName;
	}

	@Override
	void cook() {
		System.out.println("Child is cooking.");
	}
}

public class ParentChild {
	public static void main(String[] args) {
		Child childInstance = new Child("anita","reetu");

		childInstance.cook();
		childInstance.wash();
	}

}
