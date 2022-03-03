package entities;

public class Terceirizado extends Funcionario {
	
	private Double despesaAdicional;
	
	public Terceirizado() {
		super();
	}

	public Terceirizado(String nome, Integer horasTrabalhadas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1; 
	}
}
