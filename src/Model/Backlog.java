package Model;
import java.util.Calendar;

public class Backlog {

	private int id;
	private Calendar DataDeCriacao;
	private Calendar DataUltimaModificacao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDataDeCriacao() {
		return DataDeCriacao;
	}
	public void setDataDeCriacao(Calendar dataDeCriacao) {
		DataDeCriacao = dataDeCriacao;
	}
	public Calendar getDataUltimaModificacao() {
		return DataUltimaModificacao;
	}
	public void setDataUltimaModificacao(Calendar dataUltimaModificacao) {
		DataUltimaModificacao = dataUltimaModificacao;
	}
	
	
	
	
}
