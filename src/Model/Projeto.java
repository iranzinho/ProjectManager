package Model;
import java.util.Calendar;

public class Projeto {

	private int id;
	private String DescricaoGeral;
	private Calendar DataDeCriacao;
	private Calendar DataDeFinalizacao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricaoGeral() {
		return DescricaoGeral;
	}
	public void setDescricaoGeral(String descricaoGeral) {
		DescricaoGeral = descricaoGeral;
	}
	public Calendar getDataDeCriacao() {
		return DataDeCriacao;
	}
	public void setDataDeCriacao(Calendar dataDeCriacao) {
		DataDeCriacao = dataDeCriacao;
	}
	public Calendar getDataDeFinalizacao() {
		return DataDeFinalizacao;
	}
	public void setDataDeFinalizacao(Calendar dataDeFinalizacao) {
		DataDeFinalizacao = dataDeFinalizacao;
	}
	
	
	
}
