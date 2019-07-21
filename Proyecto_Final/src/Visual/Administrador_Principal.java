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

public class Administrador_Principal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	


	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		try {
			Administrador_Principal dialog = new Administrador_Principal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	/**
	 * Create the dialog.
	 */
	public Administrador_Principal() {
		
		setUndecorated(true);
		setBounds(100, 100, 484, 472);
		getContentPane().setLayout(null);
		contentPanel.setBackground(Color.CYAN);
		contentPanel.setBounds(0, 0, 484, 384);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		
		setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);/////CENTRADO

		{
			JPanel panel_windows = new JPanel();
			panel_windows.setBorder(new LineBorder(Color.BLACK));
			panel_windows.setBounds(0, 0, 484, 43);
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
				lblCerrar.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/cancel_button.png")));
				lblCerrar.setBounds(443, 11, 32, 25);
				panel_windows.add(lblCerrar);
			}
			
		}
		
		{
			JPanel panel_registrar_estu = new JPanel();
			panel_registrar_estu.setBorder(new LineBorder(Color.BLACK));
			panel_registrar_estu.setBounds(10, 49, 203, 335);
			contentPanel.add(panel_registrar_estu);
			panel_registrar_estu.setLayout(null);
			
			JButton btnRegistrarEstudiante = new JButton("");
			btnRegistrarEstudiante.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\business_application_addmale_useradd_insert_add_user_client_2312 (1).png"));
			btnRegistrarEstudiante.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Registrar_Usuario user = new Registrar_Usuario();
					user.setModal(true);
					user.setVisible(true);
				}
			});
			btnRegistrarEstudiante.setBounds(22, 11, 124, 73);
			panel_registrar_estu.add(btnRegistrarEstudiante);
			
			JButton button = new JButton("");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Lista_Admin_User lista = new Lista_Admin_User();
					lista.setVisible(true);
					lista.setModal(true);

				}
			});
			button.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\contactlist_theuser_802 (1).png"));
			button.setBounds(22, 152, 124, 73);
			panel_registrar_estu.add(button);
			
			JFormattedTextField frmtdtxtfldR = new JFormattedTextField();
			frmtdtxtfldR.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			frmtdtxtfldR.setText("Registrar ");
			frmtdtxtfldR.setBounds(54, 80, 61, 20);
			panel_registrar_estu.add(frmtdtxtfldR);
			
			JFormattedTextField frmtdtxtfldLista = new JFormattedTextField();
			frmtdtxtfldLista.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			frmtdtxtfldLista.setText("Lista");
			frmtdtxtfldLista.setBounds(62, 223, 45, 20);
			panel_registrar_estu.add(frmtdtxtfldLista);
		}
		
		JPanel panel_informacion = new JPanel();
		panel_informacion.setBorder(new LineBorder(Color.BLACK));
		panel_informacion.setBounds(241, 49, 233, 335);
		contentPanel.add(panel_informacion);
		panel_informacion.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\triangle-shape_icon-icons.com_53860.png"));
		label.setBounds(10, 5, 64, 64);
		panel_informacion.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\squareroundedemptyoutlinedbuttonshape_80680.png"));
		label_1.setBounds(10, 75, 64, 64);
		panel_informacion.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\diamond_icon-icons.com_70991.png"));
		label_2.setBounds(10, 196, 52, 76);
		panel_informacion.add(label_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\trapezeinvertedoutlinedshape_80761.png"));
		lblNewLabel.setBounds(10, 150, 64, 53);
		panel_informacion.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\Irectangle_4718.png"));
		label_3.setBounds(10, 265, 70, 55);
		panel_informacion.add(label_3);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 384, 484, 88);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("");
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
				okButton.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\log_logout_door_1563.png"));
				okButton.setBounds(394, 11, 80, 68);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
