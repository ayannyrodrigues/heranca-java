package entities;

public class Funcionario {

	private String nome;
	protected Integer horasTrabalhadas;
	protected Double valorPorHora;
	
	public Funcionario() {
	}

	public Funcionario(String nome, Integer horasTrabalhadas, Double valorPorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horasTrabalhadas;
	}

	public void setHoras(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public Double pagamento() {
		return horasTrabalhadas * valorPorHora; 
	}
	
}
