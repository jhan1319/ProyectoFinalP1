package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Cuadrado;
import Logica.Prismas;
import Logica.PrismasLab;
import Logica.Rectangulo;
import Logica.Rombo;
import Logica.StdDraw3D;
import Logica.Trapecio;
import Logica.Triangulo;
import Logica.Usuarios;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.CardLayout;

public class Estudiante_Principal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtareaLateral;
	private JTextField txtVolumen;
	private JTextField txtUser;
	private static JComboBox<String> cbxMisFormas;
	private JComboBox cbxcolor;
	private JTextField txtbase;
	private JTextField txtareaTotal;
	public static JPanel panel_grafica_formas;
	private JPanel panel_crear_figuras;
	public JPanel panel_real ;

	
	// * Launch the application.

	public static void main(String[] args) {

		try {
			Estudiante_Principal dialog = new Estudiante_Principal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Estudiante_Principal() {
		

		setUndecorated(true);
		setBounds(100, 100, 1080, 848);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(176, 196, 222));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		/////CENTRADO


		JPanel panel_windows = new JPanel();
		panel_windows.setBounds(0, 0, 1080, 42);
		panel_windows.setBackground(new Color(176, 224,230));
		contentPanel.add(panel_windows);
		panel_windows.setLayout(null);

		JLabel lblCerrar = new JLabel("");
		lblCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();

				//PrismasLab.getInstance().salvarDatos(PrismasLab.getInstance());

			}
		});
		lblCerrar.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/cancel_button.png")));
		lblCerrar.setBounds(1043, 8, 32, 25);
		panel_windows.add(lblCerrar);

		panel_crear_figuras = new JPanel();
		panel_crear_figuras.setBackground(new Color(240,248,255));
		panel_crear_figuras.setBorder(new LineBorder(Color.BLACK));
		panel_crear_figuras.setBounds(10, 62, 387, 590);
		contentPanel.add(panel_crear_figuras);
		panel_crear_figuras.setLayout(null);

		JButton btnCrearFigura = new JButton("");
		btnCrearFigura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Crear_Figuras figura= new Crear_Figuras();
				
				figura.panel_vista_previa.add(StdDraw3D.frame);
				PrismasLab.pantallaVacia(StdDraw3D.frame);
				//figura.c
				//PrismasLab.pantallaVacia(StdDraw3D.frame);
				//StdDraw3D.frame.setTitle(null);

				figura.setVisible(true);
				figura.setModal(true);
				dispose();





			}
		});
		btnCrearFigura.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/crear_figura_principal.png")));
		btnCrearFigura.setBounds(40, 61, 107, 97);
		panel_crear_figuras.add(btnCrearFigura);

		JButton btnLista = new JButton("");
		btnLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista_Figura_User list= new Lista_Figura_User();
				list.setVisible(true);
				list.setModal(true);
			}
		});
		btnLista.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/lista.png")));
		btnLista.setBounds(40, 242, 107, 108);
		panel_crear_figuras.add(btnLista);

		cbxMisFormas = new JComboBox<String>();
		cbxMisFormas.setFont(new Font("Broadway", Font.PLAIN, 13));

		cbxMisFormas.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
		cbxMisFormas.setBounds(121, 441, 123, 27);
		panel_crear_figuras.add(cbxMisFormas);

		txtUser = new JTextField();
		txtUser.setBorder(null);
		txtUser.setBackground(new Color(240,248,255));
		txtUser.setFont(new Font("Britannic Bold", Font.ITALIC, 18));
		txtUser.setEditable(false);
		txtUser.setBounds(85, 4, 102, 39);
		panel_crear_figuras.add(txtUser);
		txtUser.setColumns(10);
		txtUser.setText(PrismasLab.getLogin().getUser());

		JComboBox cbxcolor = new JComboBox();
		cbxcolor.setFont(new Font("Broadway", Font.PLAIN, 13));
		cbxcolor.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Amarillo", "Azul", "Cyan", "Gris Claro", "Gris Oscuro", "Verde", "Magenta", "Naranja", "Rosado", "Rojo", "Blanco", "Amarillo"}));
		cbxcolor.setBounds(121, 494, 123, 27);
		panel_crear_figuras.add(cbxcolor);

		JLabel lblCrearFigura = new JLabel("Crear figura");
		lblCrearFigura.setFont(new Font("Broadway", Font.PLAIN, 22));
		lblCrearFigura.setBounds(20, 169, 146, 39);
		panel_crear_figuras.add(lblCrearFigura);

		JLabel lblFigurasGuardadas = new JLabel("Figuras guardadas");
		lblFigurasGuardadas.setFont(new Font("Broadway", Font.PLAIN, 22));
		lblFigurasGuardadas.setBounds(20, 372, 224, 20);
		panel_crear_figuras.add(lblFigurasGuardadas);

		JLabel lblMisPrismas = new JLabel("Mis Prismas");
		lblMisPrismas.setFont(new Font("Broadway", Font.PLAIN, 16));
		lblMisPrismas.setBounds(10, 444, 113, 20);
		panel_crear_figuras.add(lblMisPrismas);

		JLabel lblNewLabel = new JLabel("Color\r\n");
		lblNewLabel.setFont(new Font("Broadway", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 491, 50, 32);
		panel_crear_figuras.add(lblNewLabel);

		panel_grafica_formas = new JPanel();

		panel_grafica_formas.setBackground(Color.YELLOW);
		panel_grafica_formas.add(StdDraw3D.frame);
		//PrismasLab.textoEspera();

		JButton btnMostrar = new JButton("");
		btnMostrar.setContentAreaFilled(false);
		btnMostrar.setBorderPainted(false);
		btnMostrar.setBorder(null);
		btnMostrar.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\3\\ver_figura.png"));
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DecimalFormat decimalFormat = new DecimalFormat("#.00");

				Color color = null;

				if (!cbxMisFormas.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>") && (!cbxcolor.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>"))) {

					StdDraw3D.frame.setVisible(true);
					StdDraw3D.frame.setTitle(null);

					for (Prismas figura : PrismasLab.getLogin().getMisFiguras()) {

						if (figura.getNombre().contentEquals(cbxMisFormas.getSelectedItem().toString())) {

							if (figura instanceof Cuadrado) {

								double x1 = ((Cuadrado) figura).getX1();
								double x2 = ((Cuadrado) figura).getX2();
								double y1 = ((Cuadrado) figura).getY1();
								double y2 = ((Cuadrado) figura).getY2();
								double altura = figura.getAltura();
								String name = figura.getNombre();

								color = elegirColor(cbxcolor.getSelectedItem().toString());

								PrismasLab.graficarCuadrado(x1, y1, x2, y2, altura, name, color);

								txtbase.setText("Cuadrado");
								txtareaLateral.setText(String.valueOf(decimalFormat.format(figura.areaLateral())));
								txtVolumen.setText(String.valueOf(decimalFormat.format(figura.volumen())));
								txtareaTotal.setText(String.valueOf(decimalFormat.format(figura.areaTotal())));








							}

							if (figura instanceof Rectangulo) {

								double x1 = ((Rectangulo) figura).getX1();
								double x2 = ((Rectangulo) figura).getX2();
								double x3 = ((Rectangulo) figura).getX3();
								double y1 = ((Rectangulo) figura).getY1();
								double y2 = ((Rectangulo) figura).getY2();
								double y3 = ((Rectangulo) figura).getY3();
								double altura = figura.getAltura();
								String nombre = figura.getNombre();

								color = elegirColor(cbxcolor.getSelectedItem().toString());


								PrismasLab.graficarRectangulo(x1, y1, x2, y2, x3, y3, altura, nombre, color);

								txtbase.setText("Rectangulo");
								txtareaLateral.setText(String.valueOf(figura.areaLateral()));
								txtVolumen.setText(String.valueOf(figura.volumen()));
								txtareaTotal.setText(String.valueOf(figura.areaTotal()));

							}

							if (figura instanceof Triangulo) {

								double x1 = ((Triangulo) figura).getX1();
								double x2 = ((Triangulo) figura).getX2();
								double x3 = ((Triangulo) figura).getX3();
								double y1 = ((Triangulo) figura).getY1();
								double y2 = ((Triangulo) figura).getY2();
								double y3 = ((Triangulo) figura).getY3();
								double h = figura.getAltura();
								String nombre = figura.getNombre();

								color = elegirColor(cbxcolor.getSelectedItem().toString());


								PrismasLab.graficarTriangulo(x1, y1, x2, y2, x3, y3, h, nombre, color);

								txtbase.setText("Triangulo");
								txtareaLateral.setText(String.valueOf(decimalFormat.format(figura.areaLateral())));
								txtVolumen.setText(String.valueOf(decimalFormat.format(figura.volumen())));
								txtareaTotal.setText(String.valueOf(decimalFormat.format(figura.areaTotal())));

							}

							if (figura instanceof Trapecio) {

								double x1 = ((Trapecio) figura).getX1();
								double x2 = ((Trapecio) figura).getX2();
								double x3 = ((Trapecio) figura).getX3();
								double x4 = ((Trapecio) figura).getX4();
								double y1 = ((Trapecio) figura).getY1();
								double y2 = ((Trapecio) figura).getY2();
								double y3 = ((Trapecio) figura).getY3();
								double y4 = ((Trapecio) figura).getY4();
								double altura = 0;
								double h = figura.getAltura();
								String nombre = figura.getNombre();

								color = elegirColor(cbxcolor.getSelectedItem().toString());


								PrismasLab.graficarTrapecio(x1, y1, x2, y2, x3, y3, x4, y4, altura, h, nombre, color);

								txtbase.setText("Trapecio");
								txtareaLateral.setText(String.valueOf(decimalFormat.format(figura.areaLateral())));
								txtVolumen.setText(String.valueOf(decimalFormat.format(figura.volumen())));
								txtareaTotal.setText(String.valueOf(decimalFormat.format(figura.areaTotal())));

							}

							if (figura instanceof Rombo) {

								double x1 = ((Rombo) figura).getX1();
								double y1 = ((Rombo) figura).getY1();
								double d = ((Rombo) figura).getD1();
								double d2 = ((Rombo) figura).getD2();
								double altura = figura.getAltura();
								String nombre = figura.getNombre();

								color = elegirColor(cbxcolor.getSelectedItem().toString());


								PrismasLab.graficarRombo(x1, y1, altura, d, d2, nombre, color);

								txtbase.setText("Rombo");
								txtareaLateral.setText(String.valueOf(decimalFormat.format(figura.areaLateral())));
								txtVolumen.setText(String.valueOf(decimalFormat.format(figura.volumen())));
								txtareaTotal.setText(String.valueOf(decimalFormat.format(figura.areaTotal())));

							}



						}



					}

				} else {

					JOptionPane.showMessageDialog(null, "Por favor complete los parametros!", "Advertencia", JOptionPane.WARNING_MESSAGE);

				}


			}
		});
		btnMostrar.setBounds(272, 445, 89, 83);
		panel_crear_figuras.add(btnMostrar);
		
		JLabel lblNewLabel_5 = new JLabel("Logged:");
		lblNewLabel_5.setFont(new Font("Broadway", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(12, 9, 89, 28);
		panel_crear_figuras.add(lblNewLabel_5);
		
		JLabel lblMostrar = new JLabel("Mostrar");
		lblMostrar.setFont(new Font("Broadway", Font.PLAIN, 14));
		lblMostrar.setBounds(282, 526, 66, 16);
		panel_crear_figuras.add(lblMostrar);
		panel_grafica_formas.setBorder(null);
		panel_grafica_formas.setBounds(470, 53, 600, 600);
		contentPanel.add(panel_grafica_formas);
		panel_grafica_formas.setLayout(new CardLayout(0, 0));
		
		panel_real = new JPanel();
		panel_real.setBackground(new Color(176, 196, 222));
		panel_grafica_formas.add(panel_real, "name_144011590535900");

		JPanel panel_detalle = new JPanel();
		panel_detalle.setBackground(new Color(240,248,255));
		panel_detalle.setBounds(470, 654, 600, 119);
		contentPanel.add(panel_detalle);
		panel_detalle.setLayout(null);

		txtVolumen = new JTextField();
		txtVolumen.setBackground(new Color(240,248,255));
		txtVolumen.setEditable(false);
		txtVolumen.setBorder(null);
		txtVolumen.setFont(new Font("Broadway", Font.PLAIN, 14));
		txtVolumen.setBounds(417, 8, 86, 24);
		panel_detalle.add(txtVolumen);
		txtVolumen.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Volumen\r\n");
		lblNewLabel_1.setFont(new Font("Broadway", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(311, 13, 86, 14);
		panel_detalle.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Base");
		lblNewLabel_2.setFont(new Font("Broadway", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(12, 13, 46, 14);
		panel_detalle.add(lblNewLabel_2);

		txtbase = new JTextField();
		txtbase.setEditable(false);
		txtbase.setBackground(new Color(240,248,255));
		txtbase.setFont(new Font("Broadway", Font.PLAIN, 14));
		txtbase.setBorder(null);
		txtbase.setBounds(138, 8, 86, 24);
		panel_detalle.add(txtbase);
		txtbase.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Area Total");
		lblNewLabel_3.setFont(new Font("Broadway", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(308, 72, 97, 16);
		panel_detalle.add(lblNewLabel_3);

		txtareaTotal = new JTextField();
		txtareaTotal.setBorder(null);
		txtareaTotal.setFont(new Font("Broadway", Font.PLAIN, 14));
		txtareaTotal.setBackground(new Color(240,248,255));
		txtareaTotal.setEditable(false);
		txtareaTotal.setBounds(417, 68, 86, 24);
		panel_detalle.add(txtareaTotal);
		txtareaTotal.setColumns(10);
		
				JLabel lblArea = new JLabel("Area Lateral");
				lblArea.setBounds(12, 73, 116, 14);
				panel_detalle.add(lblArea);
				lblArea.setFont(new Font("Broadway", Font.PLAIN, 16));
				
						txtareaLateral = new JTextField();
						txtareaLateral.setEditable(false);
						txtareaLateral.setBackground(new Color(240,248,255));
						txtareaLateral.setFont(new Font("Broadway", Font.PLAIN, 14));
						txtareaLateral.setBorder(null);
						txtareaLateral.setBounds(138, 68, 86, 24);
						panel_detalle.add(txtareaLateral);
						txtareaLateral.setColumns(10);

		JPanel buttonPane = new JPanel();
		buttonPane.setBackground(new Color(176, 224,230));
		buttonPane.setBounds(0, 772, 1080, 87);
		contentPanel.add(buttonPane);
		buttonPane.setLayout(null);

		JButton btnCerrar = new JButton("");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Principal login = new Login_Principal();
				login.setVisible(true);

				dispose();

			}
		});
		btnCerrar.setContentAreaFilled(false);
		btnCerrar.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/log_out.png")));
		btnCerrar.setBounds(1006, 8, 64, 64);
		buttonPane.add(btnCerrar);
		
		JLabel lblNewLabel_4 = new JLabel("Cerrar Sesion");
		lblNewLabel_4.setFont(new Font("Broadway", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(862, 49, 132, 23);
		buttonPane.add(lblNewLabel_4);
		cargarFiguras();
	}

	public static void cargarFiguras(){

		cbxMisFormas.removeAllItems();

		for (Prismas figuras : PrismasLab.getLogin().getMisFiguras()) {
			cbxMisFormas.addItem(figuras.getNombre());

		}

		cbxMisFormas.insertItemAt(new String("<Seleccionar>"), 0);
		cbxMisFormas.setSelectedIndex(0);
	}

	public Color elegirColor(String eleccion) {

		Color color = null;

		if (eleccion.equalsIgnoreCase("azul")) {

			color = StdDraw3D.BLUE;


		}
		if (eleccion.equalsIgnoreCase("cyan")) {

			color = StdDraw3D.CYAN;


		}
		if (eleccion.equalsIgnoreCase("Gris Claro")) {

			color = StdDraw3D.LIGHT_GRAY;


		}
		if (eleccion.equalsIgnoreCase("Gris oscuro")) {

			color = StdDraw3D.DARK_GRAY;


		}
		if (eleccion.equalsIgnoreCase("verde")) {

			color = StdDraw3D.GREEN;


		}
		if (eleccion.equalsIgnoreCase("Magenta")) {

			color = StdDraw3D.MAGENTA;


		}
		if (eleccion.equalsIgnoreCase("Naranja")) {

			color = StdDraw3D.ORANGE;


		}
		if (eleccion.equalsIgnoreCase("Rosado")) {

			color = StdDraw3D.PINK;


		}
		if (eleccion.equalsIgnoreCase("Rojo")) {

			color = StdDraw3D.RED;


		}
		if (eleccion.equalsIgnoreCase("Blanco")) {

			color = StdDraw3D.WHITE;


		}
		if (eleccion.equalsIgnoreCase("Amarillo")) {

			color = StdDraw3D.YELLOW;


		}

		return color;



	}
}
