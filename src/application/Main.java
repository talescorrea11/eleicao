package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Voto;
import exceptions.VotoInvalidoException;

public class Main {

	public static void main(String[] args) {

		try {
			String arq = "/home/tales/eclipse-workspace/Eleicao/src/votos.txt" ;			
			BufferedReader br = new BufferedReader(new FileReader(arq));

			//Map<String, Integer> votos = new LinkedHashMap<>();
			List<Voto> votos = new ArrayList<>();

			while (br.ready()) {
				String[] dados = br.readLine().split(",");
				String nome = dados[0];
				int count = Integer.parseInt(dados[1]);
				Voto voto = new Voto(nome, count);
				
				try {
					voto.setVoto(count);
				} 
				catch (VotoInvalidoException e) {
					e.printStackTrace();
				}
				
				System.out.println("Teste");
				
				
				votos.add(voto);
				
				/*
				if (votos.get(nome)) {
					int votesSoFar = votos.get(nome);
					votos.put(nome, count + votesSoFar);
				} else {
					votos.put(nome, count);
				}
				*/
			}
			for (Voto key : votos) {
				System.out.println(key.toString());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
