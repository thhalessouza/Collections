package ExercicioCollections;

import java.util.ArrayList;

public class EstoqueCollections {

	public static void main(String[] args) {
		
		
		String estoque1 = "Ra��o Gran Plus para Cachorro";
		String estoque2 = "Ra��o Gran Plus para Gatos";
		String estoque3 = "Ra��o Quatree para Gatos";
		String estoque4 = "Ra��o Golden para Cachorro";
		
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		
		System.out.println(estoque);
		
		estoque.remove(1);
		System.out.println(estoque);
		
		for(String i: estoque) {
			System.out.println("Op��es em Estoque: " + i);
		}
		
		
		}

	}


