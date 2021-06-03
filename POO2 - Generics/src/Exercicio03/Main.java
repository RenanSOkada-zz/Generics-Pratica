package Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ProdutoReciclavel p1 = new ProdutoReciclavel("Boas condições","Refrigerante", 213123);
		ProdutoReciclavel p2 = new ProdutoReciclavel("Boas condições","Aspirador", 2134124);
		ProdutoReciclavel p3 = new ProdutoReciclavel("Produto Radioativo","Celular", 3123);
		ProdutoReciclavel p4 = new ProdutoReciclavel("Produto Radioativo","Computador", 1234);

		
		List<ProdutoReciclavel> i = new ArrayList<ProdutoReciclavel>();
		i.add(p1);
		i.add(p2);
		i.add(p3);
		
		Pedido<ProdutoReciclavel> pe1 = new Pedido<ProdutoReciclavel>(i, "Pendente");

		pe1.addLista(p4);
		System.out.println(pe1);

	}

}
