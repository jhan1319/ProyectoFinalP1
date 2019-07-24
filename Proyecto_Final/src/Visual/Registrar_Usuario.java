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
		setBounds(100, 100, 396, 382);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(176,196,222));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);/////CENTRADO

		
		JPanel panel_reg_usuario = new JPanel();
		panel_reg_usuario.setBounds(10, 151, 376, 133);
		contentPanel.add(panel_reg_usuario);
		panel_reg_usuario.setBackground(new Color(240,248,255));
		panel_reg_usuario.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBackground(new Color(176, 196, 222));
		txtUsuario.setBounds(139, 11, 188, 20);
		panel_reg_usuario.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasena = new JTextField();
		txtContrasena.setBackground(new Color(176, 196, 222));
		txtContrasena.setBounds(139, 42, 188, 20);
		panel_reg_usuario.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		txtConfirmar = new JTextField();
		txtConfirmar.setBackground(new Color(176, 196, 222));
		txtConfirmar.setBounds(139, 79, 188, 20);
		panel_reg_usuario.add(txtConfirmar);
		txtConfirmar.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Broadway", Font.PLAIN, 18));
		lblUsuario.setBounds(6, 14, 94, 17);
		panel_reg_usuario.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Broadway", Font.PLAIN, 18));
		lblContrasea.setBounds(6, 45, 123, 17);
		panel_reg_usuario.add(lblContrasea);
		
		JLabel lblConfirmar = new JLabel("Confirmar:\r\n");
		lblConfirmar.setFont(new Font("Broadway", Font.PLAIN, 18));
		lblConfirmar.setBounds(6, 82, 123, 17);
		panel_reg_usuario.add(lblConfirmar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/registrar_user.png")));
		label.setBounds(136, 11, 151, 129);
		contentPanel.add(label);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setBounds(0, 314, 396, 68);
		buttonPane.setBackground(new Color(176, 224,230));
		contentPanel.add(buttonPane);
		buttonPane.setLayout(null);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/cancel_the_application.png")));
		btnCancelar.setBounds(325, 14, 49, 52);
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
		btnRegistrar.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/agregar_user.png")));
		btnRegistrar.setBounds(233, 14, 66, 49);
		buttonPane.add(btnRegistrar);
	}
	private void clean() {
		txtUsuario.setText("");
		txtContrasena.setText("");
		txtConfirmar.setText("");
		
	}
	
}