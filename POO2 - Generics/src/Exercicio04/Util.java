package Exercicio04;

import java.util.List;

public class Util<T> {

	public static boolean addListaStrUnico(String objeto, List<String> valor) {
		
		for (String string : valor) {
			if(string.contains(objeto)) 
				return false;
		}
		valor.add(objeto);
		return true;
	}
	
	
	
	public static Objeto<Integer> buscaChave(String o, List<Objeto<Integer>> i) {
		
		int x = i.size();
		
		for (int j = 0; j < x; j++) {
			if(o == i.get(j).getChave())
				return i.get(j);
		}
		
		return null;
		
	}
	
}
