package Interfaces;

import model.Usuario;

public interface IUsuarioDao {

	
	public boolean addUser(Usuario u);
	public boolean showUsers();
	public boolean deleteUser(Usuario u);
<<<<<<< HEAD
	public Usuario search(String name);
=======
	public Usuario search(String f);
>>>>>>> 83403a4d4c09564e4e669b9d27b964fc4f8eeeb1
	public boolean isEmpty();
}
