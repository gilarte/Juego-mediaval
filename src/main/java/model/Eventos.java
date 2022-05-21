package model;

import java.util.ArrayList;
import java.util.Random;

import model.DAO.CiudadDAO;

public class Eventos {

	ArrayList<String> eventos = new ArrayList<String>();

	public Eventos() {
		eventos = new ArrayList<String>();
		this.creaEventos();;
	}
	
	private void creaEventos() {
		eventos.add("Epidemia de Peste Bubonica");
		eventos.add("Buenas cosechas");
		eventos.add("Saqueo de barbaros");
		eventos.add("Tus Exploradores encuentra un tesoro");
		eventos.add("Dragon que destruye todo");
		eventos.add("Llegan al pueblo unos bufones");
		eventos.add("Terremoto y te destruyen las cosechas");
		eventos.add("Recibes una bendicion del cielo");
		eventos.add("La plebe se revelan");
		eventos.add("Un reino poderoso se uno a ti");
	}

	public int eligeEvento(Ciudad c) {

		int index = (int) (Math.random() * (eventos.size()-1) );

		System.out.println(eventos.get(index));
		opcEvento(index, c);
		

		return index;
	}

	public void opcEvento(int pos, Ciudad e) {
		CiudadDAO cda= new CiudadDAO();
		if (pos == 0) {
			cda.disminuyeCiudadania(20, e);
			
		} else if (pos == 1) {
			cda.aumentaCiudadania(22, e);
			cda.aumentaEconomia(15, e);

		}else if(pos == 2) {
			cda.disminuyeEjercito(25, e);
			cda.disminuyeCiudadania(30, e);
			cda.disminuyeEconomia(10, e);
		}else if(pos == 3 ) {
			cda.aumentaEconomia(40, e);			
		}else if(pos == 4) {
			cda.disminuyeCiudadania(100, e);
			cda.disminuyeEconomia(100, e);
			cda.disminuyeReligion(100, e);
			cda.disminuyeEjercito(100, e);
		}else if(pos == 5) {
			cda.aumentaCiudadania(15, e);
		}else if (pos == 6) {
			cda.disminuyeCiudadania(30, e);
			cda.disminuyeEconomia(20, e);
		}else if(pos == 7) {
			cda.aumentaCiudadania(20, e);
			cda.aumentaEconomia(30, e);
		}else if ( pos == 8) {
			cda.disminuyeEconomia(30, e);
			cda.disminuyeCiudadania(20, e);
		}else if (pos == 9 ) {
			cda.aumentaEjercito(30, e);
		}

	}
}
