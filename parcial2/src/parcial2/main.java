package parcial2;

import  java.util.Scanner ;

public class main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre,cuenta;
		int TipoCuenta,Ncuenta;

		
		
		Scanner teclado = new Scanner (System.in);
		

		
		System.out.println("ingrese si su cuenta es ahorro 1 o corriente 2: ");
		
		int tipoCuenta = teclado.nextInt();
		
		System.out.println("nombre cliente: ");
		
		nombre = teclado.nextLine();
		
		System.out.println("tipo de cuenta: ");
		
		cuenta = teclado.nextLine();
		
		System.out.println("ingrrece el monto de la cuenta: ");
		
		Ncuenta =  teclado.nextInt();
		
		Cuenta client1 = new Cuenta(tipoCuenta,nombre,cuenta,Ncuenta);
		System.out.print(client1.IdCliente );
		System.out.println(client1.TipoCuenta);
		

	}

}
