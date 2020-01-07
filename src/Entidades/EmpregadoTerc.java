package Entidades;

public class EmpregadoTerc extends Empregado {

	private Double cobrancaAdicional;

	public EmpregadoTerc() {
		super();
	}

	public EmpregadoTerc(String nome, Integer horas, Double valorPorHora, Double cobrancaAdicional) {
		super(nome, horas, valorPorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}

	public Double getCobrancaAdicional() {
		return cobrancaAdicional;
	}

	public void setCobrancaAdicional(Double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + cobrancaAdicional * 1.1;
	}
}
