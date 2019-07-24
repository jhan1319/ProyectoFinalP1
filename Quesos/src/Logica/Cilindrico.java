package Logica;

public class Cilindrico extends Quesos {
	
	protected int longitud;
	protected int radio;
	
	public Cilindrico(int precioBase, int precioUnitario, String id, int cantidad, int longitud, int radio) {
		super(precioBase, precioUnitario, id, cantidad);
		this.longitud = longitud;
		this.radio = radio;
	}

	

	public int getLongitud() {
		return longitud;
	}



	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}



	public int getRadio() {
		return radio;
	}



	public void setRadio(int radio) {
		this.radio = radio;
	}



	@Override
	double Volumen() {

		double aux = 0;
		
		aux = (Math.PI) * (radio * radio) * (longitud);
		
		
		return aux;
	}
	
	
	
	
	

}
