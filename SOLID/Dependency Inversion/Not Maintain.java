package oop.solid;

// Depends upon on Interfaces or abstract classes rather than Concrete classes.

enum OutputDevice(printer, disk);
// As the number of device increase, the copy method keep changing.

void Copy(OutputDevice dev) {
	int c;
	while((c =ReadKeyBoard() !=EOF)) {
		if(dev == printer)
			writePrinter(c);
		else writeDisk(c);
	}
}

public class DependencyInversion {

	public static void main(String[] args) {
		

	}

}
