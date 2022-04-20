package Interfaces;

import model.Usuario;

public interface IUsuarioDao {

	
	public boolean addUser(Usuario u);
	public void showUsers();
	public boolean deleteUser(Usuario u);
	
}
