package Exercicio04;


public class Objeto<V> {

	private String chave;
	private V valor;
	
	public Objeto() {
	}
	
	public Objeto(String chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public String getChave() {
		return chave;
	}
	public V getValor() {
		return valor;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public void setValor(V valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Objeto [chave=");
		builder.append(chave);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
