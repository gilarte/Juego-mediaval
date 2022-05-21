package model;

public class Ciudad {
	private int Ciudadania = 50;
	private int Ejercito = 50;
	private int Religion = 50;
	private int Economia = 50;
	private String nombre;
	
	
	
	
	public Ciudad() {
		super();
		this.nombre = nombre;
		Ciudadania = 50;
		Religion = 50;
		Ejercito = 50;
		Economia = 50;
	}
	public Ciudad(String nombre, int ciudadania, int religion, int ejercito, int economia) {
		super();
		this.nombre = nombre;
		Ciudadania = ciudadania;
		Religion = religion;
		Ejercito = ejercito;
		Economia = economia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCiudadania() {
		return Ciudadania;
	}
	public void setCiudadania(int ciudadania) {
		Ciudadania = ciudadania;
	}
	public int getReligion() {
		return Religion;
	}
	public void setReligion(int religion) {
		Religion = religion;
	}
	public int getEjercito() {
		return Ejercito;
	}
	public void setEjercito(int ejercito) {
		Ejercito = ejercito;
	}
	public int getEconomia() {
		return Economia;
	}
	public void setEconomia(int economia) {
		Economia = economia;
	}
	
	
	
	@Override
	public String toString() {
		return "Ciudad [Ciudadania=" + Ciudadania + ", Religion=" + Religion + ", Ejercito="
				+ Ejercito + ", Economia=" + Economia + "]";
	}
	
	
	
	
	

}
