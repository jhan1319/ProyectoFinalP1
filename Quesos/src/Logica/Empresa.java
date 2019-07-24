package Logica;

import java.util.ArrayList;

public class Empresa {

	private static Empresa miEmpresa = null;

	private ArrayList<Clientes> clientes;
	private ArrayList<Quesos> quesos;
	private ArrayList<Factura> facturas;

	private Empresa() {
		super();
		this.clientes = new ArrayList<Clientes>();
		this.quesos = new ArrayList<Quesos>();
		this.facturas = new ArrayList<Factura>();
	}

	public static Empresa getInstanceEmpresa() {
		if (miEmpresa == null) {

			miEmpresa = new Empresa();

		}

		return miEmpresa;
	}

	public ArrayList<Clientes> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Clientes> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Quesos> getQuesos() {
		return quesos;
	}

	public void setQuesos(ArrayList<Quesos> quesos) {
		this.quesos = quesos;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

	public void insertarClientes(Clientes cliente) {
		clientes.add(cliente);
	}

	public void insertarQuesos(Quesos queso) {
		quesos.add(queso);
	}

	public void insertarFacturas(Factura factura) {
		facturas.add(factura);
	}

	public ArrayList<Integer> totalQuesos(){

		ArrayList<Integer> listQuesos = new ArrayList<Integer>();

		for (int i = 0; i < 3; i++) {

			listQuesos.add(i, 0);

		}

		for (Quesos queso : quesos) {

			if (queso instanceof Cilindrico) {

				listQuesos.add(0, listQuesos.get(0)+1);

			}

			if (queso instanceof CilindricoHueco) {

				listQuesos.add(1, listQuesos.get(1)+1);

			}

			if (queso instanceof Esferico) {

				listQuesos.add(2, listQuesos.get(2)+1);
			}

		}


		return listQuesos;
	}

	public double totalPrice(Factura fact) {

		double aux = 0;

		for (Factura factura : facturas) {

			if (factura == fact) {

				for (Quesos queso : factura.getQueso()) {

					aux += (queso.precioBase + queso.precioUnitario) * queso.Volumen();
				}
			}
		}
		return aux;
	}



	public String tipoDeQueso(Quesos queso) {

		String tipo = null;

		for (Quesos chese : quesos) {

			if (chese.equals(queso)) {

				if (chese instanceof Cilindrico) {

					tipo = "Cilindrico";

				}
				else if (chese instanceof CilindricoHueco) {

					tipo = "Cilindrico Hueco";

				}
				else if (chese instanceof Esferico) {

					tipo = "Esferico";
				}
			}
		}
		return tipo;

	}

	public Quesos buscarQuesoByCode(String code) {

		Quesos aux = null;

		for (Quesos queso : quesos) {

			if (queso.id.equalsIgnoreCase(code)) {

				aux = queso;

			}

		}

		return aux;


	}

	public Clientes buscarClientByCode(String id) {

		Clientes aux = null;

		for (Clientes clientes2 : clientes) {

			if (clientes2.getId().equalsIgnoreCase(id)) {

				aux = clientes2;					
			}
		}	

		return aux;
	}
	
	public Boolean checkAmountCheese(Quesos cloneCheese) {
        boolean found = false;
        boolean available = false;
        int i=0;

        while(!found && i < quesos.size()) {
            if(quesos.get(i).getId().equalsIgnoreCase(cloneCheese.getId())) {
                found = true;
                if((quesos.get(i).getCantidad() >= cloneCheese.getCantidad()) && quesos.get(i).getCantidad() !=0) {
                    available = true;
                }
            }
            i++;
        }
        return available;
    }











}
