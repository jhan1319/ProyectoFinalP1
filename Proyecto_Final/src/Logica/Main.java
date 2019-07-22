package Logica;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
		
		Usuarios usuarioPrueba = new Usuarios("usuario 1", "contra", "Estudiante");
		
		usuarioPrueba.insertarFiguras(cuadradoPrueba);
		
		Triangulo trianguloPrueba = new Triangulo(5, "Triangulo 1", 114, 200, 141, 174, 121, 49);
		
		
		
		System.out.println(cuadradoPrueba.areaLateral());
		System.out.println(trianguloPrueba.areaLateral());
		
		//controladora.graficarCuadrado(x1, y1, x2, y2, altura, name);
		
		
	}

}
