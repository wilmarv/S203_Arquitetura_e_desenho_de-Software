package state;

import java.time.LocalDate;

public class EstadoRascunho implements Estado {

	private Artigo artigo;

	public EstadoRascunho(Artigo artigo) {
		this.artigo = artigo;
	}

	@Override
	public void publicar() {

		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();

		if (gerenteDeSeguranca.ehUsuarioAutor()) {
			this.artigo.transitarEstadoPara(new EstadoRevisando(artigo));
			this.artigo.getLogHistorico().add("Transitado para REVISANDO em " + LocalDate.now());
			return;
		} else
			throw new RuntimeException("Usuario não tem permissão para revisar");
	}

	@Override
	public void reprovar() {
		// TODO Auto-generated method stub

	}
}
