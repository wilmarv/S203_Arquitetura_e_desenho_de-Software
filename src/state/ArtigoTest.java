package state;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArtigoTest {

	@Test
	public void deveArtigoTransitarDeRascunhoateAprovado() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		ZzzArtigo artigo = new ZzzArtigo();
		
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertEquals("REVISANDO", artigo.getEstado());
		
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		
		assertEquals("APROVADO", artigo.getEstado());
		
		artigo.getLogHistorico().forEach(System.out::println);
	}
	
	@Test
	public void deveArtigoTransitarDeRascunho_Revisando_Rascunho() {
		
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.reprovar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
		
		artigo.getLogHistorico().forEach(System.out::println);
	}
}
