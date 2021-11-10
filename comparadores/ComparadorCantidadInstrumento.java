package comparadores;

import java.util.Comparator;

import reality.ElementoAbstracto;

public class ComparadorCantidadInstrumento implements Comparator<ElementoAbstracto>{

	@Override
	public int compare(ElementoAbstracto o1, ElementoAbstracto o2) {
		return o1.getInstrumentos().size() - o2.getInstrumentos().size();
	}

}
