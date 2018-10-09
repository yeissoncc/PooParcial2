package parcial2;

public class Cuenta {
	
	int idCuenta,Saldo;
	
	String IdCliente,TipoCuenta;
	
	private String fecha_vencimiento;
	private int Porcentaje;
	
	
	Cuenta(int cuenta, String cliente, String tipo, int saldo) {
		
		this.idCuenta = cuenta;
		
		this.IdCliente = cliente;
		
		this.Saldo = saldo;
		
		this.TipoCuenta = tipo;
		
		this.fecha_vencimiento = "";
		
		this.Porcentaje = 0;
		
	}
	
	Cuenta(int cuenta, String cliente, String tipo, int saldo, String fecha_v, int P_I_M){
		
		this.idCuenta = cuenta;
		
		this.IdCliente = cliente;
		
		this.Saldo = saldo;
		
		this.TipoCuenta = tipo;
		
		this.fecha_vencimiento = fecha_v;
		
		this.Porcentaje = P_I_M;
		
	}

	public void Depositar (int valor) {
		this.Saldo += valor;
	}
	
	public void Retirar(int monto, String fecha) {
		if(this.TipoCuenta == "Corriente") {
			if(monto < this.Saldo) {
				System.out.println("aprobado");
				this.Saldo -= monto;
			}
			else {
				System.out.println("no aprobado");
			}
		}
		else {
			if(this.fecha_vencimiento == fecha) {
				this.Saldo -= monto;
			}
		}
	}
	
	public void Depositar_Interes(String fecha){
		if(this.TipoCuenta == "Ahorro") {
			if(fecha == "01") {
				int incremento = this.Saldo * (this.Porcentaje / 100);
				this.Saldo += incremento;
			}
		}
	}
	
}
