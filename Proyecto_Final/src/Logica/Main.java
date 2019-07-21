package Logica;

public class Main {

	public static void main(String[] args) {
		
		
		PrismasLab controladora =  PrismasLab.getInstance();
		
		Cuadrado cuadradoPrueba = new Cuadrado(5, "Cuadrado 1", 0, 4, 0, 4);
		
		Usuarios usuarioPrueba = new Usuarios("usuario 1", "contra", "Estudiante");
		
		usuarioPrueba.insertarFiguras(cuadradoPrueba);
		
		Triangulo trianguloPrueba = new Triangulo(5, "Triangulo 1", 114, 200, 141, 174, 121, 49);
		
		
		
		System.out.println(cuadradoPrueba.areaLateral());
		System.out.println(trianguloPrueba.areaLateral());
		
		
	}

}
