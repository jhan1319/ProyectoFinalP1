package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Cuadrado;
import Logica.PrismasLab;
import Logica.StdDraw3D;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class Crear_Figuras extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txt_altura;
	private JComboBox cbxTipo;
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
	private JTextField txtY_3_trapecio;
	private JTextField txtY_4_trapecio;
	private JFormattedTextField frmtdtxtfldY_1_trapecio;
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
	private JFormattedTextField frmtdtxtfldX_1_cuadrado;
	private JFormattedTextField frmtdtxtfldY_1_cuadrado;
	private JFormattedTextField frmtdtxtfldX_2_cuadrado;
	private JFormattedTextField frmtdtxtfldY_2_cuadrado;
	private JTextField txt_nombre;
	private JFormattedTextField frmtdtxtfldX_1_triangulo;
	private JFormattedTextField frmtdtxtfldY_1_triangulo;
	private JFormattedTextField frmtdtxtfldX_2_triangulo;
	private JFormattedTextField frmtdtxtfldY_2_triangulo;
	private JFormattedTextField frmtdtxtfldX_3_triangulo;
	private JFormattedTextField frmtdtxtfldY_3_triangulo;
	private JFormattedTextField frmtdtxtfldX_1_trapecio;
	private JFormattedTextField frmtdtxtfldX_2_trapecio;
	private JFormattedTextField frmtdtxtfldY_2_trapecio;
	private JFormattedTextField frmtdtxtfldX_3_trapecio;
	private JFormattedTextField frmtdtxtfldX_4_trapecio;
	private JFormattedTextField frmtdtxtfldY_3_trapecio;
	private JFormattedTextField frmtdtxtfldY_4_trapecio;
	private JFormattedTextField frmtdtxtfldX_1_rombo;
	private JFormattedTextField frmtdtxtfldY_1_rombo;
	private JFormattedTextField frmtdtxtfldDVertical;
	private JFormattedTextField frmtdtxtfldDHorizontal;
	private JFormattedTextField frmtdtxtfldX_1_rectangulo;
	private JFormattedTextField frmtdtxtfldY_1_rectangulo;
	private JFormattedTextField frmtdtxtfldX_2_rectangulo;
	private JFormattedTextField frmtdtxtfldY_2_rectangulo;
	private JFormattedTextField frmtdtxtfldX_3_rectangulo;
	private JFormattedTextField frmtdtxtfldY_3_rectangulo;
	private JPanel panel_vista_previa;

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

		PrismasLab controladora = PrismasLab.getInstance();

		setUndecorated(true);
		setBounds(100, 100, 981, 888);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);/////CENTRADO

		{
			JPanel panel_windows = new JPanel();
			panel_windows.setBounds(0, 0, 981, 35);
			contentPanel.add(panel_windows);
			panel_windows.setLayout(null);
			{
				JLabel lblCerrar = new JLabel("");
				lblCerrar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
					}
				});
				lblCerrar.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/cancel_button.png")));
				lblCerrar.setBounds(940, 5, 32, 24);
				panel_windows.add(lblCerrar);
			}
		}
		{
			JPanel panel_datos = new JPanel();
			panel_datos.setBounds(10, 43, 325, 145);
			contentPanel.add(panel_datos);
			panel_datos.setLayout(null);
			{
				JFormattedTextField frmtdtxtfldTipo = new JFormattedTextField();
				frmtdtxtfldTipo.setEditable(false);
				frmtdtxtfldTipo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				frmtdtxtfldTipo.setText("Tipo de figura:");
				frmtdtxtfldTipo.setBounds(9, 80, 89, 23);
				panel_datos.add(frmtdtxtfldTipo);
			}
			{
				cbxTipo = new JComboBox();
				cbxTipo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						PrismasLab.pantallaVacia();
						
						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Triangulo")) {
							panel_triangulo.setVisible(true);
							panel_cuadrado.setVisible(false);
							panel_rectangulo.setVisible(false);
							panel_trapecio.setVisible(false);
							panel_rombo.setVisible(false);
							panel_vacio.setVisible(false);
							PrismasLab.pantallaVacia();

						}
						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Cuadrado")) {
							panel_triangulo.setVisible(false);
							panel_cuadrado.setVisible(true);
							panel_rectangulo.setVisible(false);
							panel_trapecio.setVisible(false);
							panel_rombo.setVisible(false);
							panel_vacio.setVisible(false);
							PrismasLab.pantallaVacia();
						}
						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Trapecio")) {
							panel_triangulo.setVisible(false);
							panel_cuadrado.setVisible(false);
							panel_rectangulo.setVisible(false);
							panel_trapecio.setVisible(true);
							panel_rombo.setVisible(false);
							panel_vacio.setVisible(false);
							PrismasLab.pantallaVacia();
						}
						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Rombo")) {
							panel_triangulo.setVisible(false);
							panel_cuadrado.setVisible(false);
							panel_rectangulo.setVisible(false);
							panel_trapecio.setVisible(false);
							panel_rombo.setVisible(true);
							panel_vacio.setVisible(false);
							PrismasLab.pantallaVacia();
						}
						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Rectangulo")) {
							panel_triangulo.setVisible(false);
							panel_cuadrado.setVisible(false);
							panel_rectangulo.setVisible(true);
							panel_trapecio.setVisible(false);
							panel_rombo.setVisible(false);
							panel_vacio.setVisible(false);
							PrismasLab.pantallaVacia();
						}
						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>")){
							panel_triangulo.setVisible(false);
							panel_cuadrado.setVisible(false);
							panel_rectangulo.setVisible(false);
							panel_trapecio.setVisible(false);
							panel_rombo.setVisible(false);
							panel_vacio.setVisible(true);
							PrismasLab.pantallaVacia();
						}


					}
				});
				cbxTipo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Triangulo", "Cuadrado", "Trapecio", "Rombo", "Rectangulo"}));
				cbxTipo.setBounds(110, 83, 102, 20);
				panel_datos.add(cbxTipo);



			}
			{
				JFormattedTextField frmtdtxtfldAltura = new JFormattedTextField();
				frmtdtxtfldAltura.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				frmtdtxtfldAltura.setText("Altura:");
				frmtdtxtfldAltura.setBounds(9, 114, 67, 20);
				panel_datos.add(frmtdtxtfldAltura);
			}
			{
				txt_altura = new JTextField();
				txt_altura.setBounds(108, 114, 86, 20);
				panel_datos.add(txt_altura);
				txt_altura.setColumns(10);
			}
			{
				JLabel lblDfreffvvf = new JLabel("");
				lblDfreffvvf.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/crear_figura.png")));
				lblDfreffvvf.setBounds(75, 11, 67, 64);
				panel_datos.add(lblDfreffvvf);
			}

			JFormattedTextField frmtdtxtfldNombre = new JFormattedTextField();
			frmtdtxtfldNombre.setText("Nombre:");
			frmtdtxtfldNombre.setBounds(224, 80, 67, 22);
			panel_datos.add(frmtdtxtfldNombre);

			txt_nombre = new JTextField();
			txt_nombre.setBounds(224, 113, 79, 22);
			panel_datos.add(txt_nombre);
			txt_nombre.setColumns(10);
		}
		{
			panel_vista_previa = new JPanel();
			panel_vista_previa.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_vista_previa.setBounds(347, 48, 610, 610);
			contentPanel.add(panel_vista_previa);
			panel_vista_previa.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			panel_vista_previa.add(StdDraw3D.frame);
			
			//StdDraw3D.frame.setVisible(true);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(12, 818, 945, 57);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						
						Estudiante_Principal estu = new Estudiante_Principal();
						
						estu.setVisible(true);
					}
				});
				btnCancelar.setBounds(692, 21, 89, 23);
				buttonPane.add(btnCancelar);
			}
			{
				JButton btnCrear = new JButton("Crear");
				btnCrear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

				
						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Cuadrado")) {

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
							
						}
						
						
						
							
						
							
						
							
					}
				});
				btnCrear.setBounds(439, 21, 89, 23);
				buttonPane.add(btnCrear);
			}
			{
				JButton btnVistaPrevia = new JButton("Vista Previa");
				btnVistaPrevia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {



						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Triangulo")) {

							double tx1 = Double.valueOf(txtX_1_triangulo.getText());
							double ty1 = Double.valueOf(txtY_1_triangulo.getText());
							double tx2 = Double.valueOf(txtX_2_triangulo.getText());
							double ty2 = Double.valueOf(txtY_2_triangulo.getText());
							double tx3 = Double.valueOf(txtX_3_triangulo.getText());
							double ty3 = Double.valueOf(txtY_3_triangulo.getText());
							double taltura = Double.valueOf(txt_altura.getText());
							String tnombre = txt_nombre.getText();

							PrismasLab.graficarTriangulo(tx1, ty1, tx2, ty2, tx3, ty3, taltura, tnombre);
							
							 	
						}



						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Cuadrado")) {

							double x1c = Double.valueOf(txtX_1_cuadrado.getText());
							double y1c = Double.valueOf(txtY_1_cuadrado.getText());
							double x2c = Double.valueOf(txtX_2_cuadrado.getText());
							double y2c = Double.valueOf(txtY_2_cuadrado.getText());
							double alturac = Double.valueOf(txt_altura.getText());
							String nombrec = txt_nombre.getText();

							PrismasLab.graficarCuadrado(x1c, y1c, x2c, y2c, alturac, nombrec);

						}

						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Trapecio")) {

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

							PrismasLab.graficarTrapecio(x1t, y1t, x2t, y2t, x3t, y3t, x4t, y4t, alturat, alturat, nombret);

						}

						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Rombo")) {

							double x1 = Double.valueOf(txtX_1_rombo.getText());
							double y1 = Double.valueOf(txtY_1_rombo.getText());
							double D = Double.valueOf(txt_d_vertical.getText());
							double d = Double.valueOf(txt_d_horizontal.getText());
							double altura = Double.valueOf(txt_altura.getText());
							String nombre = txt_nombre.getText();

							PrismasLab.graficarRombo(x1, y1, altura, D, d, nombre);

						}

						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Rectangulo")) {

							double x1 = Double.valueOf(txtX_1_rectangulo.getText());
							double y1 = Double.valueOf(txtY_1_rectangulo.getText());
							double x2 = Double.valueOf(txtX_2_rectangulo.getText());
							double y2 = Double.valueOf(txtY_2_rectangulo.getText());
							double x3 = Double.valueOf(txtX_3_rectangulo.getText());
							double y3 = Double.valueOf(txtY_3_rectangulo.getText());
							double altura = Double.valueOf(txt_altura.getText());
							String nombre = txt_nombre.getText();

							PrismasLab.graficarRectangulo(x1, y1, x2, y2, x3, y3, altura, nombre);



						}



						///DAOEHFIJNFIJBSEIAOJLBFKJEABLFKN



						///EAFAEFAEFEASfE




					}
				});
				btnVistaPrevia.setBounds(164, 21, 111, 23);
				buttonPane.add(btnVistaPrevia);
			}
		}
		{
			JPanel CARD = new JPanel();
			CARD.setBounds(10, 191, 222, 249);
			contentPanel.add(CARD);
			CARD.setLayout(new CardLayout(0, 0));
			{
				panel_vacio = new JPanel();
				panel_vacio.setBackground(new Color(0, 0, 102));
				CARD.add(panel_vacio, "name_3534528306112726");
				panel_vacio.setLayout(null);
				{
					JFormattedTextField frmtdtxtfldSeleccioneElTipo = new JFormattedTextField();
					frmtdtxtfldSeleccioneElTipo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
					frmtdtxtfldSeleccioneElTipo.setText("Seleccione el tipo de figura");
					frmtdtxtfldSeleccioneElTipo.setBounds(10, 51, 184, 23);
					panel_vacio.add(frmtdtxtfldSeleccioneElTipo);
				}
			}
			{
				panel_triangulo = new JPanel();
				panel_triangulo.setBackground(new Color(0, 102, 102));
				CARD.add(panel_triangulo, "name_3534587133413675");
				panel_triangulo.setLayout(null);
				{
					frmtdtxtfldX_1_triangulo = new JFormattedTextField();
					frmtdtxtfldX_1_triangulo.setText("X1: ");
					frmtdtxtfldX_1_triangulo.setBounds(10, 5, 32, 20);
					panel_triangulo.add(frmtdtxtfldX_1_triangulo);
				}
				{
					frmtdtxtfldY_1_triangulo = new JFormattedTextField();
					frmtdtxtfldY_1_triangulo.setText("Y1:");
					frmtdtxtfldY_1_triangulo.setBounds(135, 5, 32, 20);
					panel_triangulo.add(frmtdtxtfldY_1_triangulo);
				}
				{
					frmtdtxtfldX_2_triangulo = new JFormattedTextField();
					frmtdtxtfldX_2_triangulo.setText("X2:");
					frmtdtxtfldX_2_triangulo.setBounds(10, 36, 32, 20);
					panel_triangulo.add(frmtdtxtfldX_2_triangulo);
				}
				{
					frmtdtxtfldY_2_triangulo = new JFormattedTextField();
					frmtdtxtfldY_2_triangulo.setText("Y2:");
					frmtdtxtfldY_2_triangulo.setBounds(135, 36, 32, 20);
					panel_triangulo.add(frmtdtxtfldY_2_triangulo);
				}
				{
					frmtdtxtfldX_3_triangulo = new JFormattedTextField();
					frmtdtxtfldX_3_triangulo.setText("X3:");
					frmtdtxtfldX_3_triangulo.setBounds(10, 67, 32, 20);
					panel_triangulo.add(frmtdtxtfldX_3_triangulo);
				}
				{
					frmtdtxtfldY_3_triangulo = new JFormattedTextField();
					frmtdtxtfldY_3_triangulo.setText("Y3:");
					frmtdtxtfldY_3_triangulo.setBounds(135, 67, 32, 20);
					panel_triangulo.add(frmtdtxtfldY_3_triangulo);
				}
				{
					txtX_1_triangulo = new JTextField();
					txtX_1_triangulo.setBounds(49, 5, 40, 20);
					panel_triangulo.add(txtX_1_triangulo);
					txtX_1_triangulo.setColumns(10);
				}
				{
					txtY_1_triangulo = new JTextField();
					txtY_1_triangulo.setBounds(172, 5, 40, 20);
					panel_triangulo.add(txtY_1_triangulo);
					txtY_1_triangulo.setColumns(10);
				}
				{
					txtX_2_triangulo = new JTextField();
					txtX_2_triangulo.setBounds(49, 36, 40, 20);
					panel_triangulo.add(txtX_2_triangulo);
					txtX_2_triangulo.setColumns(10);
				}
				{
					txtY_2_triangulo = new JTextField();
					txtY_2_triangulo.setBounds(172, 36, 40, 20);
					panel_triangulo.add(txtY_2_triangulo);
					txtY_2_triangulo.setColumns(10);
				}
				{
					txtX_3_triangulo = new JTextField();
					txtX_3_triangulo.setBounds(49, 67, 40, 20);
					panel_triangulo.add(txtX_3_triangulo);
					txtX_3_triangulo.setColumns(10);
				}
				{
					txtY_3_triangulo = new JTextField();
					txtY_3_triangulo.setBounds(172, 67, 40, 20);
					panel_triangulo.add(txtY_3_triangulo);
					txtY_3_triangulo.setColumns(10);
				}
			}
			{
				panel_cuadrado = new JPanel();
				panel_cuadrado.setBackground(new Color(51, 204, 153));
				CARD.add(panel_cuadrado, "name_3534603057838194");
				panel_cuadrado.setLayout(null);
				{
					frmtdtxtfldX_1_cuadrado = new JFormattedTextField();
					frmtdtxtfldX_1_cuadrado.setText("X1:");
					frmtdtxtfldX_1_cuadrado.setBounds(10, 11, 31, 20);
					panel_cuadrado.add(frmtdtxtfldX_1_cuadrado);
				}
				{
					frmtdtxtfldY_1_cuadrado = new JFormattedTextField();
					frmtdtxtfldY_1_cuadrado.setText("Y1:");
					frmtdtxtfldY_1_cuadrado.setBounds(131, 11, 31, 20);
					panel_cuadrado.add(frmtdtxtfldY_1_cuadrado);
				}
				{
					frmtdtxtfldX_2_cuadrado = new JFormattedTextField();
					frmtdtxtfldX_2_cuadrado.setText("X2:");
					frmtdtxtfldX_2_cuadrado.setBounds(10, 42, 31, 20);
					panel_cuadrado.add(frmtdtxtfldX_2_cuadrado);
				}
				{
					frmtdtxtfldY_2_cuadrado = new JFormattedTextField();
					frmtdtxtfldY_2_cuadrado.setText("Y2:");
					frmtdtxtfldY_2_cuadrado.setBounds(131, 42, 31, 20);
					panel_cuadrado.add(frmtdtxtfldY_2_cuadrado);
				}
				{
					txtX_1_cuadrado = new JTextField();
					txtX_1_cuadrado.setBounds(51, 11, 40, 20);
					panel_cuadrado.add(txtX_1_cuadrado);
					txtX_1_cuadrado.setColumns(10);
				}
				{
					txtY_1_cuadrado = new JTextField();
					txtY_1_cuadrado.setBounds(172, 11, 40, 20);
					panel_cuadrado.add(txtY_1_cuadrado);
					txtY_1_cuadrado.setColumns(10);
				}
				{
					txtX_2_cuadrado = new JTextField();
					txtX_2_cuadrado.setBounds(51, 42, 40, 20);
					panel_cuadrado.add(txtX_2_cuadrado);
					txtX_2_cuadrado.setColumns(10);
				}
				{
					txtY_2_cuadrado = new JTextField();
					txtY_2_cuadrado.setBounds(172, 42, 40, 20);
					panel_cuadrado.add(txtY_2_cuadrado);
					txtY_2_cuadrado.setColumns(10);
				}
			}
			{
				panel_trapecio = new JPanel();
				panel_trapecio.setBackground(new Color(153, 0, 153));
				CARD.add(panel_trapecio, "name_3534608440743926");
				panel_trapecio.setLayout(null);
				{
					frmtdtxtfldX_1_trapecio = new JFormattedTextField();
					frmtdtxtfldX_1_trapecio.setText("X1:");
					frmtdtxtfldX_1_trapecio.setBounds(10, 11, 29, 20);
					panel_trapecio.add(frmtdtxtfldX_1_trapecio);
				}
				{
					frmtdtxtfldY_1_trapecio = new JFormattedTextField();
					frmtdtxtfldY_1_trapecio.setText("Y1:");
					frmtdtxtfldY_1_trapecio.setBounds(127, 11, 35, 20);
					panel_trapecio.add(frmtdtxtfldY_1_trapecio);
				}
				{
					frmtdtxtfldX_2_trapecio = new JFormattedTextField();
					frmtdtxtfldX_2_trapecio.setText("X2:");
					frmtdtxtfldX_2_trapecio.setBounds(10, 42, 29, 20);
					panel_trapecio.add(frmtdtxtfldX_2_trapecio);
				}
				{
					frmtdtxtfldY_2_trapecio = new JFormattedTextField();
					frmtdtxtfldY_2_trapecio.setText("Y2:");
					frmtdtxtfldY_2_trapecio.setBounds(127, 42, 35, 20);
					panel_trapecio.add(frmtdtxtfldY_2_trapecio);
				}
				{
					txtX_1_trapecio = new JTextField();
					txtX_1_trapecio.setBounds(43, 11, 40, 20);
					panel_trapecio.add(txtX_1_trapecio);
					txtX_1_trapecio.setColumns(10);
				}
				{
					txtY_1_trapecio = new JTextField();
					txtY_1_trapecio.setBounds(172, 11, 40, 20);
					panel_trapecio.add(txtY_1_trapecio);
					txtY_1_trapecio.setColumns(10);
				}
				{
					frmtdtxtfldX_3_trapecio = new JFormattedTextField();
					frmtdtxtfldX_3_trapecio.setText("X3:");
					frmtdtxtfldX_3_trapecio.setBounds(10, 73, 29, 20);
					panel_trapecio.add(frmtdtxtfldX_3_trapecio);
				}
				{
					frmtdtxtfldX_4_trapecio = new JFormattedTextField();
					frmtdtxtfldX_4_trapecio.setText("X4:");
					frmtdtxtfldX_4_trapecio.setBounds(10, 104, 29, 20);
					panel_trapecio.add(frmtdtxtfldX_4_trapecio);
				}
				{
					frmtdtxtfldY_3_trapecio = new JFormattedTextField();
					frmtdtxtfldY_3_trapecio.setText("Y3:");
					frmtdtxtfldY_3_trapecio.setBounds(127, 73, 35, 20);
					panel_trapecio.add(frmtdtxtfldY_3_trapecio);
				}
				{
					frmtdtxtfldY_4_trapecio = new JFormattedTextField();
					frmtdtxtfldY_4_trapecio.setText("Y4:");
					frmtdtxtfldY_4_trapecio.setBounds(127, 104, 35, 20);
					panel_trapecio.add(frmtdtxtfldY_4_trapecio);
				}
				{
					txtY_2_trapecio = new JTextField();
					txtY_2_trapecio.setColumns(10);
					txtY_2_trapecio.setBounds(172, 42, 40, 20);
					panel_trapecio.add(txtY_2_trapecio);
				}
				{
					txtX_2_trapecio = new JTextField();
					txtX_2_trapecio.setColumns(10);
					txtX_2_trapecio.setBounds(43, 42, 40, 20);
					panel_trapecio.add(txtX_2_trapecio);
				}
				{
					txtX_3_trapecio = new JTextField();
					txtX_3_trapecio.setColumns(10);
					txtX_3_trapecio.setBounds(43, 73, 40, 20);
					panel_trapecio.add(txtX_3_trapecio);
				}
				{
					txtX_4_trapecio = new JTextField();
					txtX_4_trapecio.setColumns(10);
					txtX_4_trapecio.setBounds(43, 104, 40, 20);
					panel_trapecio.add(txtX_4_trapecio);
				}
				{
					txtY_3_trapecio = new JTextField();
					txtY_3_trapecio.setColumns(10);
					txtY_3_trapecio.setBounds(172, 73, 40, 20);
					panel_trapecio.add(txtY_3_trapecio);
				}
				{
					txtY_4_trapecio = new JTextField();
					txtY_4_trapecio.setColumns(10);
					txtY_4_trapecio.setBounds(172, 104, 40, 20);
					panel_trapecio.add(txtY_4_trapecio);
				}
			}
			{
				panel_rombo = new JPanel();
				panel_rombo.setBackground(Color.PINK);
				CARD.add(panel_rombo, "name_3534611105430280");
				panel_rombo.setLayout(null);
				{
					frmtdtxtfldX_1_rombo = new JFormattedTextField();
					frmtdtxtfldX_1_rombo.setText("X1:");
					frmtdtxtfldX_1_rombo.setBounds(10, 11, 29, 20);
					panel_rombo.add(frmtdtxtfldX_1_rombo);
				}
				{
					frmtdtxtfldY_1_rombo = new JFormattedTextField();
					frmtdtxtfldY_1_rombo.setText("Y1:");
					frmtdtxtfldY_1_rombo.setBounds(133, 11, 29, 20);
					panel_rombo.add(frmtdtxtfldY_1_rombo);
				}
				{
					frmtdtxtfldDVertical = new JFormattedTextField();
					frmtdtxtfldDVertical.setText("D Vertical:");
					frmtdtxtfldDVertical.setBounds(10, 42, 69, 20);
					panel_rombo.add(frmtdtxtfldDVertical);
				}
				{
					frmtdtxtfldDHorizontal = new JFormattedTextField();
					frmtdtxtfldDHorizontal.setText("D Horizontal:");
					frmtdtxtfldDHorizontal.setBounds(10, 73, 69, 20);
					panel_rombo.add(frmtdtxtfldDHorizontal);
				}
				{
					txtX_1_rombo = new JTextField();
					txtX_1_rombo.setBounds(49, 11, 40, 20);
					panel_rombo.add(txtX_1_rombo);
					txtX_1_rombo.setColumns(10);
				}
				{
					txt_d_horizontal = new JTextField();
					txt_d_horizontal.setBounds(89, 73, 123, 20);
					panel_rombo.add(txt_d_horizontal);
					txt_d_horizontal.setColumns(10);
				}
				{
					txtY_1_rombo = new JTextField();
					txtY_1_rombo.setBounds(172, 11, 40, 20);
					panel_rombo.add(txtY_1_rombo);
					txtY_1_rombo.setColumns(10);
				}
				{
					txt_d_vertical = new JTextField();
					txt_d_vertical.setBounds(89, 42, 123, 20);
					panel_rombo.add(txt_d_vertical);
					txt_d_vertical.setColumns(10);
				}
			}
			{
				panel_rectangulo = new JPanel();
				panel_rectangulo.setBackground(Color.GREEN);
				CARD.add(panel_rectangulo, "name_3534615514417211");
				panel_rectangulo.setLayout(null);
				{
					frmtdtxtfldX_1_rectangulo = new JFormattedTextField();
					frmtdtxtfldX_1_rectangulo.setText("X1:");
					frmtdtxtfldX_1_rectangulo.setBounds(10, 11, 31, 20);
					panel_rectangulo.add(frmtdtxtfldX_1_rectangulo);
				}
				{
					frmtdtxtfldY_1_rectangulo = new JFormattedTextField();
					frmtdtxtfldY_1_rectangulo.setText("Y1:");
					frmtdtxtfldY_1_rectangulo.setBounds(131, 11, 31, 20);
					panel_rectangulo.add(frmtdtxtfldY_1_rectangulo);
				}
				{
					frmtdtxtfldX_2_rectangulo = new JFormattedTextField();
					frmtdtxtfldX_2_rectangulo.setText("X2:");
					frmtdtxtfldX_2_rectangulo.setBounds(10, 42, 31, 20);
					panel_rectangulo.add(frmtdtxtfldX_2_rectangulo);
				}
				{
					frmtdtxtfldY_2_rectangulo = new JFormattedTextField();
					frmtdtxtfldY_2_rectangulo.setText("Y2:");
					frmtdtxtfldY_2_rectangulo.setBounds(131, 42, 31, 20);
					panel_rectangulo.add(frmtdtxtfldY_2_rectangulo);
				}
				{
					frmtdtxtfldX_3_rectangulo = new JFormattedTextField();
					frmtdtxtfldX_3_rectangulo.setText("X3:");
					frmtdtxtfldX_3_rectangulo.setBounds(10, 73, 31, 20);
					panel_rectangulo.add(frmtdtxtfldX_3_rectangulo);
				}
				{
					frmtdtxtfldY_3_rectangulo = new JFormattedTextField();
					frmtdtxtfldY_3_rectangulo.setText("Y3:");
					frmtdtxtfldY_3_rectangulo.setBounds(131, 73, 31, 20);
					panel_rectangulo.add(frmtdtxtfldY_3_rectangulo);
				}
				{
					txtX_1_rectangulo = new JTextField();
					txtX_1_rectangulo.setBounds(51, 11, 40, 20);
					panel_rectangulo.add(txtX_1_rectangulo);
					txtX_1_rectangulo.setColumns(10);
				}
				{
					txtY_1_rectangulo = new JTextField();
					txtY_1_rectangulo.setBounds(172, 11, 40, 20);
					panel_rectangulo.add(txtY_1_rectangulo);
					txtY_1_rectangulo.setColumns(10);
				}
				{
					txtX_2_rectangulo = new JTextField();
					txtX_2_rectangulo.setBounds(51, 42, 40, 20);
					panel_rectangulo.add(txtX_2_rectangulo);
					txtX_2_rectangulo.setColumns(10);
				}
				{
					txtX_3_rectangulo = new JTextField();
					txtX_3_rectangulo.setBounds(51, 73, 40, 20);
					panel_rectangulo.add(txtX_3_rectangulo);
					txtX_3_rectangulo.setColumns(10);
				}
				{
					txtY_2_rectangulo = new JTextField();
					txtY_2_rectangulo.setBounds(172, 42, 40, 20);
					panel_rectangulo.add(txtY_2_rectangulo);
					txtY_2_rectangulo.setColumns(10);
				}
				{
					txtY_3_rectangulo = new JTextField();
					txtY_3_rectangulo.setBounds(172, 73, 40, 20);
					panel_rectangulo.add(txtY_3_rectangulo);
					txtY_3_rectangulo.setColumns(10);
				}
			}
		}
	}
}
