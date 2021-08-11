package ExercicioCollections;

import java.util.ArrayList;

public class EstoqueCollections {

	public static void main(String[] args) {
		
		
		String estoque1 = "Ração Gran Plus para Cachorro";
		String estoque2 = "Ração Gran Plus para Gatos";
		String estoque3 = "Ração Quatree para Gatos";
		String estoque4 = "Ração Golden para Cachorro";
		
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		
		System.out.println(estoque);
		
		estoque.remove(1);
		System.out.println(estoque);
		
		for(String i: estoque) {
			System.out.println("Opções em Estoque: " + i);
		}
		
		
		}

	}


