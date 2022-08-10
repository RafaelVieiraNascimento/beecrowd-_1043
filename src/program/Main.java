package program;

/*
beecrowd | 1043 - Triângulo
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		if((A < B + C) && (B < A + C) && (C < B + A)) {
			double P = A + B + C;
			System.out.printf("Perimetro = %.1f\n", P);
		}
		else {
			double P = ((A + B) / 2) * C;
			System.out.printf("Area = %.1f\n", P);
		}
		sc.close();
	}
}
