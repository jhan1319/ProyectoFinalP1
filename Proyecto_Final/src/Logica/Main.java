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

		
	
		PrismasLab controladora =  PrismasLab.getInstance();
		
		Cuadrado cuadradoPrueba = new Cuadrado(5, "Cuadrado 1", 0, 4, 0, 4);
		Triangulo trianguloPrueba = new Triangulo(5, "Triangulo 1", 114, 200, 141, 174, 121, 49);
		Rectangulo rectanguloPrueba = new Rectangulo(5, "Rectangulo", 4, 4, 6, 0, 9, 9);
		Rombo romboPrueba = new Rombo(5, "Rombo", 0, 0, 20, 10);
		Trapecio trapecioPrueba = new Trapecio(5, "Trapecio", 0, 2, 4, 6,      0, 2, 2, 0);
		
		
		Usuarios usuarioPrueba = new Usuarios("usuario 1", "contra", "Estudiante");
		
		usuarioPrueba.insertarFiguras(cuadradoPrueba);

		/*
		System.out.println("Area lateral cuadrado: " +cuadradoPrueba.areaLateral());
		System.out.println("Area lateral triangulo: " +trianguloPrueba.areaLateral());
		System.out.println("Area lateral rectangulo: " +rectanguloPrueba.areaLateral());
		System.out.println("Area lateral rombo: "+romboPrueba.areaLateral());
		System.out.println("Area lateral trapecio: " +trapecioPrueba.areaLateral());

		System.out.println("----------------------------------------");
		
		System.out.println("Area total de cuadrado: " +cuadradoPrueba.areaTotal());
		System.out.println("Area total de triangulo: " +trianguloPrueba.areaTotal());
		System.out.println("Area total de rectangulo: " +rectanguloPrueba.areaTotal());
		System.out.println("Area total de rombo: " +romboPrueba.areaTotal());
		System.out.println("Area total de trapecio: " +trapecioPrueba.areaTotal());
		*/
		
		System.out.println("cuadrado: " +cuadradoPrueba.areaDeLaBase());
		System.out.println("triangulo: " +trianguloPrueba.areaDeLaBase());
		System.out.println("rectangulo: " +rectanguloPrueba.areaDeLaBase());
		System.out.println("rombo: " +romboPrueba.areaDeLaBase());
		System.out.println("trapecio: " +trapecioPrueba.areaDeLaBase());

		 
		System.out.println("----------------------------------------");

		System.out.println("Volumen cuadrado: " +cuadradoPrueba.volumen());
		System.out.println("Volumen triangulo: " +trianguloPrueba.volumen());
		System.out.println("Volumen rectangulo: " +rectanguloPrueba.volumen());
		System.out.println("Volumen rombo: " +romboPrueba.volumen());
		System.out.println("Volumen trapecio: " +trapecioPrueba.volumen());

	
		
		//controladora.graficarCuadrado(0,0, 2, 2, 4, "", pink);
		
		
		
	}

}
