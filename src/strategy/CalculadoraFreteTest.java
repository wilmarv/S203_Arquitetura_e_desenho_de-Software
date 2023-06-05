package strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraFreteTest {
	CalculadoraFrete calculaFrete = new CalculadoraFrete();

	@Test
	void deveCalcularFreteparaSedex() {

		Double preco = calculaFrete.calcularValor(new ServicoFreteSedex(), 15.0);
		assertEquals(preco, 70, 0);
	}

	@Test
	void deveCalcularFreteparaDHL() {
		Double preco = calculaFrete.calcularValor(new ServicoFreteDHL(), 30.0);
		assertEquals(preco, 90, 0);
	}

	@Test
	void deveCalcularFreteparaJadLog() {
		Double preco = calculaFrete.calcularValor(new ServicoFreteJadLog(), 31.0);
		assertEquals(preco, 150, 0);
	}

	@Test
	void deveCalcularFreteparaFedEx() {
		Double preco = calculaFrete.calcularValor(new ServicoFreteFedEx(), 35.0);
		assertEquals(preco, 54, 0);
	}

	@Test
	void deveLancarExepctionParaServicoDesconhecido() {

		Double preco = calculaFrete.calcularValor(new ServicoFreteFedEx(), 245.0);

		assertNotEquals(preco, 54);
	}

}
