package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import Logica.Cilindrico;
import Logica.CilindricoHueco;
import Logica.Clientes;
import Logica.Empresa;
import Logica.Esferico;
import Logica.Factura;
import Logica.Quesos;
import jdk.nashorn.internal.runtime.ListAdapter;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;

public class Principal extends JDialog {

	Empresa empresa = Empresa.getInstanceEmpresa();

	private final JPanel contentPanel = new JPanel();
	private JTextField txtnombre;
	private JTextField txtdireccion;
	private JFormattedTextField txtcodigo;
	private JFormattedTextField txttelefono;
	private JButton btnRegistrar;
	private JTextField txtCredito;
	private JTextField txtMonto;
	private JList<String> listaQuesos;
	private JList<String> listaCompras;
	private ArrayList<Quesos> LISTACOMPRAS = new ArrayList<Quesos>();
	private float auxlatina = 0;
	DecimalFormat decimalFormat = new DecimalFormat("#.00");
	private JTextField txtLey;
	private JTextField txtITBIS;
	private JTextField txtTotal;
	private JTextField txtPagado;
	private JRadioButton rdbtnAlContado;
	private JRadioButton rdbtnAlCredito;
	private JPanel panelContado;
	private JPanel panelCredito;
	private JTextField txtLey1;
	private JTextField txtITBIS1;
	private JTextField txtTotal1;
	private JTextField txtcredito1;
	private boolean state = false;
	private boolean state2 = false;

	//private float ilatina = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Principal dialog = new Principal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @throws java.text.ParseException 
	 */
	public Principal() throws java.text.ParseException {



		setBounds(100, 100, 952, 693);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		Clientes clientePrueba = new Clientes("Cliente1", "PUCMM111", "(809)911-9111", "000-0000990-8", 500);
		empresa.insertarClientes(clientePrueba);


		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(22, 26, 56, 16);
		contentPanel.add(lblId);

		{
			txtcodigo = new JFormattedTextField();
		}
		try {
			txtcodigo = new JFormattedTextField(new DefaultFormatterFactory(new MaskFormatter("###-#######-#"), new MaskFormatter("###-#######-#"), new MaskFormatter("###-#######-#")));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}


		txtcodigo.setBounds(47, 23, 104, 22);
		contentPanel.add(txtcodigo);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(22, 60, 396, 140);
		contentPanel.add(panel);
		panel.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(12, 13, 56, 16);
		panel.add(lblNombre);

		txttelefono = new JFormattedTextField();


		{
			txttelefono = new JFormattedTextField();

			try {
				txttelefono = new JFormattedTextField(new DefaultFormatterFactory(new MaskFormatter("(###) ### - ####"), new MaskFormatter("(###) ### - ####"), new MaskFormatter("(###) ### - ####")));
				txttelefono.setEditable(false);

			} catch (ParseException e1) {
				e1.printStackTrace();
			}
		}


		txttelefono.setBounds(265, 13, 104, 22);
		panel.add(txttelefono);

		txtnombre = new JTextField();
		txtnombre.setEditable(false);
		txtnombre.setBounds(76, 13, 116, 22);
		panel.add(txtnombre);
		txtnombre.setColumns(10);

		JLabel lblNewLabel = new JLabel("Direccion:");
		lblNewLabel.setBounds(12, 58, 70, 16);
		panel.add(lblNewLabel);

		txtdireccion = new JTextField();
		txtdireccion.setEditable(false);
		txtdireccion.setBounds(76, 55, 116, 22);
		panel.add(txtdireccion);
		txtdireccion.setColumns(10);

		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(204, 16, 56, 16);
		panel.add(lblTelefono);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 94, 396, 46);
		panel.add(panel_1);
		panel_1.setLayout(null);

		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = null;
				String telefono = null;
				String nombre = null;
				String direccion = null;
				String credito = null;

				id = txtcodigo.getText();
				telefono = txttelefono.getText();
				direccion = txtdireccion.getText();
				nombre = txtnombre.getText();
				credito = txtCredito.getText();

