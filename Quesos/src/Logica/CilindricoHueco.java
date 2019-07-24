package Logica;

public class CilindricoHueco extends Cilindrico {
	
	private int radioInterior;

	public CilindricoHueco(int precioBase, int precioUnitario, String id, int cantidad, int longitud, int radio,
			int radioInterior) {
		super(precioBase, precioUnitario, id, cantidad, longitud, radio);
		this.radioInterior = radioInterior;
	}

	public int getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(int radioInterior) {
		this.radioInterior = radioInterior;
	}
	
	double Volumen() {
		
		double aux = 0;
		
		aux = (Math.PI) * (longitud) * ((radio * radio) - (radioInterior * radioInterior));
		
		return aux;
	}
	
	
	
	

}
