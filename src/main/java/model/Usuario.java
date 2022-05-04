package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Usuario")
@XmlAccessorType(XmlAccessType.FIELD)
public class Usuario {

	@XmlAttribute(name="Nombre")
	private String nombre;
	@XmlAttribute(name="Puntuación")
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
<<<<<<< HEAD
		return "Usuario: " + nombre + ",\nPuntuacion: " + puntuacion;
=======
		return "Usuario: " + nombre + ", Puntuacion: " + puntuacion;
>>>>>>> 83403a4d4c09564e4e669b9d27b964fc4f8eeeb1
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
<<<<<<< HEAD
}
=======
	

	
}
>>>>>>> 83403a4d4c09564e4e669b9d27b964fc4f8eeeb1
