package filtros;
import reality.ElementoAbstracto;

public class CriterioInstrumento extends Criterio{

	private String instrumento;
	
	public CriterioInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public boolean cumple(ElementoAbstracto p) {
		return p.tocaInstrumento(instrumento);
	}
}
