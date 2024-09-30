package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	public void getDetails() {
		System.out.println(" Nombre completo: " + this.name +" " + this.surname + ", " + "Area:" + this.area);
	}
}
