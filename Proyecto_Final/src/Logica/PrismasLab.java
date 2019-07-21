package Logica;

import java.util.ArrayList;

public class PrismasLab {
	
	private ArrayList<Usuarios> misUsuarios;
	private Usuarios login;
	
	private PrismasLab() {
		super();
		this.misUsuarios = new ArrayList<Usuarios>();
	}


	private static PrismasLab prisma;
	
	
	public static PrismasLab getInstance() {
		
		if(prisma == null) {
			prisma = new PrismasLab();
		}
		
		return prisma;
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


	public static PrismasLab getPrisma() {
		return prisma;
	}


	public static void setPrisma(PrismasLab prisma) {
		PrismasLab.prisma = prisma;
	}
	


}
