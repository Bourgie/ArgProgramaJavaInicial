package ArgPrograma;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numeroInicio = 5;
		int numeroFin = 14;

		while (numeroInicio <= numeroFin) {
			// Si el resultado de la division es 0, es par
			if (numeroInicio % 2 == 0) {
				System.out.println(numeroInicio);
			}
			numeroInicio++;
		}

	}

}
