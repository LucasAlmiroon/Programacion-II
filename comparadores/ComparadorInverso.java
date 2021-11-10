package comparadores;

import java.util.Comparator;

import reality.ElementoAbstracto;

public class ComparadorInverso implements Comparator<ElementoAbstracto>{

	private Comparator<ElementoAbstracto> c1;
	
	public ComparadorInverso(Comparator<ElementoAbstracto> c1) {
		this.c1 = c1;
	}
	@Override
	public int compare(ElementoAbstracto o1, ElementoAbstracto o2) {
		return c1.compare(o2, o1);
	}

}
