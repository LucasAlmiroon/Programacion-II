package filtros;

import reality.ElementoAbstracto;
import reality.Musica;

public class CriterioTemaMusicalFinal extends CriterioTemaMusical{

	private Musica temaMusical;
	private int miembrosRequeridos;
	
	public CriterioTemaMusicalFinal(Musica temaMusical, int miembros) {
		super(temaMusical);
		miembrosRequeridos = miembros;
	}

	@Override
	public boolean cumple(ElementoAbstracto p) {
		if(super.cumple(p) && p.cantMiembrosTocanInstrumento(temaMusical) >= miembrosRequeridos) {
			return true;
		} 
		return false;
	}

}
