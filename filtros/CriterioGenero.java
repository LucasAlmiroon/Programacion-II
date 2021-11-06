package filtros;
import reality.ElementoAbstracto;

public class CriterioGenero extends Criterio {

	private String genero;
	
	public CriterioGenero(String genero) {
		this.genero = genero;
	}

	public boolean cumple(ElementoAbstracto p) {
		return p.leGustaGenero(genero);
	}
}
