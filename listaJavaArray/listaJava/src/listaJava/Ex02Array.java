/* 
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * [x] Faça um programa que gere um vetor com os lançamentos, 
 * [x] escreva esse vetor. 
 * [x] A seguir determine e imprima a média aritmética dos lançamentos, 
 * [x] contabilize e apresente também quantas foram as ocorrências da maior pontuação.
 * */

package listaJava;

import java.util.Random;
import java.util.Arrays;


public class Ex02Array {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int [] lancamentos = new int [10];
		int maiorPontuacao = lancamentos[0];
		int cont = 0;
		double soma = 0;
		double media = 0;
		
		//for para inserir e encontrar a pontuacao 
		for(int i = 0; i < lancamentos.length; i++ ) {
			
			//inseri a pontuacao:
			lancamentos[i] = gerador.nextInt(20);
			
			//encontrar a maior pontuacao:
			if (lancamentos[i] > maiorPontuacao ) {
				
				maiorPontuacao = lancamentos[i];
				
			}
			
			//contar quantas vezes a maior pontuacao aparece
			else if (lancamentos[i] == maiorPontuacao) {
				
				cont++ ;
				
			}
			
			//somar os lancamentos
			soma += lancamentos[i];
	
		}
		
		//realiza a média dos lancamentos
		media = soma / lancamentos.length;
		
		/* uma forma de mostrar os lançamentos:
		 
		 for(double lancamento:lancamentos) {
			System.out.println("Lancamentos: " + lancamento);
		}*/
		
		//imprimi na tela as informações:
		System.out.println("Lancamentos: " + Arrays.toString(lancamentos) + ";");
		System.out.println("A maior pontuacao é: " + maiorPontuacao + ";");
		System.out.println("A maior pontuacao se repende: " + cont + " vezes;");
		System.out.println("A soma: " + soma + ";");
		System.out.println("A média: " + media + " .");


		
	}

}
