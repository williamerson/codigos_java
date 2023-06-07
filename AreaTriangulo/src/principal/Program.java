package principal;

import java.util.Scanner;

import entities.calcTriangulo;

public class Program {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			calcTriangulo triangulo = new calcTriangulo();

			System.out.println("lado1: ");
			triangulo.lado1 = sc.nextInt();

			System.out.println("lado2: ");
			triangulo.lado2 = sc.nextInt();

			System.out.println("lado3: ");
			triangulo.lado3 = sc.nextInt();

			String resultado = triangulo.modeloTriangulo(triangulo.lado1, triangulo.lado2, triangulo.lado3);

			System.out.println("O triangulo informado �: " + resultado);
		}

	}
}
