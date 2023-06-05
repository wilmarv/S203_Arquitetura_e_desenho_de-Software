package strategy;

public class ServicoFreteSedex implements Fretavel {

	@Override
	public Double calcularValor(Double pesoEmKg) {

		if (pesoEmKg < 10)
			return 50.0;
		else if (pesoEmKg < 20)
			return 70.0;
		else
			return 90.0;
	}
}
