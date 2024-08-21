package application;

import entities.Luta;
import entities.Lutador;

public class Program {

	public static void main(String[] args) {

		Lutador[] lutadores = new Lutador[5];

		lutadores[0] = new Lutador("Pretty Boy", "Inglaterra", 24, 1.75, 68.90, 11, 3, 1);

		lutadores[1] = new Lutador("Putscript", "França", 36, 1.67, 57.80, 21, 5, 1);

		lutadores[2] = new Lutador("Snapshadow", "Brasil", 28, 1.79, 80.90, 15, 0, 0);

		lutadores[3] = new Lutador("Dead Code", "Dinamarca", 31, 1.84, 81.60, 17, 4, 0);

		lutadores[4] = new Lutador("Pretty Boy", "Estados Unidos", 21, 1.93, 110.50, 6, 1, 1);

		Luta figth01 = new Luta();
		figth01.maracarLuta(lutadores[2], lutadores[3]);
		figth01.lutar();

		lutadores[2].status();
		lutadores[3].status();
	}

}