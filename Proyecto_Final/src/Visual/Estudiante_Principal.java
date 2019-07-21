package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
		setUndecorated(true);
		setBounds(100, 100, 597, 475);
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
		lblCerrar.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\cancelbutton_83661.png"));
		lblCerrar.setBounds(555, 11, 32, 25);
		panel_windows.add(lblCerrar);
		
		JPanel panel_crear_figuras = new JPanel();
		panel_crear_figuras.setBorder(new LineBorder(Color.BLACK));
		panel_crear_figuras.setBounds(10, 44, 212, 362);
		contentPanel.add(panel_crear_figuras);
		panel_crear_figuras.setLayout(null);
		
		JButton btnCrearFigura = new JButton("");
		btnCrearFigura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crear_Figuras figura= new Crear_Figuras();
				figura.setVisible(true);
				figura.setModal(true);
			}
		});
		btnCrearFigura.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\bluefigures_azules_12493.png"));
		btnCrearFigura.setBounds(40, 61, 107, 77);
		panel_crear_figuras.add(btnCrearFigura);
		
		JButton btnLista = new JButton("");
		btnLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista_Figura_User list= new Lista_Figura_User();
				list.setVisible(true);
				list.setModal(true);
			}
		});
		btnLista.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\1486504338-check-check-marks-list-checklist-documents-todo-list_81298.png"));
		btnLista.setBounds(40, 169, 107, 108);
		panel_crear_figuras.add(btnLista);
		
		JFormattedTextField frmtdtxtfldMisFormas = new JFormattedTextField();
		frmtdtxtfldMisFormas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmtdtxtfldMisFormas.setText("Mis formas:");
		frmtdtxtfldMisFormas.setBounds(10, 288, 74, 20);
		panel_crear_figuras.add(frmtdtxtfldMisFormas);
		
		JComboBox cbxMisFormas = new JComboBox();
		cbxMisFormas.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
		cbxMisFormas.setBounds(89, 289, 113, 20);
		panel_crear_figuras.add(cbxMisFormas);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		txtUser.setEditable(false);
		txtUser.setBounds(10, 11, 74, 20);
		panel_crear_figuras.add(txtUser);
		txtUser.setColumns(10);
		txtUser.setText(PrismasLab.getLogin().getUser());
		
		JFormattedTextField frmtdtxtfldColorFigura = new JFormattedTextField();
		frmtdtxtfldColorFigura.setText("Color Figura:");
		frmtdtxtfldColorFigura.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmtdtxtfldColorFigura.setBounds(10, 331, 80, 20);
		panel_crear_figuras.add(frmtdtxtfldColorFigura);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
		comboBox.setBounds(100, 332, 102, 20);
		panel_crear_figuras.add(comboBox);
		
		JPanel panel_grafias_formas = new JPanel();
		panel_grafias_formas.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_grafias_formas.setBounds(244, 44, 343, 309);
		contentPanel.add(panel_grafias_formas);
		panel_grafias_formas.setLayout(null);
		
		JPanel panel_detalle = new JPanel();
		panel_detalle.setBounds(244, 364, 343, 42);
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
		buttonPane.setBounds(0, 406, 597, 69);
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
		btnCerrar.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\log_logout_door_1563.png"));
		btnCerrar.setBounds(523, 11, 64, 64);
		buttonPane.add(btnCerrar);
	}
}
