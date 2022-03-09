package br.com.generation.exercicios;

public class Cavalo implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome do cavalo é: Meliodas!");
	}

	@Override
	public void idade() {
		System.out.println("Meliodas tem 8 anos de idade!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Meliodas relincha");
	}

	@Override
	public void deveCorrer() {
		System.out.println("Meliodas corre");
	}

	@Override
	public void subirArvores() {
		// TODO Auto-generated method stub
		
	}

}
