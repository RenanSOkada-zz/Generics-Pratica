package Exercicio03;

public class Produto {
	
	private String descrição;
	private int codigoProduto;
	
	public Produto() {
	}
	
	public Produto(String descrição, int codigoProduto) {
		setCodigoProduto(codigoProduto);
		setDescrição(descrição);
	}
	public String getDescrição() {
		return descrição;
	}
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [descrição=");
		builder.append(descrição);
		builder.append(", codigoProduto=");
		builder.append(codigoProduto);
		builder.append("]");
		return builder.toString();
	}
	
	
}
