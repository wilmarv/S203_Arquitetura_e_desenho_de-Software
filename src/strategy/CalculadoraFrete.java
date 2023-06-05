package strategy;

public class CalculadoraFrete {

	public Double calcularValor(Fretavel servico, Double pesoEmKg) {

		double valor = servico.calcularValor(pesoEmKg);

		return valor;
	}
}
