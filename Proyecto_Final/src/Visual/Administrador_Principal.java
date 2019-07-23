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

import Logica.PrismasLab;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.awt.SystemColor;

public class Administrador_Principal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	


	/**
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
		setBounds(100, 100, 855, 763);
		getContentPane().setLayout(null);
		contentPanel.setBackground(Color.CYAN);
		contentPanel.setBounds(0, 0, 855, 633);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		
		setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);/////CENTRADO

		{
			JPanel panel_windows = new JPanel();
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
			panel_registrar_estu.setBounds(32, 100, 300, 494);
			contentPanel.add(panel_registrar_estu);
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
			btnRegistrarEstudiante.setBounds(80, 41, 131, 137);
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
			button.setBounds(65, 266, 161, 137);
			panel_registrar_estu.add(button);
			
			JFormattedTextField frmtdtxtfldR = new JFormattedTextField();
			frmtdtxtfldR.setEditable(false);
			frmtdtxtfldR.setBorder(null);
			frmtdtxtfldR.setFont(new Font("Broadway", Font.PLAIN, 20));
			frmtdtxtfldR.setText("Registrar ");
			frmtdtxtfldR.setBackground(panel_registrar_estu.getBackground());
			frmtdtxtfldR.setBounds(90, 186, 111, 24);
			panel_registrar_estu.add(frmtdtxtfldR);
			
			JFormattedTextField frmtdtxtfldLista = new JFormattedTextField();
			frmtdtxtfldLista.setEditable(false);
			frmtdtxtfldLista.setBorder(null);
			//frmtdtxtfldLista.setBackground(SystemColor.controlShadow);
			frmtdtxtfldLista.setFont(new Font("Broadway", Font.PLAIN, 18));
			frmtdtxtfldLista.setText("Lista");
			frmtdtxtfldLista.setBackground(panel_registrar_estu.getBackground());
			frmtdtxtfldLista.setBounds(116, 402, 59, 20);
			panel_registrar_estu.add(frmtdtxtfldLista);
		}
		
		JPanel panel_informacion = new JPanel();
		panel_informacion.setBorder(new LineBorder(Color.BLACK));
		panel_informacion.setBounds(398, 100, 419, 494);
		contentPanel.add(panel_informacion);
		panel_informacion.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/triangulo.png")));
		label.setBounds(10, 5, 64, 64);
		panel_informacion.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/cuadrado.png")));
		label_1.setBounds(10, 75, 64, 64);
		panel_informacion.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/trapecio.png")));
		label_2.setBounds(10, 196, 64, 76);
		panel_informacion.add(label_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/rombo.png")));
		lblNewLabel.setBounds(10, 139, 64, 64);
		panel_informacion.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/rectangulo.png")));
		label_3.setBounds(10, 265, 70, 55);
		panel_informacion.add(label_3);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 632, 855, 131);
			getContentPane().add(buttonPane);
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
				okButton.setBounds(748, 11, 97, 105);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
