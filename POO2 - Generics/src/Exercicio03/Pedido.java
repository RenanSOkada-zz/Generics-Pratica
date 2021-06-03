package Exercicio03;

import java.util.List;

public class Pedido<T extends Produto> {

	private List<T> produto;
	private String status;
	
	public Pedido() {
	}	
	
	public boolean addLista(T o) {
		return produto.add(o);
	}
	
	public Pedido(List<T> produto, String status) {
		this.produto = produto;
		this.status = status;
	}

	public List<T> getProduto() {
		return produto;
	}

	public String getStatus() {
		return status;
	}

	public void setProduto(List<T> produto) {
		this.produto = produto;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [produto=");
		builder.append(produto);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}

	
	

	
	
}
