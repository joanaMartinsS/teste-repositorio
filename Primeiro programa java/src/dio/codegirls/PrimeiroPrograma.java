package dio.codegirls;

import dio.codegirls.dominandoIDEs.Gato; // Classe em outro arquivo

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		//Gato gato = new Gato(); // Classe em outro arquivo
		Livros livros = new Livros(); // Classe no mesmo arquivo 
		
		//System.out.println(gato); // Mostra o objeto 
		//System.out.println(livros); // Mostra o endereço de memória porque não tem o StringOut
		
		/*int a = 2;
		int b = 5;
		System.out.println("Hello World! " + (a+b));*/
	}
}

 // Classe no mesmo arquivo
class Livros{
	private String nome;
	private String num_pag;
}
