package ArgPrograma;

public class EjercicioCarrito {

	public EjercicioCarrito() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private final static int MAX_ITEMS = 3;
	private int fecha;
	private ItemCarrito[] items;
	private int posicionQueAloja;
	private Descuento desc;

	/**
	 * 
	 * @param fecha
	 * @return 
	 */
	public void CarritoCompra(int fecha) {
		this.fecha = fecha;
		this.items = new ItemCarrito[MAX_ITEMS];
		this.posicionQueAloja = 0;
	}

	/**
	 * 
	 * @param desc
	 * @return
	 */
	public double precio(Descuento desc) {
		this.desc = desc;
		int base = 0;
		for (int i = 0; i < items.length; i++) {
			base = base + items[i].precio();
		}
		return base - desc.descuento(base);
	}

	/**
	 * 
	 * @param item
	 */
	public void agregarItem(ItemCarrito item) {
		if (this.posicionQueAloja < MAX_ITEMS) {
			this.items[posicionQueAloja] = item;
			this.posicionQueAloja++;
		}
	}

}
