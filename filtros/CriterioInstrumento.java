package filtros;
import reality.Participante;

public class CriterioInstrumento {

	private String instrumento;
	
	public CriterioInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public boolean cumple(Participante p) {
		return p.tocaInstrumento(instrumento);
	}
}
