package state;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Artigo {

	private String estado;

	private List<String> logHistorico = new ArrayList<>();

	public Artigo() {
		this.estado = "RASCUNHO";
	}

	public String getEstado() {
		return estado;
	}

	public List<String> getLogHistorico() {
		return logHistorico;
	}

	public void publicar() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();

		if ("RASCUNHO".equals(this.estado))
			if (gerenteDeSeguranca.ehUsuarioAutor()) {
				this.estado = "REVISANDO";
				this.logHistorico.add("Transitado para REVISANDO em " + LocalDate.now());
				return;
			} else
				throw new RuntimeException("Usuario não tem permissão para revisar");

		if ("REVISANDO".equals(this.estado))
			if (gerenteDeSeguranca.ehUsuarioModerador()) {
				this.estado = "APROVADO";
				this.logHistorico.add("Transitado para APROVADO em " + LocalDate.now());
				return;
			} else
				throw new RuntimeException("Usuario não tem permissão para publicar");

		if ("APROVADO".equals(this.estado))
			return;

	}
	
	public void reprovar() {
		
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();

		if ("RASCUNHO".equals(this.estado))
			return;

		if ("REVISADO".equals(this.estado))
			if (gerenteDeSeguranca.ehUsuarioModerador()) {
				this.estado = "RASCUNHO";
				this.logHistorico.add("Transitado para RASCUNHO em " + LocalDate.now());
				return;
			} else
				throw new RuntimeException("Usuario não tem permissão para reprovar");

		if ("APROVADO".equals(this.estado))
			return;
		
	}

}
