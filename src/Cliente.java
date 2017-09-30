import java.time.LocalDate;

public class Cliente {
	private String nome;
	private String CPF;
	private LocalDate nascimento;
	private String numero;
	private String cidade;
	private String uf;
	
	
	public Cliente(String nome, String cPF, LocalDate nascimento, String numero, String cidade, String uf) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.nascimento = nascimento;
		this.numero = numero;
		this.cidade = cidade;
		this.uf = uf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public LocalDate getNascimento() {
		return nascimento;
	}


	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}
	

}
