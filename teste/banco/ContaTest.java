package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {

	@Test
	void testarContaCorrente() {
		Double saldoEsperado = 101D;

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100D);
		contaCorrente.rentabilizar();

		assertEquals(saldoEsperado, contaCorrente.saldo);
	}
	
	@Test
	void testarContaPoupanca() {
		Double saldoEsperado = 102D;

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.depositar(100D);
		contaPoupanca.rentabilizar();

		assertEquals(saldoEsperado, contaPoupanca.saldo);
	}

}
