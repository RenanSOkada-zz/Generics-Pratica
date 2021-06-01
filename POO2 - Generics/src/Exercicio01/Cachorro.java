package Exercicio01;

public class Cachorro {

	private String raça;
	private String cor;

	public Cachorro() {
	}
	
	public Cachorro(String raça, String cor) {
		setRaça(raça);
		setCor(cor);
	}
	
	public String getRaça() {
		return raça;
	}
	public String getCor() {
		return cor;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cachorro [raça=");
		builder.append(raça);
		builder.append(", cor=");
		builder.append(cor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
