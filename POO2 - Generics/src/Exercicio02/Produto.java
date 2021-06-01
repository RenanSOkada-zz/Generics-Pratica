package Exercicio02;

import java.util.Date;

public class Produto<T> {

	private T id;
	private double valor;
	private Date dataFabrica��o;
	private Date dataVencimento;
	
	public Produto() {
	}
	
	public Produto(T id, double valor, Date dataFabrica��o, Date dataVencimento) {
		setDataFabrica��o(dataFabrica��o);
		setDataVencimento(dataVencimento);
		setId(id);
		setValor(valor);
	}
	
	public T getId() {
		return id;
	}
	public double getValor() {
		return valor;
	}
	public Date getDataFabrica��o() {
		return dataFabrica��o;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setId(T id) {
		this.id = id;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setDataFabrica��o(Date dataFabrica��o) {
		this.dataFabrica��o = dataFabrica��o;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dataFabrica��o=");
		builder.append(DataUtil.DataForStringPadrao(dataFabrica��o));
		builder.append(", dataVencimento=");
		builder.append(DataUtil.DataForStringPadrao(dataVencimento));
		builder.append("]");
		return builder.toString();
	} 
	
	
	
	
	
}
