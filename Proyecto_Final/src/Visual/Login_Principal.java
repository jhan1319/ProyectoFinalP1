package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JEditorPane;
import javax.swing.JTree;
import java.awt.Checkbox;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import Logica.PrismasLab;
import Logica.Usuarios;
import javax.swing.JPasswordField;
import java.awt.Label;
import java.awt.SystemColor;



public class Login_Principal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsuario;
	private JTextField txtContrasena;
	private JTextField txtUsuarioNoEncontrdo;
	ImageIcon imagenIcon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FileInputStream empresa;
				FileOutputStream empresa2;
				ObjectInputStream empresaRead;
				ObjectOutputStream empresaWrite;
				try {
					empresa = new FileInputStream ("empresa.dat");
					empresaRead = new ObjectInputStream(empresa);
					PrismasLab temp = (PrismasLab)empresaRead.readObject();
					PrismasLab.setPrisma(temp); 
				} catch (FileNotFoundException e) {
					try {
						empresa2 = new  FileOutputStream("empresa.dat");
						empresaWrite = new ObjectOutputStream(empresa2);
						Usuarios aux = new Usuarios("hola", "hola", "Administrador");
						PrismasLab.getInstance().regUser(aux);
						empresaWrite.writeObject(PrismasLab.getInstance());
					} catch (FileNotFoundException e1) {
					} catch (IOException e1) {
						// TODO Auto-generated catch block
					}
				} catch (IOException e) {


				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


				//////
				try {
					Login_Principal dialog = new Login_Principal();
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				////

			}
		});
	}	


	/**
	 * Create the dialog.
	 */
	public Login_Principal() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 923, 709);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(51, 51, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);/////CENTRADO
		{
			JPanel panel_general = new JPanel();
			panel_general.setBackground(new Color(102, 153, 255));
			contentPanel.add(panel_general, BorderLayout.CENTER);
			panel_general.setLayout(null);
			{
				JPanel panel_titulo = new JPanel();
				panel_titulo.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_titulo.setBounds(10, 11, 893, 149);
				panel_general.add(panel_titulo);
				panel_titulo.setLayout(null);
				{
					ImageIcon imagenIcon = new ImageIcon(Login_Principal.class.getResource("/Imagen/62997.gif"));
				}
				
				JLabel label_1 = new JLabel("");
				label_1.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\Titulo.PNG"));
				label_1.setBounds(82, 29, 754, 95);
				panel_titulo.add(label_1);
				{


				}
			}
			{
				JPanel panel_ingresar = new JPanel();
				panel_ingresar.setBackground(new Color(51,153,255));
				panel_ingresar.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
				panel_ingresar.setBounds(226, 194, 422, 325);
				panel_general.add(panel_ingresar);
				panel_ingresar.setLayout(null);

				JTextPane txtpnUsuario = new JTextPane();
				txtpnUsuario.setEnabled(false);
				txtpnUsuario.setEditable(false);
				txtpnUsuario.setBackground(new Color(51, 153, 255));
				txtpnUsuario.setFont(new Font("Broadway", Font.BOLD | Font.ITALIC, 20));
				txtpnUsuario.setText("Usuario: ");
				txtpnUsuario.setBounds(163, 11, 112, 30);
				panel_ingresar.add(txtpnUsuario);

				txtUsuario = new JTextField();
				txtUsuario.setBackground(Color.ORANGE);
				txtUsuario.setBounds(10, 42, 402, 20);
				panel_ingresar.add(txtUsuario);
				txtUsuario.setColumns(10);

				JTextPane txtpnContrase = new JTextPane();
				txtpnContrase.setEnabled(false);
				txtpnContrase.setEditable(false);
				txtpnContrase.setBackground(new Color(51, 153, 255));
				txtpnContrase.setFont(new Font("Broadway", Font.BOLD | Font.ITALIC, 20));
				txtpnContrase.setText("Contrase\u00F1a: ");
				txtpnContrase.setBounds(142, 97, 154, 30);
				panel_ingresar.add(txtpnContrase);

				txtContrasena = new JPasswordField();
				txtContrasena.setColumns(10);
				txtContrasena.setBackground(Color.ORANGE);
				txtContrasena.setBounds(10, 133, 402, 20);
				panel_ingresar.add(txtContrasena);
				
				txtUsuarioNoEncontrdo = new JTextField();
				txtUsuarioNoEncontrdo.setFont(new Font("Broadway", Font.PLAIN, 17));
				txtUsuarioNoEncontrdo.setEnabled(false);
				txtUsuarioNoEncontrdo.setEditable(false);
				txtUsuarioNoEncontrdo.setVisible(false);
				txtUsuarioNoEncontrdo.setBackground(Color.RED);
				txtUsuarioNoEncontrdo.setText("Usuario no encontrado");
				txtUsuarioNoEncontrdo.setBounds(108, 176, 223, 20);
				panel_ingresar.add(txtUsuarioNoEncontrdo);
				txtUsuarioNoEncontrdo.setColumns(10);
				
				JLabel lblGif = new JLabel();
				imagenIcon = new ImageIcon(Login_Principal.class.getResource("/Imagen/62997.gif"));
				lblGif.setBounds(180, 224, 100, 90);
				panel_ingresar.add(lblGif);
				lblGif.setIcon(imagenIcon);
				imagenIcon.setImageObserver(lblGif);
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setBounds(10, 550, 913, 149);
				panel_general.add(buttonPane);
				buttonPane.setBackground(new Color(102, 255, 102));
				buttonPane.setLayout(null);
				{
					JButton login_Button = new JButton("");
					login_Button.setBorderPainted(false);
					login_Button.setFocusable(false);
					login_Button.setContentAreaFilled(false);
					login_Button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) { ///// true= existe un usuario con ese nombre
							
							PrismasLab.getInstance();
							if ((PrismasLab.getInstance().login(txtUsuario.getText(), txtContrasena.getText())) &&(PrismasLab.getLogin().getTipo().equalsIgnoreCase("Administrador")))
							{
								Administrador_Principal adm = new Administrador_Principal();
								adm.setVisible(true);
								
								dispose();

							}

							// PrismasLab.getInstance();
							if ((PrismasLab.getInstance().login(txtUsuario.getText(), txtContrasena.getText())) &&(PrismasLab.getLogin().getTipo().equalsIgnoreCase("Estudiante")) )
							{
								Estudiante_Principal estu = new Estudiante_Principal();
								estu.setVisible(true);
								
								dispose();
							} 

							else {
								txtUsuario.setText("");
								txtContrasena.setText("");
								
								txtUsuarioNoEncontrdo.setVisible(true);
								
								//	JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Validación", JOptionPane.WARNING_MESSAGE);

							}


						}
					});
					login_Button.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\user_check_128.png"));
					login_Button.setBounds(668, 11, 122, 127);
					login_Button.setActionCommand("OK");
					buttonPane.add(login_Button);
					getRootPane().setDefaultButton(login_Button);
				}
				{
					JButton cancel_Button = new JButton("");
					cancel_Button.setContentAreaFilled(false);
					cancel_Button.setFocusable(false);
					//	cancelButton.setBackground(Color.ORANGE);
					cancel_Button.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\cancel_login_96.png"));
					cancel_Button.setBounds(800, 23, 103, 118);
					cancel_Button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dispose();
						}

					});
					buttonPane.add(cancel_Button);
				}
			}
			ImageIcon imagenIcon = new ImageIcon(Login_Principal.class.getResource("/Imagen/62997.gif"));
		}
	}
}
