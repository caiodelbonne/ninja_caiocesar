package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import entity.Piloto;

public class TestePiloto { // posicao de chegada

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// lista de piloto
		System.out.println("Quantidade de pilotos ?");

		int N = sc.nextInt();
		List<Piloto> list = new ArrayList<Piloto>();

		for (int i = 0; i < N; i++) {
			System.out.println("Entre com Nome Piloto : " + i);
			String name = sc.next();
			System.out.println("Numero de Identificação do Piloto");
			int numeroPiloto = sc.nextInt();
			// vetor de voltas
			System.out.println("Voltas Completas. . . ");
			int quantidadeDeVoltas = sc.nextInt();
			int voltas[] = new int[quantidadeDeVoltas];
			int somaTempo = 0;
			for (int volta = 0; volta < quantidadeDeVoltas; volta++) {
				System.out.println("Volta de numero : " + volta);
				System.out.println("tempo da volta em segundos : ");
				int tempoDaVolta = sc.nextInt();
				somaTempo = somaTempo + tempoDaVolta;
			}
			System.out.println(" tempo total" + somaTempo);

			Piloto x = new Piloto(name, numeroPiloto, somaTempo);
			list.add(x);
		}

		list.sort(Comparator.comparing(Piloto::getTempoDaProva));

		for (Piloto piloto : list) {

			System.out.println("Nome do piloto: " + piloto.getNome() + " Numero do piloto : " + piloto.getNumeroPiloto()
					+ " tempo de corrida :" + piloto.getTempoDaProva());
		}
		System.out.println(list.get(0));
	}
}