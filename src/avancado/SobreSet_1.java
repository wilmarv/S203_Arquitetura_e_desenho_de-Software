package avancado;

import java.util.Set;
import java.util.TreeSet;

public class SobreSet_1 {
	public static void main(String[] args) {
		Set<String> setDeFrutas = new TreeSet();
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Pera");
		setDeFrutas.add("Manga");
		setDeFrutas.add("Limão");

		System.out.println(setDeFrutas);
	}
}
