package ArgPrograma;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {

		String archivo = args[0];
		int resultado = 0;
		int l = 0;

		switch (args[1]) {

		case "suma":
			for (String linea : Files.readAllLines(Paths.get(archivo))) {
				l = Integer.parseInt(linea);
				resultado = resultado + l;
			}
			System.out.println("La sumatoria es: " + resultado);
			break;

		case "multiplicacion":
			resultado = 1;
			for (String linea : Files.readAllLines(Paths.get(archivo))) {
				l = Integer.parseInt(linea);
				resultado = resultado * l;
			}
			System.out.println("La multiplicacion es: " + resultado);
			break;

		}

	}

}

