
public class Pessoa {
	
	private String nomePessoa;
	private int idadePessoa;
	
	@Override
	public String toString() {
		return "Pessoa [nomePessoa=" + nomePessoa + ", idade=" + idadePessoa + "]";
	}
	
	public String getNomePessoa() {
		//get pegar informação
		return nomePessoa;
	}
	
	public void setNomePessoa(String nomePessoa) {
		//set manda informação para dentro class
		this.nomePessoa = nomePessoa;
	}
	
	public int getIdadePessoa() {
		return idadePessoa;
	}
	
	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
	

}
