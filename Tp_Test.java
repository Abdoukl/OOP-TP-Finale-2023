package tp_finale2023;

public class Tp_Test {

	public static void main(String[] args) {
		Piece ps1 = new Simple("Piéce Simple 1", 2);
		Piece ps2 = new Simple("Piéce Simple 2", 3);
		Piece pc1 = new Complexe("Piéce Complexe 1", 3);
		pc1.add(ps1);
		pc1.add(ps2);
		Piece pc2 = new Complexe("Piéce Complexe 2", 5);
		pc2.add(ps1);
		pc2.add(pc1);
		Piece pc3 = new Complexe("Piéce Complexe 3", 7);
		pc3.add(pc1);
		pc3.add(pc2);
		pc3.add(ps2);
		System.out.printf("Temps de fabrication de %s est: %f\n", ps1.getn(), ps1.fab_time());
		System.out.printf("Temps de fabrication de %s est: %f\n", ps2.getn(), ps2.fab_time());
		System.out.printf("Temps de fabrication de %s est: %f\n", pc1.getn(), pc1.fab_time());
		System.out.printf("Temps de fabrication de %s est: %f\n", pc2.getn(), pc2.fab_time());
		System.out.printf("Temps de fabrication de %s est: %f", pc3.getn(), pc3.fab_time());
	}

}
