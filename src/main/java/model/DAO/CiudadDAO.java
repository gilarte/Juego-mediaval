package model.DAO;

import Interfaces.ICiudadDao;
import model.Ciudad;

public class CiudadDAO implements ICiudadDao {

	public void aumentaCiudadania(int x, Ciudad e) {
		// TODO Auto-generated method stub
		e.setCiudadania(x+e.getCiudadania());
		
	}

	public void disminuyeCiudadania(int x, Ciudad e) {
		// TODO Auto-generated method stub
		e.setCiudadania(e.getCiudadania()-x);
		
	}

	public void aumentaReligion(int x, Ciudad e) {
		// TODO Auto-generated method stub
		e.setReligion(x+e.getReligion());
	}

	public void disminuyeReligion(int x, Ciudad e) {
		// TODO Auto-generated method stub
		e.setReligion(e.getReligion()-x);
		
	}

	public void aumentaEjercito(int x, Ciudad e) {
		// TODO Auto-generated method stub
		e.setEjercito(x+e.getEjercito());
	}

	public void disminuyeEjercito(int x, Ciudad e) {
		// TODO Auto-generated method stub
		e.setEjercito(e.getEjercito()-x);
		
	}

	public void aumentaEconomia(int x, Ciudad e) {
		// TODO Auto-generated method stub
		e.setEconomia(x+e.getEconomia());
		
	}

	public void disminuyeEconomia(int x, Ciudad e) {
		// TODO Auto-generated method stub
		e.setEconomia(e.getEconomia()-x);
	}

	public String muestraStats(Ciudad e) {
		// TODO Auto-generated method stub
		return e.toString();
	}
	

}
