package state;

public class GerenteDeSeguranca {

	private static GerenteDeSeguranca instance;

	private String usuarioCorrente;

	private GerenteDeSeguranca() {

	}

	public static GerenteDeSeguranca getInstance() {
		if (instance == null) {
			instance = new GerenteDeSeguranca();
		}
		return instance;
	}

	public String getUsuarioCorrente() {
		return usuarioCorrente;
	}

	public void setUsuarioCorrente(String usuarioCorrente) {
		this.usuarioCorrente = usuarioCorrente;
	}

	public Boolean ehUsuarioModerador() {
		return "MODERADOR".equals(usuarioCorrente);
	}

	public Boolean ehUsuarioAutor() {
		return "AUTOR".equals(usuarioCorrente);
	}

}
