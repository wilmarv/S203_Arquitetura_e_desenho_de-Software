package strategy;

public class ServicoFreteDHL implements Fretavel {

	@Override
	public Double calcularValor(Double pesoEmKg) {
		
		 if (pesoEmKg < 20)
			return 100.0;
		else
			return 90.0;
		
	}

}
