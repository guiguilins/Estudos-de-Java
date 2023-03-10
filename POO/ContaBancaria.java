package POO;

public class ContaBancaria {

	private int idConta;
	private String name;
	private double saldoConta;
	
	public ContaBancaria(int idConta, String name, double saldoConta) {
		super();
		this.idConta = idConta;
		this.name = name;
		this.saldoConta = saldoConta;
	}
	
	public int getIdConta() {
		return idConta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void deposito(double value) {
		saldoConta += value;
	}
	
	public void saque(double value) {
		saldoConta -= value + 5;
	}
	
	public String toString(){
		return "Account: " 
		+ idConta 
		+ ", Holder: " 
		+ name
		+ ", Balance: $"
		+ String.format("%.2f", saldoConta);
	}
	
}