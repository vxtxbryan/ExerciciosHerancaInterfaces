package br.com.generation.exercicios;

import java.util.ArrayList;

public class Collections {

	

	/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	programa deverá atender as seguintes funcionalidades:
	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.*/

		public static void main(String[] args) {
			String estoque1 = "Celulares";
			String estoque2 = "Tablets";
			String estoque3 = "Notebooks";
			String estoque4 = "Computadores de trabalho";
			String estoque5 = "Computadores Gamer";

			ArrayList<String> estoque = new ArrayList<>();
			
			estoque.add(estoque1);
			estoque.add(estoque2);
			estoque.add(estoque3);
			estoque.add(estoque4);
			estoque.add(estoque5);
			
			System.out.println(estoque);

			for(String i: estoque) {
				System.out.println();
				System.out.println("Temos os aparelhos eletrônicos: " + i);
			}


		}
}