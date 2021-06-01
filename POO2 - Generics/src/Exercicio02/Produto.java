package Exercicio02;

import java.util.Date;

public class Produto<T> {

	private T id;
	private double valor;
	private Date dataFabricação;
	private Date dataVencimento;
	
	public Produto() {
	}
	
	public Produto(T id, double valor, Date dataFabricação, Date dataVencimento) {
		setDataFabricação(dataFabricação);
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
	public Date getDataFabricação() {
		return dataFabricação;
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
	public void setDataFabricação(Date dataFabricação) {
		this.dataFabricação = dataFabricação;
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
		builder.append(", dataFabricação=");
		builder.append(DataUtil.DataForStringPadrao(dataFabricação));
		builder.append(", dataVencimento=");
		builder.append(DataUtil.DataForStringPadrao(dataVencimento));
		builder.append("]");
		return builder.toString();
	} 
	
	
	
	
	
}
