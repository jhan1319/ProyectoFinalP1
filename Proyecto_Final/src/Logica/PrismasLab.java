package Logica;

import java.util.ArrayList;

public class PrismasLab {
	
	private ArrayList<Usuarios> misUsuarios;
	private Usuarios login;
	
	public PrismasLab() {
		super();
		this.misUsuarios = new ArrayList<Usuarios>();

	}

	public ArrayList<Usuarios> getMisUsuarios() {
		return misUsuarios;
	}

	public void setMisUsuarios(ArrayList<Usuarios> misUsuarios) {
		this.misUsuarios = misUsuarios;
	}

	public Usuarios getLogin() {
		return login;
	}

	public void setLogin(Usuarios login) {
		this.login = login;
	}
	
	
	
	

}
