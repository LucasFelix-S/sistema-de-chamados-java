package projeto;

public class Usuarios {
	
	private final String dbUsuario;
	private final String dbSenha;
	
	public Usuarios() {
		this.dbUsuario = "admin";
		this.dbSenha = "102030";
	}

	public String getDbUsuario() {
		return dbUsuario;
	}

	public String getDbSenha() {
		return dbSenha;
	}
}