				if (!txtcodigo.getText().isEmpty() && !txtdireccion.getText().isEmpty() && !txtnombre.getText().isEmpty() && !txttelefono.getText().isEmpty() && !txtCredito.getText().isEmpty()) {
					float aux = Float.valueOf(credito);



					Clientes client = new Clientes(nombre, direccion, telefono, id, aux);

					empresa.insertarClientes(client);

					JOptionPane.showMessageDialog(null, "Cliente Registrado con Exito!", "Validación", JOptionPane.INFORMATION_MESSAGE);

					limpiar();





				}

				else if (txtcodigo.getText().isEmpty() || txtdireccion.getText().isEmpty() || txtnombre.getText().isEmpty() || txttelefono.getText().isEmpty() || txtCredito.getText().isEmpty()) {

					JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos de la manera correcta", "Error de Validación", JOptionPane.WARNING_MESSAGE);

				}



			}
		});

		btnRegistrar.setEnabled(false);

		btnRegistrar.setBounds(174, 13, 97, 25);
		panel_1.add(btnRegistrar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();

				JOptionPane.showMessageDialog(null, "El registro ha sido Cancelado!", "Cancelacion de Registro", JOptionPane.WARNING_MESSAGE);

				txtCredito.setEditable(false);
				txtdireccion.setEditable(false);
				txtnombre.setEditable(false);
				txttelefono.setEditable(false);





			}
		});
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(287, 13, 97, 25);
		panel_1.add(btnCancelar);

		JLabel lblCredito = new JLabel("Credito:");
		lblCredito.setBounds(204, 58, 56, 16);
		panel.add(lblCredito);

		txtCredito = new JTextField();
		txtCredito.setBounds(265, 55, 104, 22);
		panel.add(txtCredito);
		txtCredito.setEditable(false);
		txtCredito.setColumns(10);

		JButton btnbuscar = new JButton("Buscar\r\n");
		btnbuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {



				String codigo = txtcodigo.getText();

				Clientes client = empresa.buscarClientByCode(codigo);





				if (client != null) {

					System.out.println("TAMO BIEN");

					txtcodigo.setText(empresa.buscarClientByCode(codigo).getId());
					txtdireccion.setText(empresa.buscarClientByCode(codigo).getDireccion());
					txtnombre.setText(empresa.buscarClientByCode(codigo).getNombre());
					txttelefono.setText(empresa.buscarClientByCode(codigo).getTelefono());
					txtCredito.setText(String.valueOf(empresa.buscarClientByCode(codigo).getCredito()));

				}
				else if (client == null) {
					System.out.println("TAMO MAL");

					txtcodigo.setEditable(true);				
					txtdireccion.setEditable(true);				
					txtnombre.setEditable(true);				
					txttelefono.setEditable(true);
					txtCredito.setEditable(true);
					btnCancelar.setEnabled(true);


					btnRegistrar.setEnabled(true);

					limpiar();

					JOptionPane.showMessageDialog(null, "El cliente ingresado No existe, Por favor proceda a crearlo", "Error de Validación", JOptionPane.WARNING_MESSAGE);


				}





			}


		});
		btnbuscar.setBounds(163, 22, 97, 25);
		contentPanel.add(btnbuscar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 344, 396, 194);
		contentPanel.add(scrollPane);

		listaQuesos = new JList<String>();
		scrollPane.setViewportView(listaQuesos);

		JButton btnPasarCompra = new JButton(">>");
		btnPasarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				////AW SHIT, HE WE GO AGAIN!


				String codeCheese = listaQuesos.getSelectedValue().split("   ")[0];
				Quesos auxCheese = empresa.buscarQuesoByCode(codeCheese);
				Quesos cloneCheese = cloneCheese(auxCheese);
				Quesos cheeseCarito = searchTemporalCheeseByCode(cloneCheese.getId());


				if (empresa.checkAmountCheese(cloneCheese)) {

					auxCheese.setCantidad(auxCheese.getCantidad() - 1);

					if (cheeseCarito!= null) {

						cheeseCarito.setCantidad(cheeseCarito.getCantidad() + 1);
					}
					else {
						LISTACOMPRAS.add(cloneCheese);
					}
				}
				else {
					JOptionPane.showConfirmDialog(null, "No hay disponible", "Aviso! - AVISO!", JOptionPane.WARNING_MESSAGE);
				}

				cargarQuesoEnLista();
				loadListProductCart();






				auxlatina += empresa.buscarQuesoByCode(codeCheese).precioQueso();


				txtMonto.setText(String.valueOf(auxlatina));


			}
		});



		btnPasarCompra.setBounds(438, 387, 56, 25);
		contentPanel.add(btnPasarCompra);

		JButton devolverCompra = new JButton("<<");
		devolverCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///////////////ay shiiiii


				String codeCheese = listaCompras.getSelectedValue().split("   ")[0];
				Quesos auxTempCheese = searchTemporalCheeseByCode(codeCheese);

				if (checkAmountCheeseCart(auxTempCheese)) {

					auxTempCheese.setCantidad(auxTempCheese.getCantidad() - 1);

					if (empresa.buscarQuesoByCode(auxTempCheese.getId()) != null) {


						empresa.buscarQuesoByCode(auxTempCheese.getId()).setCantidad(empresa.buscarQuesoByCode(auxTempCheese.getId()).getCantidad() + 1);
					}

				}
				else {
					JOptionPane.showConfirmDialog(null, "No existe cantidad en el carrito", "Aviso! - AVISO!", JOptionPane.WARNING_MESSAGE);
				}

				if (auxTempCheese.getCantidad() <= 0) {
					LISTACOMPRAS.remove(auxTempCheese);
				}

				loadListProductCart();
				cargarQuesoEnLista();;



				txtMonto.setText( String.valueOf(decimalFormat.format(auxlatina -= empresa.buscarQuesoByCode(codeCheese).precioQueso())));
			}



		});
		devolverCompra.setBounds(438, 438, 56, 25);
		contentPanel.add(devolverCompra);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(515, 344, 396, 194);
		contentPanel.add(scrollPane_1);

		listaCompras = new JList<String>();
		scrollPane_1.setViewportView(listaCompras);

		JLabel lblMonto = new JLabel("Sub-Monto:");
		lblMonto.setBounds(725, 546, 88, 16);
		contentPanel.add(lblMonto);

		txtMonto = new JTextField();
		txtMonto.setEditable(false);
		txtMonto.setBounds(801, 543, 110, 22);
		contentPanel.add(txtMonto);
		txtMonto.setColumns(10);

		JButton btnActualizar = new JButton("Actualizar Tablas");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cargarQuesoEnLista();
				loadListProductCart();

			}
		});
		btnActualizar.setBounds(393, 542, 157, 25);
		contentPanel.add(btnActualizar);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Informacion de Pago", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(515, 26, 396, 305);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(12, 29, 372, 51);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		rdbtnAlContado = new JRadioButton("Al Contado");
		rdbtnAlContado.setSelected(true);
		rdbtnAlContado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				rdbtnAlContado.setSelected(true);
				rdbtnAlCredito.setSelected(false);
				panelContado.setVisible(true);
				panelCredito.setVisible(false);
				state2 = false;

				cargarFacturas();
				
				state = true;
				
				







			}
		});
		rdbtnAlContado.setBounds(65, 9, 91, 25);
		panel_3.add(rdbtnAlContado);

		rdbtnAlCredito = new JRadioButton("Al Credito");
		rdbtnAlCredito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnAlContado.setSelected(false);
				rdbtnAlCredito.setSelected(true);
				panelContado.setVisible(false);
				panelCredito.setVisible(true);
				state = false;
				
				cargarFacturas2();
				
				state2 = true;
				
				
				
				
			}
		});
		rdbtnAlCredito.setBounds(221, 9, 85, 25);
		panel_3.add(rdbtnAlCredito);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 93, 372, 199);
		panel_2.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));

		panelContado = new JPanel();
		panelContado.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.add(panelContado, "name_457727786148800");
		panelContado.setLayout(null);

		JLabel lblley = new JLabel("%Ley:");
		lblley.setBounds(12, 13, 56, 16);
		panelContado.add(lblley);

		txtLey = new JTextField();



		/////////////////////////PORCIENTO DE LEEEEEEEEEEEYYYYY///////////////////////

		txtLey.setEditable(false);
		txtLey.setBounds(12, 42, 86, 22);
		panelContado.add(txtLey);
		txtLey.setColumns(10);

		JLabel lblitbis = new JLabel("%ITBIS:");
		lblitbis.setBounds(12, 77, 56, 16);
		panelContado.add(lblitbis);

		txtITBIS = new JTextField();



		/////////////////////////PORCIENTO DE ITBIS///////////////////////

		txtITBIS.setEditable(false);
		txtITBIS.setBounds(12, 106, 86, 22);
		panelContado.add(txtITBIS);
		txtITBIS.setColumns(10);

		JLabel lblMontoTotal = new JLabel("Monto Total:");
		lblMontoTotal.setBounds(176, 13, 86, 16);
		panelContado.add(lblMontoTotal);

		txtTotal = new JTextField();


		txtTotal.setEditable(false);
		txtTotal.setBounds(164, 39, 98, 22);
		panelContado.add(txtTotal);
		txtTotal.setColumns(10);

		JLabel lblTotalPagado = new JLabel("Total Pagado:\r\n");
		lblTotalPagado.setBounds(176, 74, 86, 16);
		panelContado.add(lblTotalPagado);

		txtPagado = new JTextField();
		txtPagado.setBounds(164, 103, 98, 22);
		panelContado.add(txtPagado);
		txtPagado.setColumns(10);
		
		JButton btnNewButton = new JButton("Actualizar Factura");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cargarFacturas();
				cargarFacturas2();
				
				
			}
		});
		btnNewButton.setBounds(200, 161, 160, 25);
		panelContado.add(btnNewButton);

		panelCredito = new JPanel();
		panelCredito.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.add(panelCredito, "name_457737512135700");
		panelCredito.setLayout(null);
		
		JLabel lblley_1 = new JLabel("%Ley:");
		lblley_1.setBounds(12, 23, 56, 16);
		panelCredito.add(lblley_1);
		
		txtLey1 = new JTextField();
		txtLey1.setEditable(false);
		txtLey1.setBounds(12, 52, 76, 22);
		panelCredito.add(txtLey1);
		txtLey1.setColumns(10);
		
		JLabel lblitbis_1 = new JLabel("%ITBIS:");
		lblitbis_1.setBounds(12, 87, 56, 16);
		panelCredito.add(lblitbis_1);
		
		txtITBIS1 = new JTextField();
		txtITBIS1.setEditable(false);
		txtITBIS1.setBounds(12, 116, 76, 22);
		panelCredito.add(txtITBIS1);
		txtITBIS1.setColumns(10);
		
		JLabel lblMontoTotal_1 = new JLabel("Monto Total:");
		lblMontoTotal_1.setBounds(149, 23, 84, 16);
		panelCredito.add(lblMontoTotal_1);
		
		txtTotal1 = new JTextField();
		txtTotal1.setEditable(false);
		txtTotal1.setBounds(149, 52, 84, 22);
		panelCredito.add(txtTotal1);
		txtTotal1.setColumns(10);
		
		JLabel lblCreditoActual = new JLabel("Credito Actual:");
		lblCreditoActual.setBounds(149, 87, 96, 16);
		panelCredito.add(lblCreditoActual);
		
		txtcredito1 = new JTextField();
		txtcredito1.setEditable(false);
		txtcredito1.setBounds(149, 116, 84, 22);
		panelCredito.add(txtcredito1);
		txtcredito1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Actualizar Factura");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cargarFacturas();
				
			}
		});
		btnNewButton_1.setBounds(192, 150, 143, 25);
		panelCredito.add(btnNewButton_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnPay = new JButton("Pay");
				btnPay.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if (state = true  ) {
							
							float pago = 0;
							float deuda = 0;

							if (!txtPagado.getText().isEmpty()) {
								
								deuda = Float.valueOf(txtMonto.getText())+Float.valueOf(txtITBIS.getText())+Float.valueOf(txtLey.getText());
								
								pago = Float.valueOf(txtPagado.getText());
								
								
								
								if (pago < deuda) {
									
									txtPagado.setText("");
									
									JOptionPane.showMessageDialog(null, "El monto a pagar es superior a esta cifra!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
									
								}else {
									JOptionPane.showMessageDialog(null, "Su compra ha sido realizada Satisfactoriamente!", "Compra Exitosa!", JOptionPane.INFORMATION_MESSAGE);
									clean1();
									clean2();
								}
								 
							}else {
								JOptionPane.showMessageDialog(null, "Ingrese un valor para pagar la factura!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
							}
								
							}
							
							
						else if (state2 = true) {
							
							
							
							
							if (Float.valueOf(txtTotal1.getText()) < Float.valueOf(txtcredito1.getText())) {
								
								JOptionPane.showMessageDialog(null, "Su compra ha sido realizada Satisfactoriamente!", "Compra Exitosa!", JOptionPane.INFORMATION_MESSAGE);
								clean2();
								clean1();
							}
							
							
							
						}else {
							JOptionPane.showMessageDialog(null, "El monto a pagar es superior a su credito, favor pagar al contado!s", "Advertencia!", JOptionPane.WARNING_MESSAGE);
						}
						
						
						
						
						
						
						
						
					}
				});
				btnPay.setActionCommand("OK");
				buttonPane.add(btnPay);
				getRootPane().setDefaultButton(btnPay);
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

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnQuesos = new JMenu("Quesos");
		menuBar.add(mnQuesos);

		JMenuItem mntmRegistarQueso = new JMenuItem("Registar Queso");
		mntmRegistarQueso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				registrarQuesos registro = new registrarQuesos();

				registro.setModal(true);
				registro.setLocationRelativeTo(null);
				registro.setVisible(true);

			}
		});
		mnQuesos.add(mntmRegistarQueso);

		JMenu mnClientes = new JMenu("Clientes");
		menuBar.add(mnClientes);

		JMenuItem mntmLibroDeClietnes = new JMenuItem("Libro de Clientes");
		mntmLibroDeClietnes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				listaClientes LISTA = new listaClientes();

				LISTA.setModal(true);
				LISTA.setLocationRelativeTo(null);
				LISTA.setVisible(true);



				////////////////////////////ja

			}
		});
		mnClientes.add(mntmLibroDeClietnes);


	}




	private void limpiar() {
		txtcodigo.setText("");
		txtcodigo.setText("");
		txtdireccion.setText("");
		txtdireccion.setText("");
		txtnombre.setText("");
		txtnombre.setText("");
		txttelefono.setText("");
		txttelefono.setText("");
		txtCredito.setText("");

	}

	public void cargarQuesoEnLista() {



		DefaultListModel<String> listModelCheese = new DefaultListModel<String>();
		listModelCheese.add(0, "CODIGO"+ "      "+"TIPO"+"      "+"CANT."+"      "+"PRECIO");
		for (int i = 0; i < empresa.getQuesos().size(); i++) {
			listModelCheese.addElement(empresa.getQuesos().get(i).getId() + "      "+ empresa.tipoDeQueso(empresa.getQuesos().get(i)) + "      " + empresa.getQuesos().get(i).getCantidad() + "      "+ empresa.getQuesos().get(i).precioQueso());
		}



		listaQuesos.setModel(listModelCheese);
	}

	private void loadListProductCart() {

		DefaultListModel<String> listModelCart = new DefaultListModel<String>();
		listModelCart.add(0, "CODIGO"+ "      "+"TIPO"+"      "+"CANT."+"      "+"PRECIO");
		for (int i = 0; i < LISTACOMPRAS.size(); i++) {
			listModelCart.addElement(LISTACOMPRAS.get(i).getId() + "      "+LISTACOMPRAS.get(i).tipoDeQueso(LISTACOMPRAS.get(i))+"      " + LISTACOMPRAS.get(i).getCantidad() + "      " + LISTACOMPRAS.get(i).precioQueso());
		}
		listaCompras.setModel(listModelCart);


	}

	private Quesos cloneCheese(Quesos auxCheese) {

		Quesos cloneCheese = null;

		if (auxCheese instanceof Esferico) {

			cloneCheese = new Esferico(auxCheese.getPrecioBase(), auxCheese.getPrecioUnitario(), auxCheese.getId(), 1, ((Esferico) auxCheese).getRadio());
		}
		else if (auxCheese instanceof Cilindrico) {

			cloneCheese = new Cilindrico(auxCheese.getPrecioBase(), auxCheese.getPrecioUnitario(), auxCheese.getId(), 1, ((Cilindrico) auxCheese).getLongitud(), ((Cilindrico) auxCheese).getRadio());
		}
		else if (auxCheese instanceof CilindricoHueco) {

			cloneCheese = new CilindricoHueco(auxCheese.getPrecioBase(), auxCheese.getPrecioUnitario(), auxCheese.getId(), 1, ((CilindricoHueco) auxCheese).getLongitud(), ((CilindricoHueco) auxCheese).getRadio(), ((CilindricoHueco) auxCheese).getRadioInterior());
		}
		return cloneCheese;
	}

	private Quesos searchTemporalCheeseByCode(String codeCheese) {

		Quesos auxCheese = null;
		boolean found = false;
		int i = 0;

		while (!found && i < LISTACOMPRAS.size()) {
			if(LISTACOMPRAS.get(i).getId().equalsIgnoreCase(codeCheese)) {
				found = true;
				auxCheese = LISTACOMPRAS.get(i);
			}
			i++;
		}
		return auxCheese; 
	}

	public Boolean checkAmountCheeseCart(Quesos cloneCheese) {
		boolean found = false;
		boolean available = false;
		int i=0;

		while(!found && i < LISTACOMPRAS.size()) {
			if(LISTACOMPRAS.get(i).getId().equalsIgnoreCase(cloneCheese.getId())) {
				found = true;
				if((cloneCheese.getCantidad() >= 1)) {
					available = true;
				}
			}
			i++;
		}
		return available;
	}
	
	public void cargarFacturas() {
		
		float aux = 0;

		aux = Float.valueOf(txtMonto.getText());
		
       

		txtLey.setText(String.valueOf(decimalFormat.format((aux * 0.10))));

		txtITBIS.setText(String.valueOf(decimalFormat.format((aux * 0.18))));

		txtTotal.setText(String.valueOf(decimalFormat.format(aux+Float.valueOf(txtITBIS.getText())+	Float.valueOf(txtLey.getText()))));
		
	}
	
	public void cargarFacturas2() {
		
		float aux = 0;

		aux = Float.valueOf(txtMonto.getText());
		
		Float chepa = 0.0f;
		
		chepa = empresa.buscarClientByCode("000-0000990-8").getCredito();
		
		txtcredito1.setText(String.valueOf(chepa));
		
       

		txtLey1.setText(String.valueOf(decimalFormat.format((aux * 0.10))));

		txtITBIS1.setText(String.valueOf(decimalFormat.format((aux * 0.18))));

		txtTotal1.setText(String.valueOf(decimalFormat.format(aux+Float.valueOf(txtITBIS1.getText())+	Float.valueOf(txtLey1.getText()))));
		
	}
	
	public void clean1() {
		txtITBIS.setText("");
		txtLey.setText("");
		txtPagado.setText("");
		txtTotal.setText("");
		
	}
	
	public void clean2() {
		txtITBIS1.setText("");
		txtLey1.setText("");
		txtcredito1.setText("");
		txtTotal1.setText("");
		
	}
}




