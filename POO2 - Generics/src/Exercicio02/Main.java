package Exercicio02;

public class Main {

	public static void main(String[] args) {
		
		Produto<Integer> p1 = new Produto<Integer>(12345, 20.45, DataUtil.StrTodate("12/03/2000"), DataUtil.StrTodate("15/09/2000"));
		Produto<String> p2 = new Produto<String>("abc827314", 40.28, DataUtil.StrTodate("21/12/2010"), DataUtil.StrTodate("21/12/2011"));
		Produto<Double> p3 = new Produto<Double>(987654.321, 7890.12, DataUtil.StrTodate("31/01/1990"), DataUtil.StrTodate("12/12/2000"));
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
