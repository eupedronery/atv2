package view;

import java.io.IOException;
import java.util.List;
import java.util.Stack;

import controller.FifaController;

public class princi {
	  public static void main(String [] args) {
		String caminho = "C:\\TEMP";
		String nome = "data.csv";
		FifaController fifa = new FifaController();
		try {
			Stack <String> pilha = fifa.empilhaBrasileiros(caminho, nome);
			List<String> lista = fifa.listaRevelacoes(caminho, nome);
			fifa.desempilhaBonsBrasileiros(pilha);
			fifa.buscaListaBonsJovens(lista);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
