package Exercicio01;

public class Computador {

	private String marca;
	private String cor;
	
	public Computador() {
	}
	
	public Computador(String marca, String cor) {
		setCor(cor);
		setMarca(marca);
	}
	
	public String getMarca() {
		return marca;
	}
	public String getCor() {
		return cor;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador [marca=");
		builder.append(marca);
		builder.append(", cor=");
		builder.append(cor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
