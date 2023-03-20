package avancado;

import java.util.Collection;
import java.util.TreeSet;

public class SobreCollection {

	public static void main(String[] args) {

		Collection<String> colecao = extracted();

		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leão");
		colecao.add("Pantera");
		colecao.add("Avestruz");

		System.out.println(colecao);
	}

	private static Collection<String> extracted() {
		return new TreeSet<String>();
	}

}
