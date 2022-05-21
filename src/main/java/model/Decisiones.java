package model;

import java.util.ArrayList;
import java.util.Scanner;

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
		int d = (int) (Math.random() * lista.size() );
		System.out.println(lista.get(d));
		return d;
	}
	public void eligedecicion(int pos,Ciudad ciu) {
		Scanner sc = new Scanner(System.in);
		int res=0;
		while(res!=1 && res!=2) {
			
		try {
			System.out.println("1. Si o 2. No");
			res=sc.nextInt();
			if(res==1) {
				opcDecicion(pos, true, ciu);
			}else if(res==0) {
				opcDecicion(pos, false, ciu);
			}
			
		} catch (Exception e) {
			
			System.out.println("Inserta 1 o 2");
		}
		}
		
		
	}
	
	public void opcDecicion(int pos, boolean descicion,Ciudad e) {
		CiudadDAO cda= new CiudadDAO();
		if(pos==1) {
			if(descicion==true) {
				cda.aumentaReligion(7, e);
				cda.disminuyeEconomia(4, e);
			}
			if(descicion==false) {
				cda.disminuyeReligion(1, e);
			}
		}
		if(pos==2) {
			if(descicion==true) {
				cda.aumentaEconomia(8, e);
				cda.disminuyeEjercito(5, e);
			}
			if(descicion==false) {
				
			}
		}
		if(pos==3) {
			if(descicion==true) {
				cda.aumentaEjercito(6, e);
				cda.disminuyeEconomia(4, e);
			}
			if(descicion==false) {
				
				
			}
		}
		if(pos==4) {
			if(descicion==true) {
				cda.aumentaReligion(4, e);
				cda.disminuyeCiudadania(5, e);
			}
			if(descicion==false) {
				cda.disminuyeReligion(7, e);
			}
		}
		if(pos==5) {
			if(descicion==true) {
				cda.disminuyeEconomia(4, e);
			}
			if(descicion==false) {
				cda.disminuyeEjercito(4, e);
			}
		}
		if(pos==6) {
			if(descicion==true) {
				cda.aumentaEconomia(6, e);
				cda.disminuyeReligion(3, e);
			}
			if(descicion==false) {
				cda.aumentaReligion(2, e);
			}
		}
		if(pos==7) {
			if(descicion==true) {
				cda.aumentaCiudadania(3, e);
				cda.aumentaEconomia(5, e);
				cda.disminuyeEjercito(5, e);
			}
			if(descicion==false) {
				
			}
		}
		if(pos==8) {
			if(descicion==true) {
				cda.aumentaCiudadania(8, e);
				cda.disminuyeEconomia(3, e);
			}
			if(descicion==false) {
				cda.disminuyeCiudadania(3, e);
			}
		}
		if(pos==9) {
			if(descicion==true) {
				cda.aumentaEjercito(6, e);
				cda.disminuyeEconomia(4, e);	
			}
			if(descicion==false) {
				cda.aumentaCiudadania(3, e);
			}
		}
		if(pos==10) {
			if(descicion==true) {
				cda.disminuyeEconomia(9, e);
			}
			if(descicion==false) {
				cda.disminuyeCiudadania(3, e);
				cda.disminuyeEjercito(5, e);
				cda.aumentaEconomia(4, e);
			}
		}
		if(pos==11) {
			if(descicion==true) {
				cda.aumentaEconomia(5, e);
				cda.disminuyeCiudadania(4, e);
			}
			if(descicion==false) {
				cda.aumentaCiudadania(3, e);
			}
		}
		if(pos==12) {
			if(descicion==true) {
				cda.aumentaReligion(5, e);
				cda.disminuyeCiudadania(3, e);
			}
			if(descicion==false) {
				cda.disminuyeReligion(8, e);
				cda.aumentaCiudadania(4, e);
			}
		}
		if(pos==13) {
			if(descicion==true) {
				cda.aumentaEconomia(8, e);
				cda.disminuyeCiudadania(4, e);
			}
			if(descicion==false) {
				
			}
		}
	}
	
}
