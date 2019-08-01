package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Cuadrado;
import Logica.PrismasLab;
import Logica.Rectangulo;
import Logica.Rombo;
import Logica.StdDraw3D;
import Logica.Trapecio;
import Logica.Triangulo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;

public class Crear_Figuras extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txt_altura;
	private JPanel panel_triangulo;
	private JPanel panel_cuadrado;
	private JPanel panel_trapecio;
	private JPanel panel_rombo;
	private JPanel panel_rectangulo;
	private JPanel panel_vacio;
	private JTextField txtX_1_triangulo;
	private JTextField txtY_1_triangulo;
	private JTextField txtX_2_triangulo;
	private JTextField txtY_2_triangulo;
	private JTextField txtX_3_triangulo;
	private JTextField txtY_3_triangulo;
	private JTextField txtX_1_cuadrado;
	private JTextField txtY_1_cuadrado;
	private JTextField txtX_2_cuadrado;
	private JTextField txtY_2_cuadrado;
	private JTextField txtX_1_trapecio;
	private JTextField txtY_1_trapecio;
	private JTextField txtY_2_trapecio;
	private JTextField txtX_2_trapecio;
	private JTextField txtX_3_trapecio;
	private JTextField txtX_4_trapecio;
	private JPanel panel_datos;
	private JTextField txtY_3_trapecio;
	private JTextField txtY_4_trapecio;
	private JTextField txtX_1_rombo;
	private JTextField txt_d_horizontal;
	private JTextField txtY_1_rombo;
	private JTextField txt_d_vertical;
	private JTextField txtX_1_rectangulo;
	private JTextField txtY_1_rectangulo;
	private JTextField txtX_2_rectangulo;
	private JTextField txtX_3_rectangulo;
	private JTextField txtY_2_rectangulo;
	private JTextField txtY_3_rectangulo;
	private JTextField txt_nombre;
	public JPanel panel_vista_previa;
	private JComboBox<String> cbx_colores;
	private JButton btnCuadrado;
	private JButton btnTrapecio;
	private JButton btnTriangulo;
	private JButton btnRombo ;
	private JButton btnRetangulo;
	private JLabel lblParametros_1;
	private JLabel label;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_15;
	private JLabel lblDVertical;
	private JLabel lblDHorizontal;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel label_31;
	private JLabel lblX_5;
	private JLabel lblY_5;
	private JLabel label_32;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
	
		try {
			Crear_Figuras dialog = new Crear_Figuras();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Crear_Figuras() {

		

		setUndecorated(true);
		setBounds(100, 100, 971, 991);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(176, 196, 222));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);/////CENTRADO

		{
			JPanel panel_windows = new JPanel();
			panel_windows.setBackground(new Color(176, 224, 230));
			panel_windows.setBounds(0, 0, 971, 64);
			contentPanel.add(panel_windows);
			panel_windows.setLayout(null);
			{
				JLabel lblCerrar = new JLabel("");
				lblCerrar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						

						Estudiante_Principal aux = new Estudiante_Principal();
						aux.setVisible(true);
						
						PrismasLab.pantallaVacia(StdDraw3D.frame);
						
						Estudiante_Principal.cargarFiguras();
						dispose();
					}
				});
				lblCerrar.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\cancel_login_48.png"));
				lblCerrar.setBounds(913, 11, 48, 40);
				panel_windows.add(lblCerrar);
			}
		}
		{
			panel_datos = new JPanel();
			panel_datos.setBackground(new Color(240, 248, 255));
			panel_datos.setAutoscrolls(true);
			panel_datos.setBounds(10, 80, 342, 578);
			contentPanel.add(panel_datos);
			panel_datos.setLayout(null);
			{
				JFormattedTextField frmtdtxtfldTipo = new JFormattedTextField();
				frmtdtxtfldTipo.setBorder(null);
				frmtdtxtfldTipo.setBackground(panel_datos.getBackground());
				frmtdtxtfldTipo.setEditable(false);
				frmtdtxtfldTipo.setFont(new Font("Broadway", Font.PLAIN, 22));
				frmtdtxtfldTipo.setText("Tipos de figuras");
				frmtdtxtfldTipo.setBounds(59, 29, 199, 47);
				panel_datos.add(frmtdtxtfldTipo);
			}

			btnCuadrado = new JButton("");
			btnCuadrado.setBorder(null);
			btnCuadrado.setContentAreaFilled(false);
			btnCuadrado.setIcon(new ImageIcon(Crear_Figuras.class.getResource("/Imagen/cuadrado_azul.png")));
			btnCuadrado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_triangulo.setVisible(false);
					panel_cuadrado.setVisible(true);	////
					panel_rectangulo.setVisible(false);
					panel_trapecio.setVisible(false);
					panel_rombo.setVisible(false);
					panel_vacio.setVisible(false);
					
					txt_altura.setText("");
					txt_nombre.setText("");
					txtX_1_cuadrado.setText("");
					txtX_2_cuadrado.setText("");
					
					txtY_1_cuadrado.setText("");
					txtY_2_cuadrado.setText("");

					
					//PrismasLab.pantallaVacia();

				}
			});
			btnCuadrado.setBounds(10, 113, 112, 105);
			panel_datos.add(btnCuadrado);

			btnTrapecio = new JButton("");
			btnTrapecio.setBorder(null);
			btnTrapecio.setContentAreaFilled(false);
			btnTrapecio.setIcon(new ImageIcon(Crear_Figuras.class.getResource("/Imagen/trapezio9.png")));
			btnTrapecio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_triangulo.setVisible(false);
					panel_cuadrado.setVisible(false);
					panel_rectangulo.setVisible(false);
					panel_trapecio.setVisible(true);///
					panel_rombo.setVisible(false);
					panel_vacio.setVisible(false);
					
					txt_altura.setText("");
					txt_nombre.setText("");
					txtX_1_trapecio.setText("");
					txtX_2_trapecio.setText("");
					txtX_3_trapecio.setText("");
					txtY_1_trapecio.setText("");
					txtY_2_trapecio.setText("");
					txtY_3_trapecio.setText("");
					txtX_4_trapecio.setText("");
					txtY_4_trapecio.setText("");
					
					
					//PrismasLab.pantallaVacia();
				}
			});
			btnTrapecio.setBounds(159, 249, 99, 71);
			panel_datos.add(btnTrapecio);

			btnTriangulo = new JButton("");
			btnTriangulo.setBorderPainted(false);
			btnTriangulo.setBorder(null);
			btnTriangulo.setContentAreaFilled(false);
			btnTriangulo.setIcon(new ImageIcon(Crear_Figuras.class.getResource("/Imagen/triangulo_azul.png")));
			btnTriangulo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_triangulo.setVisible(true);////
					panel_cuadrado.setVisible(false);
					panel_rectangulo.setVisible(false);
					panel_trapecio.setVisible(false);
					panel_rombo.setVisible(false);
					panel_vacio.setVisible(false);
					
					txt_altura.setText("");
					txt_nombre.setText("");
					txtX_1_triangulo.setText("");
					txtX_2_triangulo.setText("");
					txtX_3_triangulo.setText("");
					txtY_1_triangulo.setText("");
					txtY_2_triangulo.setText("");
					txtY_3_triangulo.setText("");
					
				//	PrismasLab.pantallaVacia();
				}
			});
			btnTriangulo.setBounds(159, 113, 99, 91);
			panel_datos.add(btnTriangulo);

			btnRombo = new JButton("");
			btnRombo.setBorder(null);
			btnRombo.setContentAreaFilled(false);
			btnRombo.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\rombo1.png"));
			btnRombo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_triangulo.setVisible(false);
					panel_cuadrado.setVisible(false);
					panel_rectangulo.setVisible(false);
					panel_trapecio.setVisible(false);
					panel_rombo.setVisible(true); ////
					panel_vacio.setVisible(false);
					
					txt_altura.setText("");
					txt_nombre.setText("");
					txtX_1_rombo.setText("");
					txt_d_horizontal.setText("");
					txt_d_vertical.setText("");
					txtY_1_rombo.setText("");

					
				//	PrismasLab.pantallaVacia();
				}
			});
			btnRombo.setBounds(20, 229, 89, 105);
			panel_datos.add(btnRombo);

			btnRetangulo = new JButton("");
			btnRetangulo.setBorder(null);
			btnRetangulo.setContentAreaFilled(false);
			btnRetangulo.setIcon(new ImageIcon(Crear_Figuras.class.getResource("/Imagen/rectangulo_azul.png")));
			btnRetangulo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_triangulo.setVisible(false);
					panel_cuadrado.setVisible(false);
					panel_rectangulo.setVisible(true);	///
					panel_trapecio.setVisible(false);
					panel_rombo.setVisible(false);
					panel_vacio.setVisible(false);
					
					txt_altura.setText("");
					txt_nombre.setText("");
					txtX_1_rectangulo.setText("");
					txtX_2_rectangulo.setText("");
					txtX_3_rectangulo.setText("");
					txtY_1_rectangulo.setText("");
					txtY_2_rectangulo.setText("");
					txtY_3_rectangulo.setText("");
					
				//	PrismasLab.pantallaVacia();
				}
			});
			btnRetangulo.setBounds(23, 355, 99, 77);
			panel_datos.add(btnRetangulo);

			JFormattedTextField frmtdtxtfldNombre = new JFormattedTextField();
			frmtdtxtfldNombre.setBounds(10, 458, 92, 22);
			panel_datos.add(frmtdtxtfldNombre);
			frmtdtxtfldNombre.setBackground(panel_datos.getBackground());
			frmtdtxtfldNombre.setFont(new Font("Broadway", Font.PLAIN, 18));
			frmtdtxtfldNombre.setEditable(false);
			frmtdtxtfldNombre.setAutoscrolls(false);
			frmtdtxtfldNombre.setBorder(null);
			frmtdtxtfldNombre.setText("Nombre:");

			txt_nombre = new JTextField();
			txt_nombre.setBackground(new Color(176, 196, 222));
			txt_nombre.setBounds(112, 456, 163, 27);
			panel_datos.add(txt_nombre);
			txt_nombre.setColumns(10);
			{
				JFormattedTextField frmtdtxtfldAltura = new JFormattedTextField();
				frmtdtxtfldAltura.setBounds(10, 500, 79, 20);
				panel_datos.add(frmtdtxtfldAltura);
				frmtdtxtfldAltura.setBackground(panel_datos.getBackground());
				frmtdtxtfldAltura.setBorder(null);
				frmtdtxtfldAltura.setEditable(false);
				frmtdtxtfldAltura.setFont(new Font("Broadway", Font.PLAIN, 18));
				frmtdtxtfldAltura.setText("Altura:");
			}
			{
				txt_altura = new JTextField();
				txt_altura.setBackground(new Color(176, 196, 222));
				txt_altura.setBounds(112, 497, 163, 27);
				panel_datos.add(txt_altura);
				txt_altura.setColumns(10);
			}

			JFormattedTextField frmtdtxtfldColor = new JFormattedTextField();
			frmtdtxtfldColor.setBounds(10, 543, 66, 20);
			panel_datos.add(frmtdtxtfldColor);
			frmtdtxtfldColor.setFont(new Font("Broadway", Font.PLAIN, 18));
			frmtdtxtfldColor.setEditable(false);
			frmtdtxtfldColor.setBackground(panel_datos.getBackground());
			frmtdtxtfldColor.setBorder(null);
			frmtdtxtfldColor.setText("Color:");

			cbx_colores = new JComboBox<String>();
			cbx_colores.setFont(new Font("Broadway", Font.PLAIN, 14));
			cbx_colores.setBackground(new Color(176, 196, 222));
			cbx_colores.setBounds(112, 540, 163, 27);
			panel_datos.add(cbx_colores);
			cbx_colores.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					/* EL EVENTO EMPIEZA AHORA
					 * EL EVENTO EMPIEZA AHORA
					 * EL EVENTO EMPIEZA AHORA
					 * EL EVENTO EMPIEZA AHORA
					 * EL EVENTO EMPIEZA AHORA
					 * EL EVENTO EMPIEZA AHORA
					 * EL EVENTO EMPIEZA AHORA
					 */















				}
			});
			cbx_colores.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Azul", "Cyan", "Gris Claro", "Gris Oscuro", "Verde", "Magenta", "Naranja", "Rosado", "Rojo", "Blanco", "Amarillo"}));
		}
		{
			panel_vista_previa = new JPanel();
			panel_vista_previa.setBackground(new Color(176, 196, 222));
			panel_vista_previa.setBorder(null);
			panel_vista_previa.setBounds(351, 75, 610, 583);
			contentPanel.add(panel_vista_previa);
			panel_vista_previa.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			//PrismasLab.textoEspera();
			//panel_vista_previa.add(StdDraw3D.frame);
			
			


		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(176, 224, 230));
			buttonPane.setBounds(10, 877, 947, 103);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton btnCancelar = new JButton("");
				btnCancelar.setContentAreaFilled(false);
				btnCancelar.setBorderPainted(false);
				btnCancelar.setBorder(null);
				btnCancelar.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\cancel_login_96.png"));
				btnCancelar.setSelectedIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\cancel_login_48.png"));
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						//PrismasLab.textoEspera();

						
						
						PrismasLab.getInstance().salvarDatos(PrismasLab.getInstance());

					

						Estudiante_Principal estu = new Estudiante_Principal();

						estu.setVisible(true);
						estu.panel_real.add(StdDraw3D.frame);
						
						PrismasLab.pantallaVacia(StdDraw3D.frame);
						Estudiante_Principal.cargarFiguras();
						
						dispose();

					}
				});
				btnCancelar.setBounds(816, 0, 111, 103);
				buttonPane.add(btnCancelar);
			}
			{
				JButton btnCrear = new JButton("");
				btnCrear.setContentAreaFilled(false);
				btnCrear.setBorder(null);
				btnCrear.setSelectedIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\salvar.png"));
				btnCrear.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\salvar.png"));
				btnCrear.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						/*
						 * 
						 * 
						 * 
						 * 
						 * 
						 * 
						 * 
						 * 
						 */

						if (panel_cuadrado.isVisible()) {

							double x1 = Double.valueOf(txtX_1_cuadrado.getText());
							double y1 = Double.valueOf(txtY_1_cuadrado.getText());
							double x2 = Double.valueOf(txtX_2_cuadrado.getText());
							double y2 = Double.valueOf(txtY_2_cuadrado.getText());
							double altura = Double.valueOf(txt_altura.getText());
							String nombre = txt_nombre.getText();

							Cuadrado figura = new Cuadrado(altura, nombre, x1, x2, y1, y2);

							PrismasLab.getLogin().getMisFiguras().add(figura);

							JOptionPane.showMessageDialog(null, "Figura Creada con Exito!", "Validacion", JOptionPane.INFORMATION_MESSAGE);

							Estudiante_Principal.cargarFiguras();
							
							PrismasLab.getInstance().salvarDatos(PrismasLab.getInstance());
							
							txt_altura.setText("");
							txt_nombre.setText("");
							txtX_1_cuadrado.setText("");
							txtX_2_cuadrado.setText("");
							
							txtY_1_cuadrado.setText("");
							txtY_2_cuadrado.setText("");

						}

						if (panel_rectangulo.isVisible()) {


							double x1 = Double.valueOf(txtX_1_rectangulo.getText());
							double y1 = Double.valueOf(txtY_1_rectangulo.getText());
							double x2 = Double.valueOf(txtX_2_rectangulo.getText());
							double y2 = Double.valueOf(txtY_2_rectangulo.getText());
							double x3 = Double.valueOf(txtX_3_rectangulo.getText());
							double y3 = Double.valueOf(txtY_3_rectangulo.getText());

							double altura = Float.valueOf(txt_altura.getText());
							String nombre = txt_nombre.getText();

							Rectangulo figura = new Rectangulo(altura, nombre, x1, x2, x3, y1, y2, y3);

							PrismasLab.getLogin().getMisFiguras().add(figura);

							JOptionPane.showMessageDialog(null, "Figura Creada con Exito!", "Validacion", JOptionPane.INFORMATION_MESSAGE);

							Estudiante_Principal.cargarFiguras();
							
							PrismasLab.getInstance().salvarDatos(PrismasLab.getInstance());
							
							txt_altura.setText("");
							txt_nombre.setText("");
							txtX_1_rectangulo.setText("");
							txtX_2_rectangulo.setText("");
							txtX_3_rectangulo.setText("");
							txtY_1_rectangulo.setText("");
							txtY_2_rectangulo.setText("");
							txtY_3_rectangulo.setText("");
							

						}
						
						
						
						
						if (panel_triangulo.isVisible()) {


							double x1 = Double.valueOf(txtX_1_triangulo.getText());
							double y1 = Double.valueOf(txtY_1_triangulo.getText());
							double x2 = Double.valueOf(txtX_2_triangulo.getText());
							double y2 = Double.valueOf(txtY_2_triangulo.getText());
							double x3 = Double.valueOf(txtX_3_triangulo.getText());
							double y3 = Double.valueOf(txtY_3_triangulo.getText());
							double altura = Float.valueOf(txt_altura.getText());
							String nombre = txt_nombre.getText();
						
							Triangulo figura = new Triangulo(altura, nombre, x1, x2, x3, y1, y2, y3);
							
				

							PrismasLab.getLogin().getMisFiguras().add(figura);

							JOptionPane.showMessageDialog(null, "Figura Creada con Exito!", "Validacion", JOptionPane.INFORMATION_MESSAGE);

							Estudiante_Principal.cargarFiguras();
							PrismasLab.getInstance().salvarDatos(PrismasLab.getInstance());
							
							txt_altura.setText("");
							txt_nombre.setText("");
							txtX_1_triangulo.setText("");
							txtX_2_triangulo.setText("");
							txtX_3_triangulo.setText("");
							txtY_1_triangulo.setText("");
							txtY_2_triangulo.setText("");
							txtY_3_triangulo.setText("");

						}
						
						if (panel_trapecio.isVisible()) {


							double x1 = Double.valueOf(txtX_1_trapecio.getText());
							double y1 = Double.valueOf(txtY_1_trapecio.getText());
							double x2 = Double.valueOf(txtX_2_trapecio.getText());
							double y2 = Double.valueOf(txtY_2_trapecio.getText());
							double x3 = Double.valueOf(txtX_3_trapecio.getText());
							double y3 = Double.valueOf(txtY_3_trapecio.getText());
							double x4 = Double.valueOf(txtX_4_trapecio.getText());
							double y4 = Double.valueOf(txtY_4_trapecio.getText());

							double altura = Float.valueOf(txt_altura.getText());
							String nombre = txt_nombre.getText();

							Trapecio figura = new Trapecio(altura, nombre, x1, x2, x3, x4, y1, y2, y3, y4);

							PrismasLab.getLogin().getMisFiguras().add(figura);

							JOptionPane.showMessageDialog(null, "Figura Creada con Exito!", "Validacion", JOptionPane.INFORMATION_MESSAGE);

							Estudiante_Principal.cargarFiguras();
							PrismasLab.getInstance().salvarDatos(PrismasLab.getInstance());
							
							txt_altura.setText("");
							txt_nombre.setText("");
							txtX_1_trapecio.setText("");
							txtX_2_trapecio.setText("");
							txtX_3_trapecio.setText("");
							txtY_1_trapecio.setText("");
							txtY_2_trapecio.setText("");
							txtY_3_trapecio.setText("");
							txtX_4_trapecio.setText("");
							txtY_4_trapecio.setText("");

						}
						
						if (panel_rombo.isVisible()) {

							double x1 = Double.valueOf(txtX_1_rombo.getText());
							double y1 = Double.valueOf(txtY_1_rombo.getText());
							double d2 = Double.valueOf(txt_d_horizontal.getText());
							double d1 = Double.valueOf(txt_d_vertical.getText());
							double altura = Double.valueOf(txt_altura.getText());
							String nombre = txt_nombre.getText();

							Rombo figura = new Rombo(altura, nombre, x1, y1, d1, d2);

							PrismasLab.getLogin().getMisFiguras().add(figura);

							JOptionPane.showMessageDialog(null, "Figura Creada con Exito!", "Validacion", JOptionPane.INFORMATION_MESSAGE);

							Estudiante_Principal.cargarFiguras();
							PrismasLab.getInstance().salvarDatos(PrismasLab.getInstance());
							
							txt_altura.setText("");
							txt_nombre.setText("");
							txtX_1_rombo.setText("");
							txt_d_horizontal.setText("");
							txt_d_vertical.setText("");
							txtY_1_rombo.setText("");

						}




					}
				});
				btnCrear.setBounds(679, 0, 111, 103);
				buttonPane.add(btnCrear);
			}
			{
				JButton btnVistaPrevia = new JButton("");
				btnVistaPrevia.setBorder(null);
				btnVistaPrevia.setContentAreaFilled(false);
				btnVistaPrevia.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\vista_previa.png"));
				btnVistaPrevia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						
						if (panel_triangulo.isVisible()) {
							

							double tx1 = Double.valueOf(txtX_1_triangulo.getText());
							double ty1 = Double.valueOf(txtY_1_triangulo.getText());
							double tx2 = Double.valueOf(txtX_2_triangulo.getText());
							double ty2 = Double.valueOf(txtY_2_triangulo.getText());
							double tx3 = Double.valueOf(txtX_3_triangulo.getText());
							double ty3 = Double.valueOf(txtY_3_triangulo.getText());
							double taltura = Double.valueOf(txt_altura.getText());
							String tnombre = txt_nombre.getText();							
							Color color = elegirColor(cbx_colores.getSelectedItem().toString());
							
							if (!cbx_colores.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>") && !txt_nombre.getText().isEmpty() && !txt_altura.getText().isEmpty()) {
								
								
								PrismasLab.graficarTriangulo(tx1, ty1, tx2, ty2, tx3, ty3, taltura, tnombre, color);

							}else {
								
								
								JOptionPane.showMessageDialog(null, "Por favor llene cada parametro para vista previa", "Validacion", JOptionPane.WARNING_MESSAGE);
							}
							
							

							


						}



						if (panel_cuadrado.isVisible()) {

							double x1c = Double.valueOf(txtX_1_cuadrado.getText());
							double y1c = Double.valueOf(txtY_1_cuadrado.getText());
							double x2c = Double.valueOf(txtX_2_cuadrado.getText());
							double y2c = Double.valueOf(txtY_2_cuadrado.getText());
							double alturac = Double.valueOf(txt_altura.getText());
							String nombrec = txt_nombre.getText();
							Color color = elegirColor(cbx_colores.getSelectedItem().toString());
							
							PrismasLab.graficarCuadrado(x1c, y1c, x2c, y2c, alturac, nombrec, color);


			
						}

						if (panel_trapecio.isVisible()) {

							double x1t = Double.valueOf(txtX_1_trapecio.getText());
							double y1t = Double.valueOf(txtY_1_trapecio.getText());
							double x2t = Double.valueOf(txtX_2_trapecio.getText());
							double y2t = Double.valueOf(txtY_2_trapecio.getText());
							double x3t = Double.valueOf(txtX_3_trapecio.getText());
							double y3t = Double.valueOf(txtY_3_trapecio.getText());
							double x4t = Double.valueOf(txtX_4_trapecio.getText());
							double y4t = Double.valueOf(txtY_4_trapecio.getText());
							double alturat = Double.valueOf(txt_altura.getText());
							String nombret = txt_nombre.getText();
							Color color = elegirColor(cbx_colores.getSelectedItem().toString());
							
							PrismasLab.graficarTrapecio(x1t, y1t, x2t, y2t, x3t, y3t, x4t, y4t, alturat, alturat, nombret, color);

							
						}

						if (panel_rombo.isVisible()) {

							double x1 = Double.valueOf(txtX_1_rombo.getText());
							double y1 = Double.valueOf(txtY_1_rombo.getText());
							double D = Double.valueOf(txt_d_vertical.getText());
							double d = Double.valueOf(txt_d_horizontal.getText());
							double altura = Double.valueOf(txt_altura.getText());
							String nombre = txt_nombre.getText();
							Color color = elegirColor(cbx_colores.getSelectedItem().toString());
							PrismasLab.graficarRombo(x1, y1, altura, D, d, nombre, color);

							


						}

						if (panel_rectangulo.isVisible()) {


							double x1 = Double.valueOf(txtX_1_rectangulo.getText());
							double y1 = Double.valueOf(txtY_1_rectangulo.getText());
							double x2 = Double.valueOf(txtX_2_rectangulo.getText());
							double y2 = Double.valueOf(txtY_2_rectangulo.getText());
							double x3 = Double.valueOf(txtX_3_rectangulo.getText());
							double y3 = Double.valueOf(txtY_3_rectangulo.getText());
							double altura = Double.valueOf(txt_altura.getText());
							String nombre = txt_nombre.getText();
							Color color = elegirColor(cbx_colores.getSelectedItem().toString());
							PrismasLab.graficarRectangulo(x1, y1, x2, y2, x3, y3, altura, nombre, color);

						}



						///DAOEHFIJNFIJBSEIAOJLBFKJEABLFKN



						///EAFAEFAEFEASfE




					}
				});
				btnVistaPrevia.setBounds(537, 0, 111, 103);
				buttonPane.add(btnVistaPrevia);
			}
		}
		{
			JPanel CARD = new JPanel();
			CARD.setBounds(10, 669, 947, 198);
			contentPanel.add(CARD);
			CARD.setBackground(panel_datos.getBackground());
			CARD.setLayout(new CardLayout(0, 0));
			{
				panel_vacio = new JPanel();
				panel_vacio.setBackground(new Color(175, 238, 238));
				CARD.add(panel_vacio, "name_3534528306112726");
				panel_vacio.setBackground(panel_datos.getBackground());
				panel_vacio.setLayout(null);
				{
					JFormattedTextField eltipo = new JFormattedTextField();
					eltipo.setEditable(false);
					eltipo.setBackground(panel_vacio.getBackground());
					eltipo.setBorder(null);
					eltipo.setFont(new Font("Broadway", Font.BOLD | Font.ITALIC, 28));
					eltipo.setText("Seleccione el tipo de figura");
					eltipo.setBounds(260, 64, 472, 68);
					panel_vacio.add(eltipo);
				}
			}
			{
				panel_triangulo = new JPanel();
				panel_triangulo.setBackground(new Color(240, 248, 255));

				CARD.add(panel_triangulo, "name_3534587133413675");
				panel_triangulo.setLayout(null);
				{
					txtX_1_triangulo = new JTextField();
					txtX_1_triangulo.setBounds(51, 66, 40, 25);
					panel_triangulo.add(txtX_1_triangulo);
					txtX_1_triangulo.setColumns(10);
				}
				{
					txtY_1_triangulo = new JTextField();
					txtY_1_triangulo.setBounds(165, 67, 40, 23);
					panel_triangulo.add(txtY_1_triangulo);
					txtY_1_triangulo.setColumns(10);
				}
				{
					txtX_2_triangulo = new JTextField();
					txtX_2_triangulo.setBounds(51, 104, 40, 23);
					panel_triangulo.add(txtX_2_triangulo);
					txtX_2_triangulo.setColumns(10);
				}
				{
					txtY_2_triangulo = new JTextField();
					txtY_2_triangulo.setBounds(165, 104, 40, 23);
					panel_triangulo.add(txtY_2_triangulo);
					txtY_2_triangulo.setColumns(10);
				}
				{
					txtX_3_triangulo = new JTextField();
					txtX_3_triangulo.setBounds(51, 142, 40, 23);
					panel_triangulo.add(txtX_3_triangulo);
					txtX_3_triangulo.setColumns(10);
				}
				{
					txtY_3_triangulo = new JTextField();
					txtY_3_triangulo.setBounds(165, 142, 40, 23);
					panel_triangulo.add(txtY_3_triangulo);
					txtY_3_triangulo.setColumns(10);
				}
				{
					label_4 = new JLabel("X1:");
					label_4.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_4.setBounds(10, 71, 46, 14);
					panel_triangulo.add(label_4);
				}
				{
					label_5 = new JLabel("X2:");
					label_5.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_5.setBounds(10, 108, 46, 14);
					panel_triangulo.add(label_5);
				}
				{
					label_6 = new JLabel("X3:");
					label_6.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_6.setBounds(10, 146, 46, 14);
					panel_triangulo.add(label_6);
				}
				{
					label_7 = new JLabel("Y1:");
					label_7.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_7.setBounds(123, 71, 46, 14);
					panel_triangulo.add(label_7);
				}
				{
					label_8 = new JLabel("Y2:");
					label_8.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_8.setBounds(123, 108, 46, 14);
					panel_triangulo.add(label_8);
				}
				{
					label_9 = new JLabel("Y3:");
					label_9.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_9.setBounds(123, 146, 46, 14);
					panel_triangulo.add(label_9);
				}
				{
					label_10 = new JLabel("Parametros");
					label_10.setFont(new Font("Broadway", Font.PLAIN, 25));
					label_10.setBounds(10, 11, 177, 35);
					panel_triangulo.add(label_10);
				}
				{
					label_11 = new JLabel("Indicaciones ");
					label_11.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_11.setBounds(457, 39, 166, 56);
					panel_triangulo.add(label_11);
				}
				{
					label_12 = new JLabel("Para");
					label_12.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_12.setBounds(502, 89, 77, 26);
					panel_triangulo.add(label_12);
				}
				{
					label_13 = new JLabel("Graficar");
					label_13.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_13.setBounds(487, 120, 108, 26);
					panel_triangulo.add(label_13);
				}
				{
					label_14 = new JLabel("");
					label_14.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\grafica_triangulo.jpeg"));
					label_14.setBounds(665, 0, 282, 198);
					panel_triangulo.add(label_14);
				}
			}
			{
				panel_cuadrado = new JPanel();
				panel_cuadrado.setBackground(new Color(240, 248, 255));
				//panel_cuadrado.setBackground(new Color(51, 204, 153));
				CARD.add(panel_cuadrado, "name_3534603057838194");
				panel_cuadrado.setLayout(null);
				{
					txtX_1_cuadrado = new JTextField();
					txtX_1_cuadrado.setBounds(50, 57, 40, 23);
					panel_cuadrado.add(txtX_1_cuadrado);
					txtX_1_cuadrado.setColumns(10);
				}
				{
					txtY_1_cuadrado = new JTextField();
					txtY_1_cuadrado.setBounds(171, 57, 40, 23);
					panel_cuadrado.add(txtY_1_cuadrado);
					txtY_1_cuadrado.setColumns(10);
				}
				{
					txtX_2_cuadrado = new JTextField();
					txtX_2_cuadrado.setBounds(50, 104, 40, 23);
					panel_cuadrado.add(txtX_2_cuadrado);
					txtX_2_cuadrado.setColumns(10);
				}
				{
					txtY_2_cuadrado = new JTextField();
					txtY_2_cuadrado.setBounds(171, 104, 40, 23);
					panel_cuadrado.add(txtY_2_cuadrado);
					txtY_2_cuadrado.setColumns(10);
				}

				JLabel lblX_3 = new JLabel("X1:");
				lblX_3.setFont(new Font("Broadway", Font.PLAIN, 18));
				lblX_3.setBounds(10, 58, 40, 20);
				panel_cuadrado.add(lblX_3);

				JLabel lblX_4 = new JLabel("X2:");
				lblX_4.setFont(new Font("Broadway", Font.PLAIN, 18));
				lblX_4.setBounds(10, 107, 46, 17);
				panel_cuadrado.add(lblX_4);

				JLabel lblY_3 = new JLabel("Y1:");
				lblY_3.setFont(new Font("Broadway", Font.PLAIN, 18));
				lblY_3.setBounds(132, 61, 46, 14);
				panel_cuadrado.add(lblY_3);

				JLabel lblY_4 = new JLabel("Y2:");
				lblY_4.setFont(new Font("Broadway", Font.PLAIN, 18));
				lblY_4.setBounds(132, 108, 46, 14);
				panel_cuadrado.add(lblY_4);
				{
					lblParametros_1 = new JLabel("Parametros");
					lblParametros_1.setFont(new Font("Broadway", Font.PLAIN, 25));
					lblParametros_1.setBounds(10, 11, 167, 29);
					panel_cuadrado.add(lblParametros_1);
				}
				{
					label = new JLabel("");
					label.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\grafica1_cuadrado.jpeg"));
					label.setBounds(700, 0, 247, 198);
					panel_cuadrado.add(label);
				}
				{
					label_1 = new JLabel("Indicaciones ");
					label_1.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_1.setBounds(505, 41, 166, 56);
					panel_cuadrado.add(label_1);
				}
				{
					label_2 = new JLabel("Para");
					label_2.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_2.setBounds(550, 91, 77, 26);
					panel_cuadrado.add(label_2);
				}
				{
					label_3 = new JLabel("Graficar");
					label_3.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_3.setBounds(535, 122, 108, 26);
					panel_cuadrado.add(label_3);
				}
			}
			{
				panel_trapecio = new JPanel();
				panel_trapecio.setBackground(new Color(240, 248, 255));
				CARD.add(panel_trapecio, "name_3534608440743926");
				panel_trapecio.setLayout(null);
				{
					txtX_1_trapecio = new JTextField();
					txtX_1_trapecio.setBounds(51, 59, 40, 23);
					panel_trapecio.add(txtX_1_trapecio);
					txtX_1_trapecio.setColumns(10);
				}
				{
					txtY_1_trapecio = new JTextField();
					txtY_1_trapecio.setBounds(161, 59, 40, 23);
					panel_trapecio.add(txtY_1_trapecio);
					txtY_1_trapecio.setColumns(10);
				}
				{
					txtY_2_trapecio = new JTextField();
					txtY_2_trapecio.setColumns(10);
					txtY_2_trapecio.setBounds(161, 95, 40, 23);
					panel_trapecio.add(txtY_2_trapecio);
				}
				{
					txtX_2_trapecio = new JTextField();
					txtX_2_trapecio.setColumns(10);
					txtX_2_trapecio.setBounds(51, 96, 40, 20);
					panel_trapecio.add(txtX_2_trapecio);
				}
				{
					txtX_3_trapecio = new JTextField();
					txtX_3_trapecio.setColumns(10);
					txtX_3_trapecio.setBounds(51, 126, 40, 23);
					panel_trapecio.add(txtX_3_trapecio);
				}
				{
					txtX_4_trapecio = new JTextField();
					txtX_4_trapecio.setColumns(10);
					txtX_4_trapecio.setBounds(51, 162, 40, 23);
					panel_trapecio.add(txtX_4_trapecio);
				}
				{
					txtY_3_trapecio = new JTextField();
					txtY_3_trapecio.setColumns(10);
					txtY_3_trapecio.setBounds(161, 126, 40, 23);
					panel_trapecio.add(txtY_3_trapecio);
				}
				{
					txtY_4_trapecio = new JTextField();
					txtY_4_trapecio.setColumns(10);
					txtY_4_trapecio.setBounds(161, 162, 40, 23);
					panel_trapecio.add(txtY_4_trapecio);
				}
				{
					label_17 = new JLabel("X1:");
					label_17.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_17.setBounds(10, 63, 46, 14);
					panel_trapecio.add(label_17);
				}
				{
					label_23 = new JLabel("X2:");
					label_23.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_23.setBounds(10, 99, 46, 14);
					panel_trapecio.add(label_23);
				}
				{
					label_24 = new JLabel("X3:");
					label_24.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_24.setBounds(10, 130, 46, 14);
					panel_trapecio.add(label_24);
				}
				{
					label_25 = new JLabel("Y1:");
					label_25.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_25.setBounds(123, 63, 46, 14);
					panel_trapecio.add(label_25);
				}
				{
					label_26 = new JLabel("Y2:");
					label_26.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_26.setBounds(123, 99, 46, 14);
					panel_trapecio.add(label_26);
				}
				{
					label_27 = new JLabel("Y3:");
					label_27.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_27.setBounds(123, 130, 46, 14);
					panel_trapecio.add(label_27);
				}
				{
					label_28 = new JLabel("Parametros");
					label_28.setFont(new Font("Broadway", Font.PLAIN, 25));
					label_28.setBounds(10, 11, 177, 35);
					panel_trapecio.add(label_28);
				}
				{
					label_29 = new JLabel("Indicaciones ");
					label_29.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_29.setBounds(463, 36, 166, 56);
					panel_trapecio.add(label_29);
				}
				{
					label_30 = new JLabel("Para");
					label_30.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_30.setBounds(508, 86, 77, 26);
					panel_trapecio.add(label_30);
				}
				{
					label_31 = new JLabel("Graficar");
					label_31.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_31.setBounds(493, 117, 108, 26);
					panel_trapecio.add(label_31);
				}
				{
					lblX_5 = new JLabel("X4:");
					lblX_5.setFont(new Font("Broadway", Font.PLAIN, 18));
					lblX_5.setBounds(10, 166, 46, 14);
					panel_trapecio.add(lblX_5);
				}
				{
					lblY_5 = new JLabel("Y4:");
					lblY_5.setFont(new Font("Broadway", Font.PLAIN, 18));
					lblY_5.setBounds(123, 166, 46, 14);
					panel_trapecio.add(lblY_5);
				}
				{
					label_32 = new JLabel("");
					label_32.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\grafica_trapecio.jpeg"));
					label_32.setBounds(639, 0, 308, 198);
					panel_trapecio.add(label_32);
				}
			}
			{
				panel_rombo = new JPanel();
				panel_rombo.setBackground(panel_datos.getBackground());

				CARD.add(panel_rombo, "name_3534611105430280");
				panel_rombo.setLayout(null);
				{
					txtX_1_rombo = new JTextField();
					txtX_1_rombo.setBounds(51, 67, 40, 23);
					panel_rombo.add(txtX_1_rombo);
					txtX_1_rombo.setColumns(10);
				}
				{
					txt_d_horizontal = new JTextField();
					txt_d_horizontal.setBounds(160, 149, 40, 23);
					panel_rombo.add(txt_d_horizontal);
					txt_d_horizontal.setColumns(10);
				}
				{
					txtY_1_rombo = new JTextField();
					txtY_1_rombo.setBounds(160, 67, 40, 23);
					panel_rombo.add(txtY_1_rombo);
					txtY_1_rombo.setColumns(10);
				}
				{
					txt_d_vertical = new JTextField();
					txt_d_vertical.setBounds(160, 115, 40, 23);
					panel_rombo.add(txt_d_vertical);
					txt_d_vertical.setColumns(10);
				}
				{
					label_15 = new JLabel("X1:");
					label_15.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_15.setBounds(10, 71, 46, 14);
					panel_rombo.add(label_15);
				}
				{
					lblDVertical = new JLabel("D Vertical:\r\n");
					lblDVertical.setFont(new Font("Broadway", Font.PLAIN, 18));
					lblDVertical.setBounds(10, 116, 114, 20);
					panel_rombo.add(lblDVertical);
				}
				{
					lblDHorizontal = new JLabel("D Horizontal:\r\n");
					lblDHorizontal.setFont(new Font("Broadway", Font.PLAIN, 18));
					lblDHorizontal.setBounds(10, 147, 133, 26);
					panel_rombo.add(lblDHorizontal);
				}
				{
					label_18 = new JLabel("Y1:");
					label_18.setFont(new Font("Broadway", Font.PLAIN, 18));
					label_18.setBounds(121, 71, 46, 14);
					panel_rombo.add(label_18);
				}
				{
					label_19 = new JLabel("Parametros");
					label_19.setFont(new Font("Broadway", Font.PLAIN, 25));
					label_19.setBounds(10, 11, 177, 35);
					panel_rombo.add(label_19);
				}
				{
					label_20 = new JLabel("Indicaciones ");
					label_20.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_20.setBounds(524, 34, 166, 56);
					panel_rombo.add(label_20);
				}
				{
					label_21 = new JLabel("Para");
					label_21.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_21.setBounds(569, 84, 77, 26);
					panel_rombo.add(label_21);
				}
				{
					label_22 = new JLabel("Graficar");
					label_22.setFont(new Font("Broadway", Font.PLAIN, 22));
					label_22.setBounds(554, 115, 108, 26);
					panel_rombo.add(label_22);
				}
				{
					label_16 = new JLabel("");
					label_16.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\grafica1_rombo.jpeg"));
					label_16.setBounds(729, 0, 218, 198);
					panel_rombo.add(label_16);
				}
			}
			{
				panel_rectangulo = new JPanel();
				panel_rectangulo.setFont(new Font("Broadway", Font.PLAIN, 14));
				panel_rectangulo.setBackground(panel_datos.getBackground());

				CARD.add(panel_rectangulo, "name_3534615514417211");
				panel_rectangulo.setLayout(null);
				{
					txtX_1_rectangulo = new JTextField();
					txtX_1_rectangulo.setBounds(56, 59, 40, 23);
					panel_rectangulo.add(txtX_1_rectangulo);
					txtX_1_rectangulo.setColumns(10);
				}
				{
					txtY_1_rectangulo = new JTextField();
					txtY_1_rectangulo.setBounds(162, 59, 40, 23);
					panel_rectangulo.add(txtY_1_rectangulo);
					txtY_1_rectangulo.setColumns(10);
				}
				{
					txtX_2_rectangulo = new JTextField();
					txtX_2_rectangulo.setBounds(56, 97, 40, 23);
					panel_rectangulo.add(txtX_2_rectangulo);
					txtX_2_rectangulo.setColumns(10);
				}
				{
					txtX_3_rectangulo = new JTextField();
					txtX_3_rectangulo.setBounds(56, 133, 40, 23);
					panel_rectangulo.add(txtX_3_rectangulo);
					txtX_3_rectangulo.setColumns(10);
				}
				{
					txtY_2_rectangulo = new JTextField();
					txtY_2_rectangulo.setBounds(162, 97, 40, 23);
					panel_rectangulo.add(txtY_2_rectangulo);
					txtY_2_rectangulo.setColumns(10);
				}
				{
					txtY_3_rectangulo = new JTextField();
					txtY_3_rectangulo.setBounds(162, 133, 40, 23);
					panel_rectangulo.add(txtY_3_rectangulo);
					txtY_3_rectangulo.setColumns(10);
				}

				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\grafica_rectangulo.jpeg"));
				lblNewLabel.setBounds(547, 0, 390, 198);
				panel_rectangulo.add(lblNewLabel);

				JLabel lblX = new JLabel("X1:");
				lblX.setFont(new Font("Broadway", Font.PLAIN, 18));
				lblX.setBounds(10, 63, 46, 14);
				panel_rectangulo.add(lblX);

				JLabel lblX_1 = new JLabel("X2:");
				lblX_1.setFont(new Font("Broadway", Font.PLAIN, 18));
				lblX_1.setBounds(10, 101, 46, 14);
				panel_rectangulo.add(lblX_1);

				JLabel lblX_2 = new JLabel("X3:");
				lblX_2.setFont(new Font("Broadway", Font.PLAIN, 18));
				lblX_2.setBounds(10, 137, 46, 14);
				panel_rectangulo.add(lblX_2);

				JLabel lblY = new JLabel("Y1:");
				lblY.setFont(new Font("Broadway", Font.PLAIN, 18));
				lblY.setBounds(123, 63, 46, 14);
				panel_rectangulo.add(lblY);

				JLabel lblY_1 = new JLabel("Y2:");
				lblY_1.setFont(new Font("Broadway", Font.PLAIN, 18));
				lblY_1.setBounds(123, 101, 46, 14);
				panel_rectangulo.add(lblY_1);

				JLabel lblY_2 = new JLabel("Y3:");
				lblY_2.setFont(new Font("Broadway", Font.PLAIN, 18));
				lblY_2.setBounds(123, 137, 46, 14);
				panel_rectangulo.add(lblY_2);

				JLabel lblParametros = new JLabel("Parametros");
				lblParametros.setFont(new Font("Broadway", Font.PLAIN, 25));
				lblParametros.setBounds(10, 11, 177, 35);
				panel_rectangulo.add(lblParametros);

				JLabel lblNewLabel_1 = new JLabel("Indicaciones ");
				lblNewLabel_1.setFont(new Font("Broadway", Font.PLAIN, 22));
				lblNewLabel_1.setBounds(360, 35, 166, 56);
				panel_rectangulo.add(lblNewLabel_1);

				JLabel lblNewLabel_2 = new JLabel("Para");
				lblNewLabel_2.setFont(new Font("Broadway", Font.PLAIN, 22));
				lblNewLabel_2.setBounds(405, 85, 77, 26);
				panel_rectangulo.add(lblNewLabel_2);

				JLabel lblNewLabel_3 = new JLabel("Graficar");
				lblNewLabel_3.setFont(new Font("Broadway", Font.PLAIN, 22));
				lblNewLabel_3.setBounds(390, 116, 108, 26);
				panel_rectangulo.add(lblNewLabel_3);
			}
		}
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
