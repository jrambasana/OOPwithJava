/* Example of a superclass variable referring to a subclass Object*/

class Box {
	double width;
	double height;
	double depth;

	Box() {  // default constructor
	}

	// constructor used when all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() { // compute and return volume
		return width * height * depth;
	}
}


// Here, Box is extended to include weight.
class BoxWeight extends Box {
	double weight; // weight of box

	// constructor for BoxWeight
	BoxWeight(double w, double h, double d, double m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
}

public class Demonstration_63 {
	public static void main(String args[]) {
        Box w1 = new BoxWeight(3, 5, 7, 8.37);
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();
		double vol;
		vol = weightbox.volume();
		System.out.println("Volume of weightbox is " + vol);
		System.out.println("Weight of weightbox is " + weightbox.weight);
		System.out.println();

		// assign BoxWeight reference to Box reference
		plainbox = weightbox;
		vol = plainbox.volume(); // OK, volume() defined in Box
		System.out.println("Volume of the box is " + vol);
		/* The following statement is invalid because plainbox does not define a weight member. */
		// System.out.println("Weight of plainbox is " + plainbox.weight);
	}
}
