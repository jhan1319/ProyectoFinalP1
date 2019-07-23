package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Prismas;
import Logica.PrismasLab;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Estudiante_Principal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtArea;
	private JTextField txtVolumen;
	private JTextField txtUser;
	private static JComboBox<String> cbxMisFormas;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			Estudiante_Principal dialog = new Estudiante_Principal();
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
	public Estudiante_Principal() {
		
		PrismasLab controladora = PrismasLab.getInstance();
		
		setUndecorated(true);
		setBounds(100, 100, 1080, 848);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.CYAN);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);/////CENTRADO

		
		JPanel panel_windows = new JPanel();
		panel_windows.setBounds(0, 0, 597, 42);
		contentPanel.add(panel_windows);
		panel_windows.setLayout(null);
		
		JLabel lblCerrar = new JLabel("");
		lblCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblCerrar.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/cancel_button.png")));
		lblCerrar.setBounds(555, 11, 32, 25);
		panel_windows.add(lblCerrar);
		
		JPanel panel_crear_figuras = new JPanel();
		panel_crear_figuras.setBorder(new LineBorder(Color.BLACK));
		panel_crear_figuras.setBounds(10, 44, 337, 568);
		contentPanel.add(panel_crear_figuras);
		panel_crear_figuras.setLayout(null);
		
		JButton btnCrearFigura = new JButton("");
		btnCrearFigura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crear_Figuras figura= new Crear_Figuras();
				figura.setVisible(true);
				figura.setModal(true);
				
				PrismasLab.pantallaVacia();
				
				
				
				
			}
		});
		btnCrearFigura.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/crear_figura_principal.png")));
		btnCrearFigura.setBounds(40, 61, 107, 97);
		panel_crear_figuras.add(btnCrearFigura);
		
		JButton btnLista = new JButton("");
		btnLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista_Figura_User list= new Lista_Figura_User();
				list.setVisible(true);
				list.setModal(true);
			}
		});
		btnLista.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/lista.png")));
		btnLista.setBounds(40, 169, 107, 108);
		panel_crear_figuras.add(btnLista);
		
		JFormattedTextField frmtdtxtfldMisFormas = new JFormattedTextField();
		frmtdtxtfldMisFormas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmtdtxtfldMisFormas.setText("Mis formas:");
		frmtdtxtfldMisFormas.setBounds(10, 455, 74, 20);
		panel_crear_figuras.add(frmtdtxtfldMisFormas);
		
		cbxMisFormas = new JComboBox<String>();
		cbxMisFormas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cargarFiguras();
				
	
				
			}
		});
		

		

		cbxMisFormas.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
		cbxMisFormas.setBounds(89, 456, 113, 20);
		panel_crear_figuras.add(cbxMisFormas);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Britannic Bold", Font.BOLD | Font.ITALIC, 18));
		txtUser.setEditable(false);
		txtUser.setBounds(10, 11, 156, 39);
		panel_crear_figuras.add(txtUser);
		txtUser.setColumns(10);
		txtUser.setText(PrismasLab.getLogin().getUser());
		
		JFormattedTextField frmtdtxtfldColorFigura = new JFormattedTextField();
		frmtdtxtfldColorFigura.setText("Color Figura:");
		frmtdtxtfldColorFigura.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmtdtxtfldColorFigura.setBounds(10, 498, 80, 20);
		panel_crear_figuras.add(frmtdtxtfldColorFigura);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
		comboBox.setBounds(100, 499, 102, 20);
		panel_crear_figuras.add(comboBox);
		
		JPanel panel_grafias_formas = new JPanel();
		panel_grafias_formas.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_grafias_formas.setBounds(480, 44, 600, 600);
		contentPanel.add(panel_grafias_formas);
		panel_grafias_formas.setLayout(null);
		
		JPanel panel_detalle = new JPanel();
		panel_detalle.setBounds(480, 655, 343, 92);
		contentPanel.add(panel_detalle);
		panel_detalle.setLayout(null);
		
		JFormattedTextField frmtdtxtfldArea = new JFormattedTextField();
		frmtdtxtfldArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmtdtxtfldArea.setText("Area: ");
		frmtdtxtfldArea.setBounds(10, 11, 39, 20);
		panel_detalle.add(frmtdtxtfldArea);
		
		txtArea = new JTextField();
		txtArea.setBounds(59, 12, 86, 20);
		panel_detalle.add(txtArea);
		txtArea.setColumns(10);
		
		JFormattedTextField frmtdtxtfldVolumen = new JFormattedTextField();
		frmtdtxtfldVolumen.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmtdtxtfldVolumen.setText("Volumen:");
		frmtdtxtfldVolumen.setBounds(168, 11, 68, 20);
		panel_detalle.add(frmtdtxtfldVolumen);
		
		txtVolumen = new JTextField();
		txtVolumen.setBounds(246, 12, 86, 20);
		panel_detalle.add(txtVolumen);
		txtVolumen.setColumns(10);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setBounds(0, 779, 1080, 80);
		contentPanel.add(buttonPane);
		buttonPane.setLayout(null);
		
		JButton btnCerrar = new JButton("");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login_Principal login = new Login_Principal();
				login.setVisible(true);
				
			}
		});
		btnCerrar.setContentAreaFilled(false);
		btnCerrar.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/log_out.png")));
		btnCerrar.setBounds(861, 11, 64, 64);
		buttonPane.add(btnCerrar);
		cargarFiguras();
	}
	
	public static void cargarFiguras(){

		cbxMisFormas.removeAllItems();

		for (Prismas figuras : PrismasLab.getLogin().getMisFiguras()) {
			cbxMisFormas.addItem(figuras.getNombre());

		}

		cbxMisFormas.insertItemAt(new String("<Seleccionar>"), 0);
		cbxMisFormas.setSelectedIndex(0);
	}
}
