package oop.solid;

//People always tried to inherited base class just because of save few lines of code. 
// But sometimes it is not right thing to do that.
// Sub types must be substitutable for their base types.

class Ractangle {
	viod setWidth(double w);
	void setHeight(double h);
	void getW();
	void getH();
}
// sqare is not replaceable by ractangle
// this is not maintain the liskcov substitutable principle

// don't use inheritence just save few lines of codes.
class Sqaure extends Ractangle{
	viod setWidth(double w); // set width and height by w
	void setHeight(double h); // set width and height by h
	void getW();
	void getH();
}
public class LiskcovSubstitution {

	public static void main(String[] args) {
		

	}

}
