package ArgPrograma;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import ArgPrograma.Descuento;
import ArgPrograma.DescuentoFijo;
import ArgPrograma.DescuentoPorcentaje;
import ArgPrograma.DescuentoPorcentajeConTope;
import ArgPrograma.DescuentoInvalidoException;
import ArgPrograma.NoHayStockException;
import ArgPrograma.PrecioInvalidoException;

public class Main {

	public static void main(String[] args) {

		String archivo = new File("src/main/resources/items.txt").getAbsolutePath();

		CarritoCompra carrito1 = new CarritoCompra(20230315);

		try {
			for (String linea : Files.readAllLines(Paths.get(archivo))) {

				String[] values = linea.split("\t");

				String cantidad = values[0];
				String precioUnitario = values[1];
				String nombre = values[2];

				ItemCarrito itemCarrito = new ItemCarrito(Integer.parseInt(cantidad),
						new Producto(nombre, Integer.parseInt(precioUnitario)));

				carrito1.agregarItem(itemCarrito);
			}

			if (args.length != 0) {

				switch (args[0]) {

				case "DF": // Descuento Fijo
					Descuento df = new DescuentoFijo(Integer.parseInt(args[1]));
					System.out.println("El precio del carrito es: " + carrito1.precio(df));
					break;

				case "DP": // Descuento Porcentaje
					Descuento dp = new DescuentoPorcentaje(Integer.parseInt(args[1]));
					System.out.println("El precio del carrito es: " + carrito1.precio(dp));
					break;

				case "DPT": // Descuento Porcentaje con Tope
					Descuento dpt = new DescuentoPorcentajeConTope(Integer.parseInt(args[1]),
							Integer.parseInt(args[2]));
					System.out.println("El precio del carrito es: " + carrito1.precio(dpt));
					break;
				}
			} else {
				Descuento descuento = new DescuentoFijo(0); // Creo un descuento 0
				System.out.println("El precio del carrito es: " + carrito1.precio(descuento));
			}
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NoHayStockException e) {
			System.out.println("No hay stock de al menos uno de los productos");
		} catch (PrecioInvalidoException e) {
			e.printStackTrace();
		} catch (DescuentoInvalidoException e) {
			e.printStackTrace();
		}
	}
}
