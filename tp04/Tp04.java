package noah.tp04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.Scanner;
import commun.Outils;

public class Tp04 {
	@BeforeEach void setup() {
		Outils.Aleatoire.resetSeedSet();
		Outils.Aleatoire.setSeed(123);
	}

	@Test void test11() { 
		int[] nb = {1,2,3,4,5};
		int[] pts = {0,1,4,9,16};
		assertArrayEquals(new int[] {0,0,0,0,16}, calculScore(nb,pts));
		assertArrayEquals(new int[] {1,2,3,4,5}, nb);
		assertArrayEquals(new int[] {0,1,4,9,16}, pts);
	}
	@Test void test12() { 
		int[] nb = {5,4,3,2,1};
		int[] pts = {0,1,4,9,16};
		assertArrayEquals(new int[] {0,0,0,0,0}, calculScore(nb,pts));
		assertArrayEquals(new int[] {5,4,3,2,1}, nb);
		assertArrayEquals(new int[] {0,1,4,9,16}, pts);
	}
	@Test void test13() { 
		int[] nb = {1,2,4,3,5};
		int[] pts = {0,1,4,9,16};
		assertArrayEquals(new int[] {0,0,4,0,1}, calculScore(nb,pts));
		assertArrayEquals(new int[] {1,2,4,3,5}, nb);
		assertArrayEquals(new int[] {0,1,4,9,16}, pts);
	}
	@Test void test14() { 
		int[] nb = {5,4,1,3,2};
		int[] pts = {0,1,4,9,16};
		assertArrayEquals(new int[] {0,0,0,1,0}, calculScore(nb,pts));
		assertArrayEquals(new int[] {5,4,1,3,2}, nb);
		assertArrayEquals(new int[] {0,1,4,9,16}, pts);
	}
	@Test void test15() { 
		int[] nb = {1,2,2,3,1};
		int[] pts = {0,1,4,9,16};
		assertArrayEquals(new int[] {0,0,0,9,0}, calculScore(nb,pts));
		assertArrayEquals(new int[] {1,2,2,3,1}, nb);
		assertArrayEquals(new int[] {0,1,4,9,16}, pts);
	}

	@Test void test21() { 
		int[] nb = {1,4,3,2,5};
		boolean[] dis = {true,true,true,true,true};
		assertEquals(3, pigeTuile(nb,dis));
		assertArrayEquals(new int[] {1,4,3,2,5}, nb);
		assertArrayEquals(new boolean[] {true,true,false,true,true}, dis);
	}
	@Test void test22() { 
		int[] nb = {1,4,3,2,5};
		boolean[] dis = {true,true,false,true,true};
		assertEquals(1, pigeTuile(nb,dis));
		assertArrayEquals(new int[] {1,4,3,2,5}, nb);
		assertArrayEquals(new boolean[] {false,true,false,true,true}, dis);
	}
	@Test void test23() { 
		int[] nb = {1,4,3,2,5};
		boolean[] dis = {false,true,false,true,true};
		assertEquals(4, pigeTuile(nb,dis));
		assertArrayEquals(new int[] {1,4,3,2,5}, nb);
		assertArrayEquals(new boolean[] {false,false,false,true,true}, dis);
	}
	@Test void test24() { 
		int[] nb = {1,4,3,2,5};
		boolean[] dis = {false,false,true,true,false};
		assertEquals(3, pigeTuile(nb,dis));
		assertArrayEquals(new int[] {1,4,3,2,5}, nb);
		assertArrayEquals(new boolean[] {false,false,false,true,false}, dis);
	}
	@Test void test25() { 
		int[] nb = {5,4,3,2,1};
		boolean[] dis = {true,false,false,false,true};
		assertEquals(5, pigeTuile(nb,dis));
		assertArrayEquals(new int[] {5,4,3,2,1}, nb);
		assertArrayEquals(new boolean[] {false,false,false,false,true}, dis);
	}

	@Test void test31() { assertEquals(25, somme(new int[] {1,3,5,7,9})); }
	@Test void test32() { assertEquals(6, somme(new int[] {1,0,0,5,0})); }
	@Test void test33() { assertEquals(0, somme(new int[] {0,0,0,0,0})); }
	@Test void test34() { assertEquals(8, somme(new int[] {8})); }
	@Test void test35() { assertEquals(0, somme(new int[] {})); }

	@Test void test41() { assertEquals(4, maximum(new int[] {1,3,5,7,9})); }
	@Test void test42() { assertEquals(1, maximum(new int[] {1,8,4,6})); }
	@Test void test43() { assertEquals(0, maximum(new int[] {9,7,5,3,1})); }
	@Test void test44() { assertEquals(0, maximum(new int[] {5})); }
	@Test void test45() { assertEquals(2, maximum(new int[] {3,3,8,8,3})); }

	@Test void test51() { assertEquals(1, trouve(new int[] {1,3,5,7,9}, 3)); }
	@Test void test52() { assertEquals(0, trouve(new int[] {1,3,5,7,9}, 1)); }
	@Test void test53() { assertEquals(4, trouve(new int[] {1,3,5,7,9}, 9)); }
	@Test void test54() { assertEquals(-1, trouve(new int[] {1,3,5,7,9}, 4)); }
	@Test void test55() { assertEquals(-1, trouve(new int[] {}, 7)); }


