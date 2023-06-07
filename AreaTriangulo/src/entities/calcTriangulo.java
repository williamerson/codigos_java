package entities;

public class calcTriangulo {

	public int lado1;
	public int lado2;
	public int lado3;

	public String modeloTriangulo(int lado1, int lado2, int lado3) {

		if (lado1 == lado2 && lado2 == lado3) {
			return "Equilátero";

		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {

			return "Isóceles";
		} else {
			return "Escaleno";

		}
	}

}
