package Exercicio01;

public class ClasseGenerica<T> {
	
	private T objeto ;

	public ClasseGenerica(T objeto ) {
		this.objeto =  objeto;
	}
	
	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}

	public T getObjeto() {
		return objeto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClasseGenerica [Objeto=");
		builder.append(objeto);
		builder.append("]");
		return builder.toString();
	}
	
}
