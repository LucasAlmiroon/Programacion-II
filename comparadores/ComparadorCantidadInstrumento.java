package comparadores;

import java.util.Comparator;

import reality.ElementoAbstracto;

public class ComparadorCantidadInstrumento extends Comparador{

	public ComparadorCantidadInstrumento(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(ElementoAbstracto o1, ElementoAbstracto o2) {
		return o1.getInstrumentos().size() - o2.getInstrumentos().size();
	}

}
