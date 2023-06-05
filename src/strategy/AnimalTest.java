package strategy;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class AnimalTest {

	@Test
	void deveOrdenarListaDeAnimaisPeloNome() {

		ArrayList<Animal> listaDeAnimais = new ArrayList<Animal>();

		listaDeAnimais.add(new Animal(0L, "Tartaruga"));
		listaDeAnimais.add(new Animal(1L, "Coelho"));
		listaDeAnimais.add(new Animal(2L, "Cachorro"));
		listaDeAnimais.add(new Animal(3L, "Gato"));
		listaDeAnimais.add(new Animal(4L, "Girafa"));
		listaDeAnimais.add(new Animal(5L, "Gato"));

		System.out.println(listaDeAnimais);
		listaDeAnimais.sort(new ComparadorPorNome());
		System.out.println(listaDeAnimais);
	}

	@Test
	void deveOrdenarListaDeAnimaisPeloId() {

		ArrayList<Animal> listaDeAnimais = new ArrayList<Animal>();

		listaDeAnimais.add(new Animal(3L, "Gato"));
		listaDeAnimais.add(new Animal(0L, "Tartaruga"));
		listaDeAnimais.add(new Animal(2L, "Cachorro"));
		listaDeAnimais.add(new Animal(5L, "Gato"));
		listaDeAnimais.add(new Animal(4L, "Girafa"));
		listaDeAnimais.add(new Animal(1L, "Coelho"));
		

		System.out.println(listaDeAnimais);
		listaDeAnimais.sort(new ComparadorPorId());
		System.out.println(listaDeAnimais);
	}
}
