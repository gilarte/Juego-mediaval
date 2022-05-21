package model;

import java.util.ArrayList;
import java.util.Scanner;

import model.DAO.CiudadDAO;
import utils.Utils;

public class Decisiones {

	private ArrayList<String> lista;


	public Decisiones() {
		lista = new ArrayList<String>();
		this.crearDecicion();
	}
	
	private void crearDecicion() {
		lista.add("¿Quieres construir una iglesia?");
		lista.add("Una Ciudad Extranjera te ofrece mucho dinero a cambio de armas, ¿aceptas la oferta?");
		lista.add("¿Quieres Construir un campamento para tu ejercito?");
		lista.add("Un grupo de ciudadanos esta difundiendo que la religion es un mito ¿Quieres castigarlos con la muerte?");
		lista.add("Una parte del ejercito amenaza con unirse al enemigo si no le pagan mas, ¿Aceptas subirlse eñ sueldo?");
		lista.add("¿Pedir a la iglesia que que page impuestos?");
		lista.add("¿Quieres mandar al ejercito a saquear y buscar esclavos en ciudades enemigas?");
		lista.add("¿Quieres construir una escuela?");
		lista.add("¿Quieres reclutar campesinos para el ejercito?");
		lista.add("Una Ciudad Enemiga va a atacar tu ciudad ¿Quieres darle dinero a cambio de que no ataquen?");
		lista.add("¿Quieres subir los impuestos?");
		lista.add("Unos sacerdotes se estan gastando el dinero de la iglesia para ellos ¿Quieres matarlos por malos actos?");
		lista.add("Unos exploradores han encontrado una cueva peligrosa que aparenta tener valiosos minerales ¿Quieres mandar a que la exploren?");
		
	}

	public int muestraDecicicones() {
		int d = (int) (Math.random() * (lista.size()-1) );
		System.out.println(lista.get(d));
		return d;
	}
	public Ciudad eligedecicion(int pos,Ciudad ciu) {
		int res=0;
		boolean valid=true;
		while(valid) {
		try {
			System.out.println("1. Si o 2. No");
			res=Utils.leeEntero();
			if(res==1) {
				ciu=opcDecicion(pos, true, ciu);
				valid=false;
			}else if(res==2) {
				ciu=opcDecicion(pos, false, ciu);
				valid=false;
			}else {
				Utils.print("Escribe 1 o 2");
			}
			
		} catch (Exception e) {
			
			System.out.println("Inserta 1 o 2");
		}
		}
		
		return ciu;
	}
	
	public Ciudad opcDecicion(int pos, boolean descicion,Ciudad e) {
		CiudadDAO cda= new CiudadDAO();
		if(pos==0) {
			if(descicion==true) {
				cda.aumentaReligion(20, e);
				cda.disminuyeEconomia(20, e);
			}
			if(descicion==false) {
				cda.disminuyeReligion(1, e);
			}
		}
		if(pos==1) {
			if(descicion==true) {
				cda.aumentaEconomia(30, e);
				cda.disminuyeEjercito(20, e);
			}
			if(descicion==false) {
				
			}
		}
		if(pos==2) {
			if(descicion==true) {
				cda.aumentaEjercito(40, e);
				cda.disminuyeEconomia(20, e);
			}
			if(descicion==false) {
				
				
			}
		}
		if(pos==3) {
			if(descicion==true) {
				cda.aumentaReligion(15, e);
				cda.disminuyeCiudadania(15, e);
			}
			if(descicion==false) {
				cda.disminuyeReligion(10, e);
			}
		}
		if(pos==4) {
			if(descicion==true) {
				cda.disminuyeEconomia(30, e);
			}
			if(descicion==false) {
				cda.disminuyeEjercito(25, e);
			}
		}
		if(pos==5) {
			if(descicion==true) {
				cda.aumentaEconomia(25, e);
				cda.disminuyeReligion(10, e);
			}
			if(descicion==false) {
				cda.aumentaReligion(20, e);
			}
		}
		if(pos==6) {
			if(descicion==true) {
				cda.aumentaCiudadania(25, e);
				cda.aumentaEconomia(25, e);
				cda.disminuyeEjercito(30, e);
			}
			if(descicion==false) {
				
			}
		}
		if(pos==7) {
			if(descicion==true) {
				cda.aumentaCiudadania(20, e);
				cda.disminuyeEconomia(30, e);
			}
			if(descicion==false) {
				cda.disminuyeCiudadania(30, e);
			}
		}
		if(pos==8) {
			if(descicion==true) {
				cda.aumentaEjercito(25, e);
				cda.disminuyeEconomia(30, e);	
			}
			if(descicion==false) {
				cda.aumentaCiudadania(10, e);
			}
		}
		if(pos==9) {
			if(descicion==true) {
				cda.disminuyeEconomia(20, e);
			}
			if(descicion==false) {
				cda.disminuyeCiudadania(15, e);
				cda.disminuyeEjercito(15, e);
				cda.aumentaEconomia(30, e);
			}
		}
		if(pos==10) {
			if(descicion==true) {
				cda.aumentaEconomia(15, e);
				cda.disminuyeCiudadania(10, e);
			}
			if(descicion==false) {
				cda.aumentaCiudadania(25, e);
			}
		}
		if(pos==11) {
			if(descicion==true) {
				cda.aumentaReligion(20, e);
				cda.disminuyeCiudadania(15, e);
			}
			if(descicion==false) {
				cda.disminuyeReligion(15, e);
				cda.aumentaCiudadania(20, e);
			}
		}
		if(pos==12) {
			if(descicion==true) {
				cda.aumentaEconomia(30, e);
				cda.disminuyeCiudadania(20, e);
			}
			if(descicion==false) {
				
			}
		}
		return e;
	}
	
}
