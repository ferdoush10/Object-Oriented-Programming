package oop.solid;

// Depends upon on Interfaces or abstract classes rather than Concrete classes.

interface Reader {
	char read();
}
interface Writer {
	char write(char ch);
}
//Reader and writer dependencies on copy method. Copy does not create writer object.
//It inverts responsibility and leave it the user of copy method.

void copy(Reader r, Writer w) {
	char ch;
	while(ch = r.read() != EOF) {
		w.write(ch);
	}
}
public class DependencyInversion {

	public static void main(String[] args) {
		

	}

}
