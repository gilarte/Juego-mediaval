package ranking;

import java.util.HashMap;
import java.util.TreeMap;

import utils.Utils;

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

	public void muestraRanking() {
		TreeMap<String, Integer> sorted = new TreeMap<String, Integer>();
		if(Ranking.getMiRanking().ranking.isEmpty()) {
			Utils.print("Esta vacío!");
		}else {
			sorted.putAll(miRanking.ranking);
			System.out.println(sorted);
		}
		

	}
	
	public boolean search(String name) {
		for(String n:ranking.keySet()) {
			if(n.equals(name)) {
				return true;
			}
		}
		return false;
	}
}
