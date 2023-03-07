package estoque;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ProdutoTest {

	@Test
	void testeProdutoComoJavaBean() {
		Produto produto = new Produto();
		produto.setDescricao("Queijo Minas 1Kg");
		produto.setValorCompra(50D);
		produto.setDataValidade(LocalDate.of(2023, 2, 7));

		System.out.println("Dados do produtos:");
		System.out.println(produto.getDescricao());
	}
}
