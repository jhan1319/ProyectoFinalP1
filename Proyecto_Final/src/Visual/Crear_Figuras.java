package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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

public class Crear_Figuras extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
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
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

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
		setBounds(100, 100, 620, 540);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);/////CENTRADO

		{
			JPanel panel_windows = new JPanel();
			panel_windows.setBounds(0, 0, 594, 35);
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
				lblCerrar.setBounds(550, 13, 32, 24);
				panel_windows.add(lblCerrar);
			}
		}
		{
			JPanel panel_datos = new JPanel();
			panel_datos.setBounds(10, 43, 222, 145);
			contentPanel.add(panel_datos);
			panel_datos.setLayout(null);
			{
				JFormattedTextField frmtdtxtfldTipo = new JFormattedTextField();
				frmtdtxtfldTipo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				frmtdtxtfldTipo.setText("Tipo de figura:");
				frmtdtxtfldTipo.setBounds(9, 80, 89, 23);
				panel_datos.add(frmtdtxtfldTipo);
			}
			{
				cbxTipo = new JComboBox();
				cbxTipo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Triangulo")) {
							panel_triangulo.setVisible(true);
							panel_cuadrado.setVisible(false);
							panel_rectangulo.setVisible(false);
							panel_trapecio.setVisible(false);
							panel_rombo.setVisible(false);
							panel_vacio.setVisible(false);
						
						}
						 if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Cuadrado")) {
							panel_triangulo.setVisible(false);
							panel_cuadrado.setVisible(true);
							panel_rectangulo.setVisible(false);
							panel_trapecio.setVisible(false);
							panel_rombo.setVisible(false);
							panel_vacio.setVisible(false);
						}
						if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Trapecio")) {
							panel_triangulo.setVisible(false);
							panel_cuadrado.setVisible(false);
							panel_rectangulo.setVisible(false);
							panel_trapecio.setVisible(true);
							panel_rombo.setVisible(false);
							panel_vacio.setVisible(false);
						}
						 if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Rombo")) {
							panel_triangulo.setVisible(false);
							panel_cuadrado.setVisible(false);
							panel_rectangulo.setVisible(false);
							panel_trapecio.setVisible(false);
							panel_rombo.setVisible(true);
							panel_vacio.setVisible(false);
						}
						 if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("Rectangulo")) {
							panel_triangulo.setVisible(false);
							panel_cuadrado.setVisible(false);
							panel_rectangulo.setVisible(true);
							panel_trapecio.setVisible(false);
							panel_rombo.setVisible(false);
							panel_vacio.setVisible(false);
						}
						 if (cbxTipo.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>")){
							    panel_triangulo.setVisible(false);
								panel_cuadrado.setVisible(false);
								panel_rectangulo.setVisible(false);
								panel_trapecio.setVisible(false);
								panel_rombo.setVisible(false);
								panel_vacio.setVisible(true);
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
				textField = new JTextField();
				textField.setBounds(108, 114, 86, 20);
				panel_datos.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel lblDfreffvvf = new JLabel("");
				lblDfreffvvf.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/crear_figura.png")));
				lblDfreffvvf.setBounds(75, 11, 67, 64);
				panel_datos.add(lblDfreffvvf);
			}
		}
		{
			JPanel panel_vista_previa = new JPanel();
			panel_vista_previa.setBounds(242, 46, 342, 394);
			contentPanel.add(panel_vista_previa);
			panel_vista_previa.setLayout(null);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 483, 594, 57);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setBounds(351, 21, 89, 23);
				buttonPane.add(btnCancelar);
			}
			{
				JButton btnCrear = new JButton("Crear");
				btnCrear.setBounds(258, 21, 89, 23);
				buttonPane.add(btnCrear);
			}
			{
				JButton btnVistaPrevia = new JButton("Vista Previa");
				btnVistaPrevia.setBounds(159, 21, 89, 23);
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
					JFormattedTextField frmtdtxtfldX_1_triangulo = new JFormattedTextField();
					frmtdtxtfldX_1_triangulo.setText("X1: ");
					frmtdtxtfldX_1_triangulo.setBounds(10, 5, 32, 20);
					panel_triangulo.add(frmtdtxtfldX_1_triangulo);
				}
				{
					JFormattedTextField frmtdtxtfldY_1_triangulo = new JFormattedTextField();
					frmtdtxtfldY_1_triangulo.setText("Y1:");
					frmtdtxtfldY_1_triangulo.setBounds(135, 5, 32, 20);
					panel_triangulo.add(frmtdtxtfldY_1_triangulo);
				}
				{
					JFormattedTextField frmtdtxtfldX_2_triangulo = new JFormattedTextField();
					frmtdtxtfldX_2_triangulo.setText("X2:");
					frmtdtxtfldX_2_triangulo.setBounds(10, 36, 32, 20);
					panel_triangulo.add(frmtdtxtfldX_2_triangulo);
				}
				{
					JFormattedTextField frmtdtxtfldY_2_triangulo = new JFormattedTextField();
					frmtdtxtfldY_2_triangulo.setText("Y2:");
					frmtdtxtfldY_2_triangulo.setBounds(135, 36, 32, 20);
					panel_triangulo.add(frmtdtxtfldY_2_triangulo);
				}
				{
					JFormattedTextField frmtdtxtfldX_3_triangulo = new JFormattedTextField();
					frmtdtxtfldX_3_triangulo.setText("X3:");
					frmtdtxtfldX_3_triangulo.setBounds(10, 67, 32, 20);
					panel_triangulo.add(frmtdtxtfldX_3_triangulo);
				}
				{
					JFormattedTextField frmtdtxtfldY_3_triangulo = new JFormattedTextField();
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
					JFormattedTextField frmtdtxtfldX_1_cuadrado = new JFormattedTextField();
					frmtdtxtfldX_1_cuadrado.setText("X1:");
					frmtdtxtfldX_1_cuadrado.setBounds(10, 11, 31, 20);
					panel_cuadrado.add(frmtdtxtfldX_1_cuadrado);
				}
				{
					JFormattedTextField frmtdtxtfldY_1_cuadrado = new JFormattedTextField();
					frmtdtxtfldY_1_cuadrado.setText("Y1:");
					frmtdtxtfldY_1_cuadrado.setBounds(131, 11, 31, 20);
					panel_cuadrado.add(frmtdtxtfldY_1_cuadrado);
				}
				{
					JFormattedTextField frmtdtxtfldX_2_cuadrado = new JFormattedTextField();
					frmtdtxtfldX_2_cuadrado.setText("X2:");
					frmtdtxtfldX_2_cuadrado.setBounds(10, 42, 31, 20);
					panel_cuadrado.add(frmtdtxtfldX_2_cuadrado);
				}
				{
					JFormattedTextField frmtdtxtfldY_2_cuadrado = new JFormattedTextField();
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
					JFormattedTextField frmtdtxtfldX_1_trapecio = new JFormattedTextField();
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
					JFormattedTextField frmtdtxtfldX_2_trapecio = new JFormattedTextField();
					frmtdtxtfldX_2_trapecio.setText("X2:");
					frmtdtxtfldX_2_trapecio.setBounds(10, 42, 29, 20);
					panel_trapecio.add(frmtdtxtfldX_2_trapecio);
				}
				{
					JFormattedTextField frmtdtxtfldY_2_trapecio = new JFormattedTextField();
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
					JFormattedTextField frmtdtxtfldX_3_trapecio = new JFormattedTextField();
					frmtdtxtfldX_3_trapecio.setText("X3:");
					frmtdtxtfldX_3_trapecio.setBounds(10, 73, 29, 20);
					panel_trapecio.add(frmtdtxtfldX_3_trapecio);
				}
				{
					JFormattedTextField frmtdtxtfldX_4_trapecio = new JFormattedTextField();
					frmtdtxtfldX_4_trapecio.setText("X4:");
					frmtdtxtfldX_4_trapecio.setBounds(10, 104, 29, 20);
					panel_trapecio.add(frmtdtxtfldX_4_trapecio);
				}
				{
					JFormattedTextField frmtdtxtfldY_3_trapecio = new JFormattedTextField();
					frmtdtxtfldY_3_trapecio.setText("Y3:");
					frmtdtxtfldY_3_trapecio.setBounds(127, 73, 35, 20);
					panel_trapecio.add(frmtdtxtfldY_3_trapecio);
				}
				{
					JFormattedTextField frmtdtxtfldY_4_trapecio = new JFormattedTextField();
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
					JFormattedTextField frmtdtxtfldX_1_rombo = new JFormattedTextField();
					frmtdtxtfldX_1_rombo.setText("X1:");
					frmtdtxtfldX_1_rombo.setBounds(10, 11, 29, 20);
					panel_rombo.add(frmtdtxtfldX_1_rombo);
				}
				{
					JFormattedTextField frmtdtxtfldY_1_rombo = new JFormattedTextField();
					frmtdtxtfldY_1_rombo.setText("Y1:");
					frmtdtxtfldY_1_rombo.setBounds(133, 11, 29, 20);
					panel_rombo.add(frmtdtxtfldY_1_rombo);
				}
				{
					JFormattedTextField frmtdtxtfldDVertical = new JFormattedTextField();
					frmtdtxtfldDVertical.setText("D Vertical:");
					frmtdtxtfldDVertical.setBounds(10, 42, 69, 20);
					panel_rombo.add(frmtdtxtfldDVertical);
				}
				{
					JFormattedTextField frmtdtxtfldDHorizontal = new JFormattedTextField();
					frmtdtxtfldDHorizontal.setText("D Horizontal:");
					frmtdtxtfldDHorizontal.setBounds(10, 73, 69, 20);
					panel_rombo.add(frmtdtxtfldDHorizontal);
				}
				{
					textField_1 = new JTextField();
					textField_1.setBounds(49, 11, 40, 20);
					panel_rombo.add(textField_1);
					textField_1.setColumns(10);
				}
				{
					textField_2 = new JTextField();
					textField_2.setBounds(89, 73, 123, 20);
					panel_rombo.add(textField_2);
					textField_2.setColumns(10);
				}
				{
					textField_3 = new JTextField();
					textField_3.setBounds(172, 11, 40, 20);
					panel_rombo.add(textField_3);
					textField_3.setColumns(10);
				}
				{
					textField_4 = new JTextField();
					textField_4.setBounds(89, 42, 123, 20);
					panel_rombo.add(textField_4);
					textField_4.setColumns(10);
				}
			}
			{
				panel_rectangulo = new JPanel();
				panel_rectangulo.setBackground(Color.GREEN);
				CARD.add(panel_rectangulo, "name_3534615514417211");
				panel_rectangulo.setLayout(null);
				{
					JFormattedTextField frmtdtxtfldX_1_rectangulo = new JFormattedTextField();
					frmtdtxtfldX_1_rectangulo.setText("X1:");
					frmtdtxtfldX_1_rectangulo.setBounds(10, 11, 31, 20);
					panel_rectangulo.add(frmtdtxtfldX_1_rectangulo);
				}
				{
					JFormattedTextField frmtdtxtfldY_1_rectangulo = new JFormattedTextField();
					frmtdtxtfldY_1_rectangulo.setText("Y1:");
					frmtdtxtfldY_1_rectangulo.setBounds(131, 11, 31, 20);
					panel_rectangulo.add(frmtdtxtfldY_1_rectangulo);
				}
				{
					JFormattedTextField frmtdtxtfldX_2_rectangulo = new JFormattedTextField();
					frmtdtxtfldX_2_rectangulo.setText("X2:");
					frmtdtxtfldX_2_rectangulo.setBounds(10, 42, 31, 20);
					panel_rectangulo.add(frmtdtxtfldX_2_rectangulo);
				}
				{
					JFormattedTextField frmtdtxtfldY_2_rectangulo = new JFormattedTextField();
					frmtdtxtfldY_2_rectangulo.setText("Y2:");
					frmtdtxtfldY_2_rectangulo.setBounds(131, 42, 31, 20);
					panel_rectangulo.add(frmtdtxtfldY_2_rectangulo);
				}
				{
					JFormattedTextField frmtdtxtfldX_3_rectangulo = new JFormattedTextField();
					frmtdtxtfldX_3_rectangulo.setText("X3:");
					frmtdtxtfldX_3_rectangulo.setBounds(10, 73, 31, 20);
					panel_rectangulo.add(frmtdtxtfldX_3_rectangulo);
				}
				{
					JFormattedTextField frmtdtxtfldY_3_rectangulo = new JFormattedTextField();
					frmtdtxtfldY_3_rectangulo.setText("Y3:");
					frmtdtxtfldY_3_rectangulo.setBounds(131, 73, 31, 20);
					panel_rectangulo.add(frmtdtxtfldY_3_rectangulo);
				}
				{
					textField_5 = new JTextField();
					textField_5.setBounds(51, 11, 40, 20);
					panel_rectangulo.add(textField_5);
					textField_5.setColumns(10);
				}
				{
					textField_6 = new JTextField();
					textField_6.setBounds(172, 11, 40, 20);
					panel_rectangulo.add(textField_6);
					textField_6.setColumns(10);
				}
				{
					textField_7 = new JTextField();
					textField_7.setBounds(51, 42, 40, 20);
					panel_rectangulo.add(textField_7);
					textField_7.setColumns(10);
				}
				{
					textField_8 = new JTextField();
					textField_8.setBounds(51, 73, 40, 20);
					panel_rectangulo.add(textField_8);
					textField_8.setColumns(10);
				}
				{
					textField_9 = new JTextField();
					textField_9.setBounds(172, 42, 40, 20);
					panel_rectangulo.add(textField_9);
					textField_9.setColumns(10);
				}
				{
					textField_10 = new JTextField();
					textField_10.setBounds(172, 73, 40, 20);
					panel_rectangulo.add(textField_10);
					textField_10.setColumns(10);
				}
			}
		}
	}

}
