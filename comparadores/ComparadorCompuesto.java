package comparadores;

import java.util.Comparator;

import reality.ElementoAbstracto;

public class ComparadorCompuesto extends Comparador{

	private Comparator<ElementoAbstracto> c1, c2;
	
	public ComparadorCompuesto(String nombre, Comparator<ElementoAbstracto> c1, Comparator<ElementoAbstracto> c2) {
		super(nombre);
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public int compare(ElementoAbstracto o1, ElementoAbstracto o2) {
		int i = c1.compare(o1, o2);
		if(i == 0) {
			return c2.compare(o1, o2);
		}
		return i;
	}

}
