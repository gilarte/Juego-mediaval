package controller;

import Interfaces.IController;
import model.Usuario;
import model.DAO.UsuarioDAO;
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

	public void showCity() {
		// TODO Auto-generated method stub

	}

	public void opcMenu() {
		// TODO Auto-generated method stub

	}

}
