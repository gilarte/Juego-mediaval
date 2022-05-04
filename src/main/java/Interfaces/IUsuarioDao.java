package Interfaces;

import model.Usuario;

public interface IUsuarioDao {

	
	public boolean addUser(Usuario u);
	public boolean showUsers();
	public boolean deleteUser(Usuario u);
	public Usuario search(String name);
	public boolean isEmpty();
}
