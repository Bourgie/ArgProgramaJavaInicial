package ArgPrograma;

import ArgPrograma.NoHayStockException;

public class ItemCarrito {

	private int cantidad;
	private Producto producto;

	public ItemCarrito(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	/**
	 * 
	 * @return
	 * @throws NoHayStockException
	 */
	public float precio() throws NoHayStockException {
		if (!producto.hayStock()) {
			throw new NoHayStockException(producto);
		}
		return this.cantidad * this.producto.getPrecio();
	}

}
