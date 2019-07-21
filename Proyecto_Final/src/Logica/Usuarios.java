package Logica;

import java.util.ArrayList;

public class Usuarios {
	
	private String user;
	private String password;
	private String tipo;
	private ArrayList<Prismas> misFiguras;
	
	public Usuarios(String user, String password, String tipo) {
		super();
		this.user = user;
		this.password = password;
		this.tipo = tipo;
		this.misFiguras = new ArrayList<Prismas>();
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Prismas> getMisFiguras() {
		return misFiguras;
	}

	public void setMisFiguras(ArrayList<Prismas> misFiguras) {
		this.misFiguras = misFiguras;
	}
	
	public void insertarFiguras(Prismas figura) {
		
		misFiguras.add(figura);
		
	}
	
	
	
	
	
}
