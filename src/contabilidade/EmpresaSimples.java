package contabilidade;

public class EmpresaSimples implements Tributavel {

	static final Double TAXA_IR_EMPRESA_SIMPLES = 0.15;
	static final double TAXA_ISS_EMPRESA_SIMPLES = 0.08;

	Double faturamentoMensal;

	public EmpresaSimples(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		return this.faturamentoMensal * TAXA_IR_EMPRESA_SIMPLES;
	}

	@Override
	public Double getValorISS() {
		return this.faturamentoMensal * TAXA_ISS_EMPRESA_SIMPLES;
	}

}
