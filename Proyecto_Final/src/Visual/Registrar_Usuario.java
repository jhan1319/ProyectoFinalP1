package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.PrismasLab;
import Logica.Usuarios;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Registrar_Usuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsuario;
	private JTextField txtContrasena;
	private JTextField txtConfirmar;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		try {
			Registrar_Usuario dialog = new Registrar_Usuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Registrar_Usuario() {
		setUndecorated(true);
		setBounds(100, 100, 364, 363);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.CYAN);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);/////CENTRADO

		
		JPanel panel_reg_usuario = new JPanel();
		panel_reg_usuario.setBounds(10, 151, 344, 123);
		contentPanel.add(panel_reg_usuario);
		panel_reg_usuario.setLayout(null);
		
		JFormattedTextField frmtdtxtfldUsuario = new JFormattedTextField();
		frmtdtxtfldUsuario.setEditable(false);
		frmtdtxtfldUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frmtdtxtfldUsuario.setText("USUARIO:");
		frmtdtxtfldUsuario.setBounds(10, 11, 73, 20);
		panel_reg_usuario.add(frmtdtxtfldUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(127, 11, 188, 20);
		panel_reg_usuario.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JFormattedTextField frmtdtxtfldContrase = new JFormattedTextField();
		frmtdtxtfldContrase.setEditable(false);
		frmtdtxtfldContrase.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frmtdtxtfldContrase.setText("CONTRASE\u00D1A: ");
		frmtdtxtfldContrase.setBounds(10, 42, 94, 20);
		panel_reg_usuario.add(frmtdtxtfldContrase);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(127, 42, 188, 20);
		panel_reg_usuario.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		JFormattedTextField frmtdtxtfldConfirmar = new JFormattedTextField();
		frmtdtxtfldConfirmar.setEditable(false);
		frmtdtxtfldConfirmar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frmtdtxtfldConfirmar.setText("CONFIRMAR:");
		frmtdtxtfldConfirmar.setBounds(10, 79, 90, 20);
		panel_reg_usuario.add(frmtdtxtfldConfirmar);
		
		txtConfirmar = new JTextField();
		txtConfirmar.setBounds(127, 79, 188, 20);
		panel_reg_usuario.add(txtConfirmar);
		txtConfirmar.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\user_group_14955.png"));
		label.setBounds(107, 11, 151, 129);
		contentPanel.add(label);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setBounds(0, 295, 364, 68);
		contentPanel.add(buttonPane);
		buttonPane.setLayout(null);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\canceltheapplication_cancelar_2901.png"));
		btnCancelar.setBounds(305, 11, 49, 52);
		buttonPane.add(btnCancelar);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtContrasena.getText().equalsIgnoreCase(txtConfirmar.getText()) ) {
					Usuarios user = new Usuarios(txtUsuario.getText(), txtContrasena.getText(), "Estudiante");
					PrismasLab.getInstance().regUser(user);
					JOptionPane.showMessageDialog(null, "Proceso Satisfactorio", "Validación", JOptionPane.INFORMATION_MESSAGE);
					clean();
				}
				else {
					JOptionPane.showMessageDialog(null, "Contraseña invalida", "Error!", JOptionPane.ERROR_MESSAGE);
					txtContrasena.setText("");
					txtConfirmar.setText("");

				}
				}

			
		});
		btnRegistrar.setContentAreaFilled(false);
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\businessapplication_accept_ok_male_man_you_negocio_2311.png"));
		btnRegistrar.setBounds(229, 14, 66, 49);
		buttonPane.add(btnRegistrar);
	}
	private void clean() {
		txtUsuario.setText("");
		txtContrasena.setText("");
		txtConfirmar.setText("");
		
	}
	
}