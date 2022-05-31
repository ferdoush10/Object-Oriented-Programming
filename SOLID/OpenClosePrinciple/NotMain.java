package oop.solid;

// this not maintain Open close principle because whenever one new shape is introduce, 
//then we need to change our area method. 
class ractangle {
	
}

class circle {
	
}

public double area(objects[] shapes) {
	double area = 0;
	
	foreach(var shape in shapes){
		if(shape == ractangle) {
			area += ractangle.width * ractangle.height;
		}
		else if(shape == circle) {
			area += pi * shape.r * shape.r;
		}
	}
	return area;
}

public class NotMainOpenClosePrinciple {

	public static void main(String[] args) {
		

	}

}
