package br.com.generation.exercicios;

public class TesteAnimais {

	public static void main(String[] args) {

		Cachorro c1 = new Cachorro ();
		
		c1.nome();
		c1.idade();
		c1.emitirSom();
		c1.deveCorrer();
		
		System.out.println(" ");
		
		Cavalo c2 = new Cavalo ();
		
		c2.nome();
		c2.idade();
		c2.emitirSom();
		c2.deveCorrer();
		
		System.out.println(" ");

		Preguiça p1 = new Preguiça ();
		
		p1.nome();
		p1.idade();
		p1.emitirSom();
		p1.subirArvores();
		
	}

}
