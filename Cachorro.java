package br.com.generation.exercicios;

public class Cachorro implements Animal {

	@Override
	public void nome() {
		System.out.println("O nome do cachorro é: Hulk");
	}

	@Override
	public void idade() {
        System.out.println("Hulk tem 3 anos de idade!");		
	}

	@Override
	public void emitirSom() {
		System.out.println("Hulk late");
	}

	@Override
	public void deveCorrer() {
		System.out.println("Hulk corre!");
	}

	@Override
	public void subirArvores() {
		// TODO Auto-generated method stub
		
	}

}
