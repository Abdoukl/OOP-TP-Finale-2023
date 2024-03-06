package tp_finale2023;

public abstract class Piece {
	//Attributes
	private String name;
	//Methods
	public Piece (String n) {
		this.name = n;
	}
	public String getn() {
		return name;
	}
	abstract float fab_time();
	abstract void add(Piece p);
}
