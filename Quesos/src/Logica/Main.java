package Logica;

import sun.security.jca.GetInstance;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = Empresa.getInstanceEmpresa();

		Quesos cilindricoPrueba = new Cilindrico(100, 150, "Cilindrico1", 10, 5, 1);
		Quesos cilindricoPrueba2 = new Cilindrico(100, 150, "Cilindrico2", 10, 5, 1);
		Quesos cilindricoPrueba3 = new Cilindrico(100, 150, "Cilindrico3", 10, 5, 1);

		empresa.insertarQuesos(cilindricoPrueba);
		empresa.insertarQuesos(cilindricoPrueba2);
		empresa.insertarQuesos(cilindricoPrueba3);

		Quesos esfericoPrueba = new Esferico(200,20, "Esferico1", 10, 1);
		Quesos esfericoPrueba2 = new Esferico(200,20, "Esferico2", 10, 1);
		Quesos esfericoPrueba3 = new Esferico(200,20, "Esferico3", 10, 1);

		empresa.insertarQuesos(esfericoPrueba);
		empresa.insertarQuesos(esfericoPrueba2);
		empresa.insertarQuesos(esfericoPrueba3);

		Quesos cilindricoHuecoPrueba = new CilindricoHueco(300, 30, "Hueco1", 20, 30, 10, 1);
		Quesos cilindricoHuecoPrueba2 = new CilindricoHueco(300, 30, "Hueco2", 20, 30, 10, 1);
		Quesos cilindricoHuecoPrueba3 = new CilindricoHueco(300, 30, "Hueco3", 20, 30, 10, 1);

		empresa.insertarQuesos(cilindricoHuecoPrueba);
		empresa.insertarQuesos(cilindricoHuecoPrueba2);
		empresa.insertarQuesos(cilindricoHuecoPrueba3);

		Clientes clientePrueba = new Clientes("Cliente1", "PUCMM111", "809-911", "001", 0);
		Clientes clientePrueba2 = new Clientes("Cliente2", "PUCMM", "809-911", "C-002", 0);
		Clientes clientePrueba3 = new Clientes("Cliente3", "PUCMM", "809-911", "C-003", 0);

		empresa.insertarClientes(clientePrueba);
		empresa.insertarClientes(clientePrueba2);
		empresa.insertarClientes(clientePrueba3);

		Factura facturaPrueba = new Factura(clientePrueba);


		facturaPrueba.ingresarQuesoComprado(cilindricoPrueba);
		facturaPrueba.ingresarQuesoComprado(cilindricoPrueba2);

		empresa.insertarFacturas(facturaPrueba);
		
		System.out.println(empresa.buscarClientByCode("001").getDireccion());
		
		

		////////////////INCISO A///////////////////////////

		/*for (int i = 0; i < empresa.getQuesos().size(); i++) {

			System.out.println(empresa.getQuesos().get(i).Volumen());

		}*/

		///////////////INCISO B////////////////////////////

		//System.out.println(empresa.totalPrice(facturaPrueba));


		System.out.println(empresa.totalQuesos().get(0));
		System.out.println(empresa.totalQuesos().get(1));
		 System.out.println(empresa.totalQuesos().get(2));





















	}

}
