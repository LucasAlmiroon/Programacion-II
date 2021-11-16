package filtros;

import reality.ElementoAbstracto;
import reality.Musica;

public class CriterioTemaMusical extends Criterio{

	private Musica temaMusical;
	
	
	public CriterioTemaMusical(Musica temaMusical) {
		this.temaMusical = temaMusical;
	}


	@Override
	public boolean cumple(ElementoAbstracto p) {
		return temaMusical.puedeInterpretarlo(p);
	}

}
