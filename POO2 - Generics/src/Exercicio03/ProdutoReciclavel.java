package Exercicio03;

public class ProdutoReciclavel extends Produto{
	
	private String estado;

	public ProdutoReciclavel() {
		super();
	}
	
	public ProdutoReciclavel(String estado, String descrição, int codigoProduto) {
		super(descrição, codigoProduto);
		setEstado(estado);
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoReciclavel [estado=");
		builder.append(estado);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
