import java.util.ArrayList;
import java.util.Scanner;


public class TP5Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Aliment> lesAlimentsMain = new ArrayList<Aliment>();
		ArrayList<Recette> lesRecettesMain = new ArrayList<Recette>();
		
		int idAlim = -1;
		int idRecette = -1;
		int reponse = 0;
		do{
			System.out.println("Que voulez-vous faire?" +
					"\n1. Créer un aliment" +
					"\n2. Créer une recette (impossible si aucun aliment n'a été créé)" +
					"\n3. Voir les recttes existantes" +
					"\n4 Quitter");
			reponse = sc.nextInt();
			sc.nextLine();
			if(reponse == 1){
				idAlim ++;
				String nomAlim = "";
				int calo = 0;
				
				System.out.println("nom de l'aliment :");
				nomAlim = sc.nextLine();
				
				System.out.println("calories de l'aliment :");
				calo = sc.nextInt();
				sc.nextLine();
				
				lesAlimentsMain.add(new Aliment(idAlim, nomAlim, calo));
			}
			
			else if(reponse == 2){
				
				if(lesAlimentsMain.size() == 0){
					System.out.println("Impossible de créer une rectte sans aliments.");
				}
				
				else{
					idRecette++;
					String nomRec = "";
					int tmpsPrep = 0;
					int tmpsCuis = 0;
					int nivDiff = 0;
					
					System.out.println("Nom de la recette :");
					nomRec = sc.nextLine();
					
					System.out.println("Temps de preparation :");
					tmpsPrep = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Temps de cuisson :");
					tmpsCuis = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Niveau de difficulté :");
					nivDiff = sc.nextInt();
					sc.nextLine();
					
					lesRecettesMain.add(new Recette(idRecette, nomRec, tmpsPrep, tmpsCuis, nivDiff));
					
					String r = "";
					do{
						int r2 = 0;
						String truc = "";
						int i = 0;
						for(Aliment lAlim : lesAlimentsMain){
							truc += i + ". " + lAlim.getNomAliment() + "\n";
							i++;
						}
						System.out.println("Aliments à disposition :" + truc);
						r2 = sc.nextInt();
						sc.nextLine();
						Aliment temp = lesAlimentsMain.get(r2);
						lesRecettesMain.get(idRecette).ajouterAlim(temp);
						
						System.out.println("Ajouter un autre aliment ? o/n");
						r = sc.nextLine();
					}while(r != "n");
				}
				
			}
			else if(reponse == 3){
				for(Recette laRecette : lesRecettesMain){
					System.out.println(laRecette.toString());
				}
			}
		}while(reponse != 4);
		
	}

}
