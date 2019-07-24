package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logica.Empresa;

import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listaClientes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private Empresa empresa = Empresa.getInstanceEmpresa();
	private JList<String> listaDeClientes;
			
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			listaClientes dialog = new listaClientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public listaClientes() {
		
		
		setLocationRelativeTo(null);
		setTitle("LibroClientes");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, "Lista de Clientes:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 24, 408, 176);
			contentPanel.add(scrollPane);
			{
				listaDeClientes = new JList();
				scrollPane.setViewportView(listaDeClientes);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Ver");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cargarClienteEnLista();
					}
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
	
	public void cargarClienteEnLista() {
		
		

		DefaultListModel<String> listModelCheese = new DefaultListModel<String>();
		listModelCheese.add(0, "CODIGO"+ "        "+"NOMBRE"+"        "+"DIRECCION"+"        "+"TELEFONO"+"        "+"CREDITO");
		for (int i = 0; i < empresa.getClientes().size(); i++) {
			listModelCheese.addElement(empresa.getClientes().get(i).getId() + "        "+ empresa.getClientes().get(0).getNombre() + "        " + empresa.getClientes().get(0).getTelefono()+"        "+empresa.getClientes().get(0).getCredito());
		}
		

		listaDeClientes.setModel(listModelCheese);
	}

}
