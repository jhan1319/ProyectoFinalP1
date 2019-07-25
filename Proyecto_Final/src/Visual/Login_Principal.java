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
	private JTextField txt_wrong_pass;

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
		setBackground(new Color(176, 196, 222));
		getContentPane().setBackground(new Color(176, 196, 222));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 923, 709);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(176, 196, 222));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);/////CENTRADO
		{
			JPanel panel_general = new JPanel();
			panel_general.setBackground(new Color(176,196,222));
			contentPanel.add(panel_general, BorderLayout.CENTER);
			panel_general.setLayout(null);
			{
				JPanel panel_titulo = new JPanel();
				panel_titulo.setBackground(new Color(176, 224,230));
				panel_titulo.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_titulo.setBounds(0, 11, 923, 149);
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
				panel_ingresar.setBackground(new Color(240,248,255));
				panel_ingresar.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
				panel_ingresar.setBounds(226, 194, 422, 325);
				panel_general.add(panel_ingresar);
				panel_ingresar.setLayout(null);

				JTextPane txtpnUsuario = new JTextPane();
				txtpnUsuario.setBackground(new Color(176, 224,230));
				txtpnUsuario.setEditable(false);
				txtpnUsuario.setFont(new Font("Broadway", Font.BOLD | Font.ITALIC, 20));
				txtpnUsuario.setText("Usuario: ");
				txtpnUsuario.setBounds(163, 11, 112, 30);
				panel_ingresar.add(txtpnUsuario);
				txtUsuario = new JTextField();
				txtUsuario.setBackground(new Color(176, 196, 222));
				txtUsuario.setBounds(10, 42, 402, 20);
				panel_ingresar.add(txtUsuario);
				txtUsuario.setColumns(10);

				JTextPane txtpnContrase = new JTextPane();
				txtpnContrase.setBackground(new Color(176, 224,230));
				txtpnContrase.setEditable(false);
				txtpnContrase.setFont(new Font("Broadway", Font.BOLD | Font.ITALIC, 20));
				txtpnContrase.setText("Contrase\u00F1a: ");
				txtpnContrase.setBounds(142, 97, 154, 30);
				panel_ingresar.add(txtpnContrase);

				txtContrasena = new JPasswordField();
				txtContrasena.setBackground(new Color(176, 196, 222));
				txtContrasena.setDisabledTextColor(new Color(176, 196, 222));
				txtContrasena.setColumns(10);

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
				lblGif.setBounds(163, 224, 100, 90);
				panel_ingresar.add(lblGif);
				lblGif.setIcon(imagenIcon);
				imagenIcon.setImageObserver(lblGif);
				
				txt_wrong_pass = new JTextField();
				txt_wrong_pass.setVisible(false);
				txt_wrong_pass.setBounds(108, 176, 223, 20);
				txt_wrong_pass.setBackground(Color.RED);
				txt_wrong_pass.setFont(new Font("Broadway", Font.PLAIN, 17));
				panel_ingresar.add(txt_wrong_pass);
				txt_wrong_pass.setColumns(10);
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setBounds(0, 561, 923, 149);
				panel_general.add(buttonPane);
				buttonPane.setBackground(new Color(176, 224,230));
				buttonPane.setLayout(null);
				{
					JButton login_Button = new JButton("");
					login_Button.setBorderPainted(false);
					login_Button.setFocusable(false);
					login_Button.setContentAreaFilled(false);
					login_Button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) { ///// true= existe un usuario con ese nombre
							
							PrismasLab.getInstance();
							if ((PrismasLab.getInstance().login(txtUsuario.getText(), txtContrasena.getText())) && (PrismasLab.getLogin().getTipo().equalsIgnoreCase("Administrador")))
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
								PrismasLab.textoEspera();
								dispose();
							}
							
							if (PrismasLab.getInstance().login(txtUsuario.getText(), txtContrasena.getText())) {
								
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
