package model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Interfaces.IUsuarioDao;

public class UsuarioDAO implements IUsuarioDao{
	
	private Set<Usuario> misUsuarios;
	private static UsuarioDAO _newInstance;
	

	private UsuarioDAO() {
		this.misUsuarios = new HashSet<Usuario>();
	}
	
	public static UsuarioDAO getInstance() {
		if(_newInstance==null) {
			_newInstance=new UsuarioDAO();
		}
		return _newInstance;
	}
	
	/**
	 * Añade un usuario a la lista de usuarios única.
	 * @param u Usuario que se quiere añadir.
	 */
	public boolean addUser(Usuario u) {
		boolean result=false;
		if(!misUsuarios.contains(u) && u!=null) {
			misUsuarios.add(u);
			result=true;
		}
		return result;
	}

	/**
	 * Muestra a todos los usuarios de la lista de usuarios única.
	 */
	public boolean showUsers() {
		boolean valid=false;
		Iterator<Usuario> it=misUsuarios.iterator();
		while(it.hasNext()) {
			valid=true;
			System.out.println(it.next());
		}
		return valid;
	}

	/**
	 * Borra al usuario por su nombre.
	 * @param u Usuario que será borrado.
	 */
	public boolean deleteUser(Usuario u) {
		boolean result=false;
		if(misUsuarios.contains(u) && u!=null) {
			misUsuarios.remove(u);
			result=true;
		}
		return result;
	}

	/**
	 * Busca un usuario en la coleccion por su nombre y devuelve el usuario
	 */
	public Usuario search(String name) {
		Iterator<Usuario> it=misUsuarios.iterator();
		while(it.hasNext()) {
			Usuario aux = it.next();
			if(aux.getNombre().equals(name)) {
				
				return aux;
			}
		}
        return null;
    }
	
	/**
	 * Método que comprueba si la coleccion esta vacia(false) o si tiene contenido(true)
	 */
	public boolean isEmpty() {
        if(!misUsuarios.isEmpty()) {
            return true;
        }
        return false;
    }
	
	

}