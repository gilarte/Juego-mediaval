package model.DAO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import Interfaces.IUsuarioDao;
import model.Usuario;

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
		boolean result=false;
		Iterator<Usuario> it=misUsuarios.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			result=true;
		}
		return result;
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
	
	public Usuario search(String name) {
		Iterator<Usuario> it=misUsuarios.iterator();
		while(it.hasNext()) {
			if(it.next().getNombre()==name) {
                return it.next();
            }
		}
		return null;
	}
	
	public boolean isEmpty() {
		if(!misUsuarios.isEmpty()) {
			return true;
		}
		return false;
	}

}
