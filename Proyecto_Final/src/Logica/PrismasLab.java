package Logica;

import java.io.Serializable;
import java.util.ArrayList;



public class PrismasLab implements Serializable {

	private static final long serialVersionUID = 1L;
	private ArrayList<Usuarios> misUsuarios;
	private static Usuarios login;
	private static PrismasLab prisma;
	private static boolean firstTime; ////////



	private PrismasLab() {
		super();
		this.misUsuarios = new ArrayList<Usuarios>();
	}

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


	public static Usuarios getLogin() {
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

	/////////////////////
	/////INSERTAR USUARIO
	public void regUser(Usuarios user) {
		misUsuarios.add(user);

	}

	/////
	public static boolean isFirstTime() {
		return firstTime;
	}

	public static void setFirsTime(boolean firsTime) {
		PrismasLab.firstTime = firsTime;
	}

	public boolean login(String txtUser , String txtPassword) {
		boolean log = false;
		for (Usuarios usuario : misUsuarios) {
			if ( (usuario.getUser().equalsIgnoreCase(txtUser)) && (usuario.getPassword().equalsIgnoreCase(txtPassword)) ) {
				login = usuario;//////login = usuario registrado
				log=true;
			}
		}
		return log;
	}


}
