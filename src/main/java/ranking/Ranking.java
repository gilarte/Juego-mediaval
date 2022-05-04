package ranking;

import java.util.HashMap;
import java.util.TreeMap;

public class Ranking {

	private HashMap<String, Integer> ranking;

	private static Ranking miRanking;

	private Ranking() {
		ranking = new HashMap<String, Integer>();
	}

	public static Ranking getMiRanking() {
		if (miRanking == null) {
			miRanking = new Ranking();
		}
		return miRanking;
	}

	public void addToRanking(String nombre, int puntos) {
		miRanking.ranking.put(nombre, puntos);
	}

	public void dropUserRanking(String nombre) {
		if (miRanking != null) {
			miRanking.ranking.remove(nombre);
		}
	}

	public void updatePuntuacion(String nombre, int newPuntuacion) {
		miRanking.ranking.replace(nombre, newPuntuacion);
	}

	public void muestraRanking(int numero) {
		TreeMap<String, Integer> sorted = new TreeMap<String, Integer>();
		sorted.putAll(miRanking.ranking);
		System.out.println(sorted);

	}
}
