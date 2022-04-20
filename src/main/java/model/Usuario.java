package model;

public class Usuario {

	private String nombre;
	private int puntuacion;
	
	public Usuario() {
	}
	public Usuario(String nombre, int puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	@Override
	public String toString() {
		return "Usuario: " + nombre + ",\nPuntuacion: " + puntuacion;
	}
}
