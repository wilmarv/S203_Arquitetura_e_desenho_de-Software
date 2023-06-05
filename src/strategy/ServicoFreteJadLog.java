package strategy;

public class ServicoFreteJadLog implements Fretavel {

	@Override
	public Double calcularValor(Double pesoEmKg) {

		if (pesoEmKg < 30)
			return 0.0;
		else
			return 150.0;

	}

}
