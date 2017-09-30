
import java.time.LocalDateTime;

public class Ligacao {
	private int codigo;
	private String destino;
	private LocalDateTime inicio;
	private LocalDateTime fim;
	private String cidadeD;
	private String uf;
	private Cliente cliente;
	public Ligacao(int codigo, String destino, LocalDateTime inicio, LocalDateTime fim, String cidadeD, String uf,
			Cliente cliente) {
		super();
		this.codigo = codigo;
		this.destino = destino;
		this.inicio = inicio;
		this.fim = fim;
		this.cidadeD = cidadeD;
		this.uf = uf;
		this.cliente = cliente;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public LocalDateTime getInicio() {
		return inicio;
	}
	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}
	public LocalDateTime getFim() {
		return fim;
	}
	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}
	public String getCidadeD() {
		return cidadeD;
	}
	public void setCidadeD(String cidadeD) {
		this.cidadeD = cidadeD;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Cliente getCliente() {
		return cliente;
	}
}