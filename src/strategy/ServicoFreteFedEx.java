package strategy;

public class ServicoFreteFedEx implements Fretavel {

	@Override
	public Double calcularValor(Double pesoEmKg) {
		if (pesoEmKg < 20)
			return 0.0;
		else if (pesoEmKg > 20 && pesoEmKg < 40)
			return 54.0;
		else
			return 75.0;
	}

}
