package br.com.generation.exercicios;

public class Pregui�a implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome da pregui�a �: Kirito");
	}

	@Override
	public void idade() {
		System.out.println("Kirito tem 2 anos de idade!");
	}

	@Override
	public void emitirSom() {
         System.out.println("Kirito emite som pelas narinas");
	}

	@Override
	public void deveCorrer() {
	}
	@Override
	public void subirArvores() {
		System.out.println("Kirito sobe em arvores!");
	}

}
