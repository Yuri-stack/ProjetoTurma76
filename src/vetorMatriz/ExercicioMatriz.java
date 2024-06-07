package vetorMatriz;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		// Iniciamos uma matriz quadrada, que possui a mesma quantidade de linhas e colunas
		int[][] matriz = new int[3][3];
		
		// Criamos as variavéis que vão receber a soma dos valores das Diagonais
		int somaPrincipal = 0, somaSecundaria = 0;
		
		// Essas variaveis vão nos ajudar a exibir os resultados
		String diagonalPrincipal = "", diagonalSecundaria = "";
		
		Scanner leia = new Scanner(System.in);	

		// O primeiro Laço de Repetição percorrerá as linhas da Matriz
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			// O segundo Laço de Repetição percorrerá as colunas da Matriz
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {

				// A combinação Linha e Coluna indica a posição onde o numero digitado será armazenado. 
				System.out.println("Digite o numero da posição: (" + indiceI + "," + indiceJ + "): ");
				matriz[indiceI][indiceJ] = leia.nextInt();
				// Exemplo: matriz[0][0] = recebe o valor digitado
			}

		}

		// Nesse FOR, iremos listar e somar os elementos da Diagonal Principal
		// Na Diagonal principal os índices dos elementos são iguais. Ex.: 0,0 - 1,1 - 2,2
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			// Pega os elementos e adicionam dentro de uma String. Ex.: "25 58 98 63"
			diagonalPrincipal += matriz[indiceI][indiceI] + " ";
			
			// Soma os elementos. Ex.: 25 + 85 + 98 + 63
			somaPrincipal += matriz[indiceI][indiceI];

		}

		// Nesse outro FOR, iremos listar e somar os elementos da Diagonal Secundária
		// Na Diagonal secundária o índice da coluna é o resultado entre o
		// tamanho da linha - 1 - indice da linha
		// Exemplo: 2,0 => tamanho da linha (3) - 1 - indice da linha (2)
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			diagonalSecundaria += matriz[indiceI][matriz.length - 1 - indiceI] + " ";
			somaSecundaria += matriz[indiceI][matriz.length - 1 - indiceI];

		}

		// Exibe os elementos de cada Diagonal e a Soma dos elementos

		System.out.println("Elementos da Diagonal Principal:\n");
		System.out.println(diagonalPrincipal);

		System.out.println("\n\nElementos da Diagonal Secundária:\n");
		System.out.println(diagonalSecundaria);

		System.out.println("\n\nSoma de todos Elementos da Diagonal Principal:\n");
		System.out.println(somaPrincipal);

		System.out.println("\n\nSoma de todos Elementos da Diagonal Secundária:\n");
		System.out.println(somaSecundaria);

		leia.close();
	}

}
