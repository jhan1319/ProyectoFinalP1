package Logica;

import java.util.ArrayList;

public class Factura {
	
	private Clientes cliente;
	private ArrayList<Quesos> Queso;
	
	public Factura(Clientes cliente) {
		super();
		this.cliente = cliente;
		Queso = new ArrayList<Quesos>();
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Quesos> getQueso() {
		return Queso;
	}

	public void setQueso(ArrayList<Quesos> queso) {
		Queso = queso;
	}
	
	public void ingresarQuesoComprado(Quesos queso) {
		Queso.add(queso);
	}
	
	public double precioActual() {
		
		double aux = 0;
		
		for (Quesos queso : Queso) {
			
			aux =+ (queso.precioBase + queso.precioUnitario) * queso.Volumen();
			
			
		}
		
		return aux;
		
	}

	
	
	
	

}
