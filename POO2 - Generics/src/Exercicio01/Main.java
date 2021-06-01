package Exercicio01;


public class Main {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro("Pug", "Preto");
		Computador co1 = new Computador("HP", "Branco");
		
		ClasseGenerica<Cachorro> cg = new ClasseGenerica<Cachorro>(c1);
		
		System.out.println(cg);
		
		ClasseGenerica<Computador> ch = new ClasseGenerica<Computador>(co1);
	
		System.out.println(ch);
		
		ClasseGenerica<String> cs = new ClasseGenerica<>("Macarrão");
		
		System.out.println(cs);
		
		ClasseGenerica<Integer> ci = new ClasseGenerica<>(45);
		
		System.out.println(ci);
	}
	
}
