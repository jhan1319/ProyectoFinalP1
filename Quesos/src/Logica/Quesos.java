package Logica;

public abstract class Quesos {

	protected int precioBase;
	protected int precioUnitario;
	protected String id;
	protected int cantidad;




	public Quesos(int precioBase, int precioUnitario, String id, int cantidad) {
		super();
		this.precioBase = precioBase;
		this.precioUnitario = precioUnitario;
		this.id = id;
		this.cantidad = cantidad;
	}



	public int getPrecioBase() {
		return precioBase;
	}



	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}



	public int getPrecioUnitario() {
		return precioUnitario;
	}



	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	abstract double Volumen();

	public float precioQueso() {

		return (float) ((precioBase + precioUnitario) * Volumen());

	}




	public String tipoDeQueso(Quesos queso) {

		String tipo = null;



		if (queso.equals(queso)) {

			if (queso instanceof Cilindrico) {

				tipo = "Cilindrico";

			}
			else if (queso instanceof CilindricoHueco) {

				tipo = "Cilindrico Hueco";

			}
			else if (queso instanceof Esferico) {

				tipo = "Esferico";
			}
		}

		return tipo;






	}
	
}



