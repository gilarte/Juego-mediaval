package Model;

import java.util.HashMap;

import Model.Usuario;

public class Ranking {
	private HashMap<Integer, Usuario> ranking;
	
	private static Ranking miRanking;
	
	private Ranking(int puntuacion, Usuario a) {
		
		this.ranking =  new HashMap<Integer, Usuario>();
		ranking.put(puntuacion, a);
	}
	
	public static Ranking getMiRanking(int puntuacion, Usuario a) {
		if(miRanking==null) {
			miRanking = new Ranking(puntuacion, a);
		}
		return miRanking;
	}

	public static Ranking getMiRanking() {
		return miRanking;
	}

	
	public int getPuntuacion() {
		return miRanking.getPuntuacion();
	}
	
	public void setPuntuacion(int newPuntuacion) {
		if(miRanking!=null) {
			miRanking.setPuntuacion(newPuntuacion);
		}
	}
		
	
}
