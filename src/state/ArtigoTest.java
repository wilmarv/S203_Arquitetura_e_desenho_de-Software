package state;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArtigoTest {

	@Test
	public void deveArtigoTransitarDeRascunhoateAprovado() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertEquals("REVISANDO", artigo.getEstado());
		
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		
		assertEquals("APROVADO", artigo.getEstado());
		
		artigo.getLogHistorico().forEach(System.out::println);
	}
}
