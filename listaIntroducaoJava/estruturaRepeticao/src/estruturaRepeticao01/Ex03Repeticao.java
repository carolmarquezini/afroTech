/*
 
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
    
*/

package estruturaRepeticao01;

import java.util.Scanner;

public class Ex03Repeticao {

	public static void main(String[] args) {

		int idade = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Informe a idade: ");

		idade = input.nextInt();

		for (int i = 0; i < 1; i++) {

			if (idade >= 10 && idade <= 14) {

				System.out.println(idade + " anos esta na categoria infantil.");

			} else if (idade > 14 && idade <= 17) {

				System.out.println(idade + " anos esta na categoria juvenil.");

			} else if (idade > 17 && idade <= 25) {

				System.out.println(idade + " anos esta na categoria adulto.");

			}

		}

		input.close();
	}

}
