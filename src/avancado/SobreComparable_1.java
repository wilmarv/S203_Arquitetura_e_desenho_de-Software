package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreComparable_1 {
	public static void main(String[] args) {

		List<String> listaDeAlimentos = new ArrayList();

		listaDeAlimentos.add("Damasco");
		listaDeAlimentos.add("Batata");
		listaDeAlimentos.add("Arroz");
		listaDeAlimentos.add("Cenoura");

		System.out.println(listaDeAlimentos);

		Collections.sort(listaDeAlimentos);

		System.out.println(listaDeAlimentos);
	}
}