	public static final int NB_CASES = 7; // Nombre de cases à remplir par partie, maximum 20
	public static void main(String[] args) {
		float usager, Q, E, D, pointage, scoreFinal, scoreMax, distribution;
		float[] tuiles;
		// A FAIRE (45) : code
//		Outils.Aleatoire.setSeed(9531);
		Scanner cl = new Scanner(System.in);
		int[] points = {0, 1, 3, 5, 7, 9, 11, 15, 20};
		int[] pointsBase = new int[points.length];
		for(int i = 0; i < points.length; i++) {
            pointsBase[i] = points[i];
        }
		tuiles = new float[40];
		scoreMax = 0;
		int quitter = 0;
		while (quitter == 0) {
		System.out.print("Sélectionnez le pointage de Base ou Expert ou Quitter : ");
		pointage = cl.nextInt();
		if (pointage == Q){
			quitter = 1;
			break;
		} else if(pointage==E){
			points[5] = 6;
			points[11] = 12;
			points[16] = 18;
		}else{
			for (int i = 0; i < points.length; i++) {
                pointsBase[i] = points[i];
		}
	}
		System.out.print("Distribution des chiffres, soit Classique ou Différents? ");
		distribution = cl.nextInt();
		if(distribution==D){
			for (int i = 0; i < tuiles.length; i++) {
				tuiles[i] = i + 1;
			}
		} else {
			for (int i = 0; i <= 30; i++) {
				tuiles[i] = i;
			}
			for (int i = 31, j = 11; i < 40; i++, j++) {
				tuiles[i] = j;
			}
		}
		}
		float[] tableTuiles;
		scoreFinal = jouerPartie(cl, tuiles, points);
		scoreMax = scoreMax + scoreFinal;
		System.out.print("Total de la Partie = " + scoreMax);
		System.out.print("Bravo, vous avez battu votre record! Nouveau score à battre : 00" + scoreMax);
		}
	

	// A FAIRE (14) : code - documentation(/**)
	public static int jouerPartie(Scanner cl, int[] tuiles, int[] points) {
		int[] cases = toursDeJeu(cl, tuiles);
		changeJoker(cl, cases);
		int[] scores = calculScore(cases, points);
		int scoreFinal = somme(scores);
		int scoreMax = scores[maximum(scores)];
		System.out.print("Résultat final : "+ scoreFinal);
		return scoreFinal;
	}

	// A FAIRE (26) : code - documentation(/**)
	public static int[] toursDeJeu(Scanner cl, int[] tuiles) {
		int[] cases = new int[NB_CASES];
        for (int i = 0; i < NB_CASES; i++) {
            cases[i] = -1;
        }
		for (int i = 0; i < NB_CASES; i++) {
            int tuile = pigeTuile(tuiles, null);
            int vrai = 0;
			while(vrai==0) {
				System.out.print("Position d'ajout du nombre " + tuile + " > ");
                int position = cl.nextInt() - 1;
                if (position >= 0 && position < NB_CASES && cases[position] == -1) {
                    cases[position] = tuile;
                    vrai = 1;
                } else {
                    System.out.println("Cette position est invalide, choisissez-en une autre.");
                }
            }
			}
		return cases;
	}

	// A FAIRE (8) : code - documentation(/**)
	public static void changeJoker(Scanner cl, int[] cases) {
		int index = trouve(cases, 0);
        if (index != -1) {
            System.out.print("En quelle valeur voulez-vous changer le JOKER? ");
            cases[index] = cl.nextInt();
        }
	}

	// A FAIRE (13) : code - documentation(/**)
	public static int[] calculScore(int[] cases, int[] points) {
		int[] scores = new int[cases.length];
		int longueur = 1;
		for (int i = 0; i < cases.length - 1; i++) {
            if (cases[i] < cases[i + 1]) {
                longueur++;
            } else {
                scores[i] = points[longueur - 1];
                longueur = 1;
            }
        }
		scores[cases.length - 1] = points[longueur - 1];
		return scores; // Retourne le tableau des scores créé
	}

	// A FAIRE (8) : code - documentation(/**)
	public static int pigeTuile(int[] tuiles, boolean[] disponible) {
		int position = (int) (Outils.Aléatoire()*tuiles.length);
		disponible[position]=false;
		return tuiles[position]; // Retourne la valeur de la tuile pigée
	}

	// A FAIRE (15) : code - documentation(/**)
	public static void affiche(int[] tab, char sepC, char sepD, int val, String rem) {
		for (int i = 0; i < tab.length; i++) {
            if (i > 0) {
                System.out.print((tab[i - 1] < tab[i] ? sepC : sepD) + " ");
            }
            if (tab[i] == val) {
                System.out.print(rem);
            } else if (tab[i] == -1) {
                System.out.print("__");
            } else {
                System.out.print(tab[i]);
            }
        }
    }

	// A FAIRE (6) : code - documentation(/**)
	public static int somme(int[] vecteur) {
		int sum = 0;
        for (int val : vecteur) {
            sum += val;
        }
		return sum; // Retourne une valeur
	}

	// A FAIRE (8) : code - documentation(/**)
	public static int maximum(int[] vecteur) {
		int maxIndex = 0;
        for (int i = 1; i < vecteur.length; i++) {
            if (vecteur[i] > vecteur[maxIndex]) {
                maxIndex = i;
            }
        }
		return maxIndex; // Retourne une position
	}

	// A FAIRE (9) : code - documentation(/**)
	public static int trouve(int[] vecteur, int valeur) {
		for (int i = 0; i < vecteur.length; i++) {
            if (vecteur[i] == valeur) {
                return i;
            }
        }
		return -1; // Retourne une position
	}
}
