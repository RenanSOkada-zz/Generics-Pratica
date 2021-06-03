package Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> s = new ArrayList<String>();
		
		System.out.println(Util.addListaStrUnico("a123", s));
		System.out.println(Util.addListaStrUnico("b456", s));
		System.out.println(Util.addListaStrUnico("c789", s));
		System.out.println(Util.addListaStrUnico("a123", s));
		
		List<Objeto<Integer>> obj1 = new ArrayList<Objeto<Integer>>();

		Objeto<Integer> o1 = new Objeto<Integer>(s.get(0), 1);
		Objeto<Integer> o2 = new Objeto<Integer>(s.get(1), 2);
		Objeto<Integer> o3 = new Objeto<Integer>(s.get(2), 3);
		
		obj1.add(o1);
		obj1.add(o2);
		obj1.add(o3);
		
		System.out.println(obj1.toString());
		
		System.out.println(Util.buscaChave("c789", obj1));
		

	}

}
