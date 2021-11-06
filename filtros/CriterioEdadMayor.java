package filtros;
import reality.ElementoAbstracto;

public class CriterioEdadMayor extends Criterio{

	private int edad;
	
	public CriterioEdadMayor(int edad) {
		this.edad = edad;
	}

	public boolean cumple(ElementoAbstracto p) {
		return p.getEdad() > edad;
	}
}
