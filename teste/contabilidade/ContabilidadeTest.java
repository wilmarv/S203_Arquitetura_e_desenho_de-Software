package contabilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContabilidadeTest {

	@Test
	void testEmpresaMei() {

		EmpresaMei empresa = new EmpresaMei(100D);
		Double valorIREsperado = 27.5;

		assertEquals(valorIREsperado, empresa.getValorIR(), 0.01);

		Double valorISSEsperado = 0D;
		assertEquals(empresa.getValorISS(), valorISSEsperado);
	}

	@Test
	void testEmpresaSimples() {
		EmpresaSimples empresa = new EmpresaSimples(100D);

		Double valorIREsperado = 15D;
		assertEquals(valorIREsperado, empresa.getValorIR());

		Double valorISSEsperado = 8D;
		assertEquals(valorISSEsperado, empresa.getValorISS());
	}
}
