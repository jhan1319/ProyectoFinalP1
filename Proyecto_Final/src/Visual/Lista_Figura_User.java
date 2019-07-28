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

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

public class Lista_Figura_User extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTable table_1;
	private static DefaultTableModel model;
	private static Object[] fila;
	private String nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Lista_Figura_User dialog = new Lista_Figura_User();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Lista_Figura_User() {
		setUndecorated(true);
		setBounds(100, 100, 731, 606);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(176, 196, 222));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);/////CENTRADO

		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 731, 40);
			panel.setBackground(new Color(176,224,230));
			contentPanel.add(panel);
			panel.setLayout(null);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 541, 731, 65);
			contentPanel.add(buttonPane);
			buttonPane.setBackground(new Color(176,224,230));
			buttonPane.setLayout(null);
			{
				JButton button = new JButton("");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				button.setContentAreaFilled(false);
				button.setIcon(new ImageIcon(Login_Principal.class.getResource("/Imagen/cancel_login_48.png")));
				button.setBounds(670, 8, 53, 50);
				buttonPane.add(button);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setFont(new Font("Broadway", Font.PLAIN, 16));
			scrollPane.setBackground(new Color(240,248,255 ));
		
			
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					/*
					 * INICIA EL EVENTO
					 */
					
					
					
					if (table.getSelectedRow() >= 0) {
						int index = table.getSelectedRow();
						nombre = (String) table.getValueAt(index, 0); ////TOMA EL INDEX 0 __ EL NOMBRE DEL SUM
					
					
					
					
					
					
					}
					
					
				}
			});
			
			scrollPane.setViewportView(table);
			scrollPane.setBounds(10, 53, 709, 475);
			contentPanel.add(scrollPane);
			
			{
				model = new DefaultTableModel();
				
				String[] header = {"Nombre","Base","Area Lateral", "Area Total" ,"Volumen"}; //////TITULO DE LAS COLUMNAS
				model.setColumnIdentifiers(header); /////IDENTIFICAR LAS COLUMNAS CON EL ARREGLO DE STRING

				table = new JTable();
				
				
			}
			table_1 = new JTable();
			table_1.setBackground(new Color(176, 224, 230));
			table_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 16));
			table_1.setModel(model);
			scrollPane.setViewportView(table_1);
			loadTable();
			
		}
	}

	private void loadTable() {
		// TODO Auto-generated method stub
		
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		
		for (Prismas figuras: PrismasLab.getLogin().getMisFiguras()) {
			fila[0] = figuras.getNombre();
			fila[1] = figuras.tipoFigura();
			fila[2] = figuras.areaLateral();
			fila[3] = figuras.areaTotal();
			fila[4] = figuras.volumen();
			model.addRow(fila);
		}
		
	}
}

