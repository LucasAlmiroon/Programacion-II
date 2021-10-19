package filtros;
import reality.Participante;

public class CriterioEdadMayor {

	private int edad;
	
	public CriterioEdadMayor(int edad) {
		this.edad = edad;
	}

	public boolean cumple(Participante p) {
		return p.getEdad() > edad;
	}
}
