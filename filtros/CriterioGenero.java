package filtros;
import reality.Participante;

public class CriterioGenero {

	private String genero;
	
	public CriterioGenero(String genero) {
		this.genero = genero;
	}

	public boolean cumple(Participante p) {
		return p.getGeneros().contains(genero);
	}
}
