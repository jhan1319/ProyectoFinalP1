package Logica;

public class Esferico extends Quesos {
	
	private int Radio;
	
	public Esferico(int precioBase, int precioUnitario, String id, int cantidad, int radio) {
		super(precioBase, precioUnitario, id, cantidad);
		Radio = radio;
	}

	

	public int getRadio() {
		return Radio;
	}



	public void setRadio(int radio) {
		Radio = radio;
	}



	@Override
	double Volumen() {
		
		double aux = 0;
		
		aux = ((4.0/3.0) * ((Math.PI) * (Radio * Radio * Radio)));
		
		
		return aux;
	}


}
