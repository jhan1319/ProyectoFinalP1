package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logica.Cilindrico;
import Logica.CilindricoHueco;
import Logica.Empresa;
import Logica.Esferico;
import Logica.Quesos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.CardLayout;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class registrarQuesos extends JDialog {

	Empresa empresa = Empresa.getInstanceEmpresa();



	private final JPanel contentPanel = new JPanel();
	private JTextField txtcodigo;
	private JTextField txtPBase;
	private JTextField txtPUnitario;
	private JRadioButton rdbtnCilindrico;
	private JRadioButton rdbtnCilindricoHueco;
	private JRadioButton rdbtnEsferico;
	private JTextField txtLongitud;
	private JTextField txtRadio;
	private JTextField txtLongHueco;
	private JTextField txtRadioHueco;
	private JTextField txtRInterior;
	private JTextField txtRadioEsfera;
	private JPanel panelCilindrico;
	private JPanel panelEsferico;
	private JPanel panelHueco; 
	private JLabel lblCantidad;
	private JSpinner spnCantidad;
	private Principal main;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			registrarQuesos dialog = new registrarQuesos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public registrarQuesos() {
		setTitle("Registro de Quesos");
		setBounds(100, 100, 484, 375);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		spnCantidad = new JSpinner();
		spnCantidad.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		spnCantidad.setBounds(303, 75, 94, 22);
		contentPanel.add(spnCantidad);

		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(208, 78, 56, 16);
		contentPanel.add(lblCantidad);

		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(12, 37, 56, 16);
		contentPanel.add(lblCodigo);

		txtcodigo = new JTextField();
		txtcodigo.setEditable(false);
		txtcodigo.setBounds(86, 34, 94, 22);
		contentPanel.add(txtcodigo);
		txtcodigo.setColumns(10);

		JLabel lblNewLabel = new JLabel("Precio Base:");
		lblNewLabel.setBounds(12, 78, 83, 16);
		contentPanel.add(lblNewLabel);

		txtPBase = new JTextField();
		txtPBase.setBounds(86, 75, 94, 22);
		contentPanel.add(txtPBase);
		txtPBase.setColumns(10);

		JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
		lblPrecioUnitario.setBounds(208, 37, 94, 16);
		contentPanel.add(lblPrecioUnitario);

		txtPUnitario = new JTextField();
		txtPUnitario.setBounds(303, 34, 94, 22);
		contentPanel.add(txtPUnitario);
		txtPUnitario.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tipo de Queso:", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(12, 123, 442, 78);
		contentPanel.add(panel);
		panel.setLayout(null);

		rdbtnCilindrico = new JRadioButton("Cilindrico");
		rdbtnCilindrico.setSelected(true);
		rdbtnCilindrico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtcodigo.setText("QC-" + (empresa.getQuesos().size()+1));

				rdbtnCilindrico.setSelected(true);
				rdbtnCilindricoHueco.setSelected(false);
				rdbtnEsferico.setSelected(false);
				panelCilindrico.setVisible(true);
				panelEsferico.setVisible(false);
				panelHueco.setVisible(false);



			}
		});
		rdbtnCilindrico.setBounds(40, 27, 81, 25);
		panel.add(rdbtnCilindrico);

		rdbtnCilindricoHueco = new JRadioButton("Cilindrico Hueco");
		rdbtnCilindricoHueco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtcodigo.setText("QCH-" + (empresa.getQuesos().size()+1));
				rdbtnCilindrico.setSelected(false);
				rdbtnCilindricoHueco.setSelected(true);
				rdbtnEsferico.setSelected(false);
				panelCilindrico.setVisible(false);
				panelEsferico.setVisible(false);
				panelHueco.setVisible(true);


			}
		});
		rdbtnCilindricoHueco.setBounds(161, 27, 119, 25);
		panel.add(rdbtnCilindricoHueco);

		rdbtnEsferico = new JRadioButton("Esferico");
		rdbtnEsferico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtcodigo.setText("QE-" + (empresa.getQuesos().size()+1));
				rdbtnCilindrico.setSelected(false);
				rdbtnCilindricoHueco.setSelected(false);
				rdbtnEsferico.setSelected(true);
				panelCilindrico.setVisible(false);
				panelEsferico.setVisible(true);
				panelHueco.setVisible(false);


			}
		});
		rdbtnEsferico.setBounds(320, 27, 81, 25);
		panel.add(rdbtnEsferico);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(12, 214, 442, 51);
		contentPanel.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));

		panelCilindrico = new JPanel();
		panelCilindrico.setBackground(Color.WHITE);
		panel_1.add(panelCilindrico, "name_188506043247700");
		panelCilindrico.setLayout(null);

		JLabel lblLongitud = new JLabel("Longitud:");
		lblLongitud.setBounds(42, 13, 56, 16);
		panelCilindrico.add(lblLongitud);

		txtLongitud = new JTextField();
		txtLongitud.setBounds(140, 13, 56, 22);
		panelCilindrico.add(txtLongitud);
		txtLongitud.setColumns(10);

		JLabel lblRadio = new JLabel("Radio:");
		lblRadio.setBounds(238, 13, 56, 16);
		panelCilindrico.add(lblRadio);

		txtRadio = new JTextField();
		txtRadio.setBounds(336, 13, 56, 22);
		panelCilindrico.add(txtRadio);
		txtRadio.setColumns(10);

		panelHueco = new JPanel();
		panelHueco.setBackground(Color.WHITE);
		panel_1.add(panelHueco, "name_188534677943300");
		panelHueco.setLayout(null);

		JLabel lblLongitud_1 = new JLabel("Longitud:");
		lblLongitud_1.setBounds(12, 13, 56, 16);
		panelHueco.add(lblLongitud_1);

		txtLongHueco = new JTextField();
		txtLongHueco.setBounds(80, 13, 56, 22);
		panelHueco.add(txtLongHueco);
		txtLongHueco.setColumns(10);

		JLabel lblRadioExterior = new JLabel("Radio:");
		lblRadioExterior.setBounds(148, 13, 37, 16);
		panelHueco.add(lblRadioExterior);

		txtRadioHueco = new JTextField();
		txtRadioHueco.setBounds(197, 13, 56, 22);
		panelHueco.add(txtRadioHueco);
		txtRadioHueco.setColumns(10);

		JLabel lblRadioInterior = new JLabel("Radio Interior:");
		lblRadioInterior.setBounds(265, 13, 92, 16);
		panelHueco.add(lblRadioInterior);

		txtRInterior = new JTextField();
		txtRInterior.setBounds(369, 13, 56, 22);
		panelHueco.add(txtRInterior);
		txtRInterior.setColumns(10);

		panelEsferico = new JPanel();
		panelEsferico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEsferico.setBackground(Color.WHITE);
		panel_1.add(panelEsferico, "name_197961738277700");
		panelEsferico.setLayout(null);

		JLabel lblRadio_1 = new JLabel("Radio:");
		lblRadio_1.setBounds(157, 13, 48, 16);
		panelEsferico.add(lblRadio_1);

		txtRadioEsfera = new JTextField();
		txtRadioEsfera.setBounds(217, 13, 48, 22);
		panelEsferico.add(txtRadioEsfera);
		txtRadioEsfera.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						String codigo = null;
						String longitud = null;
						String radio = null;
						String cantidad = null;
						String pbase = null;
						String punidad = null;
						String rinterior = null;

						codigo = txtcodigo.getText();
						cantidad =(spnCantidad.getValue().toString());
						pbase = txtPBase.getText();
						punidad = txtPUnitario.getText();


						if (rdbtnCilindrico.isSelected()) {


							longitud = txtLongitud.getText();
							radio = txtRadio.getText();

							if (!txtcodigo.getText().isEmpty() && !txtLongitud.getText().isEmpty() && !txtRadio.getText().isEmpty() && !txtPBase.getText().isEmpty() && !txtPUnitario.getText().isEmpty()) {

								int base = Integer.parseInt(pbase);
								int p = Integer.parseInt(punidad);
								int canti = Integer.parseInt(cantidad);
								int radi = Integer.parseInt(radio);
								int longi = Integer.parseInt(longitud);


								Quesos queso = new Cilindrico(base, p, codigo, canti, longi, radi);

								empresa.insertarQuesos(queso);

								JOptionPane.showMessageDialog(null, "Queso Registrado con Exito!", "Validación", JOptionPane.INFORMATION_MESSAGE);

								main.cargarQuesoEnLista();

								limpiar();
							}

							else {
								JOptionPane.showMessageDialog(null, "Por favor llene cada campo para procesar el Registro", "Validación", JOptionPane.WARNING_MESSAGE);

							}

						}

						if (rdbtnCilindricoHueco.isSelected()) {

							longitud = txtLongHueco.getText();
							radio = txtRadioHueco.getText();
							rinterior = txtRInterior.getText();

							if (!txtcodigo.getText().equalsIgnoreCase("") && !txtLongHueco.getText().equalsIgnoreCase("") && !txtRadioHueco.getText().equalsIgnoreCase("")&& !txtRInterior.getText().equalsIgnoreCase("") && !txtPBase.getText().equalsIgnoreCase("") && !txtPUnitario.getText().equalsIgnoreCase("")) {

								int radi = Integer.parseInt(radio);
								int longi = Integer.parseInt(longitud);
								int base = Integer.parseInt(pbase);
								int p = Integer.parseInt(punidad);
								int canti = Integer.parseInt(cantidad);
								int interior = Integer.parseInt(rinterior);

								if (radi > interior) {

									Quesos queso = new CilindricoHueco(base, p, codigo, canti, longi, radi, interior);

									empresa.insertarQuesos(queso);

									JOptionPane.showMessageDialog(null, "Queso Registrado con Exito!", "Validación", JOptionPane.INFORMATION_MESSAGE);

									limpiar();

								}else {
									JOptionPane.showMessageDialog(null, "El Radio interior debe ser MENOR al radio Exterior", "Validación", JOptionPane.WARNING_MESSAGE);

								}

							}

							else  {
								JOptionPane.showMessageDialog(null, "Por favor llene cada campo para procesar el Registro", "Validación", JOptionPane.WARNING_MESSAGE);

							}



						}

						if (rdbtnEsferico.isSelected()) {

							radio = txtRadioEsfera.getText();

							if (!txtcodigo.getText().equalsIgnoreCase("") && !txtRadioEsfera.getText().equalsIgnoreCase("") &&  !txtPBase.getText().equalsIgnoreCase("") && !txtPUnitario.getText().equalsIgnoreCase("")) {


								int radi = Integer.parseInt(radio);
								int base = Integer.parseInt(pbase);
								int p = Integer.parseInt(punidad);
								int canti = Integer.parseInt(cantidad);

								Quesos queso = new Esferico(base, p, codigo, canti, radi);

								empresa.insertarQuesos(queso);

								JOptionPane.showMessageDialog(null, "Queso Registrado con Exito!", "Validación", JOptionPane.INFORMATION_MESSAGE);

								limpiar();
							}

							else  {
								JOptionPane.showMessageDialog(null, "Por favor llene cada campo para procesar el Registro", "Validación", JOptionPane.WARNING_MESSAGE);

							}



						}



					}

					private void limpiar() {


						txtcodigo.setText("QC-" + (empresa.getQuesos().size()+1));
						txtLongHueco.setText("");
						txtLongitud.setText("");
						txtPBase.setText("");
						txtPUnitario.setText("");
						txtRadio.setText("");
						txtRadioEsfera.setText("");
						txtRadioHueco.setText("");
						txtRInterior.setText("");
						panelCilindrico.setVisible(true);
						panelEsferico.setVisible(false);
						panelHueco.setVisible(false);
						rdbtnCilindrico.setSelected(true);
						rdbtnCilindricoHueco.setSelected(false);
						rdbtnEsferico.setSelected(false);


					}

					//}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	
}
