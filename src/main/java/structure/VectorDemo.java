import java.util.*;

/**
 * Simple demo of the Vector class.
 */
public class VectorDemo {
	public static void main(String argv[]) {
		Vector v = new Vector();

		// Create a source of Objects
		StructureDemo source = new StructureDemo(15);

		// Add lots of elements to the Vector...
		v.addElement(source.getDate());
		v.addElement(source.getDate());
		v.addElement(source.getDate());

		// First print them out using a for loop.
		System.out.println("Retrieving by index:");
		for (int i = 0; i<v.size(); i++) {
			System.out.println("Element " + i + " = " + v.get(i));
		}
	}
}
