package Logica;

import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JInternalFrame;

import com.sun.javafx.font.LogicalFont;

import Visual.Crear_Figuras;



public class PrismasLab implements Serializable {

	private static final long serialVersionUID = 1L;
	private  ArrayList<Usuarios> misUsuarios;
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
			if ( (usuario.getUser().contentEquals(txtUser) && (usuario.getPassword().contentEquals(txtPassword)) )) {
				login = usuario;//////login = usuario registrado
				log=true;
			}
		}
		return log;
	}
	
	


	/////////////////////GRAPHIC'S RENDERS 3D/////////////////////////////////////
	
	public static void pantallaVacia( JInternalFrame panel) {
		
		
		StdDraw3D.clearOverlay();
		StdDraw3D.clear3D();
		StdDraw3D.clear(StdDraw3D.BLACK);
		
		StdDraw3D.show();
		
		
	}
	
	// Para cargar los datos de la clase controladora.
    public void cargarDatos(PrismasLab controladora) {

        File archivo = new File("Empresa.dat");
        FileInputStream fileInput;
        ObjectInputStream fileObjectInput;

        try {
            fileInput = new FileInputStream (archivo);
            fileObjectInput = new ObjectInputStream(fileInput);

            PrismasLab control = (PrismasLab) fileObjectInput.readObject();
            PrismasLab.setPrisma(control);
            fileInput.close();
            fileObjectInput.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    
    // para guardar los datos de la clase controladora
    public void salvarDatos(PrismasLab controladora) {
    	
        File file = new File("Empresa.dat");
        FileOutputStream fileOutput;
        ObjectOutputStream fileObjectOutput = null;

        try {
            fileOutput = new FileOutputStream(file);
            fileObjectOutput = new ObjectOutputStream(fileOutput);
            fileObjectOutput.writeObject(controladora);

            fileOutput.close();
            fileObjectOutput.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileObjectOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
	
	
	
	

	public static void graficarCuadrado( double x1, double y1, double x2, double y2, double altura, String name, Color color) {
		
		double lados = x2 - x1;

		if (lados < 0) {

			lados = lados * (-1);

		}

		/*
		 * Este metodo es capaz de graficar el prisma de un cuadrado
		 * Sin embargo aun hacen falta validaciones y/o advertencias para que cuando se ingresen
		 * valores que no correspondan a un cuadrado se le notifique al estudiante
		 * 
		 */
		
		
		
		


		// Sets the scale of the drawing window
		StdDraw3D.clearOverlay();
		StdDraw3D.clear(StdDraw3D.BLACK);
		StdDraw3D.clear3D();
		//StdDraw3D.setCameraPosition(0, 10, 0);
		StdDraw3D.setCameraOrientation(0, 0, 0);
		StdDraw3D.setScale(-10,10);
		
		StdDraw3D.overlayText(0, -8, "Utilice su Mouse para mover el prisma Tridimensional");
		
	//	StdDraw3D.overlayText(0, -8, );
		StdDraw3D.setPenColor(color);

		//vertices para la cara delantera

		double verticesX [] = new double [] {0, 0, lados, lados};
		double verticesY [] = new double [] {0, lados, lados, 0};
		double verticesZ [] = new double [] {0, 0, 0, 0};


		// vertices para la cara trasera//

		double vertices1X [] = new double [] {0, 0, lados, lados};
		double vertices1Y [] = new double [] {0, lados, lados, 0};
		double vertices1Z [] = new double [] {altura, altura, altura, altura};

		// vertices para la pared izquierda

		double vertices2X [] = new double [] {0, 0, 0, 0};
		double vertices2Y [] = new double [] {0, lados, lados, 0};
		double vertices2Z [] = new double [] {0, 0, altura, altura};

		// vertices para la pared derecha

		double vertices3X [] = new double [] {lados, lados, lados, lados};
		double vertices3Y [] = new double [] {0, lados, lados, 0};
		double vertices3Z [] = new double [] {altura, altura, 0, 0};

		//vertices para la pared superior

		double vertices4X [] = new double [] {0, 0, lados, lados};
		double vertices4Y [] = new double [] {lados, lados, lados, lados};
		double vertices4Z [] = new double [] {0, altura, altura, 0};

		//vertices para la pared inferior

		double vertices5X [] = new double [] {0, 0, lados, lados};
		double vertices5Y [] = new double [] {0, 0, 0, 0};
		double vertices5Z [] = new double [] {0, altura, altura, 0};

		//grafica la cara delantera
		
		
		StdDraw3D.polygon(verticesX, verticesY, verticesZ).rotate(15, 15, 0);
		//grafica la cara trasera
		StdDraw3D.polygon(vertices1X, vertices1Y, vertices1Z).rotate(15, 15, 0);
		//grafica la pared izquierda
		StdDraw3D.polygon(vertices2X, vertices2Y, vertices2Z).rotate(15, 15, 0);
		//grafica la pared derecha
		StdDraw3D.polygon(vertices3X, vertices3Y, vertices3Z).rotate(15, 15, 0);
		//grafica la pared superior
		StdDraw3D.polygon(vertices4X, vertices4Y, vertices4Z).rotate(15, 15, 0);
		//grafica la pared inferior
		StdDraw3D.polygon(vertices5X, vertices5Y, vertices5Z).rotate(15, 15, 0);
		
		
		
		
		 // Draws the information text.
     
        
		
		StdDraw3D.show();

		
		


	}

	public static void graficarRectangulo(double x1, double y1, double x2, double y2, double x3, double y3, double altura, String nombre, Color color) {

		// Sets the scale of the drawing window
		StdDraw3D.clearOverlay();
		StdDraw3D.clear(StdDraw3D.BLACK);
		StdDraw3D.setScale(-10,10);
		StdDraw3D.clear3D();
		StdDraw3D.setCameraOrientation(0, 0, 0);
		
		StdDraw3D.setPenColor(color);
		StdDraw3D.overlayText(0, -8, "Utilice su Mouse para mover el prisma Tridimensional");


		double ancho = 0;
		double largo = 0;

		largo = x2 - x1;

		ancho = y2 - y1;

		if (x2 - x1 == 0 ) {


			largo = Math.abs(x3 - x1);

		}

		if (y2 - y1 == 0) {

			ancho = Math.abs(y3 - y1);



		}

		//vertices para la cara delantera

		double verticesX [] = new double [] {0, 0, largo, largo};
		double verticesY [] = new double [] {0, ancho, ancho, 0};
		double verticesZ [] = new double [] {0, 0, 0, 0};


		// vertices para la cara trasera//

		double vertices1X [] = new double [] {0, 0, largo, largo};
		double vertices1Y [] = new double [] {0, ancho, ancho, 0};
		double vertices1Z [] = new double [] {altura, altura, altura, altura};

		// vertices para la pared izquierda

		double vertices2X [] = new double [] {0, 0, 0, 0};
		double vertices2Y [] = new double [] {0, ancho, ancho, 0};
		double vertices2Z [] = new double [] {0, 0, altura, altura};

		// vertices para la pared derecha

		double vertices3X [] = new double [] {largo, largo, largo, largo};
		double vertices3Y [] = new double [] {0, ancho, ancho, 0};
		double vertices3Z [] = new double [] {altura, altura, 0, 0};

		//vertices para la pared superior

		double vertices4X [] = new double [] {0, 0, largo, largo};
		double vertices4Y [] = new double [] {ancho, ancho, ancho, ancho};
		double vertices4Z [] = new double [] {0, altura, altura, 0};

		//vertices para la pared inferior

		double vertices5X [] = new double [] {0, 0, largo, largo};
		double vertices5Y [] = new double [] {0, 0, 0, 0};
		double vertices5Z [] = new double [] {0, altura, altura, 0};



		//grafica la cara delantera
		StdDraw3D.polygon(verticesX, verticesY, verticesZ).rotate(15, 15, 0);
		//grafica la cara trasera
		StdDraw3D.polygon(vertices1X, vertices1Y, vertices1Z).rotate(15, 15, 0);
		//grafica la pared izquierda
		StdDraw3D.polygon(vertices2X, vertices2Y, vertices2Z).rotate(15, 15, 0);
		//grafica la pared derecha
		StdDraw3D.polygon(vertices3X, vertices3Y, vertices3Z).rotate(15, 15, 0);
		//grafica la pared superior
		StdDraw3D.polygon(vertices4X, vertices4Y, vertices4Z).rotate(15, 15, 0);
		//grafica la pared inferior
		StdDraw3D.polygon(vertices5X, vertices5Y, vertices5Z).rotate(15, 15, 0);
		
		 // Draws the information text.
        StdDraw3D.setPenColor(StdDraw3D.WHITE);
        StdDraw3D.overlayText(0, -8, "Utilice su Mouse para mover el prisma Tridimensional");
		

		// Renders to the drawing window
		StdDraw3D.show();



	}

	public static void graficarTrapecio(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double altura, double h, String nombre, Color color) {

		
		
		// Sets the scale of the drawing window
		StdDraw3D.clearOverlay();
		StdDraw3D.clear(StdDraw3D.BLACK);
		StdDraw3D.setScale(-10,10);
		StdDraw3D.clear3D();
		StdDraw3D.setCameraOrientation(0, 0, 0);
		//	StdDraw3D.loadScene3D(filename);
		
		StdDraw3D.setPenColor(color);
		StdDraw3D.overlayText(0, -8, "Utilice su Mouse para mover el prisma Tridimensional");

		double Y14 = y1;
		double Y23 = y2;

		/*
		 * Segun lo visto se obtienen la siguientes conclusiones:
		 * 
		 * 1. Los vertices y1 & y4 deben ser iguales
		 * 2. Los vertices y2 & y3 deben ser iguales
		 * 3. El vertice X2 debe ser mayor o igual al vertice X1 (para un trapecio cuya pendiente este a la derecha x2 = x1)
		 * 4. El vertice X4 debe ser mayor o igual al vertice X3 (Para un trapecio cuya pendiente este a la izquierda x3 = x4)
		 * 5. El parametro "Altura del trapecio" deberia ser asignado por el programa, pues al ingresar 4 vertices
		 * >> automaticamente se obtiene la altura de este.
		 * 
		 */


		//vertices de la cara delantera
		double verticesX [] = new double [] {x1, x2, x3, x4};
		double verticesY [] = new double [] {Y14, Y23, Y23, Y14};
		double verticesZ [] = new double [] {0, 0, 0, 0};

		//vertices de la cara trasera
		double verticesX1 [] = new double [] {x1, x2, x3, x4};
		double verticesY1 [] = new double [] {Y14, Y23, Y23, Y14};
		double verticesZ1 [] = new double [] {h, h, h, h};

		//vertices de la cara izquierda
		double verticesX2 [] = new double [] {x1, x2, x2, x1};
		double verticesY2 [] = new double [] {Y14, Y23, Y23, Y14};
		double verticesZ2 [] = new double [] {h, h, 0, 0};

		//vertices de la cara izquierda
		double verticesX3 [] = new double [] {x4, x3, x3, x4};
		double verticesY3 [] = new double [] {Y14, Y23, Y23,Y14};
		double verticesZ3 [] = new double [] {0, 0, h, h};

		//vertices de la cara superior
		double verticesX4 [] = new double [] {x2, x2, x3, x3};
		double verticesY4 [] = new double [] {Y23, Y23, Y23, Y23};
		double verticesZ4 [] = new double [] {h, 0, 0, h};

		//vertices de la cara inferior
		double verticesX5 [] = new double [] {x1, x1, x4, x4};
		double verticesY5 [] = new double [] {Y14, Y14, Y14, Y14};
		double verticesZ5 [] = new double [] {h, 0, 0, h};



		//grafica cara delantera
		StdDraw3D.polygon(verticesX, verticesY, verticesZ).rotate(15, 15, 0);

		//grafica la cara trasera
		StdDraw3D.polygon(verticesX1, verticesY1, verticesZ1).rotate(15, 15, 0);

		//grafica la cara izquiera
		StdDraw3D.polygon(verticesX2, verticesY2, verticesZ2).rotate(15, 15, 0);

		//grafica la cara derecha
		StdDraw3D.polygon(verticesX3, verticesY3, verticesZ3).rotate(15, 15, 0);

		//grafica la cara superior
		StdDraw3D.polygon(verticesX4, verticesY4, verticesZ4).rotate(15, 15, 0);

		//grafica la cara inferior
		StdDraw3D.polygon(verticesX5, verticesY5, verticesZ5).rotate(15, 15, 0);
		
		 // Draws the information text.
        StdDraw3D.setPenColor(StdDraw3D.WHITE);
        StdDraw3D.overlayText(0, -8, "Utilice su Mouse para mover el prisma Tridimensional");
		


		// Renders to the drawing window
		StdDraw3D.show();
	}

	public static void graficarTriangulo(double x1, double y1, double x2, double y2, double x3, double y3, double h, String nombre, Color color) {

		// Sets the scale of the drawing window
		StdDraw3D.setCameraOrientation(0, 0, 0);
		StdDraw3D.clearOverlay();
		StdDraw3D.clear(StdDraw3D.BLACK);
		StdDraw3D.setScale(-10,10);
		StdDraw3D.clear3D();
		
		StdDraw3D.setPenColor(color);
		StdDraw3D.overlayText(0, -8, "Utilice su Mouse para mover el prisma Tridimensional");

		//vertices de la cara delantera
		double verticesX [] = new double [] {x1, x2, x3};
		double verticesY [] = new double [] {y1, y2, y3};
		double verticesZ [] = new double [] {0, 0, 0, 0};

		//vertices de la cara trasera
		double verticesX1 [] = new double [] {x1, x2, x3};
		double verticesY1 [] = new double [] {y1, y2, y3};
		double verticesZ1 [] = new double [] {h, h, h, h};

		//vertices de la cara izquierda
		double verticesX2 [] = new double [] {x1, x1, x2, x2};
		double verticesY2 [] = new double [] {y1, y1, y2, y2};
		double verticesZ2 [] = new double [] {0, h, h, 0};

		//vertices de la cara derecha
		double verticesX3 [] = new double [] {x3, x2, x2, x3};
		double verticesY3 [] = new double [] {y3, y2, y2, y3};
		double verticesZ3 [] = new double [] {0, 0, h, h};

		//vertices de la cara inferior
		double verticesX4 [] = new double [] {x1, x1, x3, x3};
		double verticesY4 [] = new double [] {y1, y1, y3, y3};
		double verticesZ4 [] = new double [] {0, h, h, 0};




		//grafica la cara delantera
		StdDraw3D.polygon(verticesX, verticesY, verticesZ).rotate(15, 15, 0);

		//grafica la cara trasera
		StdDraw3D.polygon(verticesX1, verticesY1, verticesZ1).rotate(15, 15, 0);

		//grafica la cara izquierda
		StdDraw3D.polygon(verticesX2, verticesY2, verticesZ2).rotate(15, 15, 0);

		//grafica de la cara derecha
		StdDraw3D.polygon(verticesX3, verticesY3, verticesZ3).rotate(15, 15, 0);

		//grafica de la cara inferior
		StdDraw3D.polygon(verticesX4, verticesY4, verticesZ4).rotate(15, 15, 0);
		
		 // Draws the information text.
        StdDraw3D.setPenColor(StdDraw3D.WHITE);

        StdDraw3D.overlayText(0, -8, "Utilice su Mouse para mover el prisma Tridimensional");
		


		// Renders to the drawing window
		StdDraw3D.show();


	}


	public static void  graficarRombo(double x1, double y1, double altura, double d, double d2, String nombre, Color color) {
		
		StdDraw3D.clearOverlay();
		StdDraw3D.clear(StdDraw3D.BLACK);
		StdDraw3D.clear3D();
		StdDraw3D.setCameraOrientation(0, 0, 0);

		StdDraw3D.setScale(-10, 10);
		
		StdDraw3D.setPenColor(color);
		StdDraw3D.overlayText(0, -8, "Utilice su Mouse para mover el prisma Tridimensional");

		double x2 = x1 - (d2/2);
		double y2 = y1 - (d/2);
		double x3 = x1;
		double y3 = y1 - d;
		double x4 = x1 + (d2/2);
		double y4 = y2;


		
		

		double xb1[] = new double[]{x1,x2,x3,x4};
		double yb1[] = new double[]{y1,y2,y3,y4};
		double zb1[] = new double[]{0,0,0,0};
		StdDraw3D.polygon(xb1,yb1,zb1).rotate(15, 15, 0);
		double xb2[] = new double[]{x1,x2,x3,x4};
		double yb2[] = new double[]{y1,y2,y3,y4};
		double zb2[] = new double[]{altura,altura,altura,altura};
		StdDraw3D.polygon(xb2,yb2,zb2).rotate(15, 15, 0);
		double xl1[] = new double[]{x1,x2,x2,x1};
		double yl1[] = new double[]{y1,y2,y2,y1};
		double zl1[] = new double[]{0,0,altura,altura};
		StdDraw3D.polygon(xl1,yl1,zl1).rotate(15, 15, 0);
		double xl2[] = new double[]{x2,x3,x3,x2};
		double yl2[] = new double[]{y2,y3,y3,y2};
		double zl2[] = new double[]{0,0,altura,altura};
		StdDraw3D.polygon(xl2,yl2,zl2).rotate(15, 15, 0);
		double xl3[] = new double[]{x3,x4,x4,x3};
		double yl3[] = new double[]{y3,y4,y4,y3};
		double zl3[] = new double[]{0,0,altura,altura};
		StdDraw3D.polygon(xl3,yl3,zl3).rotate(15, 15, 0);
		double xl4[] = new double[]{x4,x1,x1,x4};
		double yl4[] = new double[]{y4,y1,y1,y4};
		double zl4[] = new double[]{0,0,altura,altura};
		StdDraw3D.polygon(xl4,yl4,zl4).rotate(15, 15, 0);
		
		 // Draws the information text.
        StdDraw3D.setPenColor(StdDraw3D.WHITE);
        StdDraw3D.overlayText(0, -8, "Utilice su Mouse para mover el prisma Tridimensional");
		
		//    StdDraw3D.setOrbitCenter(((x1+x3)/2),((y1+y3)/2),alt/2);

		StdDraw3D.show();

	}
	/*
	public static void textoEspera() {
		
		
		   // Sets the scale
        StdDraw3D.setScale(-10, 10);
         
        // Turns off the default info HUD display.
        StdDraw3D.setInfoDisplay(false);
        
        // Draws the two red circles.
        StdDraw3D.setPenRadius(0.06);
        StdDraw3D.setPenColor(StdDraw3D.RED, 220);
        StdDraw3D.overlayCircle(0, 0, 0.8);
        StdDraw3D.setPenColor(StdDraw3D.RED, 220);
        StdDraw3D.overlayCircle(0, 0, 0.6);
 
        // Draws the information text.
        //StdDraw3D.setPenColor(StdDraw3D.WHITE);
       // StdDraw3D.overlayText(0, 0.91, "Standard Draw 3D - Test Program");
        //StdDraw3D.overlayText(0, -0.95, "You should see rotating text. Drag the mouse to orbit.");
 
        // Creates the 3D text object and centers it.
        StdDraw3D.setPenColor(StdDraw3D.YELLOW);
        StdDraw3D.setFont(new Font("Arial", Font.BOLD, 16));
        StdDraw3D.Shape text = StdDraw3D.text3D(0, 0, 0, "Prisma's Lab");
        text.scale(3.5);
        text.move(-0.7, -0.1, 0);
        text = StdDraw3D.combine(text);
 
            StdDraw3D.show();
		
	}*/
	
	public static Usuarios buscarUsuario(String nombre) {
		
		System.out.println("KLK ETA E LA PRUEBA");
		
		Usuarios aux = null;
		
		for (Usuarios estudiante : PrismasLab.getInstance().misUsuarios) {
			
			if (estudiante.getUser().equalsIgnoreCase(nombre)) {
				
				aux = estudiante;
				
			}
			
		}
		
		
		
		System.out.println("El objeto es: " + aux.getUser().toString() );
		
		return aux;
		
	}
	
	public void eliminarUsuario(Usuarios user) {
		
		misUsuarios.remove(user);
		
		System.out.println("USUARIO FUERA PAPA");
		
		
		
	}
	
	public Prismas encontrarFigura(String nombre) {
		
		Prismas fig = null;
		
		for (Prismas figura : getLogin().getMisFiguras()) {
			
			if (figura.getNombre().contentEquals(nombre)) {
				
				fig = figura;
				
			}
			
		}
		
		System.out.println("TENGO EL CUBITO");
		
		return fig;
		
		
		
	}
	
	


}



