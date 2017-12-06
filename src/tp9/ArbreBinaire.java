package tp9;

public class ArbreBinaire {
	ArbreBinaire arbregauche = null;
	ArbreBinaire arbredroit = null;
	String nom;

	public ArbreBinaire(String cnom) {
		this.nom = cnom;
	}

	public ArbreBinaire(String cnom, ArbreBinaire carbregauche, ArbreBinaire carbredroit) {
		this.nom = cnom;
		this.arbregauche = carbregauche;
		this.arbredroit = carbredroit;
	}

	public int profondeur() {
		if (arbregauche == null && arbredroit == null) {
			return (0);
		} else if (arbregauche == null) {
			return (arbredroit.profondeur() + 1);
		} else if (arbredroit == null) {
			return (arbregauche.profondeur() + 1);
		}
		return (Math.max(arbregauche.profondeur(), arbredroit.profondeur()) + 1);
	}
	
	
}