package comparadores;

import java.util.Comparator;

import reality.ElementoAbstracto;

public class ComparadorEdad implements Comparator<ElementoAbstracto>{

	@Override
	public int compare(ElementoAbstracto o1, ElementoAbstracto o2) {
		return (int) (o1.getEdad() - o2.getEdad());
	}

}
