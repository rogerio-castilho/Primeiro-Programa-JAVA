package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
			
	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		System.out.println(gato);
		System.out.println(livro);		
		
		/*int a = 3;
		int b = 2;	
		System.out.println("Hello Word! " + (a+b));*/
	}

}
class Livro {
	public String livro;
}