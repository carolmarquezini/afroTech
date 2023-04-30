/*
 Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
 exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 
*/

package listaJava;

import java.util.Random;

public class Ex04ArrayList {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int[][] matriz = new int [3][3];
		int soma = 0; 
		
		System.out.println("\nA matriz ficou: \n");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = gerador.nextInt(50);

				
				if( i == j ) {
					
					soma += matriz[i][j]; 
					
				}
				System.out.printf("\t %d \t", matriz[i][j]);
			
			}
			System.out.println();
		}
		
		System.out.println("soma da diagonal principal: " + soma);
		
		
	}

}
