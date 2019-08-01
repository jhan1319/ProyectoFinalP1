package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.border.LineBorder;

import Logica.Cuadrado;
import Logica.Prismas;
import Logica.PrismasLab;
import Logica.Rectangulo;
import Logica.Rombo;
import Logica.Trapecio;
import Logica.Triangulo;
import Logica.Usuarios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Administrador_Principal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel cant_Cuadrado;
	private JLabel cant_rombo;
	private JLabel cant_trapecio;
	private JLabel cant_triangulo;
	private JLabel cant_rectangulo;



	/**
	 * 
	 * 
	 * 
	 * Launch the application.
	 */

	public static void main(String[] args) {
		try {
			Administrador_Principal dialog = new Administrador_Principal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Administrador_Principal() {
		getContentPane().setBackground(new Color(255, 250, 205));

		setUndecorated(true);
		setBounds(100, 100, 855, 775);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(176, 196, 222));
		contentPanel.setBounds(0, 0, 855, 881);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);

		setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);/////CENTRADO

		{
			JPanel panel_windows = new JPanel();
			panel_windows.setBackground(new Color(176, 224,230));
			panel_windows.setBorder(new LineBorder(Color.BLACK));
			panel_windows.setBounds(0, 0, 855, 64);
			contentPanel.add(panel_windows);
			panel_windows.setLayout(null);
			{

				JLabel lblCerrar = new JLabel("");
				lblCerrar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {

						FileOutputStream empresa2;
						ObjectOutputStream empresaWrite;
						try {
							empresa2 = new  FileOutputStream("empresa.dat");
							empresaWrite = new ObjectOutputStream(empresa2);
							empresaWrite.writeObject(PrismasLab.getInstance());
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						dispose();
					}

				});
				lblCerrar.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\cancel_login_48.png"));
				lblCerrar.setBounds(797, 11, 48, 40);
				panel_windows.add(lblCerrar);
			}

		}

		{
			JPanel panel_registrar_estu = new JPanel();
			panel_registrar_estu.setBorder(null);
			panel_registrar_estu.setBounds(32, 75, 300, 550);
			contentPanel.add(panel_registrar_estu);
			panel_registrar_estu.setBackground(new Color(240,248,255));
			panel_registrar_estu.setLayout(null);

			JButton btnRegistrarEstudiante = new JButton("");
			btnRegistrarEstudiante.setContentAreaFilled(false);
			btnRegistrarEstudiante.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\login_+_128.png"));
			btnRegistrarEstudiante.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Registrar_Usuario user = new Registrar_Usuario();
					user.setModal(true);
					user.setVisible(true);
				}
			});
			btnRegistrarEstudiante.setBounds(80, 66, 131, 137);
			panel_registrar_estu.add(btnRegistrarEstudiante);

			JButton button = new JButton("");
			button.setContentAreaFilled(false);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Lista_Admin_User lista = new Lista_Admin_User();
					lista.setVisible(true);
					lista.setModal(true);

				}
			});
			button.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\list_adm_128.png"));
			button.setBounds(65, 329, 161, 137);
			panel_registrar_estu.add(button);

			JFormattedTextField frmtdtxtfldR = new JFormattedTextField();
			frmtdtxtfldR.setEditable(false);
			frmtdtxtfldR.setBorder(null);
			frmtdtxtfldR.setFont(new Font("Broadway", Font.PLAIN, 20));
			frmtdtxtfldR.setText("Registrar ");
			frmtdtxtfldR.setBackground(panel_registrar_estu.getBackground());
			frmtdtxtfldR.setBounds(90, 211, 111, 24);
			panel_registrar_estu.add(frmtdtxtfldR);

			JFormattedTextField frmtdtxtfldLista = new JFormattedTextField();
			frmtdtxtfldLista.setEditable(false);
			frmtdtxtfldLista.setBorder(null);
			//frmtdtxtfldLista.setBackground(SystemColor.controlShadow);
			frmtdtxtfldLista.setFont(new Font("Broadway", Font.PLAIN, 18));
			frmtdtxtfldLista.setText("Lista");
			frmtdtxtfldLista.setBackground(panel_registrar_estu.getBackground());
			frmtdtxtfldLista.setBounds(116, 465, 59, 20);
			panel_registrar_estu.add(frmtdtxtfldLista);
		}

		JPanel panel_informacion = new JPanel();

		panel_informacion.setBorder(new LineBorder(Color.BLACK));
		panel_informacion.setBounds(404, 77, 419, 550);
		panel_informacion.setBackground(new Color(240,248,255));
		contentPanel.add(panel_informacion);
		panel_informacion.setLayout(null);





		//cant_Cuadrado.setText(cantidadCuadrado()); ///////////////////

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Administrador_Principal.class.getResource("/Imagen/cuadrado_azul.png")));
		label.setBounds(20, 66, 103, 108);
		panel_informacion.add(label);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Administrador_Principal.class.getResource("/Imagen/rombo1.png")));
		label_1.setBounds(21, 185, 100, 108);
		panel_informacion.add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Administrador_Principal.class.getResource("/Imagen/trapezio9.png")));
		label_2.setBounds(21, 304, 93, 59);
		panel_informacion.add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Administrador_Principal.class.getResource("/Imagen/triangulo_azul.png")));
		label_3.setBounds(21, 362, 93, 81);
		panel_informacion.add(label_3);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Administrador_Principal.class.getResource("/Imagen/rectangulo_azul.png")));
		lblNewLabel.setBounds(21, 465, 102, 54);
		panel_informacion.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cantidad total de prismas");
		lblNewLabel_1.setFont(new Font("Broadway", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(24, 11, 365, 40);
		panel_informacion.add(lblNewLabel_1);

		cant_Cuadrado = new JLabel("New label");
		cant_Cuadrado.setFont(new Font("Broadway", Font.PLAIN, 20));
		cant_Cuadrado.setBounds(241, 106, 117, 29);
		panel_informacion.add(cant_Cuadrado);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(176, 224,230));
			buttonPane.setBounds(0, 661, 855, 119);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("");
				okButton.setContentAreaFilled(false);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						FileOutputStream empresa2;
						ObjectOutputStream empresaWrite;
						try {
							empresa2 = new  FileOutputStream("empresa.dat");
							empresaWrite = new ObjectOutputStream(empresa2);
							empresaWrite.writeObject(PrismasLab.getInstance());
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						dispose();

						Login_Principal log = new Login_Principal();
						log.setVisible(true);


					}
				});
				okButton.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\logout_96.png"));
				okButton.setBounds(748, 5, 97, 105);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);

			}
		}

		
		cant_rombo = new JLabel("New label");
		cant_rombo.setFont(new Font("Broadway", Font.PLAIN, 20));
		cant_rombo.setBounds(241, 225, 117, 29);
		panel_informacion.add(cant_rombo);
		
		cant_trapecio = new JLabel("New label");
		cant_trapecio.setFont(new Font("Broadway", Font.PLAIN, 20));
		cant_trapecio.setBounds(241, 319, 117, 29);
		panel_informacion.add(cant_trapecio);
		
		cant_triangulo = new JLabel("New label");
		cant_triangulo.setFont(new Font("Broadway", Font.PLAIN, 20));
		cant_triangulo.setBounds(241, 388, 131, 29);
		panel_informacion.add(cant_triangulo);
		
		cant_rectangulo = new JLabel("New label");
		cant_rectangulo.setFont(new Font("Broadway", Font.PLAIN, 20));
		cant_rectangulo.setBounds(241, 478, 125, 29);
		panel_informacion.add(cant_rectangulo);
		
		cant_Cuadrado.setText(cantidadCuadrado());
		cant_rombo.setText(cantidadRombo());
		cant_rectangulo.setText(cantidadRectangulo());
		cant_trapecio.setText(cantidadTrapecio());
		cant_triangulo.setText(cantidadTriangulo());
		
	}

	public String cantidadCuadrado() {

		int cant = 0;
		String convert = null;

		for (Usuarios estudiante : PrismasLab.getInstance().getMisUsuarios()) {

			for (Prismas figura : estudiante.getMisFiguras()) {

				if (figura instanceof Cuadrado) {

					cant++;

				}

			}

		}

		convert = String.valueOf(cant);

		System.out.println(convert);

		return convert;
	}

	public String cantidadRectangulo() {

		int cant = 0;
		String convert = null;

		for (Usuarios estudiante : PrismasLab.getInstance().getMisUsuarios()) {

			for (Prismas figura : estudiante.getMisFiguras()) {

				if (figura instanceof Rectangulo) {

					cant++;

				}

			}

		}

		convert = String.valueOf(cant);

		System.out.println(convert);

		return convert;
	}

	public String cantidadTriangulo() {

		int cant = 0;
		String convert = null;

		for (Usuarios estudiante : PrismasLab.getInstance().getMisUsuarios()) {

			for (Prismas figura : estudiante.getMisFiguras()) {

				if (figura instanceof Triangulo) {

					cant++;

				}

			}

		}

		convert = String.valueOf(cant);

		System.out.println(convert);

		return convert;
	}

	public String cantidadRombo() {

		int cant = 0;
		String convert = null;

		for (Usuarios estudiante : PrismasLab.getInstance().getMisUsuarios()) {

			for (Prismas figura : estudiante.getMisFiguras()) {

				if (figura instanceof Rombo) {

					cant++;

				}

			}

		}

		convert = String.valueOf(cant);

		System.out.println(convert);

		return convert;
	}

	public String cantidadTrapecio() {

		int cant = 0;
		String convert = null;

		for (Usuarios estudiante : PrismasLab.getInstance().getMisUsuarios()) {

			for (Prismas figura : estudiante.getMisFiguras()) {

				if (figura instanceof Trapecio) {

					cant++;

				}

			}

		}

		convert = String.valueOf(cant);

		System.out.println(convert);

		return convert;
	}
}
