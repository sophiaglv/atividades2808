package poo2808;

public class Usuario {
	//Atributos
	int id;
	String nome;
	String password;
	String permissao;
	String usuario;

	//Métodos
	String logar;
	String cadastrar;
	String freqUtilizar;
	String pesquisa;
	
	public int getId() {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getPassword () {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPermissao () {
		return permissao;
	}
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
	public String getUsuario () {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getLogar () {
		return logar;
	}
	public void setLogar(String logar) {
		this.logar = logar;
	}
	public String getCadastrar () {
		return cadastrar;
	}
	public void setCadastrar(String cadastrar) {
		this.cadastrar = cadastrar;
	}
	public String getFreqUtilizar () {
		return freqUtilizar;
	}
	public void setFreqUtilizar(String freqUtilizar) {
		this.freqUtilizar = freqUtilizar;
	}
	public String getPesquisa () {
		return pesquisa;
	}
	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
}
