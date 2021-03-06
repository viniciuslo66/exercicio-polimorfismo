package Entidades;

public class Empregado {
	
	private String nome;
	private Integer horas;
	private Double valorPorHora;

	public Empregado() {
		super();
	}

	public Empregado(String nome, Integer horas, Double valorPorHora) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public double pagamento () {
		return horas * valorPorHora;
	}

}
