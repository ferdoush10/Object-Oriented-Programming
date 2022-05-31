package oop.solid;

// this is maintain Open close principle because whenever one new shape is introduce, 
//then our area method do not need to change because it only resposible for adding area.

class ractangle {
	return Area()
}

class circle {
	return Area();
}

class polygoan {
	return area();
}
public double area(objects[] shapes) {
	double area = 0;
	
	foreach(var shape in shapes){
		area += shape.Area();
	}
	return area;
}

public class NotMainOpenClosePrinciple {

	public static void main(String[] args) {
		

	}

}
