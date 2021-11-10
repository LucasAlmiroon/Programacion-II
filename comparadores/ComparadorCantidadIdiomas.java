package comparadores;

import java.util.Comparator;

import reality.ElementoAbstracto;

public class ComparadorCantidadIdiomas implements Comparator<ElementoAbstracto>{

	@Override
	public int compare(ElementoAbstracto o1, ElementoAbstracto o2) {
		return o1.getIdiomas().size() - o2.getIdiomas().size();
	}

}
