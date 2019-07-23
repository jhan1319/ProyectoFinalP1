package Logica;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.media.j3d.Sound;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws NoSuchAlgorithmException{
		////AGREGADO////
		String original = new String("Admin");
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(original.getBytes());
		byte[] digest = md.digest();
		StringBuffer sb = new StringBuffer();
		for (byte b : digest) {
			sb.append(String.format("%02x", b & 0xff));
		}

		System.out.println("original:" + original);
		System.out.println("digested(hex):" + sb.toString());
	/////////////////////	
		
	
		PrismasLab controladora =  PrismasLab.getInstance();
		
		Cuadrado cuadradoPrueba = new Cuadrado(5, "Cuadrado 1", 0, 4, 0, 4);
		Triangulo trianguloPrueba = new Triangulo(5, "Triangulo 1", 114, 200, 141, 174, 121, 49);
		Rectangulo rectanguloPrueba = new Rectangulo(5, "Rectangulo", 4, 4, 6, 0, 9, 9);
		Rombo romboPrueba = new Rombo(5, "Rombo", 0, 0, 20, 10);
		Trapecio trapecioPrueba = new Trapecio(5, "Trapecio", 0, 2, 4, 6,      0, 2, 2, 0);
		
		
		Usuarios usuarioPrueba = new Usuarios("usuario 1", "contra", "Estudiante");
		
		usuarioPrueba.insertarFiguras(cuadradoPrueba);
		
		
		
		
		//System.out.println("Area lateral cuadrado: " +cuadradoPrueba.areaLateral());
		//System.out.println("Area lateral triangulo: " +trianguloPrueba.areaLateral());
		//System.out.println("Area lateral cuadrado: " +rectanguloPrueba.areaLateral());
		//System.out.println("Area lateral rombo: "+romboPrueba.areaLateral());
		//System.out.println("Area lateral trapecio: " +trapecioPrueba.areaLateral());

		
		//controladora.graficarCuadrado(0,0, 2, 2, 4, "", pink);
		
		
	}

}
