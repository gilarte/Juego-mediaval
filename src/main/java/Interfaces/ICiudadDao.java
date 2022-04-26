package Interfaces;

import model.Ciudad;

public interface ICiudadDao {
	public void aumentaCiudadania(int x, Ciudad e);
	public void disminuyeCiudadania(int x, Ciudad e );
	public void aumentaReligion(int x, Ciudad e);
	public void disminuyeReligion(int x, Ciudad e);
	public void aumentaEjercito(int x, Ciudad e);
	public void disminuyeEjercito(int x, Ciudad e);
	public void aumentaEconomia(int x, Ciudad e);
	public void disminuyeEconomia(int x, Ciudad e);
	public String muestraStats(Ciudad e);
}
