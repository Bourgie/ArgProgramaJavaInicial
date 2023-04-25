package ArgPrograma;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Persona {
	public Persona(String nombre2, String apillido, LocalDate dob2) {
		// TODO Auto-generated constructor stub
	}
	private String nombre;
	private String apellido;
	private LocalDate dob;
}
