package tp_finale2023;

public class Complexe extends Piece{
  //Attributes
  Piece tab[] = new Piece[50];
  private float t_assemblage;
  int cpt = 0;
  //Methods
  public Complexe (String n,float t) {
    super(n);
    this.t_assemblage = t;
  }
  public void add (Piece p) {
	  tab[cpt] = p;
	  cpt++;
  }
  public float fab_time () {
	float s = 0;
    for(int i = 0; i < cpt; i++) {
      s += tab[i].fab_time();
    }
    return s+t_assemblage;
  }
}
