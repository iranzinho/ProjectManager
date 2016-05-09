package Model;

public class GrupoDeUsuario {

	private int id;
	private String NomeDoGrupo;
	
	public GrupoDeUsuario(int id, String NomeDoGrupo){
	
	this.id = id;
	this.NomeDoGrupo = NomeDoGrupo;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDoGrupo() {
		return NomeDoGrupo;
	}

	public void setNomeDoGrupo(String nomeDoGrupo) {
		NomeDoGrupo = nomeDoGrupo;
	}




}
