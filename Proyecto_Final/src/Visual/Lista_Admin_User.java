package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Logica.Prismas;
import Logica.PrismasLab;
import Logica.Usuarios;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

public class Lista_Admin_User extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTable table_1;
	private String nombre;
	private static DefaultTableModel model;
	private static Object[] fila;
	private JButton btn_delete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Lista_Admin_User dialog = new Lista_Admin_User();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Lista_Admin_User() {
		setUndecorated(true);
		setBounds(100, 100, 732, 566);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(176, 196, 222));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);/////CENTRADO
		contentPanel.setLayout(null);


		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 732, 37);
		contentPanel.add(panel);
		panel.setBackground(new Color(176,224,230));
		panel.setLayout(null);

		JPanel buttonPane = new JPanel();
		buttonPane.setBounds(0, 486, 732, 80);
		buttonPane.setBackground(new Color(176,224,230));
		contentPanel.add(buttonPane);
		buttonPane.setLayout(null);

		JButton button = new JButton("");
		button.setContentAreaFilled(false);
		button.setDefaultCapable(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		button.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/cancel_login_48.png")));
		button.setBounds(660, 13, 60, 49);
		buttonPane.add(button);

		btn_delete = new JButton("");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Usuarios aux = PrismasLab.buscarUsuario(nombre);

				System.out.println("KLK ETA E LA PRUEBA");

				//PrismasLab.getInstance().eliminarUsuario(aux);

				System.out.println("KLK ETA E LA PRUEBA" + aux.getUser());

				loadTable();




			}
		});
		btn_delete.setEnabled(false);
		btn_delete.setContentAreaFilled(false);
		btn_delete.setBorder(null);
		btn_delete.setIcon(new ImageIcon("C:\\Users\\Jhan\\Desktop\\Imagenes_Proyecto\\delete.png"));
		btn_delete.setBounds(576, 3, 72, 71);
		buttonPane.add(btn_delete);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 50, 710, 423);
		contentPanel.add(scrollPane);

		table = new JTable();
		table.setBackground(new Color(176, 224, 230));
		table.setFont(new Font("Broadway", Font.PLAIN, 16));
		scrollPane.setViewportView(table);
		scrollPane.setBackground(new Color(240,248,255 ));

		{
			model = new DefaultTableModel();

			String[] header = {"Nombre","Cuadrados","Rectangulos", "Triangulos" ,"Trapecios", "Rombos"}; //////TITULO DE LAS COLUMNAS
			model.setColumnIdentifiers(header); /////IDENTIFICAR LAS COLUMNAS CON EL ARREGLO DE STRING

			table = new JTable();


		}
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int index = 0;

				if (table_1.getSelectedRow() >= 0) {

					index = table_1.getSelectedRow();

					nombre = (String) table_1.getValueAt(index, 0); ////TOMA EL INDEX 0 __ EL NOMBRE DEL SUM

					btn_delete.setEnabled(true);
				}
				System.out.println("EL NOMBRE ES: "+nombre);

			}
		});

		table_1.setBackground(new Color(176, 224, 230));
		table_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 16));
		table_1.setModel(model);
		table_1.getTableHeader().setFont(new Font("Eras Demi ITC", Font.PLAIN, 18));
		scrollPane.setViewportView(table_1);

		loadTable();
	}

	private void loadTable() {
		// TODO Auto-generated method stub

		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];

		for (Usuarios estudiante : PrismasLab.getInstance().getMisUsuarios()) {

			if (estudiante.getTipo().equalsIgnoreCase("Estudiante")) {

				fila[0] = estudiante.getUser();
				fila[1] = estudiante.cantidadCuadrados();
				fila[2] = estudiante.cantidadRectangulos();
				fila[3] = estudiante.cantidadTriangulos();
				fila[4] = estudiante.cantidadTrapecios();
				fila[5] = estudiante.cantidadRombos();
				model.addRow(fila);

			}

		}

	}
}
