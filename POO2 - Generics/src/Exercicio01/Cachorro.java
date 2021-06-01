package Exercicio01;

public class Cachorro {

	private String ra�a;
	private String cor;

	public Cachorro() {
	}
	
	public Cachorro(String ra�a, String cor) {
		setRa�a(ra�a);
		setCor(cor);
	}
	
	public String getRa�a() {
		return ra�a;
	}
	public String getCor() {
		return cor;
	}
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cachorro [ra�a=");
		builder.append(ra�a);
		builder.append(", cor=");
		builder.append(cor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
