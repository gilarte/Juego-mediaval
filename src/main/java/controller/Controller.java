package controller;

import Interfaces.IController;
import model.Ciudad;
import model.Decisiones;
import model.Eventos;
import model.Usuario;
import model.DAO.UsuarioDAO;
import ranking.Ranking;
import utils.Utils;
import vistas.Vistas;

public class Controller implements IController {

	public void startGame() {
		boolean valid = true;
		UsuarioDAO x = UsuarioDAO.getInstance();
		Usuario elegido = null;
		do {
			
			Vistas.inicio();
			int opc = Utils.leeEntero();
			switch (opc) {
			case 1:
				elegido=login(x, elegido);
				break;
			case 2: 
				boolean valide=true;
				String aux="";
				do {
					//Utils.print("\n\n\nUn nombre de usuario es válido si cumple las siguientes reglas:");
					//Utils.print("El nombre de usuario debe tener al menos 6 caracteres y no exceder los 16 caracteres.\n El nombre de usuario debe contener solo letras, números y, opcionalmente, un guión (-).\n El nombre de usuario debe comenzar con una letra y no debe terminar con un guión. ");
					Utils.print("\nIntroduce el nombre de usuario nuevo:");
					String username=Utils.leeString();
					aux=username;
					valide=false;
				}while(valide);
				Usuario a = new Usuario(aux,0);
				UsuarioDAO.getInstance().addUser(a);
				Utils.print("Usuario "+a.getNombre()+" con una puntuación actual de "+a.getPuntuacion()+"\nHa sido agregado con éxito.");
				break;
			case 3: //se borran usuarios inexistentes
				Usuario d = new Usuario();
				if (x.isEmpty()) {
					Utils.print("elige usuario:");
					UsuarioDAO.getInstance().showUsers();
					d=x.search(Utils.leeString());
					if(d!=null) {
						x.deleteUser(d);
						Utils.print("Usuario borrado correctamente");
					}else {
						Utils.print("el nombre de usuario introducido no existe.");
					}
					elegido=null;
				}else {
					Utils.print("No hay usuarios registrados.");
				}
				break;
			case 4:
				if(elegido!=null) {
					System.out.println("CORRECTO");
					Utils.print(elegido.toString());
					Ciudad c=new Ciudad();
					Usuario auxx=new Usuario("auxiliar", elegido.getPuntuacion());
					Decisiones dec = new Decisiones();
					Eventos ev = new Eventos();
					
					int contador=6;
					Utils.print("Bienvenido, eres el heredero de esta ciudad\n y tienes que ir eligiendo una serie de decisiones\n para que la ciudad prospere... Buena suerte!");
					while(showCity(c)) {
						c=dec.eligedecicion(dec.muestraDecicicones(), c);
						System.out.println(c);
						if(showCity(c)) {
							contador++;
							if(mult(contador)) {
								ev.eligeEvento(c);
								System.out.println(c);
							}
						}
					}
					Utils.print("Has perdido");
					if(contador>auxx.getPuntuacion()) {
						if(Ranking.getMiRanking().search(elegido.getNombre())) {
							Ranking.getMiRanking().updatePuntuacion(elegido.getNombre(), contador);
						}else {
							Ranking.getMiRanking().addToRanking(elegido.getNombre(), contador);
						}
					}
					
				}else {
					Utils.print("No has elegido un usuario");
				}
				break;
			case 5:
				if(elegido!=null) {
					Utils.print("Tu usuario actual es "+elegido);
					Utils.print("");
					Utils.print("Cerrando usuario...");
					elegido=null;
					Utils.print("");
					Utils.print("Usuario cerrado!");
					elegido=login(x,elegido);
					
				}else {
					Utils.print("No estas logueado");
				}
				break;
			case 6:
					Ranking.getMiRanking().muestraRanking();
				break;
			case 0:
				valid = false;
				break;

			default:
				Utils.print("Opción inválida.");
				break;
			}

		} while (valid);
		Utils.print("Adios");
	}
	
	public static Usuario login(UsuarioDAO x, Usuario elegido) {
		if (x.isEmpty() && elegido==null) {
			Utils.print("elige usuario:\n");
			UsuarioDAO.getInstance().showUsers();
			boolean valide=true;
			do {
				try {
					
					elegido=x.search(Utils.leeString());
					Utils.print("Usuario "+elegido.getNombre()+" con una puntuación de "+elegido.getPuntuacion()+"\nHa sido elegido correctamente");
					valide=false;
				} catch (Exception e) {
					// TODO: handle exception
					Utils.print("No existe ese usuario!");
				}
			}while(valide);
			

		}else if(!x.isEmpty()){
			Utils.print("No hay usuarios registrados.");
		}else if(elegido!=null) {
			Utils.print("Ya has elegido un usuario");
		}
		return elegido;
	}

	public boolean showCity(Ciudad c) {

		if((c.getCiudadania()<100 && c.getCiudadania()>0) && (c.getEconomia()<100 && c.getEconomia()>0) && (c.getEjercito()<100 && c.getEjercito()>0) && (c.getReligion()<100 && c.getReligion()>0)) {
			return true;
		}
		return false;
	}

	public boolean mult(int x) {

		if(x%7==0) {
			return true;
		}
		return false;
	}

}
