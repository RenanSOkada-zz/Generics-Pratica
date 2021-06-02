package Exercicio03;

public class Produto {
	
	private String descri��o;
	private int codigoProduto;
	
	public Produto() {
	}
	
	public Produto(String descri��o, int codigoProduto) {
		setCodigoProduto(codigoProduto);
		setDescri��o(descri��o);
	}
	public String getDescri��o() {
		return descri��o;
	}
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [descri��o=");
		builder.append(descri��o);
		builder.append(", codigoProduto=");
		builder.append(codigoProduto);
		builder.append("]");
		return builder.toString();
	}
	
	
}
