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

	@Test
	void testarPolimorfismo() {

		Boolean flagContaCorrenteComoDefault = false;

		Conta conta = null;

		if (flagContaCorrenteComoDefault) {
			conta = new ContaCorrente();
		} else {
			conta = new ContaPoupanca();
		}

		conta.depositar(100D);
		conta.rentabilizar();
		System.out.println(conta.getClass().getName());
		System.out.println(conta.saldo);
	}

	@Test
	void testaConta_ToString() {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(1000D);
		contaCorrente.sacar(10D);

		System.out.println(contaCorrente);
	}

}
