package ArgPrograma;

public class DescuentoPorcentaje extends Descuento {
	private int porcentaje;

	public DescuentoPorcentaje(int porcentaje) {
		super();
		this.porcentaje = porcentaje;
	}

	@Override
	public int descuento(int base) {
		return base * porcentaje / 100;
	}

}