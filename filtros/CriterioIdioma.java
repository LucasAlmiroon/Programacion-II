package filtros;
import reality.ElementoAbstracto;

public class CriterioIdioma extends Criterio{

	private String idioma;
	
	public CriterioIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean cumple(ElementoAbstracto p) {
		return p.sabeIdioma(idioma);
	}
}
