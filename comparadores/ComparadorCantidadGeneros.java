package comparadores;

import java.util.Comparator;

import reality.ElementoAbstracto;

public class ComparadorCantidadGeneros implements Comparator<ElementoAbstracto>{

	@Override
	public int compare(ElementoAbstracto o1, ElementoAbstracto o2) {
		return o1.getGeneros().size() - o2.getGeneros().size();
	}

}
