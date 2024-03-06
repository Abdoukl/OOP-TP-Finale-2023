package tp_finale2023;

public class Simple extends Piece {
	//Attributes
	private float fab_time;
	//Methods
	public Simple (String n, float t) {
		super(n);
		fab_time = t;
	}
	public float fab_time () {
		return this.fab_time;
	}
	//To not make Simple class abstract.
	void add(Piece p) {
	}
}
