package Logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;
	private String user;
	private String password;
	private String tipo;
	private ArrayList<Prismas> misFiguras;



	public Usuarios(String user, String password, String tipo, ArrayList<Prismas> misFiguras) {
		super();
		this.user = user;
		this.password = password;
		this.tipo = tipo;
		this.misFiguras = new ArrayList<Prismas>();
	}

	////CONTROL Z PAPU



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

	//////////INSERTAR FIGURAS
	public void insertarFiguras(Prismas figura) {

		misFiguras.add(figura);

	}

	public int cantidadCuadrados() {

		int cant = 0;

		for (Prismas prismas : misFiguras) {

			if (prismas instanceof Cuadrado) {
				cant++;

			}

		}

		return cant;


	}

	public int cantidadRectangulos() {

		int cant = 0;

		for (Prismas prismas : misFiguras) {

			if (prismas instanceof Rectangulo) {
				cant++;

			}

		}

		return cant;


	}

	public int cantidadRombos() {

		int cant = 0;

		for (Prismas prismas : misFiguras) {

			if (prismas instanceof Rombo) {
				cant++;

			}

		}

		return cant;


	}

	public int cantidadTrapecios() {

		int cant = 0;

		for (Prismas prismas : misFiguras) {

			if (prismas instanceof Trapecio) {
				cant++;

			}

		}

		return cant;


	}

	public int cantidadTriangulos() {

		int cant = 0;

		for (Prismas prismas : misFiguras) {

			if (prismas instanceof Triangulo) {
				cant++;

			}

		}

		return cant;


	}







}
