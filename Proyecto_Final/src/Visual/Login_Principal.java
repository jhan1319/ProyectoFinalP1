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



public class Login_Principal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsuario;
	private JTextField txtContrasena;
	private JTextField txtUsuarioNoEncontrdo;

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
		setBounds(100, 100, 449, 382);
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
				panel_titulo.setBounds(10, 11, 419, 128);
				panel_general.add(panel_titulo);
				panel_titulo.setLayout(null);
				{
					JTextPane txtpnPrismassLab = new JTextPane();
					txtpnPrismassLab.setBackground(new Color(248, 248, 255));
					txtpnPrismassLab.setEditable(false);
					txtpnPrismassLab.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
					txtpnPrismassLab.setText("\r\n       PRISMAS'S LAB");
					txtpnPrismassLab.setBounds(120, 0, 190, 74);
					panel_titulo.add(txtpnPrismassLab);
				}


				{
					JLabel lblTema = new JLabel("");
					lblTema.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\Idea_Portada.png"));
					lblTema.setBounds(112, 0, 307, 128);
					panel_titulo.add(lblTema);
				}
				{
					JLabel lblGif = new JLabel();
					ImageIcon imagenIcon = new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\62997.gif");
					lblGif.setIcon(imagenIcon);
					imagenIcon.setImageObserver(lblGif);
					lblGif.setBounds(10, 11, 100, 106);
					panel_titulo.add(lblGif);
				}
				{


				}
			}
			{
				JPanel panel_ingresar = new JPanel();
				panel_ingresar.setBackground(new Color(51,153,255));
				panel_ingresar.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
				panel_ingresar.setBounds(80, 144, 278, 155);
				panel_general.add(panel_ingresar);
				panel_ingresar.setLayout(null);

				JTextPane txtpnUsuario = new JTextPane();
				txtpnUsuario.setEnabled(false);
				txtpnUsuario.setEditable(false);
				txtpnUsuario.setBackground(new Color(51, 153, 255));
				txtpnUsuario.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
				txtpnUsuario.setText("USUARIO: ");
				txtpnUsuario.setBounds(102, 11, 68, 20);
				panel_ingresar.add(txtpnUsuario);

				txtUsuario = new JTextField();
				txtUsuario.setBackground(Color.ORANGE);
				txtUsuario.setBounds(10, 42, 253, 20);
				panel_ingresar.add(txtUsuario);
				txtUsuario.setColumns(10);

				JTextPane txtpnContrase = new JTextPane();
				txtpnContrase.setEnabled(false);
				txtpnContrase.setEditable(false);
				txtpnContrase.setBackground(new Color(51, 153, 255));
				txtpnContrase.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
				txtpnContrase.setText("CONTRASE\u00D1A: ");
				txtpnContrase.setBounds(88, 73, 97, 20);
				panel_ingresar.add(txtpnContrase);

				txtContrasena = new JTextField();
				txtContrasena.setColumns(10);
				txtContrasena.setBackground(Color.ORANGE);
				txtContrasena.setBounds(10, 98, 253, 20);
				panel_ingresar.add(txtContrasena);
				
				txtUsuarioNoEncontrdo = new JTextField();
				txtUsuarioNoEncontrdo.setEnabled(false);
				txtUsuarioNoEncontrdo.setEditable(false);
				txtUsuarioNoEncontrdo.setVisible(false);
				txtUsuarioNoEncontrdo.setBackground(Color.RED);
				txtUsuarioNoEncontrdo.setText("USUARIO NO ENCONTRDO!");
				txtUsuarioNoEncontrdo.setBounds(54, 127, 165, 20);
				panel_ingresar.add(txtUsuarioNoEncontrdo);
				txtUsuarioNoEncontrdo.setColumns(10);
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setBounds(0, 300, 439, 72);
				panel_general.add(buttonPane);
				buttonPane.setBackground(new Color(255, 255, 51));
				buttonPane.setLayout(null);
				{
					JButton login_Button = new JButton("");
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

					login_Button.setContentAreaFilled(false);
					login_Button.setFocusable(false);
					login_Button.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\businessapplication_accept_ok_male_man_you_negocio_2311.png"));
					login_Button.setBounds(313, 11, 53, 52);
					login_Button.setActionCommand("OK");
					buttonPane.add(login_Button);
					getRootPane().setDefaultButton(login_Button);
				}
				{
					JButton cancel_Button = new JButton("");
					cancel_Button.setContentAreaFilled(false);
					cancel_Button.setFocusable(false);
					//	cancelButton.setBackground(Color.ORANGE);
					cancel_Button.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\canceltheapplication_cancelar_2901.png"));
					cancel_Button.setBounds(376, 11, 53, 52);
					cancel_Button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dispose();
						}

					});
					buttonPane.add(cancel_Button);
				}
			}
		}
	}
}
