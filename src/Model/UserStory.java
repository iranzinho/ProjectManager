package Model;

public class UserStory {

	private int id;
	private String Descricao;
	private int peso;
	private String prioridade;
	
	
	public UserStory(int id, String Descricao, int peso, String prioridade){
		
		this.id = id;
		this.Descricao = Descricao;
		this.peso = peso;
		this.prioridade = prioridade;	
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	
	
}
