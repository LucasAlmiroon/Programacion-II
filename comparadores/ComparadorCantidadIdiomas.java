package comparadores;

import java.util.Comparator;

import reality.ElementoAbstracto;

public class ComparadorCantidadIdiomas extends Comparador{

	public ComparadorCantidadIdiomas(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(ElementoAbstracto o1, ElementoAbstracto o2) {
		return o1.getIdiomas().size() - o2.getIdiomas().size();
	}

}
