import java.util.ArrayList;


public class Recette {
	private int idRecette;
	private String nomRecette;
	private int tempsPreparation;
	private int tempsCuisson;
	private int niveauDifficulte;
	private Type leType;
	private ArrayList<Aliment> lesAliments;
	
	public Recette(int idRecette, String nomRecette, int tempsPreparation,
			int tempsCuisson, int niveauDifficulte) {
		this.idRecette = idRecette;
		this.nomRecette = nomRecette;
		this.tempsPreparation = tempsPreparation;
		this.tempsCuisson = tempsCuisson;
		this.niveauDifficulte = niveauDifficulte;
		this.leType = null;
		this.lesAliments = new ArrayList<Aliment>();
	}

	public int getIdRecette() {
		return idRecette;
	}

	public void setIdRecette(int idRecette) {
		this.idRecette = idRecette;
	}

	public String getNomRecette() {
		return nomRecette;
	}

	public void setNomRecette(String nomRecette) {
		this.nomRecette = nomRecette;
	}

	public int getTempsPreparation() {
		return tempsPreparation;
	}

	public void setTempsPreparation(int tempsPreparation) {
		this.tempsPreparation = tempsPreparation;
	}

	public int getTempsCuisson() {
		return tempsCuisson;
	}

	public void setTempsCuisson(int tempsCuisson) {
		this.tempsCuisson = tempsCuisson;
	}

	public int getNiveauDifficulte() {
		return niveauDifficulte;
	}

	public void setNiveauDifficulte(int niveauDifficulte) {
		this.niveauDifficulte = niveauDifficulte;
	}
	
	public void ajouterAlim(Aliment alim){
		lesAliments.add(alim);
	}

	@Override
	public String toString() {
		String truc = "";
		for(Aliment lAlim : lesAliments){
			truc += lAlim.getNomAliment() + "\n";
		}
		return "Recette [idRecette=" + idRecette + ", nomRecette=" + nomRecette
				+ ", tempsPreparation=" + tempsPreparation + ", tempsCuisson="
				+ tempsCuisson + ", niveauDifficulte=" + niveauDifficulte + "\n" + truc + "]"
				;
	}
	
	
	
}
